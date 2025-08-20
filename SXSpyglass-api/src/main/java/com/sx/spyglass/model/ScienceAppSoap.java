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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.sx.spyglass.service.http.ScienceAppServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ScienceAppSoap implements Serializable {

	public static ScienceAppSoap toSoapModel(ScienceApp model) {
		ScienceAppSoap soapModel = new ScienceAppSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setScienceAppId(model.getScienceAppId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setLastPublishDate(model.getLastPublishDate());
		soapModel.setAppName(model.getAppName());
		soapModel.setAppVersion(model.getAppVersion());
		soapModel.setAppType(model.getAppType());
		soapModel.setExeFileName(model.getExeFileName());
		soapModel.setDisplayName(model.getDisplayName());
		soapModel.setDescription(model.getDescription());
		soapModel.setStartScript(model.getStartScript());
		soapModel.setFinishScript(model.getFinishScript());

		return soapModel;
	}

	public static ScienceAppSoap[] toSoapModels(ScienceApp[] models) {
		ScienceAppSoap[] soapModels = new ScienceAppSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ScienceAppSoap[][] toSoapModels(ScienceApp[][] models) {
		ScienceAppSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ScienceAppSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ScienceAppSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ScienceAppSoap[] toSoapModels(List<ScienceApp> models) {
		List<ScienceAppSoap> soapModels = new ArrayList<ScienceAppSoap>(
			models.size());

		for (ScienceApp model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ScienceAppSoap[soapModels.size()]);
	}

	public ScienceAppSoap() {
	}

	public long getPrimaryKey() {
		return _scienceAppId;
	}

	public void setPrimaryKey(long pk) {
		setScienceAppId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getScienceAppId() {
		return _scienceAppId;
	}

	public void setScienceAppId(long scienceAppId) {
		_scienceAppId = scienceAppId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public Date getLastPublishDate() {
		return _lastPublishDate;
	}

	public void setLastPublishDate(Date lastPublishDate) {
		_lastPublishDate = lastPublishDate;
	}

	public String getAppName() {
		return _appName;
	}

	public void setAppName(String appName) {
		_appName = appName;
	}

	public String getAppVersion() {
		return _appVersion;
	}

	public void setAppVersion(String appVersion) {
		_appVersion = appVersion;
	}

	public String getAppType() {
		return _appType;
	}

	public void setAppType(String appType) {
		_appType = appType;
	}

	public String getExeFileName() {
		return _exeFileName;
	}

	public void setExeFileName(String exeFileName) {
		_exeFileName = exeFileName;
	}

	public String getDisplayName() {
		return _displayName;
	}

	public void setDisplayName(String displayName) {
		_displayName = displayName;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getStartScript() {
		return _startScript;
	}

	public void setStartScript(String startScript) {
		_startScript = startScript;
	}

	public String getFinishScript() {
		return _finishScript;
	}

	public void setFinishScript(String finishScript) {
		_finishScript = finishScript;
	}

	private String _uuid;
	private long _scienceAppId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private Date _lastPublishDate;
	private String _appName;
	private String _appVersion;
	private String _appType;
	private String _exeFileName;
	private String _displayName;
	private String _description;
	private String _startScript;
	private String _finishScript;

}