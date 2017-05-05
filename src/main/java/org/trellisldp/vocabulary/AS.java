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
 * RDF Terms from the W3C Activity Streams Vocabulary
 *
 * @see <a href="https://www.w3.org/TR/activitystreams-vocabulary/">Activity Streams Vocabulary</a>
 *
 * @author acoburn
 */
public final class AS extends BaseVocabulary {

    /* Namespace */
    public static final String uri = "https://www.w3.org/ns/activitystreams#";

    /* Classes */
    public static final IRI Accept = createIRI(uri + "Accept");
    public static final IRI Activity = createIRI(uri + "Activity");
    public static final IRI IntransitiveActivity = createIRI(uri + "IntransitiveActivity");
    public static final IRI Add = createIRI(uri + "Add");
    public static final IRI Announce = createIRI(uri + "Announce");
    public static final IRI Application = createIRI(uri + "Application");
    public static final IRI Arrive = createIRI(uri + "Arrive");
    public static final IRI Article = createIRI(uri + "Article");
    public static final IRI Audio = createIRI(uri + "Audio");
    public static final IRI Block = createIRI(uri + "Block");
    public static final IRI Collection = createIRI(uri + "Collection");
    public static final IRI CollectionPage = createIRI(uri + "CollectionPage");
    public static final IRI Relationship = createIRI(uri + "Relationship");
    public static final IRI Create = createIRI(uri + "Create");
    public static final IRI Delete = createIRI(uri + "Delete");
    public static final IRI Dislike = createIRI(uri + "Dislike");
    public static final IRI Document = createIRI(uri + "Document");
    public static final IRI Event = createIRI(uri + "Event");
    public static final IRI Follow = createIRI(uri + "Follow");
    public static final IRI Flag = createIRI(uri + "Flag");
    public static final IRI Group = createIRI(uri + "Group");
    public static final IRI Ignore = createIRI(uri + "Ignore");
    public static final IRI Image = createIRI(uri + "Image");
    public static final IRI Invite = createIRI(uri + "Invite");
    public static final IRI Join = createIRI(uri + "Join");
    public static final IRI Leave = createIRI(uri + "Leave");
    public static final IRI Like = createIRI(uri + "Like");
    public static final IRI Link = createIRI(uri + "Link");
    public static final IRI Mention = createIRI(uri + "Mention");
    public static final IRI Note = createIRI(uri + "Note");
    public static final IRI Object = createIRI(uri + "Object");
    public static final IRI Offer = createIRI(uri + "Offer");
    public static final IRI OrderedCollection = createIRI(uri + "OrderedCollection");
    public static final IRI OrderedCollectionPage = createIRI(uri + "OrderedCollectionPage");
    public static final IRI Organization = createIRI(uri + "Organization");
    public static final IRI Page = createIRI(uri + "Page");
    public static final IRI Person = createIRI(uri + "Person");
    public static final IRI Place = createIRI(uri + "Place");
    public static final IRI Profile = createIRI(uri + "Profile");
    public static final IRI Question = createIRI(uri + "Question");
    public static final IRI Reject = createIRI(uri + "Reject");
    public static final IRI Remove = createIRI(uri + "Remove");
    public static final IRI Service = createIRI(uri + "Service");
    public static final IRI TentativeAccept = createIRI(uri + "TentativeAccept");
    public static final IRI TentativeReject = createIRI(uri + "TentativeReject");
    public static final IRI Tombstone = createIRI(uri + "Tombstone");
    public static final IRI Undo = createIRI(uri + "Undo");
    public static final IRI Update = createIRI(uri + "Update");
    public static final IRI Video = createIRI(uri + "Video");
    public static final IRI View = createIRI(uri + "View");
    public static final IRI Listen = createIRI(uri + "Listen");
    public static final IRI Read = createIRI(uri + "Read");
    public static final IRI Move = createIRI(uri + "Move");
    public static final IRI Travel = createIRI(uri + "Travel");
    public static final IRI IsFollowing = createIRI(uri + "IsFollowing");
    public static final IRI IsFollowedBy = createIRI(uri + "IsFollowedBy");
    public static final IRI IsContact = createIRI(uri + "IsContact");
    public static final IRI IsMember = createIRI(uri + "IsMember");

    /* Properties */
    public static final IRI subject = createIRI(uri + "subject");
    public static final IRI relationship = createIRI(uri + "relationship");
    public static final IRI actor = createIRI(uri + "actor");
    public static final IRI attributedTo = createIRI(uri + "attributedTo");
    public static final IRI attachment = createIRI(uri + "attachment");
    public static final IRI attachments = createIRI(uri + "attachments");
    public static final IRI author = createIRI(uri + "author");
    public static final IRI bcc = createIRI(uri + "bcc");
    public static final IRI bto = createIRI(uri + "bto");
    public static final IRI cc = createIRI(uri + "cc");
    public static final IRI context = createIRI(uri + "context");
    public static final IRI current = createIRI(uri + "current");
    public static final IRI first = createIRI(uri + "first");
    public static final IRI generator = createIRI(uri + "generator");
    public static final IRI icon = createIRI(uri + "icon");
    public static final IRI image = createIRI(uri + "image");
    public static final IRI inReplyTo = createIRI(uri + "inReplyTo");
    public static final IRI items = createIRI(uri + "items");
    public static final IRI instrument = createIRI(uri + "instrument");
    public static final IRI last = createIRI(uri + "last");
    public static final IRI location = createIRI(uri + "location");
    public static final IRI next = createIRI(uri + "next");
    public static final IRI object = createIRI(uri + "object");
    public static final IRI oneOf = createIRI(uri + "oneOf");
    public static final IRI anyOf = createIRI(uri + "anyOf");
    public static final IRI closed = createIRI(uri + "closed");
    public static final IRI origin = createIRI(uri + "origin");
    public static final IRI accuracy = createIRI(uri + "accuracy");
    public static final IRI prev = createIRI(uri + "prev");
    public static final IRI preview = createIRI(uri + "preview");
    public static final IRI provider = createIRI(uri + "provider");
    public static final IRI replies = createIRI(uri + "replies");
    public static final IRI result = createIRI(uri + "result");
    public static final IRI audience = createIRI(uri + "audience");
    public static final IRI partOf = createIRI(uri + "partOf");
    public static final IRI tag = createIRI(uri + "tag");
    public static final IRI target = createIRI(uri + "target");
    public static final IRI to = createIRI(uri + "to");
    public static final IRI url = createIRI(uri + "url");
    public static final IRI altitude = createIRI(uri + "altitude");
    public static final IRI content = createIRI(uri + "content");
    public static final IRI name = createIRI(uri + "name");
    public static final IRI downStreamDuplicates = createIRI(uri + "downStreamDuplicates");
    public static final IRI duration = createIRI(uri + "duration");
    public static final IRI endTime = createIRI(uri + "endTime");
    public static final IRI height = createIRI(uri + "height");
    public static final IRI href = createIRI(uri + "href");
    public static final IRI hreflang = createIRI(uri + "hreflang");
    public static final IRI latitude = createIRI(uri + "latitude");
    public static final IRI longitude = createIRI(uri + "longitude");
    public static final IRI mediaType = createIRI(uri + "mediaType");
    public static final IRI published = createIRI(uri + "published");
    public static final IRI radius = createIRI(uri + "radius");
    public static final IRI rating = createIRI(uri + "rating");
    public static final IRI rel = createIRI(uri + "rel");
    public static final IRI startIndex = createIRI(uri + "startIndex");
    public static final IRI startTime = createIRI(uri + "startTime");
    public static final IRI summary = createIRI(uri + "summary");
    public static final IRI totalItems = createIRI(uri + "totalItems");
    public static final IRI units = createIRI(uri + "units");
    public static final IRI updated = createIRI(uri + "updated");
    public static final IRI upstreamDuplicates = createIRI(uri + "upstreamDuplicates");
    public static final IRI verb = createIRI(uri + "verb");
    public static final IRI width = createIRI(uri + "width");
    public static final IRI describes = createIRI(uri + "describes");
    public static final IRI formerType = createIRI(uri + "formerType");
    public static final IRI deleted = createIRI(uri + "deleted");
    public static final IRI outbox = createIRI(uri + "outbox");
    public static final IRI following = createIRI(uri + "following");
    public static final IRI followers = createIRI(uri + "followers");
    public static final IRI streams = createIRI(uri + "streams");
    public static final IRI preferredUsername = createIRI(uri + "preferredUsername");
    public static final IRI endpoints = createIRI(uri + "endpoints");
    public static final IRI uploadMedia = createIRI(uri + "uploadMedia");
    public static final IRI proxyUrl = createIRI(uri + "proxyUrl");
    public static final IRI oauthClientAuthorize = createIRI(uri + "oauthClientAuthorize");
    public static final IRI provideClientKey = createIRI(uri + "provideClientKey");
    public static final IRI authorizeClientKey = createIRI(uri + "authorizeClientKey");
    public static final IRI source = createIRI(uri + "source");

    private AS() {
        super();
    }
}
