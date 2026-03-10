/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.sx.spyglass.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.sx.spyglass.model.AppPort;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AppPort in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AppPortCacheModel implements CacheModel<AppPort>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof AppPortCacheModel)) {
			return false;
		}

		AppPortCacheModel appPortCacheModel = (AppPortCacheModel)object;

		if (appPortId == appPortCacheModel.appPortId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, appPortId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{appPortId=");
		sb.append(appPortId);
		sb.append(", scienceAppId=");
		sb.append(scienceAppId);
		sb.append(", dataTypeId=");
		sb.append(dataTypeId);
		sb.append(", optionName=");
		sb.append(optionName);
		sb.append(", portType=");
		sb.append(portType);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AppPort toEntityModel() {
		AppPortImpl appPortImpl = new AppPortImpl();

		appPortImpl.setAppPortId(appPortId);
		appPortImpl.setScienceAppId(scienceAppId);
		appPortImpl.setDataTypeId(dataTypeId);

		if (optionName == null) {
			appPortImpl.setOptionName("");
		}
		else {
			appPortImpl.setOptionName(optionName);
		}

		if (portType == null) {
			appPortImpl.setPortType("");
		}
		else {
			appPortImpl.setPortType(portType);
		}

		appPortImpl.resetOriginalValues();

		return appPortImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		appPortId = objectInput.readLong();

		scienceAppId = objectInput.readLong();

		dataTypeId = objectInput.readLong();
		optionName = objectInput.readUTF();
		portType = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(appPortId);

		objectOutput.writeLong(scienceAppId);

		objectOutput.writeLong(dataTypeId);

		if (optionName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(optionName);
		}

		if (portType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(portType);
		}
	}

	public long appPortId;
	public long scienceAppId;
	public long dataTypeId;
	public String optionName;
	public String portType;

}