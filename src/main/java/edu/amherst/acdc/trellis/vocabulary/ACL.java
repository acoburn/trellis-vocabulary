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
 * RDF Terms from the W3C ACL Vocabulary
 *
 * @see <a href="https://www.w3.org/wiki/WebAccessControl">WebAccessControl Wiki</a>
 *
 * @author acoburn
 */
public final class ACL extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "http://www.w3.org/ns/auth/acl#";

    /* Classes */
    public static final IRI Access = createIRI(uri + "Access");
    public static final IRI Append = createIRI(uri + "Append");
    public static final IRI Authorization = createIRI(uri + "Authorization");
    public static final IRI Control = createIRI(uri + "Control");
    public static final IRI Read = createIRI(uri + "Read");
    public static final IRI Write = createIRI(uri + "Write");

    /* Properties */
    public static final IRI accessControl = createIRI(uri + "accessControl");
    public static final IRI accessTo = createIRI(uri + "accessTo");
    public static final IRI accessToClass = createIRI(uri + "accessToClass");
    public static final IRI agent = createIRI(uri + "agent");
    public static final IRI agentClass = createIRI(uri + "agentClass");
    public static final IRI agentGroup = createIRI(uri + "agentGroup");
    public static final IRI defaultForNew = createIRI(uri + "defaultForNew");
    public static final IRI delegates = createIRI(uri + "delegates");
    public static final IRI mode = createIRI(uri + "mode");
    public static final IRI owner = createIRI(uri + "owner");

    private ACL() {
        // prevent instantiation
    }
}
