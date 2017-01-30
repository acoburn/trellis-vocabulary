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
 * RDF Terms from the trellis vocabulary
 *
 * @author acoburn
 */
public class Trellis extends AbstractVocabulary {

    /* Namespace */
    public static String uri = "http://acdc.amherst.edu/ns/trellis#";

    /* Classes */
    public static IRI AccessViolation = createIRI(uri + "AccessViolation");
    public static IRI ConstraintViolation = createIRI(uri + "ConstraintViolation");
    public static IRI DefaultInteractionModel = createIRI(uri + "DefaultInteractionModel");
    public static IRI InvalidInteractionModel = createIRI(uri + "InvalidInteractionModel");
    public static IRI InvalidObject = createIRI(uri + "InvalidObject");
    public static IRI InvalidProperty = createIRI(uri + "InvalidProperty");
    public static IRI InvalidSubject = createIRI(uri + "InvalidSubject");

    /* Properties */
    public static IRI containedBy = createIRI(uri + "containedBy");
}
