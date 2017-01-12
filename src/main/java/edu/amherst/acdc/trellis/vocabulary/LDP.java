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
 * RDF Terms from the LDP Vocabulary
 *
 * @see <a href="https://www.w3.org/ns/ldp">LDP Vocabulary</a>
 *
 * @author acoburn
 */
public class LDP extends AbstractVocabulary {

    /* Namespace */
    public static String uri = "http://www.w3.org/ns/ldp#";

    /* Classes */
    public static IRI BasicContainer = createIRI(uri + "BasicContainer");
    public static IRI Container = createIRI(uri + "Container");
    public static IRI DirectContainer = createIRI(uri + "DirectContainer");
    public static IRI IndirectContainer = createIRI(uri + "IndirectContainer");
    public static IRI NonRDFSource = createIRI(uri + "NonRDFSource");
    public static IRI Resource = createIRI(uri + "Resource");
    public static IRI RDFSource = createIRI(uri + "RDFSource");

    /* Properties */
    public static IRI contains = createIRI(uri + "contains");
    public static IRI hasMemberRelation = createIRI(uri + "hasMemberRelation");
    public static IRI inbox = createIRI(uri + "inbox");
    public static IRI insertedContentRelation = createIRI(uri + "insertedContentRelation");
    public static IRI isMemberOfRelation = createIRI(uri + "isMemberOfRelation");
    public static IRI member = createIRI(uri + "member");
    public static IRI membershipResource = createIRI(uri + "membershipResource");

    /* Prefer-related Classes */
    public static IRI PreferContainment = createIRI(uri + "PreferContainment");
    public static IRI PreferMembership = createIRI(uri + "PreferMembership");
    public static IRI PreferMinimalContainer = createIRI(uri + "PreferMinimalContainer");

    /* Paging Classes */
    public static IRI PageSortCriterion = createIRI(uri + "PageSortCriterion");
    public static IRI Ascending = createIRI(uri + "Ascending");
    public static IRI Descending = createIRI(uri + "Descending");
    public static IRI Page = createIRI(uri + "Page");

    /* Paging Properties */
    public static IRI constrainedBy = createIRI(uri + "constrainedBy");
    public static IRI pageSortCriteria = createIRI(uri + "pageSortCriteria");
    public static IRI pageSortPredicate = createIRI(uri + "pageSortPredicate");
    public static IRI pageSortOrder = createIRI(uri + "pageSortOrder");
    public static IRI pageSortCollation = createIRI(uri + "pageSortCollation");
    public static IRI pageSequence = createIRI(uri + "pageSequence");

    /* Other Classes */
    public static IRI MemberSubject = createIRI(uri + "MemberSubject");

    private LDP() {
        // prevent instantiation
    }
}
