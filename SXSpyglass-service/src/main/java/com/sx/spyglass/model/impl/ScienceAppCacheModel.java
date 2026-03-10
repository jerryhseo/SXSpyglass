/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.sx.spyglass.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.sx.spyglass.model.ScienceApp;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ScienceApp in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ScienceAppCacheModel
	implements CacheModel<ScienceApp>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ScienceAppCacheModel)) {
			return false;
		}

		ScienceAppCacheModel scienceAppCacheModel =
			(ScienceAppCacheModel)object;

		if (scienceAppId == scienceAppCacheModel.scienceAppId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, scienceAppId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(43);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", scienceAppId=");
		sb.append(scienceAppId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", lastPublishDate=");
		sb.append(lastPublishDate);
		sb.append(", appName=");
		sb.append(appName);
		sb.append(", appVersion=");
		sb.append(appVersion);
		sb.append(", appType=");
		sb.append(appType);
		sb.append(", exeFileName=");
		sb.append(exeFileName);
		sb.append(", displayName=");
		sb.append(displayName);
		sb.append(", description=");
		sb.append(description);
		sb.append(", startScript=");
		sb.append(startScript);
		sb.append(", finishScript=");
		sb.append(finishScript);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ScienceApp toEntityModel() {
		ScienceAppImpl scienceAppImpl = new ScienceAppImpl();

		if (uuid == null) {
			scienceAppImpl.setUuid("");
		}
		else {
			scienceAppImpl.setUuid(uuid);
		}

		scienceAppImpl.setScienceAppId(scienceAppId);
		scienceAppImpl.setGroupId(groupId);
		scienceAppImpl.setCompanyId(companyId);
		scienceAppImpl.setUserId(userId);

		if (userName == null) {
			scienceAppImpl.setUserName("");
		}
		else {
			scienceAppImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			scienceAppImpl.setCreateDate(null);
		}
		else {
			scienceAppImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			scienceAppImpl.setModifiedDate(null);
		}
		else {
			scienceAppImpl.setModifiedDate(new Date(modifiedDate));
		}

		scienceAppImpl.setStatus(status);
		scienceAppImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			scienceAppImpl.setStatusByUserName("");
		}
		else {
			scienceAppImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			scienceAppImpl.setStatusDate(null);
		}
		else {
			scienceAppImpl.setStatusDate(new Date(statusDate));
		}

		if (lastPublishDate == Long.MIN_VALUE) {
			scienceAppImpl.setLastPublishDate(null);
		}
		else {
			scienceAppImpl.setLastPublishDate(new Date(lastPublishDate));
		}

		if (appName == null) {
			scienceAppImpl.setAppName("");
		}
		else {
			scienceAppImpl.setAppName(appName);
		}

		if (appVersion == null) {
			scienceAppImpl.setAppVersion("");
		}
		else {
			scienceAppImpl.setAppVersion(appVersion);
		}

		if (appType == null) {
			scienceAppImpl.setAppType("");
		}
		else {
			scienceAppImpl.setAppType(appType);
		}

		if (exeFileName == null) {
			scienceAppImpl.setExeFileName("");
		}
		else {
			scienceAppImpl.setExeFileName(exeFileName);
		}

		if (displayName == null) {
			scienceAppImpl.setDisplayName("");
		}
		else {
			scienceAppImpl.setDisplayName(displayName);
		}

		if (description == null) {
			scienceAppImpl.setDescription("");
		}
		else {
			scienceAppImpl.setDescription(description);
		}

		if (startScript == null) {
			scienceAppImpl.setStartScript("");
		}
		else {
			scienceAppImpl.setStartScript(startScript);
		}

		if (finishScript == null) {
			scienceAppImpl.setFinishScript("");
		}
		else {
			scienceAppImpl.setFinishScript(finishScript);
		}

		scienceAppImpl.resetOriginalValues();

		return scienceAppImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		scienceAppId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		lastPublishDate = objectInput.readLong();
		appName = objectInput.readUTF();
		appVersion = objectInput.readUTF();
		appType = objectInput.readUTF();
		exeFileName = objectInput.readUTF();
		displayName = objectInput.readUTF();
		description = objectInput.readUTF();
		startScript = objectInput.readUTF();
		finishScript = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(scienceAppId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
		objectOutput.writeLong(lastPublishDate);

		if (appName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appName);
		}

		if (appVersion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appVersion);
		}

		if (appType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appType);
		}

		if (exeFileName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(exeFileName);
		}

		if (displayName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(displayName);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (startScript == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(startScript);
		}

		if (finishScript == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(finishScript);
		}
	}

	public String uuid;
	public long scienceAppId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public long lastPublishDate;
	public String appName;
	public String appVersion;
	public String appType;
	public String exeFileName;
	public String displayName;
	public String description;
	public String startScript;
	public String finishScript;

}