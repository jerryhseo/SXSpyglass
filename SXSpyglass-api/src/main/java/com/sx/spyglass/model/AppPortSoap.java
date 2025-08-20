/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sx.spyglass.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AppPortSoap implements Serializable {

	public static AppPortSoap toSoapModel(AppPort model) {
		AppPortSoap soapModel = new AppPortSoap();

		soapModel.setAppPortId(model.getAppPortId());
		soapModel.setScienceAppId(model.getScienceAppId());
		soapModel.setDataTypeId(model.getDataTypeId());
		soapModel.setOptionName(model.getOptionName());
		soapModel.setPortType(model.getPortType());

		return soapModel;
	}

	public static AppPortSoap[] toSoapModels(AppPort[] models) {
		AppPortSoap[] soapModels = new AppPortSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AppPortSoap[][] toSoapModels(AppPort[][] models) {
		AppPortSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AppPortSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AppPortSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AppPortSoap[] toSoapModels(List<AppPort> models) {
		List<AppPortSoap> soapModels = new ArrayList<AppPortSoap>(
			models.size());

		for (AppPort model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AppPortSoap[soapModels.size()]);
	}

	public AppPortSoap() {
	}

	public long getPrimaryKey() {
		return _appPortId;
	}

	public void setPrimaryKey(long pk) {
		setAppPortId(pk);
	}

	public long getAppPortId() {
		return _appPortId;
	}

	public void setAppPortId(long appPortId) {
		_appPortId = appPortId;
	}

	public long getScienceAppId() {
		return _scienceAppId;
	}

	public void setScienceAppId(long scienceAppId) {
		_scienceAppId = scienceAppId;
	}

	public long getDataTypeId() {
		return _dataTypeId;
	}

	public void setDataTypeId(long dataTypeId) {
		_dataTypeId = dataTypeId;
	}

	public String getOptionName() {
		return _optionName;
	}

	public void setOptionName(String optionName) {
		_optionName = optionName;
	}

	public String getPortType() {
		return _portType;
	}

	public void setPortType(String portType) {
		_portType = portType;
	}

	private long _appPortId;
	private long _scienceAppId;
	private long _dataTypeId;
	private String _optionName;
	private String _portType;

}