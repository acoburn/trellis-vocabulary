/*
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
package org.trellisldp.vocabulary;

import static org.apache.jena.graph.Factory.createDefaultGraph;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.apache.jena.graph.Graph;
import org.apache.jena.riot.RDFParser;

/**
 * @author acoburn
 */
public class ASTest extends AbstractVocabularyTest {

    public String namespace() {
        return "https://www.w3.org/ns/activitystreams#";
    }

    public Class vocabulary() {
        return AS.class;
    }

    private static Graph getVocabulary(final String url) {
        final Graph graph = createDefaultGraph();
        RDFParser.source(url).httpAccept("application/ld+json").parse(graph);
        return graph;
    }

    @Test
    @Override
    public void testVocabularyRev() {
        assertEquals(namespace() + "Create", AS.Create.getIRIString());
        assertEquals(namespace() + "Delete", AS.Delete.getIRIString());
        assertEquals(namespace() + "Update", AS.Update.getIRIString());
    }

    @Test
    @Override
    public void testVocabulary() {
        assertEquals(namespace() + "Activity", AS.Activity.getIRIString());
    }

    @Test
    public void checkUri() {
        getVocabulary(namespace());
        assertEquals(namespace(), AS.uri);
    }
}
