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
import org.apache.commons.rdf.simple.SimpleRDF;

/**
 * RDF Terms from the W3C RDF Syntax Vocabulary
 *
 * @see <a href="https://www.w3.org/TR/rdf-schema/">RDF Schema 1.1</a> and
 * <a href="https://www.w3.org/TR/rdf11-concepts/">RDF 1.1 Concepts and Abstract Syntax</a>
 *
 * @author acoburn
 */
public class RDF {

    private static org.apache.commons.rdf.api.RDF rdf = new SimpleRDF();

    /* Namespace */
    public static String uri = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";

    /* Classes */
    public static IRI Property = rdf.createIRI(uri + "Property");
    public static IRI Statement = rdf.createIRI(uri + "Statement");
    public static IRI Bag = rdf.createIRI(uri + "Bag");
    public static IRI Seq = rdf.createIRI(uri + "Seq");
    public static IRI Alt = rdf.createIRI(uri + "Alt");
    public static IRI List = rdf.createIRI(uri + "List");

    /* Datatypes */
    public static IRI XMLLiteral = rdf.createIRI(uri + "XMLLiteral");
    public static IRI HTML = rdf.createIRI(uri + "HTML");
    public static IRI PlainLiteral = rdf.createIRI(uri + "PlainLiteral");
    public static IRI langString = rdf.createIRI(uri + "langString");

    /* List */
    public static IRI nil = rdf.createIRI(uri + "nil");

    /* Properties */
    public static IRI type = rdf.createIRI(uri + "type");
    public static IRI subject = rdf.createIRI(uri + "subject");
    public static IRI predicate = rdf.createIRI(uri + "predicate");
    public static IRI object = rdf.createIRI(uri + "object");
    public static IRI value = rdf.createIRI(uri + "value");
    public static IRI first = rdf.createIRI(uri + "first");
    public static IRI rest = rdf.createIRI(uri + "rest");

    private RDF() {
        // prevent instantiation
    }
}
