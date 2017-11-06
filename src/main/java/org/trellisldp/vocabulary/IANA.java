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
 * Selected terms from the IANA link relations registry
 *
 * @see <a href="https://www.iana.org/assignments/link-relations/link-relations.xhtml">Link Relations</a>
 *
 * @author acoburn
 */
public final class IANA extends BaseVocabulary {

    /* Namespace */
    public static final String URI = "http://www.iana.org/assignments/relation/";

    /* Properties */
    public static final IRI canonical = createIRI(URI + "canonical");
    public static final IRI describes = createIRI(URI + "describes");
    public static final IRI describedby = createIRI(URI + "describedby");
    public static final IRI first = createIRI(URI + "first");
    public static final IRI last = createIRI(URI + "last");
    public static final IRI memento = createIRI(URI + "memento");
    public static final IRI next = createIRI(URI + "next");
    public static final IRI original = createIRI(URI + "original");
    public static final IRI prev = createIRI(URI + "prev");
    public static final IRI self = createIRI(URI + "self");
    public static final IRI timemap = createIRI(URI + "timemap");
    public static final IRI timegate = createIRI(URI + "timegate");
    public static final IRI type = createIRI(URI + "type");
}
