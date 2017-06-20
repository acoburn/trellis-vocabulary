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
 * RDF Terms from the trellis vocabulary
 *
 * @see <a href="http://www.trellisldp.org/ns/trellis">Trellis repository vocabulary</a>
 *
 * @author acoburn
 */
public final class Trellis extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "http://www.trellisldp.org/ns/trellis#";

    /* Classes */
    public static final IRI ConstraintViolation = createIRI(uri + "ConstraintViolation");

    /* Named Individuals */
    public static final IRI AccessViolation = createIRI(uri + "AccessViolation");
    public static final IRI AnonymousUser = createIRI(uri + "AnonymousUser");
    public static final IRI DefaultInteractionModel = createIRI(uri + "DefaultInteractionModel");
    public static final IRI DeletedResource = createIRI(uri + "DeletedResource");
    public static final IRI InvalidInteractionModel = createIRI(uri + "InvalidInteractionModel");
    public static final IRI InvalidType = createIRI(uri + "InvalidType");
    public static final IRI InvalidRange = createIRI(uri + "InvalidRange");
    public static final IRI InvalidCardinality = createIRI(uri + "InvalidCardinality");
    public static final IRI InvalidPayloadSize = createIRI(uri + "InvalidPayloadSize");
    public static final IRI InvalidProperty = createIRI(uri + "InvalidProperty");
    public static final IRI PreferAudit = createIRI(uri + "PreferAudit");
    public static final IRI PreferServerManaged = createIRI(uri + "PreferServerManaged");
    public static final IRI PreferUserManaged = createIRI(uri + "PreferUserManaged");
    public static final IRI RepositoryAdministrator = createIRI(uri + "RepositoryAdministrator");

    private Trellis() {
        super();
    }
}
