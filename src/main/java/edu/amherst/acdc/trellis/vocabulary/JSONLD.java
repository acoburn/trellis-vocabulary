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
 * JSON-LD vocabulary terms
 *
 * @see <a href="https://www.w3.org/ns/json-ld">The JSON-LD Vocabulary</a>
 *
 * @author acoburn
 */
public class JSONLD {

    private static RDF rdf = new SimpleRDF();

    /* Namespace */
    public static String uri = "https://www.w3.org/ns/json-ld#";

    /* Profiles */
    public static IRI context = rdf.createIRI(uri + "context");

    /* Extra definitions */
    public static IRI expanded = rdf.createIRI(uri + "expanded");
    public static IRI compacted = rdf.createIRI(uri + "compacted");
    public static IRI flattened = rdf.createIRI(uri + "flattened");

    private JSONLD() {
        // prevent instantiation
    }
}
