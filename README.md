# trellis-vocabulary

[![Build Status](https://travis-ci.org/trellis-ldp/trellis-vocabulary.png?branch=master)](https://travis-ci.org/trellis-ldp/trellis-vocabulary)
[![Build status](https://ci.appveyor.com/api/projects/status/pj37pv708p8u1cl2?svg=true)](https://ci.appveyor.com/project/acoburn/trellis-vocabulary)
[![Coverage Status](https://coveralls.io/repos/github/trellis-ldp/trellis-vocabulary/badge.svg?branch=master)](https://coveralls.io/github/trellis-ldp/trellis-vocabulary?branch=master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.trellisldp/trellis-vocabulary/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.trellisldp/trellis-vocabulary/)
[![Code Climate](https://codeclimate.com/github/trellis-ldp/trellis-vocabulary/badges/gpa.svg)](https://codeclimate.com/github/trellis-ldp/trellis-vocabulary)

RDF vocabularies used by a trellis repository

## Vocabularies

The following vocabularies are defined in this package:

  * `ACL`: [Web Access Control](https://www.w3.org/wiki/WebAccessControl) (W3C)
  * `AS`: [Activity Streams](https://www.w3.org/TR/activitystreams-vocabulary/) (W3C)
  * `DC`: [DCMI Metadata Terms](http://dublincore.org/documents/dcmi-terms/) (DCMI)
  * `FOAF`: [Friend of a Friend](http://xmlns.com/foaf/spec/)
  * `IANA`: [Link Relations Vocabulary](https://www.iana.org/assignments/link-relations/link-relations.xhtml) (IANA)
  * `JSONLD`: [The JSON-LD Vocabulary](https://www.w3.org/ns/json-ld) (W3C)
  * `LDP`: [Linked Data Platform](https://www.w3.org/ns/ldp) (W3C)
  * `Memento`: [Time-Based Access to Resources](https://tools.ietf.org/html/rfc7089)
  * `OA`: [Web Annotation](https://www.w3.org/ns/oa) (W3C)
  * `PROV`: [Provenance Vocabulary](http://www.w3.org/TR/prov-o/) (W3C)
  * `RDF` and `RDFS`: [RDF Schema 1.1](https://www.w3.org/TR/rdf-schema/) (W3C)
  * `SKOS`: [Simple Knowledge Organization System](https://www.w3.org/2009/08/skos-reference/skos.html) (W3C)
  * `Time`: [OWL-Time](https://www.w3.org/TR/owl-time/) (W3C)
  * `Trellis`: [Trellis Vocabulary](http://www.trellisldp.org/ns/trellis)
  * `VCARD`: [vCard Ontology](https://www.w3.org/TR/vcard-rdf) (W3C)
  * `XSD`: [XML Schema](https://www.w3.org/TR/xmlschema-2/) (W3C)

## Building

This code requires Java 8 and can be built with Gradle:

    ./gradlew install
