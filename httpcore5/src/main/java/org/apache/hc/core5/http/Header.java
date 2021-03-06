/*
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.hc.core5.http;

/**
 * Represents an HTTP header field consisting of a field name and a field
 * value.
 *
 * @since 4.0
 */
public interface Header extends NameValuePair {

    /**
     * Returns {@code true} if the header should be considered sensitive.
     * <p>
     * Some encoding schemes such as HPACK impose restrictions on encoded
     * representation of sensitive headers.
     * </p>
     *
     * @return {@code true} if the header should be considered sensitive.
     *
     * @since 5.0
     */
    boolean isSensitive();

}
