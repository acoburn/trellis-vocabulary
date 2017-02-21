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

import org.apache.commons.rdf.api.IRI;

/**
 * RDFS Terms from the W3C RDF Syntax Vocabulary
 *
 * @see <a href="https://www.w3.org/TR/rdf-schema/">RDF Schema 1.1</a> and
 * <a href="https://www.w3.org/TR/rdf11-concepts/">RDF 1.1 Concepts and Abstract Syntax</a>
 *
 * @author acoburn
 */
public final class RDFS extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "http://www.w3.org/2000/01/rdf-schema#";

    /* Classes */
    public static final IRI Resource = createIRI(uri + "Resource");
    public static final IRI Class = createIRI(uri + "Class");
    public static final IRI Literal = createIRI(uri + "Literal");
    public static final IRI Container = createIRI(uri + "Container");
    public static final IRI ContainerMembershipProperty = createIRI(uri + "ContainerMembershipProperty");
    public static final IRI Datatype = createIRI(uri + "Datatype");

    /* Properties */
    public static final IRI subClassOf = createIRI(uri + "subClassOf");
    public static final IRI subPropertyOf = createIRI(uri + "subPropertyOf");
    public static final IRI comment = createIRI(uri + "comment");
    public static final IRI label = createIRI(uri + "label");
    public static final IRI domain = createIRI(uri + "domain");
    public static final IRI range = createIRI(uri + "range");
    public static final IRI seeAlso = createIRI(uri + "seeAlso");
    public static final IRI isDefinedBy = createIRI(uri + "isDefinedBy");
    public static final IRI member = createIRI(uri + "member");

    private RDFS() {
        super();
    }
}
