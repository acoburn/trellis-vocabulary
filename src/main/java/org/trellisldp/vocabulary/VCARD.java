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
 * RDF Terms from the W3C vCARD Vocabulary
 *
 * @see <a href="https://www.w3.org/TR/vcard-rdf">vCARD</a>
 *
 * @author acoburn
 */
public final class VCARD extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "http://www.w3.org/2006/vcard/ns#";

    /* Classes */
    public static final IRI Acquaintance = createIRI(uri + "Acquaintance");
    public static final IRI Address = createIRI(uri + "Address");
    public static final IRI Agent = createIRI(uri + "Agent");
    public static final IRI Cell = createIRI(uri + "Cell");
    public static final IRI Child = createIRI(uri + "Child");
    public static final IRI Colleague = createIRI(uri + "Colleague");
    public static final IRI Contact = createIRI(uri + "Contact");
    public static final IRI Coresident = createIRI(uri + "Coresident");
    public static final IRI Coworker = createIRI(uri + "Coworker");
    public static final IRI Crush = createIRI(uri + "Crush");
    public static final IRI Date = createIRI(uri + "Date");
    public static final IRI Emergency = createIRI(uri + "Emergency");
    public static final IRI Fax = createIRI(uri + "Fax");
    public static final IRI Female = createIRI(uri + "Female");
    public static final IRI Friend = createIRI(uri + "Friend");
    public static final IRI Gender = createIRI(uri + "Gender");
    public static final IRI Group = createIRI(uri + "Group");
    public static final IRI Home = createIRI(uri + "Home");
    public static final IRI Individual = createIRI(uri + "Individual");
    public static final IRI Kin = createIRI(uri + "Kin");
    public static final IRI Kind = createIRI(uri + "Kind");
    public static final IRI Location = createIRI(uri + "Location");
    public static final IRI Male = createIRI(uri + "Male");
    public static final IRI Me = createIRI(uri + "Me");
    public static final IRI Met = createIRI(uri + "Met");
    public static final IRI Muse = createIRI(uri + "Muse");
    public static final IRI Name = createIRI(uri + "Name");
    public static final IRI Neighbor = createIRI(uri + "Neighbor");
    public static final IRI None = createIRI(uri + "None");
    public static final IRI Organization = createIRI(uri + "Organization");
    public static final IRI Other = createIRI(uri + "Other");
    public static final IRI Pager = createIRI(uri + "Pager");
    public static final IRI Parent = createIRI(uri + "Parent");
    public static final IRI RelatedType = createIRI(uri + "RelatedType");
    public static final IRI Sibling = createIRI(uri + "Sibling");
    public static final IRI Spouse = createIRI(uri + "Spouse");
    public static final IRI Sweetheart = createIRI(uri + "Sweetheart");
    public static final IRI TelephoneType = createIRI(uri + "TelephoneType");
    public static final IRI Text = createIRI(uri + "Text");
    public static final IRI TextPhone = createIRI(uri + "TextPhone");
    public static final IRI Type = createIRI(uri + "Type");
    public static final IRI Unknown = createIRI(uri + "Unknown");
    public static final IRI VCard = createIRI(uri + "VCard");
    public static final IRI Video = createIRI(uri + "Video");
    public static final IRI Voice = createIRI(uri + "Voice");
    public static final IRI Work = createIRI(uri + "Work");

    /* Object Properties */
    public static final IRI hasAdditionalName = createIRI(uri + "hasAdditionalName");
    public static final IRI hasAddress = createIRI(uri + "hasAddress");
    public static final IRI hasCalendarBusy = createIRI(uri + "hasCalendarBusy");
    public static final IRI hasCalendarLink = createIRI(uri + "hasCalendarLink");
    public static final IRI hasCalendarRequest = createIRI(uri + "hasCalendarRequest");
    public static final IRI hasCategory = createIRI(uri + "hasCategory");
    public static final IRI hasCountryName = createIRI(uri + "hasCountryName");
    public static final IRI hasEmail = createIRI(uri + "hasEmail");
    public static final IRI hasFamilyName = createIRI(uri + "hasFamilyName");
    public static final IRI hasFN = createIRI(uri + "hasFN");
    public static final IRI hasGender = createIRI(uri + "hasGender");
    public static final IRI hasGeo = createIRI(uri + "hasGeo");
    public static final IRI hasGivenName = createIRI(uri + "hasGivenName");
    public static final IRI hasHonorificPrefix = createIRI(uri + "hasHonorificPrefix");
    public static final IRI hasHonorificSuffix = createIRI(uri + "hasHonorificSuffix");
    public static final IRI hasInstantMessage = createIRI(uri + "hasInstantMessage");
    public static final IRI hasKey = createIRI(uri + "hasKey");
    public static final IRI hasLanguage = createIRI(uri + "hasLanguage");
    public static final IRI hasLocality = createIRI(uri + "hasLocality");
    public static final IRI hasLogo = createIRI(uri + "hasLogo");
    public static final IRI hasMember = createIRI(uri + "hasMember");
    public static final IRI hasName = createIRI(uri + "hasName");
    public static final IRI hasNickname = createIRI(uri + "hasNickname");
    public static final IRI hasNote = createIRI(uri + "hasNote");
    public static final IRI hasOrganizationName = createIRI(uri + "hasOrganizationName");
    public static final IRI hasOrganizationUnit = createIRI(uri + "hasOrganizationUnit");
    public static final IRI hasPhoto = createIRI(uri + "hasPhoto");
    public static final IRI hasPostalCode = createIRI(uri + "hasPostalCode");
    public static final IRI hasRegion = createIRI(uri + "hasRegion");
    public static final IRI hasRelated = createIRI(uri + "hasRelated");
    public static final IRI hasRole = createIRI(uri + "hasRole");
    public static final IRI hasSound = createIRI(uri + "hasSound");
    public static final IRI hasSource = createIRI(uri + "hasSource");
    public static final IRI hasStreetAddress = createIRI(uri + "hasStreetAddress");
    public static final IRI hasTelephone = createIRI(uri + "hasTelephone");
    public static final IRI hasTitle = createIRI(uri + "hasTitle");
    public static final IRI hasUID = createIRI(uri + "hasUID");
    public static final IRI hasURL = createIRI(uri + "hasURL");
    public static final IRI hasValue = createIRI(uri + "hasValue");

    /* Datatype Properties */
    public static final IRI additional_name = createIRI(uri + "additional-name");
    public static final IRI anniversary = createIRI(uri + "anniversary");
    public static final IRI bday = createIRI(uri + "bday");
    public static final IRI category = createIRI(uri + "category");
    public static final IRI country_name = createIRI(uri + "country-name");
    public static final IRI family_name = createIRI(uri + "family-name");
    public static final IRI fn = createIRI(uri + "fn");
    public static final IRI given_name = createIRI(uri + "given-name");
    public static final IRI honorific_prefix = createIRI(uri + "honorific-prefix");
    public static final IRI honorific_suffix = createIRI(uri + "honorific-suffix");
    public static final IRI language = createIRI(uri + "language");
    public static final IRI locality = createIRI(uri + "locality");
    public static final IRI nickname = createIRI(uri + "nickname");
    public static final IRI note = createIRI(uri + "note");
    public static final IRI organization_name = createIRI(uri + "organization-name");
    public static final IRI organization_unit = createIRI(uri + "organization-unit");
    public static final IRI postal_code = createIRI(uri + "postal-code");
    public static final IRI prodid = createIRI(uri + "prodid");
    public static final IRI region = createIRI(uri + "region");
    public static final IRI rev = createIRI(uri + "rev");
    public static final IRI role = createIRI(uri + "role");
    public static final IRI sort_string = createIRI(uri + "sort-string");
    public static final IRI street_address = createIRI(uri + "street-address");
    public static final IRI title = createIRI(uri + "title");
    public static final IRI tz = createIRI(uri + "tz");
    public static final IRI value = createIRI(uri + "value");

    private VCARD() {
        super();
    }
}
