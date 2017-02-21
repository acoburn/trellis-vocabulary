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
public final class LDP extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "http://www.w3.org/ns/ldp#";

    /* Classes */
    public static final IRI BasicContainer = createIRI(uri + "BasicContainer");
    public static final IRI Container = createIRI(uri + "Container");
    public static final IRI DirectContainer = createIRI(uri + "DirectContainer");
    public static final IRI IndirectContainer = createIRI(uri + "IndirectContainer");
    public static final IRI NonRDFSource = createIRI(uri + "NonRDFSource");
    public static final IRI Resource = createIRI(uri + "Resource");
    public static final IRI RDFSource = createIRI(uri + "RDFSource");

    /* Properties */
    public static final IRI contains = createIRI(uri + "contains");
    public static final IRI hasMemberRelation = createIRI(uri + "hasMemberRelation");
    public static final IRI inbox = createIRI(uri + "inbox");
    public static final IRI insertedContentRelation = createIRI(uri + "insertedContentRelation");
    public static final IRI isMemberOfRelation = createIRI(uri + "isMemberOfRelation");
    public static final IRI member = createIRI(uri + "member");
    public static final IRI membershipResource = createIRI(uri + "membershipResource");

    /* Prefer-related Classes */
    public static final IRI PreferContainment = createIRI(uri + "PreferContainment");
    public static final IRI PreferMembership = createIRI(uri + "PreferMembership");
    public static final IRI PreferMinimalContainer = createIRI(uri + "PreferMinimalContainer");

    /* Paging Classes */
    public static final IRI PageSortCriterion = createIRI(uri + "PageSortCriterion");
    public static final IRI Ascending = createIRI(uri + "Ascending");
    public static final IRI Descending = createIRI(uri + "Descending");
    public static final IRI Page = createIRI(uri + "Page");

    /* Paging Properties */
    public static final IRI constrainedBy = createIRI(uri + "constrainedBy");
    public static final IRI pageSortCriteria = createIRI(uri + "pageSortCriteria");
    public static final IRI pageSortPredicate = createIRI(uri + "pageSortPredicate");
    public static final IRI pageSortOrder = createIRI(uri + "pageSortOrder");
    public static final IRI pageSortCollation = createIRI(uri + "pageSortCollation");
    public static final IRI pageSequence = createIRI(uri + "pageSequence");

    /* Other Classes */
    public static final IRI MemberSubject = createIRI(uri + "MemberSubject");

    private LDP() {
        super();
    }
}
