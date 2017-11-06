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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author acoburn
 */
public class IANATest extends AbstractVocabularyTest {

    public String namespace() {
        return "http://www.iana.org/assignments/relation/";
    }

    public Class vocabulary() {
        return IANA.class;
    }

    @Test
    @Override
    public void testVocabularyRev() {
        assertEquals(namespace() + "prev", IANA.prev.getIRIString());
        assertEquals(namespace() + "next", IANA.next.getIRIString());
        assertEquals(namespace() + "first", IANA.first.getIRIString());
        assertEquals(namespace() + "last", IANA.last.getIRIString());
    }

    @Test
    @Override
    public void testVocabulary() {
        assertEquals(namespace() + "canonical", IANA.canonical.getIRIString());
    }

    @Test
    public void checkUri() {
        assertEquals(namespace(), IANA.URI);
    }
}
