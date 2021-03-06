/* 
 * Copyright 2007 Luke Daley
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gldapo.schema
import gldapo.Gldapo
import gldapo.schema.annotation.GldapoNamingAttribute
import injecto.Injecto

class GldapoSchemaRegistrationTest extends GroovyTestCase 
{
    static r = new GldapoSchemaRegistration(GldapoSchemaRegistrationTestSubject, new Gldapo())
        
    void testItGotInjected() {
        assertTrue(Injecto.isInjected(GldapoSchemaRegistrationTestSubject, GldapoSchemaClassInjecto))
    }
    
    void testReturnsRightClass() {
        assertEquals(GldapoSchemaRegistrationTestSubject, r.schema)
    }
    
    void testGetsAttributeMappings() {
        assertTrue(r.attributeMappings instanceof Map)
        assertNotNull(r.attributeMappings)
    }
}

class GldapoSchemaRegistrationTestSubject {
    @GldapoNamingAttribute
    String name
}