/**
 * 
 *  Copyright (C) 2013 Vanderbilt University <csaba.toth, b.malin @vanderbilt.edu>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.openhie.openempi.loader;

import java.io.Serializable;

import org.openhie.openempi.model.BaseObject;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;

public class DataLoaderServiceType extends BaseObject implements Serializable
{
	private static final long serialVersionUID = 2479311272097801489L;

	private String name;
	private DataLoaderService dataServiceService;
	
	public DataLoaderServiceType(String name, DataLoaderService dataServiceService) {
		this.name = name;
		this.dataServiceService = dataServiceService;
	}

	public DataLoaderService getDataServiceService() {
		return dataServiceService;
	}

	public void setDataServiceService(DataLoaderService dataServiceService) {
		this.dataServiceService = dataServiceService;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(final Object other) {
		if (!(other instanceof DataLoaderServiceType))
			return false;
		DataLoaderServiceType castOther = (DataLoaderServiceType) other;
		return new EqualsBuilder()
				.append(name, castOther.name)
				.append(dataServiceService, castOther.dataServiceService)
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(name)
				.append(dataServiceService)
				.toHashCode();
	}

	@Override
	public String toString() {
		return name;
	}
}
