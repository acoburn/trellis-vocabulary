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
 * RDF Terms from the Dublin Core Vocabulary
 *
 * @see <a href="http://dublincore.org/documents/dcmi-terms/">DCMI Metadata Terms</a>
 *
 * @author acoburn
 */
public final class DC extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "http://purl.org/dc/terms/";

    /* Classes */
    public static final IRI Agent = createIRI(uri + "Agent");
    public static final IRI AgentClass = createIRI(uri + "AgentClass");
    public static final IRI BibliographicResource = createIRI(uri + "BibliographicResource");
    public static final IRI FileFormat = createIRI(uri + "FileFormat");
    public static final IRI Frequency = createIRI(uri + "Frequency");
    public static final IRI Jurisdiction = createIRI(uri + "Jurisdiction");
    public static final IRI LicenseDocument = createIRI(uri + "LicenseDocument");
    public static final IRI LinguisticSystem = createIRI(uri + "LinguisticSystem");
    public static final IRI Location = createIRI(uri + "Location");
    public static final IRI LocationPeriodOrJurisdiction = createIRI(uri + "LocationPeriodOrJurisdiction");
    public static final IRI MediaType = createIRI(uri + "MediaType");
    public static final IRI MediaTypeOrExtent = createIRI(uri + "MediaTypeOrExtent");
    public static final IRI MethodOfAccrual = createIRI(uri + "MethodOfAccrual");
    public static final IRI MethodOfInstruction = createIRI(uri + "MethodOfInstruction");
    public static final IRI PeriodOfTime = createIRI(uri + "PeriodOfTime");
    public static final IRI PhysicalMedium = createIRI(uri + "PhysicalMedium");
    public static final IRI PhysicalResource = createIRI(uri + "PhysicalResource");
    public static final IRI Policy = createIRI(uri + "Policy");
    public static final IRI ProvenanceStatement = createIRI(uri + "ProvenanceStatement");
    public static final IRI RightsStatement = createIRI(uri + "RightsStatement");
    public static final IRI SizeOrDuration = createIRI(uri + "SizeOrDuration");
    public static final IRI Standard = createIRI(uri + "Standard");

    /* Properties */
    public static final IRI abstract_ = createIRI(uri + "abstract");
    public static final IRI accessRights = createIRI(uri + "accessRights");
    public static final IRI accrualMethod = createIRI(uri + "accrualMethod");
    public static final IRI accrualPeriodicity = createIRI(uri + "accrualPeriodicity");
    public static final IRI accrualPolicy = createIRI(uri + "accrualPolicy");
    public static final IRI alternative = createIRI(uri + "alternative");
    public static final IRI audience = createIRI(uri + "audience");
    public static final IRI available = createIRI(uri + "available");
    public static final IRI bibliographicCitation = createIRI(uri + "bibliographicCitation");
    public static final IRI conformsTo = createIRI(uri + "conformsTo");
    public static final IRI contributor = createIRI(uri + "contributor");
    public static final IRI coverage = createIRI(uri + "coverage");
    public static final IRI created = createIRI(uri + "created");
    public static final IRI creator = createIRI(uri + "creator");
    public static final IRI date = createIRI(uri + "date");
    public static final IRI dateAccepted = createIRI(uri + "dateAccepted");
    public static final IRI dateCopyrighted = createIRI(uri + "dateCopyrighted");
    public static final IRI dateSubmitted = createIRI(uri + "dateSubmitted");
    public static final IRI description = createIRI(uri + "description");
    public static final IRI educationLevel = createIRI(uri + "educationLevel");
    public static final IRI extent = createIRI(uri + "extent");
    public static final IRI format = createIRI(uri + "format");
    public static final IRI hasFormat = createIRI(uri + "hasFormat");
    public static final IRI hasPart = createIRI(uri + "hasPart");
    public static final IRI hasVersion = createIRI(uri + "hasVersion");
    public static final IRI identifier = createIRI(uri + "identifier");
    public static final IRI instructionalMethod = createIRI(uri + "instructionalMethod");
    public static final IRI isFormatOf = createIRI(uri + "isFormatOf");
    public static final IRI isPartOf = createIRI(uri + "isPartOf");
    public static final IRI isReferencedBy = createIRI(uri + "isReferencedBy");
    public static final IRI isReplacedBy = createIRI(uri + "isReplacedBy");
    public static final IRI isRequiredBy = createIRI(uri + "isRequiredBy");
    public static final IRI issued = createIRI(uri + "issued");
    public static final IRI isVersionOf = createIRI(uri + "isVersionOf");
    public static final IRI language = createIRI(uri + "language");
    public static final IRI license = createIRI(uri + "license");
    public static final IRI mediator = createIRI(uri + "mediator");
    public static final IRI medium = createIRI(uri + "medium");
    public static final IRI modified = createIRI(uri + "modified");
    public static final IRI provenance = createIRI(uri + "provenance");
    public static final IRI publisher = createIRI(uri + "publisher");
    public static final IRI references = createIRI(uri + "references");
    public static final IRI relation = createIRI(uri + "relation");
    public static final IRI replaces = createIRI(uri + "replaces");
    public static final IRI requires = createIRI(uri + "requires");
    public static final IRI rights = createIRI(uri + "rights");
    public static final IRI rightsHolder = createIRI(uri + "rightsHolder");
    public static final IRI source = createIRI(uri + "source");
    public static final IRI spatial = createIRI(uri + "spatial");
    public static final IRI subject = createIRI(uri + "subject");
    public static final IRI tableOfContents = createIRI(uri + "tableOfContents");
    public static final IRI temporal = createIRI(uri + "temporal");
    public static final IRI title = createIRI(uri + "title");
    public static final IRI type = createIRI(uri + "type");
    public static final IRI valid = createIRI(uri + "valid");

    private DC() {
        super();
    }
}

