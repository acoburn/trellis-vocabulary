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
 * RDF Terms from the Fedora Ontology
 *
 * @see <a href="http://fedora.info/definitions/v4/repository">Fedora Ontology</a>
 *
 * @author acoburn
 */
public class Fedora extends AbstractVocabulary {

    /* Namespace */
    public static String uri = "http://fedora.info/definitions/v4/repository#";

    /* Classes */
    public static IRI AnnotatedResource = createIRI(uri + "AnnotatedResource");
    public static IRI Binary = createIRI(uri + "Binary");
    public static IRI Configuration = createIRI(uri + "Configuration");
    public static IRI Container = createIRI(uri + "Container");
    public static IRI EmbedResources = createIRI(uri + "EmbedResources");
    public static IRI InboundReferences = createIRI(uri + "InboundReferences");
    public static IRI NonRdfSourceDescription = createIRI(uri + "NonRdfSourceDescription");
    public static IRI Pairtree = createIRI(uri + "Pairtree");
    public static IRI Relations = createIRI(uri + "Relations");
    public static IRI RepositoryRoot = createIRI(uri + "RepositoryRoot");
    public static IRI Resource = createIRI(uri + "Resource");
    public static IRI ServerManaged = createIRI(uri + "ServerManaged");
    public static IRI Skolem = createIRI(uri + "Skolem");
    public static IRI Thing = createIRI(uri + "Thing");
    public static IRI Tombstone = createIRI(uri + "Tombstone");
    public static IRI Version = createIRI(uri + "Version");

    /* Named Individuals */
    public static IRI inaccessibleResource = createIRI(uri + "inaccessibleResource");

    /* Object Properties */
    public static IRI baseVersion = createIRI(uri + "baseVersion");
    public static IRI hasAccessRoles = createIRI(uri + "hasAccessRoles");
    public static IRI hasFixityService = createIRI(uri + "hasFixityService");
    public static IRI hasMember = createIRI(uri + "hasMember");
    public static IRI hasNamespaces = createIRI(uri + "hasNamespaces");
    public static IRI hasParent = createIRI(uri + "hasParent");
    public static IRI hasResultsMember = createIRI(uri + "hasResultsMember");
    public static IRI hasVersion = createIRI(uri + "hasVersion");
    public static IRI hasVersions = createIRI(uri + "hasVersions");
    public static IRI predecessors = createIRI(uri + "predecessors");
    public static IRI sparql = createIRI(uri + "sparql");

    /* Datatype Properties */
    public static IRI computedChecksum = createIRI(uri + "computedChecksum");
    public static IRI computedSize = createIRI(uri + "computedSize");
    public static IRI created = createIRI(uri + "created");
    public static IRI createdBy = createIRI(uri + "createdBy");
    public static IRI hasLocation = createIRI(uri + "hasLocation");
    public static IRI hasMoreResults = createIRI(uri + "hasMoreResults");
    public static IRI hasTransactionProvider = createIRI(uri + "hasTransactionProvider");
    public static IRI hasVersionLabel = createIRI(uri + "hasVersionLabel");
    public static IRI isCheckedOut = createIRI(uri + "isCheckedOut");
    public static IRI lastModified = createIRI(uri + "lastModified");
    public static IRI lastModifiedBy = createIRI(uri + "lastModifiedBy");
    public static IRI numberOfChildren = createIRI(uri + "numberOfChildren");
    public static IRI numFixityErrors = createIRI(uri + "numFixityErrors");
    public static IRI numFixityRepaired = createIRI(uri + "numFixityRepaired");
    public static IRI objectCount = createIRI(uri + "objectCount");
    public static IRI objectSize = createIRI(uri + "objectSize");
    public static IRI writable = createIRI(uri + "writable");

    private Fedora() {
        // prevent instantiation
    }
}
