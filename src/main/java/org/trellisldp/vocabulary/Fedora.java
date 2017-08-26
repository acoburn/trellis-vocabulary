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

import org.apache.commons.rdf.api.IRI;

/**
 * RDF Terms from the Fedora Ontology
 *
 * @see <a href="http://fedora.info/definitions/repository">Fedora Ontology</a>
 *
 * @author acoburn
 */
public final class Fedora extends BaseVocabulary {

    /* Namespace */
    public static final String URI = "http://fedora.info/definitions/fcrepo#";

    /* Named Individuals */
    public static final IRI PreferInboundReferences = createIRI(URI + "PreferInboundReferences");

    private Fedora() {
        super();
    }
}
