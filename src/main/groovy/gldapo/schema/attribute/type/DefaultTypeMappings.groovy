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
package gldapo.schema.attribute.type

import java.math.BigInteger
import java.math.BigDecimal
import org.springframework.ldap.core.DistinguishedName

class DefaultTypeMappings 
{
    /**
     * Default type mapping for <strong>String<strong> type
     * 
     * @param value The string representation
     * @return The exact same value that was passed in
     */
    static mapToStringType(value) {
        if (value instanceof byte[] || value instanceof Byte[]) {
            return new String(value)
        } else {
            return value as String
        }
    }

    /**
     * 
     */
    static mapFromStringType(value) {
        value as String
    }

    static mapTobyteArrayType(value) {
        value as byte[]
    }

    static mapFrombyteArrayType(value) {
        value as byte[]
    }

    static mapToByteArrayType(value) {
        value as Byte[]
    }

    static mapFromByteArrayType(value) {
        value as byte[]
    }
    
    /**
     * Default type mapping for <strong>Integer<strong> type
     * 
     * Uses new Integer(String) to convert.
     * 
     * @param value The string representation
     * @return The exact same value that was passed in
     * @throws NumberFormatException if the string can't be converted into an Integer
     */    
    static mapToIntegerType(value) throws NumberFormatException {
        new Integer(value)
    }

    /**
     * 
     */
     static mapFromIntegerType(value) {
        value.toString()
     }
     
    /**
     * Default type mapping for <strong>BigInteger<strong> type
     * 
     * Uses new BigInteger(String) to convert.
     * 
     * @param value The string representation
     * @return The exact same value that was passed in
     * @throws NumberFormatException if the string can't be converted into a BigInteger
     */    
    static mapToBigIntegerType(value) throws NumberFormatException {
        new BigInteger(value)
    }
    
    /**
     * Default type mapping for <strong>Decimal<strong> type
     * 
     * Uses new Decimal(String) to convert.
     * 
     * @param value The string representation
     * @return The exact same value that was passed in
     * @throws NumberFormatException if the string can't be converted into a Decimal
     */    
    static mapToBigDecimalType(value) throws NumberFormatException {
        new BigDecimal(value)
    }
    
    /**
     * Default type mapping for <strong>Double<strong> type
     * 
     * Uses new Double(String) to convert.
     * 
     * @param value The string representation
     * @return The exact same value that was passed in
     * @throws NumberFormatException if the string can't be converted into a Double
     */    
    static mapToDoubleType(value) throws NumberFormatException {
        new Double(value)
    }
    
    /**
     * Default type mapping for <strong>Float<strong> type
     * 
     * Uses new Float(String) to convert.
     * 
     * @param value The string representation
     * @return The exact same value that was passed in
     * @throws NumberFormatException if the string can't be converted into a Float
     */    
    static mapToFloatType(value) throws NumberFormatException {
        new Float(value)
    }
    
    /**
     * 
     */
    static mapFromFloatType(value) {
        value.toString()
    }

    /**
     * Default type mapping for <strong>Long<strong> type
     * 
     * Uses new Long(String) to convert.
     * 
     * @param value The string representation
     * @return The exact same value that was passed in
     * @throws NumberFormatException if the string can't be converted into a Long
     */    
    static mapToLongType(value) throws NumberFormatException {
        new Long(value)
    }
    
    static mapFromLongType(value) {
        value.toString()
    }

    /**
     * Default type mapping for <strong>Short<strong> type
     * 
     * Uses new Short(String) to convert.
     * 
     * @param value The string representation
     * @return The exact same value that was passed in
     * @throws NumberFormatException if the string can't be converted into a Short
     */    
    static mapToShortType(value) throws NumberFormatException {
        new Short(value)
    }
    
    static mapFromShortType(value) {
        value.toString()
    }
    
    static mapToDistinguishedNameType(value) {
        new DistinguishedName(value)
    }
    
    static mapFromDistinguishedNameType(value) {
        value.toString()
    }
    
    static mapToBooleanType(value) {
        new Boolean(value)
    }
    
    static mapFromBooleanType(value) {
        value.toString().toUpperCase()
    }
}