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
import org.apache.commons.rdf.api.RDF;
import org.apache.commons.rdf.simple.SimpleRDF;

/**
 * RDF Terms from the Premis Vocabulary
 *
 * @see <a href="https://www.w3.org/wiki/WebAccessControl">WebAccessControl Wiki</a>
 *
 * @author acoburn
 */
public class Premis {

    private static RDF rdf = new SimpleRDF();

    /* Namespace */
    public static String uri = "http://www.loc.gov/premis/rdf/v1#";

    /* Classes */
    public static IRI Agent = rdf.createIRI(uri + "Agent");
    public static IRI ApplicableDates = rdf.createIRI(uri + "ApplicableDates");
    public static IRI Bitstream = rdf.createIRI(uri + "Bitstream");
    public static IRI ContentLocation = rdf.createIRI(uri + "ContentLocation");
    public static IRI CopyrightInformation = rdf.createIRI(uri + "CopyrightInformation");
    public static IRI CreatingApplication = rdf.createIRI(uri + "CreatingApplication");
    public static IRI Dependency = rdf.createIRI(uri + "Dependency");
    public static IRI Environment = rdf.createIRI(uri + "Environment");
    public static IRI Event = rdf.createIRI(uri + "Event");
    public static IRI EventOutcomeDetail = rdf.createIRI(uri + "EventOutcomeDetail");
    public static IRI EventOutcomeInformation = rdf.createIRI(uri + "EventOutcomeInformation");
    public static IRI File = rdf.createIRI(uri + "File");
    public static IRI Fixity = rdf.createIRI(uri + "Fixity");
    public static IRI Format = rdf.createIRI(uri + "Format");
    public static IRI FormatDesignation = rdf.createIRI(uri + "FormatDesignation");
    public static IRI FormatRegistry = rdf.createIRI(uri + "FormatRegistry");
    public static IRI Hardware = rdf.createIRI(uri + "Hardware");
    public static IRI Identifier = rdf.createIRI(uri + "Identifier");
    public static IRI Inhibitors = rdf.createIRI(uri + "Inhibitors");
    public static IRI IntellectualEntity = rdf.createIRI(uri + "IntellectualEntity");
    public static IRI LicenseInformation = rdf.createIRI(uri + "LicenseInformation");
    public static IRI Object = rdf.createIRI(uri + "Object");
    public static IRI ObjectCharacteristics = rdf.createIRI(uri + "ObjectCharacteristics");
    public static IRI PremisEntity = rdf.createIRI(uri + "PremisEntity");
    public static IRI PreservationLevel = rdf.createIRI(uri + "PreservationLevel");
    public static IRI RelatedObjectIdentification = rdf.createIRI(uri + "RelatedObjectIdentification");
    public static IRI Representation = rdf.createIRI(uri + "Representation");
    public static IRI RightsDocumentation = rdf.createIRI(uri + "RightsDocumentation");
    public static IRI RightsGranted = rdf.createIRI(uri + "RightsGranted");
    public static IRI RightsStatement = rdf.createIRI(uri + "RightsStatement");
    public static IRI Signature = rdf.createIRI(uri + "Signature");
    public static IRI SignificantProperties = rdf.createIRI(uri + "SignificantProperties");
    public static IRI Software = rdf.createIRI(uri + "Software");
    public static IRI StatuteInformation = rdf.createIRI(uri + "StatuteInformation");
    public static IRI Storage = rdf.createIRI(uri + "Storage");
    public static IRI TermOfGrant = rdf.createIRI(uri + "TermOfGrant");
    public static IRI TermOfRestriction = rdf.createIRI(uri + "TermOfRestriction");

    /* Properties */
    public static IRI hasAct = rdf.createIRI(uri + "hasAct");
    public static IRI hasAgent = rdf.createIRI(uri + "hasAgent");
    public static IRI hasAgentName = rdf.createIRI(uri + "hasAgentName");
    public static IRI hasAgentNote = rdf.createIRI(uri + "hasAgentNote");
    public static IRI hasAgentType = rdf.createIRI(uri + "hasAgentType");
    public static IRI hasApplicableDates = rdf.createIRI(uri + "hasApplicableDates");
    public static IRI hasCompositionLevel = rdf.createIRI(uri + "hasCompositionLevel");
    public static IRI hasContentLocation = rdf.createIRI(uri + "hasContentLocation");
    public static IRI hasContentLocationType = rdf.createIRI(uri + "hasContentLocationType");
    public static IRI hasContentLocationValue = rdf.createIRI(uri + "hasContentLocationValue");
    public static IRI hasCopyrightJurisdiction = rdf.createIRI(uri + "hasCopyrightJurisdiction");
    public static IRI hasCopyrightStatus = rdf.createIRI(uri + "hasCopyrightStatus");
    public static IRI hasCopyrightStatusDeterminationDate = rdf.createIRI(uri + "hasCopyrightStatusDeterminationDate");
    public static IRI hasCreatingApplication = rdf.createIRI(uri + "hasCreatingApplication");
    public static IRI hasCreatingApplicationName = rdf.createIRI(uri + "hasCreatingApplicationName");
    public static IRI hasCreatingApplicationVersion = rdf.createIRI(uri + "hasCreatingApplicationVersion");
    public static IRI hasDateCreatedByApplication = rdf.createIRI(uri + "hasDateCreatedByApplication");
    public static IRI hasDependency = rdf.createIRI(uri + "hasDependency");
    public static IRI hasDependencyName = rdf.createIRI(uri + "hasDependencyName");
    public static IRI hasEndDate = rdf.createIRI(uri + "hasEndDate");
    public static IRI hasEnvironment = rdf.createIRI(uri + "hasEnvironment");
    public static IRI hasEnvironmentCharacteristic = rdf.createIRI(uri + "hasEnvironmentCharacteristic");
    public static IRI hasEnvironmentNote = rdf.createIRI(uri + "hasEnvironmentNote");
    public static IRI hasEnvironmentPurpose = rdf.createIRI(uri + "hasEnvironmentPurpose");
    public static IRI hasEvent = rdf.createIRI(uri + "hasEvent");
    public static IRI hasEventDateTime = rdf.createIRI(uri + "hasEventDateTime");
    public static IRI hasEventDetail = rdf.createIRI(uri + "hasEventDetail");
    public static IRI hasEventOutcome = rdf.createIRI(uri + "hasEventOutcome");
    public static IRI hasEventOutcomeDetail = rdf.createIRI(uri + "hasEventOutcomeDetail");
    public static IRI hasEventOutcomeDetailNote = rdf.createIRI(uri + "hasEventOutcomeDetailNote");
    public static IRI hasEventOutcomeInformation = rdf.createIRI(uri + "hasEventOutcomeInformation");
    public static IRI hasEventRelatedAgent = rdf.createIRI(uri + "hasEventRelatedAgent");
    public static IRI hasEventRelatedObject = rdf.createIRI(uri + "hasEventRelatedObject");
    public static IRI hasEventType = rdf.createIRI(uri + "hasEventType");
    public static IRI hasFixity = rdf.createIRI(uri + "hasFixity");
    public static IRI hasFormat = rdf.createIRI(uri + "hasFormat");
    public static IRI hasFormatDesignation = rdf.createIRI(uri + "hasFormatDesignation");
    public static IRI hasFormatName = rdf.createIRI(uri + "hasFormatName");
    public static IRI hasFormatNote = rdf.createIRI(uri + "hasFormatNote");
    public static IRI hasFormatRegistry = rdf.createIRI(uri + "hasFormatRegistry");
    public static IRI hasFormatRegistryKey = rdf.createIRI(uri + "hasFormatRegistryKey");
    public static IRI hasFormatRegistryName = rdf.createIRI(uri + "hasFormatRegistryName");
    public static IRI hasFormatRegistryRole = rdf.createIRI(uri + "hasFormatRegistryRole");
    public static IRI hasFormatVersion = rdf.createIRI(uri + "hasFormatVersion");
    public static IRI hasHardware = rdf.createIRI(uri + "hasHardware");
    public static IRI hasHardwareName = rdf.createIRI(uri + "hasHardwareName");
    public static IRI hasHardwareOtherInformation = rdf.createIRI(uri + "hasHardwareOtherInformation");
    public static IRI hasHardwareType = rdf.createIRI(uri + "hasHardwareType");
    public static IRI hasIdentifier = rdf.createIRI(uri + "hasIdentifier");
    public static IRI hasIdentifierType = rdf.createIRI(uri + "hasIdentifierType");
    public static IRI hasIdentifierValue = rdf.createIRI(uri + "hasIdentifierValue");
    public static IRI hasInhibitorKey = rdf.createIRI(uri + "hasInhibitorKey");
    public static IRI hasInhibitors = rdf.createIRI(uri + "hasInhibitors");
    public static IRI hasInhibitorTarget = rdf.createIRI(uri + "hasInhibitorTarget");
    public static IRI hasInhibitorType = rdf.createIRI(uri + "hasInhibitorType");
    public static IRI hasIntellectualEntity = rdf.createIRI(uri + "hasIntellectualEntity");
    public static IRI hasKeyInformation = rdf.createIRI(uri + "hasKeyInformation");
    public static IRI hasLicenseTerms = rdf.createIRI(uri + "hasLicenseTerms");
    public static IRI hasMessageDigest = rdf.createIRI(uri + "hasMessageDigest");
    public static IRI hasMessageDigestAlgorithm = rdf.createIRI(uri + "hasMessageDigestAlgorithm");
    public static IRI hasMessageDigestOriginator = rdf.createIRI(uri + "hasMessageDigestOriginator");
    public static IRI hasObject = rdf.createIRI(uri + "hasObject");
    public static IRI hasObjectCharacteristics = rdf.createIRI(uri + "hasObjectCharacteristics");
    public static IRI hasOriginalName = rdf.createIRI(uri + "hasOriginalName");
    public static IRI hasPreservationLevel = rdf.createIRI(uri + "hasPreservationLevel");
    public static IRI hasPreservationLevelDateAssigned = rdf.createIRI(uri + "hasPreservationLevelDateAssigned");
    public static IRI hasPreservationLevelRationale = rdf.createIRI(uri + "hasPreservationLevelRationale");
    public static IRI hasPreservationLevelRole = rdf.createIRI(uri + "hasPreservationLevelRole");
    public static IRI hasPreservationLevelValue = rdf.createIRI(uri + "hasPreservationLevelValue");
    public static IRI hasRelatedObject = rdf.createIRI(uri + "hasRelatedObject");
    public static IRI hasRelatedObjectSequence = rdf.createIRI(uri + "hasRelatedObjectSequence");
    public static IRI hasRelatedStatuteInformation = rdf.createIRI(uri + "hasRelatedStatuteInformation");
    public static IRI hasRelationship = rdf.createIRI(uri + "hasRelationship");
    public static IRI hasRestriction = rdf.createIRI(uri + "hasRestriction");
    public static IRI hasRightsDocumentation = rdf.createIRI(uri + "hasRightsDocumentation");
    public static IRI hasRightsDocumentationRole = rdf.createIRI(uri + "hasRightsDocumentationRole");
    public static IRI hasRightsGranted = rdf.createIRI(uri + "hasRightsGranted");
    public static IRI hasRightsGrantedNote = rdf.createIRI(uri + "hasRightsGrantedNote");
    public static IRI hasRightsRelatedAgent = rdf.createIRI(uri + "hasRightsRelatedAgent");
    public static IRI hasRightsStatement = rdf.createIRI(uri + "hasRightsStatement");
    public static IRI hasRightsStatementNote = rdf.createIRI(uri + "hasRightsStatementNote");
    public static IRI hasSignature = rdf.createIRI(uri + "hasSignature");
    public static IRI hasSignatureEncoding = rdf.createIRI(uri + "hasSignatureEncoding");
    public static IRI hasSignatureMethod = rdf.createIRI(uri + "hasSignatureMethod");
    public static IRI hasSignatureProperties = rdf.createIRI(uri + "hasSignatureProperties");
    public static IRI hasSignatureValidationRules = rdf.createIRI(uri + "hasSignatureValidationRules");
    public static IRI hasSignatureValue = rdf.createIRI(uri + "hasSignatureValue");
    public static IRI hasSigner = rdf.createIRI(uri + "hasSigner");
    public static IRI hasSignificantProperties = rdf.createIRI(uri + "hasSignificantProperties");
    public static IRI hasSignificantPropertiesType = rdf.createIRI(uri + "hasSignificantPropertiesType");
    public static IRI hasSignificantPropertiesValue = rdf.createIRI(uri + "hasSignificantPropertiesValue");
    public static IRI hasSize = rdf.createIRI(uri + "hasSize");
    public static IRI hasSoftware = rdf.createIRI(uri + "hasSoftware");
    public static IRI hasSoftwareDependency = rdf.createIRI(uri + "hasSoftwareDependency");
    public static IRI hasSoftwareName = rdf.createIRI(uri + "hasSoftwareName");
    public static IRI hasSoftwareOtherInformation = rdf.createIRI(uri + "hasSoftwareOtherInformation");
    public static IRI hasSoftwareType = rdf.createIRI(uri + "hasSoftwareType");
    public static IRI hasSoftwareVersion = rdf.createIRI(uri + "hasSoftwareVersion");
    public static IRI hasStartDate = rdf.createIRI(uri + "hasStartDate");
    public static IRI hasStatuteCitation = rdf.createIRI(uri + "hasStatuteCitation");
    public static IRI hasStatuteInformationDeterminationDate = rdf.createIRI(
                        uri + "hasStatuteInformationDeterminationDate");
    public static IRI hasStatuteJurisdiction = rdf.createIRI(uri + "hasStatuteJurisdiction");
    public static IRI hasStorage = rdf.createIRI(uri + "hasStorage");
    public static IRI hasStorageMedium = rdf.createIRI(uri + "hasStorageMedium");
    public static IRI hasTermOfGrant = rdf.createIRI(uri + "hasTermOfGrant");
    public static IRI hasTermOfRestriction = rdf.createIRI(uri + "hasTermOfRestriction");

    private Premis() {
        // prevent instantiation
    }
}
