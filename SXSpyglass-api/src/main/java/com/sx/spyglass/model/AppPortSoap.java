/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
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