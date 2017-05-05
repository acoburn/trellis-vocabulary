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
 * RDF Terms from the OA Vocabulary
 *
 * @see <a href="https://www.w3.org/ns/oa">OA Vocabulary</a>
 *
 * @author acoburn
 */
public final class OA extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "http://www.w3.org/ns/oa#";

    /* Classes */
    public static final IRI Annotation = createIRI(uri + "Annotation");
    public static final IRI Choice = createIRI(uri + "Choice");
    public static final IRI CssSelector = createIRI(uri + "CssSelector");
    public static final IRI CssStyle = createIRI(uri + "CssStyle");
    public static final IRI DataPositionSelector = createIRI(uri + "DataPositionSelector");
    public static final IRI Direction = createIRI(uri + "Direction");
    public static final IRI FragmentSelector = createIRI(uri + "FragmentSelector");
    public static final IRI HttpRequestState = createIRI(uri + "HttpRequestState");
    public static final IRI Motivation = createIRI(uri + "Motivation");
    public static final IRI RangeSelector = createIRI(uri + "RangeSelector");
    public static final IRI ResourceSelection = createIRI(uri + "ResourceSelection");
    public static final IRI Selector = createIRI(uri + "Selector");
    public static final IRI SpecificResource = createIRI(uri + "SpecificResource");
    public static final IRI State = createIRI(uri + "State");
    public static final IRI Style = createIRI(uri + "Style");
    public static final IRI SvgSelector = createIRI(uri + "SvgSelector");
    public static final IRI TextPositionSelector = createIRI(uri + "TextPositionSelector");
    public static final IRI TextQuoteSelector = createIRI(uri + "TextQuoteSelector");
    public static final IRI TextualBody = createIRI(uri + "TextualBody");
    public static final IRI TimeState = createIRI(uri + "TimeState");
    public static final IRI XPathSelector = createIRI(uri + "XPathSelector");

    /* Properties */
    public static final IRI annotationService = createIRI(uri + "annotationService");
    public static final IRI bodyValue = createIRI(uri + "bodyValue");
    public static final IRI cachedSource = createIRI(uri + "cachedSource");
    public static final IRI canonical = createIRI(uri + "canonical");
    public static final IRI end = createIRI(uri + "end");
    public static final IRI exact = createIRI(uri + "exact");
    public static final IRI hasBody = createIRI(uri + "hasBody");
    public static final IRI hasEndSelector = createIRI(uri + "hasEndSelector");
    public static final IRI hasPurpose = createIRI(uri + "hasPurpose");
    public static final IRI hasScope = createIRI(uri + "hasScope");
    public static final IRI hasSelector = createIRI(uri + "hasSelector");
    public static final IRI hasSource = createIRI(uri + "hasSource");
    public static final IRI hasStartSelector = createIRI(uri + "hasStartSelector");
    public static final IRI hasState = createIRI(uri + "hasState");
    public static final IRI hasTarget = createIRI(uri + "hasTarget");
    public static final IRI motivatedBy = createIRI(uri + "motivatedBy");
    public static final IRI prefix = createIRI(uri + "prefix");
    public static final IRI processingLanguage = createIRI(uri + "processingLanguage");
    public static final IRI refinedBy = createIRI(uri + "refinedBy");
    public static final IRI renderedVia = createIRI(uri + "renderedVia");
    public static final IRI sourceDate = createIRI(uri + "sourceDate");
    public static final IRI sourceDateEnd = createIRI(uri + "sourceDateEnd");
    public static final IRI sourceDateStart = createIRI(uri + "sourceDateStart");
    public static final IRI start = createIRI(uri + "start");
    public static final IRI styleClass = createIRI(uri + "styleClass");
    public static final IRI styledBy = createIRI(uri + "styledBy");
    public static final IRI suffix = createIRI(uri + "suffix");
    public static final IRI textDirection = createIRI(uri + "textDirection");
    public static final IRI via = createIRI(uri + "via");

    /* Named Individuals */
    public static final IRI assessing = createIRI(uri + "assessing");
    public static final IRI bookmarking = createIRI(uri + "bookmarking");
    public static final IRI classifying = createIRI(uri + "classifying");
    public static final IRI commenting = createIRI(uri + "commenting");
    public static final IRI describing = createIRI(uri + "describing");
    public static final IRI editing = createIRI(uri + "editing");
    public static final IRI highlighting = createIRI(uri + "highlighting");
    public static final IRI identifying = createIRI(uri + "identifying");
    public static final IRI linking = createIRI(uri + "linking");
    public static final IRI ltrDirection = createIRI(uri + "ltrDirection");
    public static final IRI moderating = createIRI(uri + "moderating");
    public static final IRI questioning = createIRI(uri + "questioning");
    public static final IRI replying = createIRI(uri + "replying");
    public static final IRI rtlDirection = createIRI(uri + "rtlDirection");
    public static final IRI tagging = createIRI(uri + "tagging");

    /* Prefer-related Classes */
    public static final IRI PreferContainedDescriptions = createIRI(uri + "PreferContainedDescriptions");
    public static final IRI PreferContainedIRIs = createIRI(uri + "PreferContainedIRIs");

    private OA() {
        super();
    }
}
