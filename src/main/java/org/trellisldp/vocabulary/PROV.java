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
 * RDF Terms from the W3C PROV Ontology
 *
 * @see <a href="https://www.w3.org/TR/prov-o/">PROV Ontology</a>
 *
 * @author acoburn
 */
public final class PROV extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "http://www.w3.org/ns/prov#";

    /* Classes */
    public static final IRI Activity = createIRI(uri + "Activity");
    public static final IRI Agent = createIRI(uri + "Agent");
    public static final IRI Entity = createIRI(uri + "Entity");

    /* Expanded Classes */
    public static final IRI Bundle = createIRI(uri + "Bundle");
    public static final IRI Collection = createIRI(uri + "Collection");
    public static final IRI EmptyCollection = createIRI(uri + "EmptyCollection");
    public static final IRI Location = createIRI(uri + "Location");
    public static final IRI Organization = createIRI(uri + "Organization");
    public static final IRI Person = createIRI(uri + "Person");
    public static final IRI SoftwareAgent = createIRI(uri + "SoftwareAgent");

    /* Qualified Classes */
    public static final IRI ActivityInfluence = createIRI(uri + "ActivityInfluence");
    public static final IRI AgentInfluence = createIRI(uri + "AgentInfluence");
    public static final IRI Association = createIRI(uri + "Association");
    public static final IRI Attribution = createIRI(uri + "Attribution");
    public static final IRI Communication = createIRI(uri + "Communication");
    public static final IRI Delegation = createIRI(uri + "Delegation");
    public static final IRI Derivation = createIRI(uri + "Derivation");
    public static final IRI End = createIRI(uri + "End");
    public static final IRI EntityInfluence = createIRI(uri + "EntityInfluence");
    public static final IRI Generation = createIRI(uri + "Generation");
    public static final IRI Influence = createIRI(uri + "Influence");
    public static final IRI InstantaneousEvent = createIRI(uri + "InstantaneousEvent");
    public static final IRI Invalidation = createIRI(uri + "Invalidation");
    public static final IRI Plan = createIRI(uri + "Plan");
    public static final IRI PrimarySource = createIRI(uri + "PrimarySource");
    public static final IRI Quotation = createIRI(uri + "Quotation");
    public static final IRI Revision = createIRI(uri + "Revision");
    public static final IRI Start = createIRI(uri + "Start");
    public static final IRI Usage = createIRI(uri + "Usage");

    /* Properties */
    public static final IRI actedOnBehalfOf = createIRI(uri + "actedOnBehalfOf");
    public static final IRI endedAtTime = createIRI(uri + "endedAtTime");
    public static final IRI startedAtTime = createIRI(uri + "startedAtTime");
    public static final IRI used = createIRI(uri + "used");
    public static final IRI wasAssociatedWith = createIRI(uri + "wasAssociatedWith");
    public static final IRI wasAttributedTo = createIRI(uri + "wasAttributedTo");
    public static final IRI wasDerivedFrom = createIRI(uri + "wasDerivedFrom");
    public static final IRI wasGeneratedBy = createIRI(uri + "wasGeneratedBy");
    public static final IRI wasInformedBy = createIRI(uri + "wasInformedBy");

    /* Expanded Properties */
    public static final IRI alternateOf = createIRI(uri + "alternateOf");
    public static final IRI atLocation = createIRI(uri + "atLocation");
    public static final IRI generated = createIRI(uri + "generated");
    public static final IRI generatedAtTime = createIRI(uri + "generatedAtTime");
    public static final IRI hadMember = createIRI(uri + "hadMember");
    public static final IRI hadPrimarySource = createIRI(uri + "hadPrimarySource");
    public static final IRI influenced = createIRI(uri + "influenced");
    public static final IRI invalidated = createIRI(uri + "invalidated");
    public static final IRI invalidatedAtTime = createIRI(uri + "invalidatedAtTime");
    public static final IRI specializationOf = createIRI(uri + "specializationOf");
    public static final IRI value = createIRI(uri + "value");
    public static final IRI wasEndedBy = createIRI(uri + "wasEndedBy");
    public static final IRI wasInvalidatedBy = createIRI(uri + "wasInvalidatedBy");
    public static final IRI wasQuotedFrom = createIRI(uri + "wasQuotedFrom");
    public static final IRI wasRevisionOf = createIRI(uri + "wasRevisionOf");
    public static final IRI wasStartedBy = createIRI(uri + "wasStartedBy");

    /* Qualified Properties */
    public static final IRI activity = createIRI(uri + "activity");
    public static final IRI agent = createIRI(uri + "agent");
    public static final IRI atTime = createIRI(uri + "atTime");
    public static final IRI entity = createIRI(uri + "entity");
    public static final IRI hadActivity = createIRI(uri + "hadActivity");
    public static final IRI hadGeneration = createIRI(uri + "hadGeneration");
    public static final IRI hadPlan = createIRI(uri + "hadPlan");
    public static final IRI hadRole = createIRI(uri + "hadRole");
    public static final IRI hadUsage = createIRI(uri + "hadUsage");
    public static final IRI influencer = createIRI(uri + "influencer");
    public static final IRI qualifiedAssociation = createIRI(uri + "qualifiedAssociation");
    public static final IRI qualifiedAttribution = createIRI(uri + "qualifiedAttribution");
    public static final IRI qualifiedCommunication = createIRI(uri + "qualifiedCommunication");
    public static final IRI qualifiedDelegation = createIRI(uri + "qualifiedDelegation");
    public static final IRI qualifiedDerivation = createIRI(uri + "qualifiedDerivation");
    public static final IRI qualifiedEnd = createIRI(uri + "qualifiedEnd");
    public static final IRI qualifiedGeneration = createIRI(uri + "qualifiedGeneration");
    public static final IRI qualifiedInfluence = createIRI(uri + "qualifiedInfluence");
    public static final IRI qualifiedInvalidation = createIRI(uri + "qualifiedInvalidation");
    public static final IRI qualifiedPrimarySource = createIRI(uri + "qualifiedPrimarySource");
    public static final IRI qualifiedQuotation = createIRI(uri + "qualifiedQuotation");
    public static final IRI qualifiedRevision = createIRI(uri + "qualifiedRevision");
    public static final IRI qualifiedStart = createIRI(uri + "qualifiedStart");
    public static final IRI qualifiedUsage = createIRI(uri + "qualifiedUsage");
    public static final IRI wasInfluencedBy = createIRI(uri + "wasInfluencedBy");

    private PROV() {
        super();
    }
}
