/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.sx.spyglass.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ScienceApp}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ScienceApp
 * @generated
 */
public class ScienceAppWrapper
	extends BaseModelWrapper<ScienceApp>
	implements ModelWrapper<ScienceApp>, ScienceApp {

	public ScienceAppWrapper(ScienceApp scienceApp) {
		super(scienceApp);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("scienceAppId", getScienceAppId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("lastPublishDate", getLastPublishDate());
		attributes.put("appName", getAppName());
		attributes.put("appVersion", getAppVersion());
		attributes.put("appType", getAppType());
		attributes.put("exeFileName", getExeFileName());
		attributes.put("displayName", getDisplayName());
		attributes.put("description", getDescription());
		attributes.put("startScript", getStartScript());
		attributes.put("finishScript", getFinishScript());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long scienceAppId = (Long)attributes.get("scienceAppId");

		if (scienceAppId != null) {
			setScienceAppId(scienceAppId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		Date lastPublishDate = (Date)attributes.get("lastPublishDate");

		if (lastPublishDate != null) {
			setLastPublishDate(lastPublishDate);
		}

		String appName = (String)attributes.get("appName");

		if (appName != null) {
			setAppName(appName);
		}

		String appVersion = (String)attributes.get("appVersion");

		if (appVersion != null) {
			setAppVersion(appVersion);
		}

		String appType = (String)attributes.get("appType");

		if (appType != null) {
			setAppType(appType);
		}

		String exeFileName = (String)attributes.get("exeFileName");

		if (exeFileName != null) {
			setExeFileName(exeFileName);
		}

		String displayName = (String)attributes.get("displayName");

		if (displayName != null) {
			setDisplayName(displayName);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String startScript = (String)attributes.get("startScript");

		if (startScript != null) {
			setStartScript(startScript);
		}

		String finishScript = (String)attributes.get("finishScript");

		if (finishScript != null) {
			setFinishScript(finishScript);
		}
	}

	/**
	 * Returns the app name of this science app.
	 *
	 * @return the app name of this science app
	 */
	@Override
	public String getAppName() {
		return model.getAppName();
	}

	/**
	 * Returns the app type of this science app.
	 *
	 * @return the app type of this science app
	 */
	@Override
	public String getAppType() {
		return model.getAppType();
	}

	/**
	 * Returns the app version of this science app.
	 *
	 * @return the app version of this science app
	 */
	@Override
	public String getAppVersion() {
		return model.getAppVersion();
	}

	@Override
	public String[] getAvailableLanguageIds() {
		return model.getAvailableLanguageIds();
	}

	/**
	 * Returns the company ID of this science app.
	 *
	 * @return the company ID of this science app
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this science app.
	 *
	 * @return the create date of this science app
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	@Override
	public String getDefaultLanguageId() {
		return model.getDefaultLanguageId();
	}

	/**
	 * Returns the description of this science app.
	 *
	 * @return the description of this science app
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the localized description of this science app in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized description of this science app
	 */
	@Override
	public String getDescription(java.util.Locale locale) {
		return model.getDescription(locale);
	}

	/**
	 * Returns the localized description of this science app in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this science app. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getDescription(java.util.Locale locale, boolean useDefault) {
		return model.getDescription(locale, useDefault);
	}

	/**
	 * Returns the localized description of this science app in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized description of this science app
	 */
	@Override
	public String getDescription(String languageId) {
		return model.getDescription(languageId);
	}

	/**
	 * Returns the localized description of this science app in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this science app
	 */
	@Override
	public String getDescription(String languageId, boolean useDefault) {
		return model.getDescription(languageId, useDefault);
	}

	@Override
	public String getDescriptionCurrentLanguageId() {
		return model.getDescriptionCurrentLanguageId();
	}

	@Override
	public String getDescriptionCurrentValue() {
		return model.getDescriptionCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized descriptions of this science app.
	 *
	 * @return the locales and localized descriptions of this science app
	 */
	@Override
	public Map<java.util.Locale, String> getDescriptionMap() {
		return model.getDescriptionMap();
	}

	/**
	 * Returns the display name of this science app.
	 *
	 * @return the display name of this science app
	 */
	@Override
	public String getDisplayName() {
		return model.getDisplayName();
	}

	/**
	 * Returns the localized display name of this science app in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized display name of this science app
	 */
	@Override
	public String getDisplayName(java.util.Locale locale) {
		return model.getDisplayName(locale);
	}

	/**
	 * Returns the localized display name of this science app in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized display name of this science app. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@Override
	public String getDisplayName(java.util.Locale locale, boolean useDefault) {
		return model.getDisplayName(locale, useDefault);
	}

	/**
	 * Returns the localized display name of this science app in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized display name of this science app
	 */
	@Override
	public String getDisplayName(String languageId) {
		return model.getDisplayName(languageId);
	}

	/**
	 * Returns the localized display name of this science app in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized display name of this science app
	 */
	@Override
	public String getDisplayName(String languageId, boolean useDefault) {
		return model.getDisplayName(languageId, useDefault);
	}

	@Override
	public String getDisplayNameCurrentLanguageId() {
		return model.getDisplayNameCurrentLanguageId();
	}

	@Override
	public String getDisplayNameCurrentValue() {
		return model.getDisplayNameCurrentValue();
	}

	/**
	 * Returns a map of the locales and localized display names of this science app.
	 *
	 * @return the locales and localized display names of this science app
	 */
	@Override
	public Map<java.util.Locale, String> getDisplayNameMap() {
		return model.getDisplayNameMap();
	}

	/**
	 * Returns the exe file name of this science app.
	 *
	 * @return the exe file name of this science app
	 */
	@Override
	public String getExeFileName() {
		return model.getExeFileName();
	}

	/**
	 * Returns the finish script of this science app.
	 *
	 * @return the finish script of this science app
	 */
	@Override
	public String getFinishScript() {
		return model.getFinishScript();
	}

	/**
	 * Returns the group ID of this science app.
	 *
	 * @return the group ID of this science app
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the last publish date of this science app.
	 *
	 * @return the last publish date of this science app
	 */
	@Override
	public Date getLastPublishDate() {
		return model.getLastPublishDate();
	}

	/**
	 * Returns the modified date of this science app.
	 *
	 * @return the modified date of this science app
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this science app.
	 *
	 * @return the primary key of this science app
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the science app ID of this science app.
	 *
	 * @return the science app ID of this science app
	 */
	@Override
	public long getScienceAppId() {
		return model.getScienceAppId();
	}

	/**
	 * Returns the start script of this science app.
	 *
	 * @return the start script of this science app
	 */
	@Override
	public String getStartScript() {
		return model.getStartScript();
	}

	/**
	 * Returns the status of this science app.
	 *
	 * @return the status of this science app
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this science app.
	 *
	 * @return the status by user ID of this science app
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this science app.
	 *
	 * @return the status by user name of this science app
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this science app.
	 *
	 * @return the status by user uuid of this science app
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this science app.
	 *
	 * @return the status date of this science app
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the trash entry created when this science app was moved to the Recycle Bin. The trash entry may belong to one of the ancestors of this science app.
	 *
	 * @return the trash entry created when this science app was moved to the Recycle Bin
	 */
	@Override
	public com.liferay.trash.kernel.model.TrashEntry getTrashEntry()
		throws com.liferay.portal.kernel.exception.PortalException {

		return model.getTrashEntry();
	}

	/**
	 * Returns the class primary key of the trash entry for this science app.
	 *
	 * @return the class primary key of the trash entry for this science app
	 */
	@Override
	public long getTrashEntryClassPK() {
		return model.getTrashEntryClassPK();
	}

	/**
	 * Returns the trash handler for this science app.
	 *
	 * @return the trash handler for this science app
	 * @deprecated As of Judson (7.1.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public com.liferay.portal.kernel.trash.TrashHandler getTrashHandler() {
		return model.getTrashHandler();
	}

	/**
	 * Returns the user ID of this science app.
	 *
	 * @return the user ID of this science app
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this science app.
	 *
	 * @return the user name of this science app
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this science app.
	 *
	 * @return the user uuid of this science app
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this science app.
	 *
	 * @return the uuid of this science app
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this science app is approved.
	 *
	 * @return <code>true</code> if this science app is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this science app is denied.
	 *
	 * @return <code>true</code> if this science app is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this science app is a draft.
	 *
	 * @return <code>true</code> if this science app is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this science app is expired.
	 *
	 * @return <code>true</code> if this science app is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this science app is inactive.
	 *
	 * @return <code>true</code> if this science app is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this science app is incomplete.
	 *
	 * @return <code>true</code> if this science app is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this science app is in the Recycle Bin.
	 *
	 * @return <code>true</code> if this science app is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrash() {
		return model.isInTrash();
	}

	/**
	 * Returns <code>true</code> if the parent of this science app is in the Recycle Bin.
	 *
	 * @return <code>true</code> if the parent of this science app is in the Recycle Bin; <code>false</code> otherwise
	 */
	@Override
	public boolean isInTrashContainer() {
		return model.isInTrashContainer();
	}

	@Override
	public boolean isInTrashExplicitly() {
		return model.isInTrashExplicitly();
	}

	@Override
	public boolean isInTrashImplicitly() {
		return model.isInTrashImplicitly();
	}

	/**
	 * Returns <code>true</code> if this science app is pending.
	 *
	 * @return <code>true</code> if this science app is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this science app is scheduled.
	 *
	 * @return <code>true</code> if this science app is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	@Override
	public void prepareLocalizedFieldsForImport()
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport();
	}

	@Override
	public void prepareLocalizedFieldsForImport(
			java.util.Locale defaultImportLocale)
		throws com.liferay.portal.kernel.exception.LocaleException {

		model.prepareLocalizedFieldsForImport(defaultImportLocale);
	}

	/**
	 * Sets the app name of this science app.
	 *
	 * @param appName the app name of this science app
	 */
	@Override
	public void setAppName(String appName) {
		model.setAppName(appName);
	}

	/**
	 * Sets the app type of this science app.
	 *
	 * @param appType the app type of this science app
	 */
	@Override
	public void setAppType(String appType) {
		model.setAppType(appType);
	}

	/**
	 * Sets the app version of this science app.
	 *
	 * @param appVersion the app version of this science app
	 */
	@Override
	public void setAppVersion(String appVersion) {
		model.setAppVersion(appVersion);
	}

	/**
	 * Sets the company ID of this science app.
	 *
	 * @param companyId the company ID of this science app
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this science app.
	 *
	 * @param createDate the create date of this science app
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this science app.
	 *
	 * @param description the description of this science app
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the localized description of this science app in the language.
	 *
	 * @param description the localized description of this science app
	 * @param locale the locale of the language
	 */
	@Override
	public void setDescription(String description, java.util.Locale locale) {
		model.setDescription(description, locale);
	}

	/**
	 * Sets the localized description of this science app in the language, and sets the default locale.
	 *
	 * @param description the localized description of this science app
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setDescription(
		String description, java.util.Locale locale,
		java.util.Locale defaultLocale) {

		model.setDescription(description, locale, defaultLocale);
	}

	@Override
	public void setDescriptionCurrentLanguageId(String languageId) {
		model.setDescriptionCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized descriptions of this science app from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this science app
	 */
	@Override
	public void setDescriptionMap(
		Map<java.util.Locale, String> descriptionMap) {

		model.setDescriptionMap(descriptionMap);
	}

	/**
	 * Sets the localized descriptions of this science app from the map of locales and localized descriptions, and sets the default locale.
	 *
	 * @param descriptionMap the locales and localized descriptions of this science app
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setDescriptionMap(
		Map<java.util.Locale, String> descriptionMap,
		java.util.Locale defaultLocale) {

		model.setDescriptionMap(descriptionMap, defaultLocale);
	}

	/**
	 * Sets the display name of this science app.
	 *
	 * @param displayName the display name of this science app
	 */
	@Override
	public void setDisplayName(String displayName) {
		model.setDisplayName(displayName);
	}

	/**
	 * Sets the localized display name of this science app in the language.
	 *
	 * @param displayName the localized display name of this science app
	 * @param locale the locale of the language
	 */
	@Override
	public void setDisplayName(String displayName, java.util.Locale locale) {
		model.setDisplayName(displayName, locale);
	}

	/**
	 * Sets the localized display name of this science app in the language, and sets the default locale.
	 *
	 * @param displayName the localized display name of this science app
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setDisplayName(
		String displayName, java.util.Locale locale,
		java.util.Locale defaultLocale) {

		model.setDisplayName(displayName, locale, defaultLocale);
	}

	@Override
	public void setDisplayNameCurrentLanguageId(String languageId) {
		model.setDisplayNameCurrentLanguageId(languageId);
	}

	/**
	 * Sets the localized display names of this science app from the map of locales and localized display names.
	 *
	 * @param displayNameMap the locales and localized display names of this science app
	 */
	@Override
	public void setDisplayNameMap(
		Map<java.util.Locale, String> displayNameMap) {

		model.setDisplayNameMap(displayNameMap);
	}

	/**
	 * Sets the localized display names of this science app from the map of locales and localized display names, and sets the default locale.
	 *
	 * @param displayNameMap the locales and localized display names of this science app
	 * @param defaultLocale the default locale
	 */
	@Override
	public void setDisplayNameMap(
		Map<java.util.Locale, String> displayNameMap,
		java.util.Locale defaultLocale) {

		model.setDisplayNameMap(displayNameMap, defaultLocale);
	}

	/**
	 * Sets the exe file name of this science app.
	 *
	 * @param exeFileName the exe file name of this science app
	 */
	@Override
	public void setExeFileName(String exeFileName) {
		model.setExeFileName(exeFileName);
	}

	/**
	 * Sets the finish script of this science app.
	 *
	 * @param finishScript the finish script of this science app
	 */
	@Override
	public void setFinishScript(String finishScript) {
		model.setFinishScript(finishScript);
	}

	/**
	 * Sets the group ID of this science app.
	 *
	 * @param groupId the group ID of this science app
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the last publish date of this science app.
	 *
	 * @param lastPublishDate the last publish date of this science app
	 */
	@Override
	public void setLastPublishDate(Date lastPublishDate) {
		model.setLastPublishDate(lastPublishDate);
	}

	/**
	 * Sets the modified date of this science app.
	 *
	 * @param modifiedDate the modified date of this science app
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this science app.
	 *
	 * @param primaryKey the primary key of this science app
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the science app ID of this science app.
	 *
	 * @param scienceAppId the science app ID of this science app
	 */
	@Override
	public void setScienceAppId(long scienceAppId) {
		model.setScienceAppId(scienceAppId);
	}

	/**
	 * Sets the start script of this science app.
	 *
	 * @param startScript the start script of this science app
	 */
	@Override
	public void setStartScript(String startScript) {
		model.setStartScript(startScript);
	}

	/**
	 * Sets the status of this science app.
	 *
	 * @param status the status of this science app
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this science app.
	 *
	 * @param statusByUserId the status by user ID of this science app
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this science app.
	 *
	 * @param statusByUserName the status by user name of this science app
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this science app.
	 *
	 * @param statusByUserUuid the status by user uuid of this science app
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this science app.
	 *
	 * @param statusDate the status date of this science app
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this science app.
	 *
	 * @param userId the user ID of this science app
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this science app.
	 *
	 * @param userName the user name of this science app
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this science app.
	 *
	 * @param userUuid the user uuid of this science app
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this science app.
	 *
	 * @param uuid the uuid of this science app
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected ScienceAppWrapper wrap(ScienceApp scienceApp) {
		return new ScienceAppWrapper(scienceApp);
	}

}