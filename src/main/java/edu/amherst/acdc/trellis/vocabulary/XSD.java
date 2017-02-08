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
 * RDF Terms from the XML Schema Datatype Vocabulary
 *
 * @see <a href="https://www.w3.org/TR/xmlschema-2/">XML Schema Part 2</a>
 *
 * @author acoburn
 */
public class XSD extends AbstractVocabulary {

    /* Namespace */
    public static String uri = "http://www.w3.org/2001/XMLSchema#";

    /* DataTypes */
    public static IRI anyURI = createIRI(uri + "anyURI");
    public static IRI base64Binary = createIRI(uri + "base64Binary");
    public static IRI boolean_ = createIRI(uri + "boolean");
    public static IRI byte_ = createIRI(uri + "byte");
    public static IRI date = createIRI(uri + "date");
    public static IRI dateTime = createIRI(uri + "dateTime");
    public static IRI dateTimeStamp = createIRI(uri + "dateTimeStamp");
    public static IRI dayTimeDuration = createIRI(uri + "dayTimeDuration");
    public static IRI decimal = createIRI(uri + "decimal");
    public static IRI double_ = createIRI(uri + "double");
    public static IRI duration = createIRI(uri + "duration");
    public static IRI float_ = createIRI(uri + "float");
    public static IRI gDay = createIRI(uri + "gDay");
    public static IRI gMonth = createIRI(uri + "gMonth");
    public static IRI gMonthDay = createIRI(uri + "gMonthDay");
    public static IRI gYear = createIRI(uri + "gYear");
    public static IRI gYearMonth = createIRI(uri + "gYearMonth");
    public static IRI hexBinary = createIRI(uri + "hexBinary");
    public static IRI integer = createIRI(uri + "integer");
    public static IRI int_ = createIRI(uri + "int");
    public static IRI language = createIRI(uri + "language");
    public static IRI long_ = createIRI(uri + "long");
    public static IRI negativeInteger = createIRI(uri + "negativeInteger");
    public static IRI nonNegativeInteger = createIRI(uri + "nonNegativeInteger");
    public static IRI nonPositiveInteger = createIRI(uri + "nonPositiveInteger");
    public static IRI normalizedString = createIRI(uri + "normalizedString");
    public static IRI positiveInteger = createIRI(uri + "positiveInteger");
    public static IRI short_ = createIRI(uri + "short");
    public static IRI string_ = createIRI(uri + "string");
    public static IRI time = createIRI(uri + "time");
    public static IRI token = createIRI(uri + "token");
    public static IRI unsignedByte = createIRI(uri + "unsignedByte");
    public static IRI unsignedInt = createIRI(uri + "unsignedInt");
    public static IRI unsignedLong = createIRI(uri + "unsignedLong");
    public static IRI unsignedShort = createIRI(uri + "unsignedShort");
    public static IRI yearMonthDuration = createIRI(uri + "yearMonthDuration");

    private XSD() {
        // prevent instantiation
    }
}
