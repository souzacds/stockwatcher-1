/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.stockwatcher.data.cassandra;

import java.math.BigDecimal;
import java.util.UUID;

import org.stockwatcher.data.DAOException;

import com.datastax.driver.core.LocalDate;

/**
 * Cassandra-specific DAO interface that provides methods for reading 
 * application properties.
 * 
 * @author Tony Piazza
 */
public interface ApplicationPropertyDAO extends org.stockwatcher.data.ApplicationPropertyDAO {
	boolean getBoolean(StatementOptions options, String propertyName) throws DAOException;
	int getInt(StatementOptions options, String propertyName) throws DAOException;
	long getLong(StatementOptions options, String propertyName) throws DAOException;
	LocalDate getDate(StatementOptions options, String propertyName) throws DAOException;
	float getFloat(StatementOptions options, String propertyName) throws DAOException;
	double getDouble(StatementOptions options, String propertyName) throws DAOException;
	BigDecimal getDecimal(StatementOptions options, String propertyName) throws DAOException;
	UUID getUUID(StatementOptions options, String propertyName) throws DAOException;
	String getString(StatementOptions options, String propertyName) throws DAOException;
}