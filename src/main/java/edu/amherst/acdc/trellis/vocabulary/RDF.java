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
 * RDF Terms from the W3C RDF Syntax Vocabulary
 *
 * @see <a href="https://www.w3.org/TR/rdf-schema/">RDF Schema 1.1</a> and
 * <a href="https://www.w3.org/TR/rdf11-concepts/">RDF 1.1 Concepts and Abstract Syntax</a>
 *
 * @author acoburn
 */
public final class RDF extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";

    /* Classes */
    public static final IRI Property = createIRI(uri + "Property");
    public static final IRI Statement = createIRI(uri + "Statement");
    public static final IRI Bag = createIRI(uri + "Bag");
    public static final IRI Seq = createIRI(uri + "Seq");
    public static final IRI Alt = createIRI(uri + "Alt");
    public static final IRI List = createIRI(uri + "List");

    /* Datatypes */
    public static final IRI XMLLiteral = createIRI(uri + "XMLLiteral");
    public static final IRI HTML = createIRI(uri + "HTML");
    public static final IRI PlainLiteral = createIRI(uri + "PlainLiteral");
    public static final IRI langString = createIRI(uri + "langString");

    /* List */
    public static final IRI nil = createIRI(uri + "nil");

    /* Properties */
    public static final IRI type = createIRI(uri + "type");
    public static final IRI subject = createIRI(uri + "subject");
    public static final IRI predicate = createIRI(uri + "predicate");
    public static final IRI object = createIRI(uri + "object");
    public static final IRI value = createIRI(uri + "value");
    public static final IRI first = createIRI(uri + "first");
    public static final IRI rest = createIRI(uri + "rest");

    private RDF() {
        // prevent instantiation
    }
}
