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
 * RDF Terms from the W3C PROV Ontology
 *
 * @see <a href="https://www.w3.org/TR/prov-o/">PROV Ontology</a>
 *
 * @author acoburn
 */
public class PROV extends AbstractVocabulary {

    /* Namespace */
    public static String uri = "http://www.w3.org/ns/prov#";

    /* Classes */
    public static IRI Activity = createIRI(uri + "Activity");
    public static IRI Agent = createIRI(uri + "Agent");
    public static IRI Entity = createIRI(uri + "Entity");

    /* Expanded Classes */
    public static IRI Bundle = createIRI(uri + "Bundle");
    public static IRI Collection = createIRI(uri + "Collection");
    public static IRI EmptyCollection = createIRI(uri + "EmptyCollection");
    public static IRI Location = createIRI(uri + "Location");
    public static IRI Organization = createIRI(uri + "Organization");
    public static IRI Person = createIRI(uri + "Person");
    public static IRI SoftwareAgent = createIRI(uri + "SoftwareAgent");

    /* Qualified Classes */
    public static IRI ActivityInfluence = createIRI(uri + "ActivityInfluence");
    public static IRI AgentInfluence = createIRI(uri + "AgentInfluence");
    public static IRI Association = createIRI(uri + "Association");
    public static IRI Attribution = createIRI(uri + "Attribution");
    public static IRI Communication = createIRI(uri + "Communication");
    public static IRI Delegation = createIRI(uri + "Delegation");
    public static IRI Derivation = createIRI(uri + "Derivation");
    public static IRI End = createIRI(uri + "End");
    public static IRI EntityInfluence = createIRI(uri + "EntityInfluence");
    public static IRI Generation = createIRI(uri + "Generation");
    public static IRI Influence = createIRI(uri + "Influence");
    public static IRI InstantaneousEvent = createIRI(uri + "InstantaneousEvent");
    public static IRI Invalidation = createIRI(uri + "Invalidation");
    public static IRI Plan = createIRI(uri + "Plan");
    public static IRI PrimarySource = createIRI(uri + "PrimarySource");
    public static IRI Quotation = createIRI(uri + "Quotation");
    public static IRI Revision = createIRI(uri + "Revision");
    public static IRI Start = createIRI(uri + "Start");
    public static IRI Usage = createIRI(uri + "Usage");

    /* Properties */
    public static IRI actedOnBehalfOf = createIRI(uri + "actedOnBehalfOf");
    public static IRI endedAtTime = createIRI(uri + "endedAtTime");
    public static IRI startedAtTime = createIRI(uri + "startedAtTime");
    public static IRI used = createIRI(uri + "used");
    public static IRI wasAssociatedWith = createIRI(uri + "wasAssociatedWith");
    public static IRI wasAttributedTo = createIRI(uri + "wasAttributedTo");
    public static IRI wasDerivedFrom = createIRI(uri + "wasDerivedFrom");
    public static IRI wasGeneratedBy = createIRI(uri + "wasGeneratedBy");
    public static IRI wasInformedBy = createIRI(uri + "wasInformedBy");

    /* Expanded Properties */
    public static IRI alternateOf = createIRI(uri + "alternateOf");
    public static IRI atLocation = createIRI(uri + "atLocation");
    public static IRI generated = createIRI(uri + "generated");
    public static IRI generatedAtTime = createIRI(uri + "generatedAtTime");
    public static IRI hadMember = createIRI(uri + "hadMember");
    public static IRI hadPrimarySource = createIRI(uri + "hadPrimarySource");
    public static IRI influenced = createIRI(uri + "influenced");
    public static IRI invalidated = createIRI(uri + "invalidated");
    public static IRI invalidatedAtTime = createIRI(uri + "invalidatedAtTime");
    public static IRI specializationOf = createIRI(uri + "specializationOf");
    public static IRI value = createIRI(uri + "value");
    public static IRI wasEndedBy = createIRI(uri + "wasEndedBy");
    public static IRI wasInvalidatedBy = createIRI(uri + "wasInvalidatedBy");
    public static IRI wasQuotedFrom = createIRI(uri + "wasQuotedFrom");
    public static IRI wasRevisionOf = createIRI(uri + "wasRevisionOf");
    public static IRI wasStartedBy = createIRI(uri + "wasStartedBy");

    /* Qualified Properties */
    public static IRI activity = createIRI(uri + "activity");
    public static IRI agent = createIRI(uri + "agent");
    public static IRI atTime = createIRI(uri + "atTime");
    public static IRI entity = createIRI(uri + "entity");
    public static IRI hadActivity = createIRI(uri + "hadActivity");
    public static IRI hadGeneration = createIRI(uri + "hadGeneration");
    public static IRI hadPlan = createIRI(uri + "hadPlan");
    public static IRI hadRole = createIRI(uri + "hadRole");
    public static IRI hadUsage = createIRI(uri + "hadUsage");
    public static IRI influencer = createIRI(uri + "influencer");
    public static IRI qualifiedAssociation = createIRI(uri + "qualifiedAssociation");
    public static IRI qualifiedAttribution = createIRI(uri + "qualifiedAttribution");
    public static IRI qualifiedCommunication = createIRI(uri + "qualifiedCommunication");
    public static IRI qualifiedDelegation = createIRI(uri + "qualifiedDelegation");
    public static IRI qualifiedDerivation = createIRI(uri + "qualifiedDerivation");
    public static IRI qualifiedEnd = createIRI(uri + "qualifiedEnd");
    public static IRI qualifiedGeneration = createIRI(uri + "qualifiedGeneration");
    public static IRI qualifiedInfluence = createIRI(uri + "qualifiedInfluence");
    public static IRI qualifiedInvalidation = createIRI(uri + "qualifiedInvalidation");
    public static IRI qualifiedPrimarySource = createIRI(uri + "qualifiedPrimarySource");
    public static IRI qualifiedQuotation = createIRI(uri + "qualifiedQuotation");
    public static IRI qualifiedRevision = createIRI(uri + "qualifiedRevision");
    public static IRI qualifiedStart = createIRI(uri + "qualifiedStart");
    public static IRI qualifiedUsage = createIRI(uri + "qualifiedUsage");
    public static IRI wasInfluencedBy = createIRI(uri + "wasInfluencedBy");

    private PROV() {
        // prevent instantiation
    }
}
