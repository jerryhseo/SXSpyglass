/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.sx.spyglass.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AppPort}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AppPort
 * @generated
 */
public class AppPortWrapper
	extends BaseModelWrapper<AppPort>
	implements AppPort, ModelWrapper<AppPort> {

	public AppPortWrapper(AppPort appPort) {
		super(appPort);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("appPortId", getAppPortId());
		attributes.put("scienceAppId", getScienceAppId());
		attributes.put("dataTypeId", getDataTypeId());
		attributes.put("optionName", getOptionName());
		attributes.put("portType", getPortType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long appPortId = (Long)attributes.get("appPortId");

		if (appPortId != null) {
			setAppPortId(appPortId);
		}

		Long scienceAppId = (Long)attributes.get("scienceAppId");

		if (scienceAppId != null) {
			setScienceAppId(scienceAppId);
		}

		Long dataTypeId = (Long)attributes.get("dataTypeId");

		if (dataTypeId != null) {
			setDataTypeId(dataTypeId);
		}

		String optionName = (String)attributes.get("optionName");

		if (optionName != null) {
			setOptionName(optionName);
		}

		String portType = (String)attributes.get("portType");

		if (portType != null) {
			setPortType(portType);
		}
	}

	/**
	 * Returns the app port ID of this app port.
	 *
	 * @return the app port ID of this app port
	 */
	@Override
	public long getAppPortId() {
		return model.getAppPortId();
	}

	/**
	 * Returns the data type ID of this app port.
	 *
	 * @return the data type ID of this app port
	 */
	@Override
	public long getDataTypeId() {
		return model.getDataTypeId();
	}

	/**
	 * Returns the option name of this app port.
	 *
	 * @return the option name of this app port
	 */
	@Override
	public String getOptionName() {
		return model.getOptionName();
	}

	/**
	 * Returns the port type of this app port.
	 *
	 * @return the port type of this app port
	 */
	@Override
	public String getPortType() {
		return model.getPortType();
	}

	/**
	 * Returns the primary key of this app port.
	 *
	 * @return the primary key of this app port
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the science app ID of this app port.
	 *
	 * @return the science app ID of this app port
	 */
	@Override
	public long getScienceAppId() {
		return model.getScienceAppId();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the app port ID of this app port.
	 *
	 * @param appPortId the app port ID of this app port
	 */
	@Override
	public void setAppPortId(long appPortId) {
		model.setAppPortId(appPortId);
	}

	/**
	 * Sets the data type ID of this app port.
	 *
	 * @param dataTypeId the data type ID of this app port
	 */
	@Override
	public void setDataTypeId(long dataTypeId) {
		model.setDataTypeId(dataTypeId);
	}

	/**
	 * Sets the option name of this app port.
	 *
	 * @param optionName the option name of this app port
	 */
	@Override
	public void setOptionName(String optionName) {
		model.setOptionName(optionName);
	}

	/**
	 * Sets the port type of this app port.
	 *
	 * @param portType the port type of this app port
	 */
	@Override
	public void setPortType(String portType) {
		model.setPortType(portType);
	}

	/**
	 * Sets the primary key of this app port.
	 *
	 * @param primaryKey the primary key of this app port
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the science app ID of this app port.
	 *
	 * @param scienceAppId the science app ID of this app port
	 */
	@Override
	public void setScienceAppId(long scienceAppId) {
		model.setScienceAppId(scienceAppId);
	}

	@Override
	protected AppPortWrapper wrap(AppPort appPort) {
		return new AppPortWrapper(appPort);
	}

}