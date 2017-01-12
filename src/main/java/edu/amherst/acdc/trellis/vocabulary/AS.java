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
 * RDF Terms from the W3C Activity Streams Vocabulary
 *
 * @see <a href="https://www.w3.org/TR/activitystreams-vocabulary/">Activity Streams Vocabulary</a>
 *
 * @author acoburn
 */
public class AS extends AbstractVocabulary {

    /* Namespace */
    public static String uri = "https://www.w3.org/ns/activitystreams#";

    /* Classes */
    public static IRI Accept = createIRI(uri + "Accept");
    public static IRI Activity = createIRI(uri + "Activity");
    public static IRI IntransitiveActivity = createIRI(uri + "IntransitiveActivity");
    public static IRI Add = createIRI(uri + "Add");
    public static IRI Announce = createIRI(uri + "Announce");
    public static IRI Application = createIRI(uri + "Application");
    public static IRI Arrive = createIRI(uri + "Arrive");
    public static IRI Article = createIRI(uri + "Article");
    public static IRI Audio = createIRI(uri + "Audio");
    public static IRI Block = createIRI(uri + "Block");
    public static IRI Collection = createIRI(uri + "Collection");
    public static IRI CollectionPage = createIRI(uri + "CollectionPage");
    public static IRI Relationship = createIRI(uri + "Relationship");
    public static IRI Create = createIRI(uri + "Create");
    public static IRI Delete = createIRI(uri + "Delete");
    public static IRI Dislike = createIRI(uri + "Dislike");
    public static IRI Document = createIRI(uri + "Document");
    public static IRI Event = createIRI(uri + "Event");
    public static IRI Follow = createIRI(uri + "Follow");
    public static IRI Flag = createIRI(uri + "Flag");
    public static IRI Group = createIRI(uri + "Group");
    public static IRI Ignore = createIRI(uri + "Ignore");
    public static IRI Image = createIRI(uri + "Image");
    public static IRI Invite = createIRI(uri + "Invite");
    public static IRI Join = createIRI(uri + "Join");
    public static IRI Leave = createIRI(uri + "Leave");
    public static IRI Like = createIRI(uri + "Like");
    public static IRI Link = createIRI(uri + "Link");
    public static IRI Mention = createIRI(uri + "Mention");
    public static IRI Note = createIRI(uri + "Note");
    public static IRI Object = createIRI(uri + "Object");
    public static IRI Offer = createIRI(uri + "Offer");
    public static IRI OrderedCollection = createIRI(uri + "OrderedCollection");
    public static IRI OrderedCollectionPage = createIRI(uri + "OrderedCollectionPage");
    public static IRI Organization = createIRI(uri + "Organization");
    public static IRI Page = createIRI(uri + "Page");
    public static IRI Person = createIRI(uri + "Person");
    public static IRI Place = createIRI(uri + "Place");
    public static IRI Profile = createIRI(uri + "Profile");
    public static IRI Question = createIRI(uri + "Question");
    public static IRI Reject = createIRI(uri + "Reject");
    public static IRI Remove = createIRI(uri + "Remove");
    public static IRI Service = createIRI(uri + "Service");
    public static IRI TentativeAccept = createIRI(uri + "TentativeAccept");
    public static IRI TentativeReject = createIRI(uri + "TentativeReject");
    public static IRI Tombstone = createIRI(uri + "Tombstone");
    public static IRI Undo = createIRI(uri + "Undo");
    public static IRI Update = createIRI(uri + "Update");
    public static IRI Video = createIRI(uri + "Video");
    public static IRI View = createIRI(uri + "View");
    public static IRI Listen = createIRI(uri + "Listen");
    public static IRI Read = createIRI(uri + "Read");
    public static IRI Move = createIRI(uri + "Move");
    public static IRI Travel = createIRI(uri + "Travel");
    public static IRI IsFollowing = createIRI(uri + "IsFollowing");
    public static IRI IsFollowedBy = createIRI(uri + "IsFollowedBy");
    public static IRI IsContact = createIRI(uri + "IsContact");
    public static IRI IsMember = createIRI(uri + "IsMember");

    /* Properties */
    public static IRI subject = createIRI(uri + "subject");
    public static IRI relationship = createIRI(uri + "relationship");
    public static IRI actor = createIRI(uri + "actor");
    public static IRI attributedTo = createIRI(uri + "attributedTo");
    public static IRI attachment = createIRI(uri + "attachment");
    public static IRI attachments = createIRI(uri + "attachments");
    public static IRI author = createIRI(uri + "author");
    public static IRI bcc = createIRI(uri + "bcc");
    public static IRI bto = createIRI(uri + "bto");
    public static IRI cc = createIRI(uri + "cc");
    public static IRI context = createIRI(uri + "context");
    public static IRI current = createIRI(uri + "current");
    public static IRI first = createIRI(uri + "first");
    public static IRI generator = createIRI(uri + "generator");
    public static IRI icon = createIRI(uri + "icon");
    public static IRI image = createIRI(uri + "image");
    public static IRI inReplyTo = createIRI(uri + "inReplyTo");
    public static IRI items = createIRI(uri + "items");
    public static IRI instrument = createIRI(uri + "instrument");
    public static IRI last = createIRI(uri + "last");
    public static IRI location = createIRI(uri + "location");
    public static IRI next = createIRI(uri + "next");
    public static IRI object = createIRI(uri + "object");
    public static IRI oneOf = createIRI(uri + "oneOf");
    public static IRI anyOf = createIRI(uri + "anyOf");
    public static IRI closed = createIRI(uri + "closed");
    public static IRI origin = createIRI(uri + "origin");
    public static IRI accuracy = createIRI(uri + "accuracy");
    public static IRI prev = createIRI(uri + "prev");
    public static IRI preview = createIRI(uri + "preview");
    public static IRI provider = createIRI(uri + "provider");
    public static IRI replies = createIRI(uri + "replies");
    public static IRI result = createIRI(uri + "result");
    public static IRI audience = createIRI(uri + "audience");
    public static IRI partOf = createIRI(uri + "partOf");
    public static IRI tag = createIRI(uri + "tag");
    public static IRI target = createIRI(uri + "target");
    public static IRI to = createIRI(uri + "to");
    public static IRI url = createIRI(uri + "url");
    public static IRI altitude = createIRI(uri + "altitude");
    public static IRI content = createIRI(uri + "content");
    public static IRI name = createIRI(uri + "name");
    public static IRI downStreamDuplicates = createIRI(uri + "downStreamDuplicates");
    public static IRI duration = createIRI(uri + "duration");
    public static IRI endTime = createIRI(uri + "endTime");
    public static IRI height = createIRI(uri + "height");
    public static IRI href = createIRI(uri + "href");
    public static IRI hreflang = createIRI(uri + "hreflang");
    public static IRI latitude = createIRI(uri + "latitude");
    public static IRI longitude = createIRI(uri + "longitude");
    public static IRI mediaType = createIRI(uri + "mediaType");
    public static IRI published = createIRI(uri + "published");
    public static IRI radius = createIRI(uri + "radius");
    public static IRI rating = createIRI(uri + "rating");
    public static IRI rel = createIRI(uri + "rel");
    public static IRI startIndex = createIRI(uri + "startIndex");
    public static IRI startTime = createIRI(uri + "startTime");
    public static IRI summary = createIRI(uri + "summary");
    public static IRI totalItems = createIRI(uri + "totalItems");
    public static IRI units = createIRI(uri + "units");
    public static IRI updated = createIRI(uri + "updated");
    public static IRI upstreamDuplicates = createIRI(uri + "upstreamDuplicates");
    public static IRI verb = createIRI(uri + "verb");
    public static IRI width = createIRI(uri + "width");
    public static IRI describes = createIRI(uri + "describes");
    public static IRI formerType = createIRI(uri + "formerType");
    public static IRI deleted = createIRI(uri + "deleted");
    public static IRI outbox = createIRI(uri + "outbox");
    public static IRI following = createIRI(uri + "following");
    public static IRI followers = createIRI(uri + "followers");
    public static IRI streams = createIRI(uri + "streams");
    public static IRI preferredUsername = createIRI(uri + "preferredUsername");
    public static IRI endpoints = createIRI(uri + "endpoints");
    public static IRI uploadMedia = createIRI(uri + "uploadMedia");
    public static IRI proxyUrl = createIRI(uri + "proxyUrl");
    public static IRI oauthClientAuthorize = createIRI(uri + "oauthClientAuthorize");
    public static IRI provideClientKey = createIRI(uri + "provideClientKey");
    public static IRI authorizeClientKey = createIRI(uri + "authorizeClientKey");
    public static IRI source = createIRI(uri + "source");

    private AS() {
        // prevent instantiation
    }
}
