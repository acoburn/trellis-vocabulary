/*
 * Copyright Amherst College
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.amherst.acdc.trellis.vocabulary;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toSet;
import static org.apache.http.impl.client.HttpClientBuilder.create;
import static org.apache.jena.graph.Factory.createDefaultGraph;
import static org.apache.jena.graph.Node.ANY;
import static org.apache.jena.riot.web.HttpOp.setDefaultHttpClient;
import static org.apache.jena.riot.RDFDataMgr.read;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.lang.reflect.Field;
import java.util.stream.Stream;

import org.apache.http.impl.client.LaxRedirectStrategy;
import org.apache.jena.graph.Graph;
import org.apache.jena.graph.Node;
import org.apache.jena.graph.Triple;
import org.junit.Test;
import org.slf4j.Logger;

/**
 * @author acoburn
 */
public abstract class AbstractVocabularyTest {

    private static final Logger LOGGER = getLogger(AbstractVocabularyTest.class);

    public abstract String namespace();

    public abstract Class vocabulary();

    static {
        setDefaultHttpClient(create().setRedirectStrategy(new LaxRedirectStrategy()).build());
    }

    @Test
    public void testEventVocabulary() {
        final Graph graph = createDefaultGraph();
        read(graph, namespace());

        final Set<String> subjects = graph.find(ANY, ANY, ANY).mapWith(Triple::getSubject)
                .filterKeep(Node::isURI).mapWith(Node::getURI).filterKeep(Objects::nonNull).toSet();

        fields().forEach(field -> {
            assertTrue("Field definition is not in published ontology! " + field,
                    subjects.contains(namespace() + field));
        });
    }

    @Test
    public void testEventVocabularyRev() {
        final Graph graph = createDefaultGraph();
        read(graph, namespace());

        final Set<String> subjects = fields().map(namespace()::concat).collect(toSet());

        assertTrue("Unable to extract field definitions!", subjects.size() > 0);

        graph.find(ANY, ANY, ANY).mapWith(Triple::getSubject).filterKeep(Node::isURI).mapWith(Node::getURI)
                .filterKeep(Objects::nonNull)
                .filterKeep(uri -> uri.startsWith(namespace())).filterDrop(namespace()::equals)
                .filterDrop(subjects::contains).forEachRemaining(uri -> {
            LOGGER.warn("{} not defined in {} class", uri, vocabulary().getName());
        });
    }

    @Test
    public void testNamespace() throws Exception {
        final Optional<Field> uri = stream(vocabulary().getFields()).filter(field -> field.getName().equals("uri"))
                .findFirst();

        assertTrue(vocabulary().getName() + " does not contain a 'uri' field!", uri.isPresent());
        assertEquals("Namespaces do not match!", namespace(), uri.get().get(null));
    }

    private Stream<String> fields() {
        return stream(vocabulary().getFields()).map(Field::getName).map(name ->
                name.endsWith("_") ? name.substring(0, name.length() - 1) : name)
            .map(name -> name.replaceAll("_", "-")).filter(field -> !field.equals("uri"));
    }
}
