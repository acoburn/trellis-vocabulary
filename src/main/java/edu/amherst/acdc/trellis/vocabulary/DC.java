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
 * RDF Terms from the Dublin Core Vocabulary
 *
 * @see <a href="http://dublincore.org/documents/dcmi-terms/">DCMI Metadata Terms</a>
 *
 * @author acoburn
 */
public class DC extends AbstractVocabulary {

    /* Namespace */
    public static String uri = "http://purl.org/dc/terms/";

    /* Classes */
    public static IRI Agent = createIRI(uri + "Agent");
    public static IRI AgentClass = createIRI(uri + "AgentClass");
    public static IRI BibliographicResource = createIRI(uri + "BibliographicResource");
    public static IRI FileFormat = createIRI(uri + "FileFormat");
    public static IRI Frequency = createIRI(uri + "Frequency");
    public static IRI Jurisdiction = createIRI(uri + "Jurisdiction");
    public static IRI LicenseDocument = createIRI(uri + "LicenseDocument");
    public static IRI LinguisticSystem = createIRI(uri + "LinguisticSystem");
    public static IRI Location = createIRI(uri + "Location");
    public static IRI LocationPeriodOrJurisdiction = createIRI(uri + "LocationPeriodOrJurisdiction");
    public static IRI MediaType = createIRI(uri + "MediaType");
    public static IRI MediaTypeOrExtent = createIRI(uri + "MediaTypeOrExtent");
    public static IRI MethodOfAccrual = createIRI(uri + "MethodOfAccrual");
    public static IRI MethodOfInstruction = createIRI(uri + "MethodOfInstruction");
    public static IRI PeriodOfTime = createIRI(uri + "PeriodOfTime");
    public static IRI PhysicalMedium = createIRI(uri + "PhysicalMedium");
    public static IRI PhysicalResource = createIRI(uri + "PhysicalResource");
    public static IRI Policy = createIRI(uri + "Policy");
    public static IRI ProvenanceStatement = createIRI(uri + "ProvenanceStatement");
    public static IRI RightsStatement = createIRI(uri + "RightsStatement");
    public static IRI SizeOrDuration = createIRI(uri + "SizeOrDuration");
    public static IRI Standard = createIRI(uri + "Standard");

    /* Properties */
    public static IRI abstract_ = createIRI(uri + "abstract");
    public static IRI accessRights = createIRI(uri + "accessRights");
    public static IRI accrualMethod = createIRI(uri + "accrualMethod");
    public static IRI accrualPeriodicity = createIRI(uri + "accrualPeriodicity");
    public static IRI accrualPolicy = createIRI(uri + "accrualPolicy");
    public static IRI alternative = createIRI(uri + "alternative");
    public static IRI audience = createIRI(uri + "audience");
    public static IRI available = createIRI(uri + "available");
    public static IRI bibliographicCitation = createIRI(uri + "bibliographicCitation");
    public static IRI conformsTo = createIRI(uri + "conformsTo");
    public static IRI contributor = createIRI(uri + "contributor");
    public static IRI coverage = createIRI(uri + "coverage");
    public static IRI created = createIRI(uri + "created");
    public static IRI creator = createIRI(uri + "creator");
    public static IRI date = createIRI(uri + "date");
    public static IRI dateAccepted = createIRI(uri + "dateAccepted");
    public static IRI dateCopyrighted = createIRI(uri + "dateCopyrighted");
    public static IRI dateSubmitted = createIRI(uri + "dateSubmitted");
    public static IRI description = createIRI(uri + "description");
    public static IRI educationLevel = createIRI(uri + "educationLevel");
    public static IRI extent = createIRI(uri + "extent");
    public static IRI format = createIRI(uri + "format");
    public static IRI hasFormat = createIRI(uri + "hasFormat");
    public static IRI hasPart = createIRI(uri + "hasPart");
    public static IRI hasVersion = createIRI(uri + "hasVersion");
    public static IRI identifier = createIRI(uri + "identifier");
    public static IRI instructionalMethod = createIRI(uri + "instructionalMethod");
    public static IRI isFormatOf = createIRI(uri + "isFormatOf");
    public static IRI isPartOf = createIRI(uri + "isPartOf");
    public static IRI isReferencedBy = createIRI(uri + "isReferencedBy");
    public static IRI isReplacedBy = createIRI(uri + "isReplacedBy");
    public static IRI isRequiredBy = createIRI(uri + "isRequiredBy");
    public static IRI issued = createIRI(uri + "issued");
    public static IRI isVersionOf = createIRI(uri + "isVersionOf");
    public static IRI language = createIRI(uri + "language");
    public static IRI license = createIRI(uri + "license");
    public static IRI mediator = createIRI(uri + "mediator");
    public static IRI medium = createIRI(uri + "medium");
    public static IRI modified = createIRI(uri + "modified");
    public static IRI provenance = createIRI(uri + "provenance");
    public static IRI publisher = createIRI(uri + "publisher");
    public static IRI references = createIRI(uri + "references");
    public static IRI relation = createIRI(uri + "relation");
    public static IRI replaces = createIRI(uri + "replaces");
    public static IRI requires = createIRI(uri + "requires");
    public static IRI rights = createIRI(uri + "rights");
    public static IRI rightsHolder = createIRI(uri + "rightsHolder");
    public static IRI source = createIRI(uri + "source");
    public static IRI spatial = createIRI(uri + "spatial");
    public static IRI subject = createIRI(uri + "subject");
    public static IRI tableOfContents = createIRI(uri + "tableOfContents");
    public static IRI temporal = createIRI(uri + "temporal");
    public static IRI title = createIRI(uri + "title");
    public static IRI type = createIRI(uri + "type");
    public static IRI valid = createIRI(uri + "valid");

    private DC() {
        // prevent instantiation
    }
}

