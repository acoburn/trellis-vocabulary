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
import org.apache.commons.rdf.api.RDF;
import org.apache.commons.rdf.simple.SimpleRDF;

/**
 * RDFS Terms from the W3C RDF Syntax Vocabulary
 *
 * @see <a href="https://www.w3.org/TR/rdf-schema/">RDF Schema 1.1</a> and
 * <a href="https://www.w3.org/TR/rdf11-concepts/">RDF 1.1 Concepts and Abstract Syntax</a>
 *
 * @author acoburn
 */
public class RDFS {

    private static RDF rdf = new SimpleRDF();

    /* Namespace */
    public static String uri = "http://www.w3.org/2000/01/rdf-schema#";

    /* Classes */
    public static IRI Resource = rdf.createIRI(uri + "Resource");
    public static IRI Class = rdf.createIRI(uri + "Class");
    public static IRI Literal = rdf.createIRI(uri + "Literal");
    public static IRI Container = rdf.createIRI(uri + "Container");
    public static IRI ContainerMembershipProperty = rdf.createIRI(uri + "ContainerMembershipProperty");
    public static IRI Datatype = rdf.createIRI(uri + "Datatype");

    /* Properties */
    public static IRI subClassOf = rdf.createIRI(uri + "subClassOf");
    public static IRI subPropertyOf = rdf.createIRI(uri + "subPropertyOf");
    public static IRI comment = rdf.createIRI(uri + "comment");
    public static IRI label = rdf.createIRI(uri + "label");
    public static IRI domain = rdf.createIRI(uri + "domain");
    public static IRI range = rdf.createIRI(uri + "range");
    public static IRI seeAlso = rdf.createIRI(uri + "seeAlso");
    public static IRI isDefinedBy = rdf.createIRI(uri + "isDefinedBy");
    public static IRI member = rdf.createIRI(uri + "member");

    private RDFS() {
        // prevent instantiation
    }
}
