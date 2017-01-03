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
 * RDF Terms from the W3C Activity Streams Vocabulary
 *
 * @see <a href="https://www.w3.org/TR/activitystreams-vocabulary/">Activity Streams Vocabulary</a>
 *
 * @author acoburn
 */
public class AS {

    private static RDF rdf = new SimpleRDF();

    /* Namespace */
    public static String uri = "https://www.w3.org/ns/activitystreams#";

    /* Classes */
    public static IRI Accept = rdf.createIRI(uri + "Accept");
    public static IRI Activity = rdf.createIRI(uri + "Activity");
    public static IRI IntransitiveActivity = rdf.createIRI(uri + "IntransitiveActivity");
    public static IRI Add = rdf.createIRI(uri + "Add");
    public static IRI Announce = rdf.createIRI(uri + "Announce");
    public static IRI Application = rdf.createIRI(uri + "Application");
    public static IRI Arrive = rdf.createIRI(uri + "Arrive");
    public static IRI Article = rdf.createIRI(uri + "Article");
    public static IRI Audio = rdf.createIRI(uri + "Audio");
    public static IRI Block = rdf.createIRI(uri + "Block");
    public static IRI Collection = rdf.createIRI(uri + "Collection");
    public static IRI CollectionPage = rdf.createIRI(uri + "CollectionPage");
    public static IRI Relationship = rdf.createIRI(uri + "Relationship");
    public static IRI Create = rdf.createIRI(uri + "Create");
    public static IRI Delete = rdf.createIRI(uri + "Delete");
    public static IRI Dislike = rdf.createIRI(uri + "Dislike");
    public static IRI Document = rdf.createIRI(uri + "Document");
    public static IRI Event = rdf.createIRI(uri + "Event");
    public static IRI Follow = rdf.createIRI(uri + "Follow");
    public static IRI Flag = rdf.createIRI(uri + "Flag");
    public static IRI Group = rdf.createIRI(uri + "Group");
    public static IRI Ignore = rdf.createIRI(uri + "Ignore");
    public static IRI Image = rdf.createIRI(uri + "Image");
    public static IRI Invite = rdf.createIRI(uri + "Invite");
    public static IRI Join = rdf.createIRI(uri + "Join");
    public static IRI Leave = rdf.createIRI(uri + "Leave");
    public static IRI Like = rdf.createIRI(uri + "Like");
    public static IRI Link = rdf.createIRI(uri + "Link");
    public static IRI Mention = rdf.createIRI(uri + "Mention");
    public static IRI Note = rdf.createIRI(uri + "Note");
    public static IRI Object = rdf.createIRI(uri + "Object");
    public static IRI Offer = rdf.createIRI(uri + "Offer");
    public static IRI OrderedCollection = rdf.createIRI(uri + "OrderedCollection");
    public static IRI OrderedCollectionPage = rdf.createIRI(uri + "OrderedCollectionPage");
    public static IRI Organization = rdf.createIRI(uri + "Organization");
    public static IRI Page = rdf.createIRI(uri + "Page");
    public static IRI Person = rdf.createIRI(uri + "Person");
    public static IRI Place = rdf.createIRI(uri + "Place");
    public static IRI Profile = rdf.createIRI(uri + "Profile");
    public static IRI Question = rdf.createIRI(uri + "Question");
    public static IRI Reject = rdf.createIRI(uri + "Reject");
    public static IRI Remove = rdf.createIRI(uri + "Remove");
    public static IRI Service = rdf.createIRI(uri + "Service");
    public static IRI TentativeAccept = rdf.createIRI(uri + "TentativeAccept");
    public static IRI TentativeReject = rdf.createIRI(uri + "TentativeReject");
    public static IRI Tombstone = rdf.createIRI(uri + "Tombstone");
    public static IRI Undo = rdf.createIRI(uri + "Undo");
    public static IRI Update = rdf.createIRI(uri + "Update");
    public static IRI Video = rdf.createIRI(uri + "Video");
    public static IRI View = rdf.createIRI(uri + "View");
    public static IRI Listen = rdf.createIRI(uri + "Listen");
    public static IRI Read = rdf.createIRI(uri + "Read");
    public static IRI Move = rdf.createIRI(uri + "Move");
    public static IRI Travel = rdf.createIRI(uri + "Travel");
    public static IRI IsFollowing = rdf.createIRI(uri + "IsFollowing");
    public static IRI IsFollowedBy = rdf.createIRI(uri + "IsFollowedBy");
    public static IRI IsContact = rdf.createIRI(uri + "IsContact");
    public static IRI IsMember = rdf.createIRI(uri + "IsMember");

    /* Properties */
    public static IRI subject = rdf.createIRI(uri + "subject");
    public static IRI relationship = rdf.createIRI(uri + "relationship");
    public static IRI actor = rdf.createIRI(uri + "actor");
    public static IRI attributedTo = rdf.createIRI(uri + "attributedTo");
    public static IRI attachment = rdf.createIRI(uri + "attachment");
    public static IRI attachments = rdf.createIRI(uri + "attachments");
    public static IRI author = rdf.createIRI(uri + "author");
    public static IRI bcc = rdf.createIRI(uri + "bcc");
    public static IRI bto = rdf.createIRI(uri + "bto");
    public static IRI cc = rdf.createIRI(uri + "cc");
    public static IRI context = rdf.createIRI(uri + "context");
    public static IRI current = rdf.createIRI(uri + "current");
    public static IRI first = rdf.createIRI(uri + "first");
    public static IRI generator = rdf.createIRI(uri + "generator");
    public static IRI icon = rdf.createIRI(uri + "icon");
    public static IRI image = rdf.createIRI(uri + "image");
    public static IRI inReplyTo = rdf.createIRI(uri + "inReplyTo");
    public static IRI items = rdf.createIRI(uri + "items");
    public static IRI instrument = rdf.createIRI(uri + "instrument");
    public static IRI last = rdf.createIRI(uri + "last");
    public static IRI location = rdf.createIRI(uri + "location");
    public static IRI next = rdf.createIRI(uri + "next");
    public static IRI object = rdf.createIRI(uri + "object");
    public static IRI oneOf = rdf.createIRI(uri + "oneOf");
    public static IRI anyOf = rdf.createIRI(uri + "anyOf");
    public static IRI closed = rdf.createIRI(uri + "closed");
    public static IRI origin = rdf.createIRI(uri + "origin");
    public static IRI accuracy = rdf.createIRI(uri + "accuracy");
    public static IRI prev = rdf.createIRI(uri + "prev");
    public static IRI preview = rdf.createIRI(uri + "preview");
    public static IRI provider = rdf.createIRI(uri + "provider");
    public static IRI replies = rdf.createIRI(uri + "replies");
    public static IRI result = rdf.createIRI(uri + "result");
    public static IRI audience = rdf.createIRI(uri + "audience");
    public static IRI partOf = rdf.createIRI(uri + "partOf");
    public static IRI tag = rdf.createIRI(uri + "tag");
    public static IRI target = rdf.createIRI(uri + "target");
    public static IRI to = rdf.createIRI(uri + "to");
    public static IRI url = rdf.createIRI(uri + "url");
    public static IRI altitude = rdf.createIRI(uri + "altitude");
    public static IRI content = rdf.createIRI(uri + "content");
    public static IRI name = rdf.createIRI(uri + "name");
    public static IRI downStreamDuplicates = rdf.createIRI(uri + "downStreamDuplicates");
    public static IRI duration = rdf.createIRI(uri + "duration");
    public static IRI endTime = rdf.createIRI(uri + "endTime");
    public static IRI height = rdf.createIRI(uri + "height");
    public static IRI href = rdf.createIRI(uri + "href");
    public static IRI hreflang = rdf.createIRI(uri + "hreflang");
    public static IRI latitude = rdf.createIRI(uri + "latitude");
    public static IRI longitude = rdf.createIRI(uri + "longitude");
    public static IRI mediaType = rdf.createIRI(uri + "mediaType");
    public static IRI published = rdf.createIRI(uri + "published");
    public static IRI radius = rdf.createIRI(uri + "radius");
    public static IRI rating = rdf.createIRI(uri + "rating");
    public static IRI rel = rdf.createIRI(uri + "rel");
    public static IRI startIndex = rdf.createIRI(uri + "startIndex");
    public static IRI startTime = rdf.createIRI(uri + "startTime");
    public static IRI summary = rdf.createIRI(uri + "summary");
    public static IRI totalItems = rdf.createIRI(uri + "totalItems");
    public static IRI units = rdf.createIRI(uri + "units");
    public static IRI updated = rdf.createIRI(uri + "updated");
    public static IRI upstreamDuplicates = rdf.createIRI(uri + "upstreamDuplicates");
    public static IRI verb = rdf.createIRI(uri + "verb");
    public static IRI width = rdf.createIRI(uri + "width");
    public static IRI describes = rdf.createIRI(uri + "describes");
    public static IRI formerType = rdf.createIRI(uri + "formerType");
    public static IRI deleted = rdf.createIRI(uri + "deleted");
    public static IRI outbox = rdf.createIRI(uri + "outbox");
    public static IRI following = rdf.createIRI(uri + "following");
    public static IRI followers = rdf.createIRI(uri + "followers");
    public static IRI streams = rdf.createIRI(uri + "streams");
    public static IRI preferredUsername = rdf.createIRI(uri + "preferredUsername");
    public static IRI endpoints = rdf.createIRI(uri + "endpoints");
    public static IRI uploadMedia = rdf.createIRI(uri + "uploadMedia");
    public static IRI proxyUrl = rdf.createIRI(uri + "proxyUrl");
    public static IRI oauthClientAuthorize = rdf.createIRI(uri + "oauthClientAuthorize");
    public static IRI provideClientKey = rdf.createIRI(uri + "provideClientKey");
    public static IRI authorizeClientKey = rdf.createIRI(uri + "authorizeClientKey");
    public static IRI source = rdf.createIRI(uri + "source");

    private AS() {
        // prevent instantiation
    }
}
