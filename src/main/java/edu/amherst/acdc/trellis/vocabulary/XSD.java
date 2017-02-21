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
public final class XSD extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "http://www.w3.org/2001/XMLSchema#";

    /* DataTypes */
    public static final IRI anyURI = createIRI(uri + "anyURI");
    public static final IRI base64Binary = createIRI(uri + "base64Binary");
    public static final IRI boolean_ = createIRI(uri + "boolean");
    public static final IRI byte_ = createIRI(uri + "byte");
    public static final IRI date = createIRI(uri + "date");
    public static final IRI dateTime = createIRI(uri + "dateTime");
    public static final IRI dateTimeStamp = createIRI(uri + "dateTimeStamp");
    public static final IRI dayTimeDuration = createIRI(uri + "dayTimeDuration");
    public static final IRI decimal = createIRI(uri + "decimal");
    public static final IRI double_ = createIRI(uri + "double");
    public static final IRI duration = createIRI(uri + "duration");
    public static final IRI float_ = createIRI(uri + "float");
    public static final IRI gDay = createIRI(uri + "gDay");
    public static final IRI gMonth = createIRI(uri + "gMonth");
    public static final IRI gMonthDay = createIRI(uri + "gMonthDay");
    public static final IRI gYear = createIRI(uri + "gYear");
    public static final IRI gYearMonth = createIRI(uri + "gYearMonth");
    public static final IRI hexBinary = createIRI(uri + "hexBinary");
    public static final IRI integer = createIRI(uri + "integer");
    public static final IRI int_ = createIRI(uri + "int");
    public static final IRI language = createIRI(uri + "language");
    public static final IRI long_ = createIRI(uri + "long");
    public static final IRI negativeInteger = createIRI(uri + "negativeInteger");
    public static final IRI nonNegativeInteger = createIRI(uri + "nonNegativeInteger");
    public static final IRI nonPositiveInteger = createIRI(uri + "nonPositiveInteger");
    public static final IRI normalizedString = createIRI(uri + "normalizedString");
    public static final IRI positiveInteger = createIRI(uri + "positiveInteger");
    public static final IRI short_ = createIRI(uri + "short");
    public static final IRI string_ = createIRI(uri + "string");
    public static final IRI time = createIRI(uri + "time");
    public static final IRI token = createIRI(uri + "token");
    public static final IRI unsignedByte = createIRI(uri + "unsignedByte");
    public static final IRI unsignedInt = createIRI(uri + "unsignedInt");
    public static final IRI unsignedLong = createIRI(uri + "unsignedLong");
    public static final IRI unsignedShort = createIRI(uri + "unsignedShort");
    public static final IRI yearMonthDuration = createIRI(uri + "yearMonthDuration");

    private XSD() {
        // prevent instantiation
    }
}
