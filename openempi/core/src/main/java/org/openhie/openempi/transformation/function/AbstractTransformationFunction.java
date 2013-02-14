/**
 *
 *  Copyright (C) 2009 SYSNET International, Inc. <support@sysnetint.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 *
 */
package org.openhie.openempi.transformation.function;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openhie.openempi.model.FieldType.FieldTypeEnum;

public abstract class AbstractTransformationFunction implements TransformationFunction
{
	protected final Log log = LogFactory.getLog(getClass());

	private Map<String, String> configuration;

	private String name;
	private FieldTypeEnum inputType;
	private FieldTypeEnum outputType;
	
	public AbstractTransformationFunction() {
	}
	
	public AbstractTransformationFunction(String name) {
		this.name = name;
	}
	
	public void init(Map<String, String> configParameters) {
		configuration = configParameters;
	}

	public abstract Object transform(Object field, Map<String, Object> parameters);

	public Map<String, String> getConfiguration() {
		return configuration;
	}

	public void setConfiguration(Map<String, String> configuration) {
		this.configuration = configuration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FieldTypeEnum getInputType() {
		return inputType;
	}

	public void setInputType(FieldTypeEnum inputType) {
		this.inputType = inputType;
	}

	public FieldTypeEnum getOutputType() {
		return outputType;
	}

	public void setOutputType(FieldTypeEnum outputType) {
		this.outputType = outputType;
	}

}
