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
 * RDF Terms from the OA Vocabulary
 *
 * @see <a href="https://www.w3.org/ns/oa">OA Vocabulary</a>
 *
 * @author acoburn
 */
public class OA extends AbstractVocabulary {

    /* Namespace */
    public static String uri = "http://www.w3.org/ns/oa#";

    /* Classes */
    public static IRI Annotation = createIRI(uri + "Annotation");
    public static IRI Choice = createIRI(uri + "Choice");
    public static IRI CssSelector = createIRI(uri + "CssSelector");
    public static IRI CssStyle = createIRI(uri + "CssStyle");
    public static IRI DataPositionSelector = createIRI(uri + "DataPositionSelector");
    public static IRI Direction = createIRI(uri + "Direction");
    public static IRI FragmentSelector = createIRI(uri + "FragmentSelector");
    public static IRI HttpRequestState = createIRI(uri + "HttpRequestState");
    public static IRI Motivation = createIRI(uri + "Motivation");
    public static IRI RangeSelector = createIRI(uri + "RangeSelector");
    public static IRI ResourceSelection = createIRI(uri + "ResourceSelection");
    public static IRI Selector = createIRI(uri + "Selector");
    public static IRI SpecificResource = createIRI(uri + "SpecificResource");
    public static IRI State = createIRI(uri + "State");
    public static IRI Style = createIRI(uri + "Style");
    public static IRI SvgSelector = createIRI(uri + "SvgSelector");
    public static IRI TextPositionSelector = createIRI(uri + "TextPositionSelector");
    public static IRI TextQuoteSelector = createIRI(uri + "TextQuoteSelector");
    public static IRI TextualBody = createIRI(uri + "TextualBody");
    public static IRI TimeState = createIRI(uri + "TimeState");
    public static IRI XPathSelector = createIRI(uri + "XPathSelector");

    /* Properties */
    public static IRI annotationService = createIRI(uri + "annotationService");
    public static IRI bodyValue = createIRI(uri + "bodyValue");
    public static IRI cachedSource = createIRI(uri + "cachedSource");
    public static IRI canonical = createIRI(uri + "canonical");
    public static IRI end = createIRI(uri + "end");
    public static IRI exact = createIRI(uri + "exact");
    public static IRI hasBody = createIRI(uri + "hasBody");
    public static IRI hasEndSelector = createIRI(uri + "hasEndSelector");
    public static IRI hasPurpose = createIRI(uri + "hasPurpose");
    public static IRI hasScope = createIRI(uri + "hasScope");
    public static IRI hasSelector = createIRI(uri + "hasSelector");
    public static IRI hasSource = createIRI(uri + "hasSource");
    public static IRI hasStartSelector = createIRI(uri + "hasStartSelector");
    public static IRI hasState = createIRI(uri + "hasState");
    public static IRI hasTarget = createIRI(uri + "hasTarget");
    public static IRI motivatedBy = createIRI(uri + "motivatedBy");
    public static IRI prefix = createIRI(uri + "prefix");
    public static IRI processingLanguage = createIRI(uri + "processingLanguage");
    public static IRI refinedBy = createIRI(uri + "refinedBy");
    public static IRI renderedVia = createIRI(uri + "renderedVia");
    public static IRI sourceDate = createIRI(uri + "sourceDate");
    public static IRI sourceDateEnd = createIRI(uri + "sourceDateEnd");
    public static IRI sourceDateStart = createIRI(uri + "sourceDateStart");
    public static IRI start = createIRI(uri + "start");
    public static IRI styleClass = createIRI(uri + "styleClass");
    public static IRI styledBy = createIRI(uri + "styledBy");
    public static IRI suffix = createIRI(uri + "suffix");
    public static IRI textDirection = createIRI(uri + "textDirection");
    public static IRI via = createIRI(uri + "via");

    /* Named Individuals */
    public static IRI assessing = createIRI(uri + "assessing");
    public static IRI bookmarking = createIRI(uri + "bookmarking");
    public static IRI classifying = createIRI(uri + "classifying");
    public static IRI commenting = createIRI(uri + "commenting");
    public static IRI describing = createIRI(uri + "describing");
    public static IRI editing = createIRI(uri + "editing");
    public static IRI highlighting = createIRI(uri + "highlighting");
    public static IRI identifying = createIRI(uri + "identifying");
    public static IRI linking = createIRI(uri + "linking");
    public static IRI ltrDirection = createIRI(uri + "ltrDirection");
    public static IRI moderating = createIRI(uri + "moderating");
    public static IRI questioning = createIRI(uri + "questioning");
    public static IRI replying = createIRI(uri + "replying");
    public static IRI rtlDirection = createIRI(uri + "rtlDirection");
    public static IRI tagging = createIRI(uri + "tagging");

    /* Prefer-related Classes */
    public static IRI PreferContainedDescriptions = createIRI(uri + "PreferContainedDescriptions");
    public static IRI PreferContainedIRIs = createIRI(uri + "PreferContainedIRIs");

    private OA() {
        // prevent instantiation
    }
}
