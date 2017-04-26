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
 * RDF Terms from the W3C SKOS Vocabulary
 *
 * @see <a href="https://www.w3.org/2009/08/skos-reference/skos.html">W3C SKOS Vocabulary</a>
 *
 * @author acoburn
 */
public final class SKOS extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "http://www.w3.org/2004/02/skos/core#";

    /* Classes */
    public static final IRI Concept = createIRI(uri + "Concept");
    public static final IRI ConceptScheme = createIRI(uri + "ConceptScheme");
    public static final IRI Collection = createIRI(uri + "Collection");
    public static final IRI OrderedCollection = createIRI(uri + "OrderedCollection");

    /* Propreties */
    public static final IRI inScheme = createIRI(uri + "inScheme");
    public static final IRI hasTopConcept = createIRI(uri + "hasTopConcept");
    public static final IRI topConceptOf = createIRI(uri + "topConceptOf");
    public static final IRI prefLabel = createIRI(uri + "prefLabel");
    public static final IRI altLabel = createIRI(uri + "altLabel");
    public static final IRI hiddenLabel = createIRI(uri + "hiddenLabel");
    public static final IRI notation = createIRI(uri + "notation");
    public static final IRI note = createIRI(uri + "note");
    public static final IRI changeNote = createIRI(uri + "changeNote");
    public static final IRI definition = createIRI(uri + "definition");
    public static final IRI editorialNote = createIRI(uri + "editorialNote");
    public static final IRI example = createIRI(uri + "example");
    public static final IRI historyNote = createIRI(uri + "historyNote");
    public static final IRI scopeNote = createIRI(uri + "scopeNote");
    public static final IRI semanticRelation = createIRI(uri + "semanticRelation");
    public static final IRI broader = createIRI(uri + "broader");
    public static final IRI narrower = createIRI(uri + "narrower");
    public static final IRI related = createIRI(uri + "related");
    public static final IRI broaderTransitive = createIRI(uri + "broaderTransitive");
    public static final IRI narrowerTransitive = createIRI(uri + "narrowerTransitive");
    public static final IRI member = createIRI(uri + "member");
    public static final IRI memberList = createIRI(uri + "memberList");
    public static final IRI mappingRelation = createIRI(uri + "mappingRelation");
    public static final IRI broadMatch = createIRI(uri + "broadMatch");
    public static final IRI narrowMatch = createIRI(uri + "narrowMatch");
    public static final IRI relatedMatch = createIRI(uri + "relatedMatch");
    public static final IRI exactMatch = createIRI(uri + "exactMatch");
    public static final IRI closeMatch = createIRI(uri + "closeMatch");

    private SKOS() {
        super();
    }
}
