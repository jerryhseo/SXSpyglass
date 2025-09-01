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

package com.sx.spyglass.service;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.sx.spyglass.model.ScienceApp;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ScienceApp. This utility wraps
 * <code>com.sx.spyglass.service.impl.ScienceAppLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ScienceAppLocalService
 * @generated
 */
public class ScienceAppLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.sx.spyglass.service.impl.ScienceAppLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the science app to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ScienceAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param scienceApp the science app
	 * @return the science app that was added
	 */
	public static ScienceApp addScienceApp(ScienceApp scienceApp) {
		return getService().addScienceApp(scienceApp);
	}

	/**
	 * Creates a new science app with the primary key. Does not add the science app to the database.
	 *
	 * @param scienceAppId the primary key for the new science app
	 * @return the new science app
	 */
	public static ScienceApp createScienceApp(long scienceAppId) {
		return getService().createScienceApp(scienceAppId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the science app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ScienceAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param scienceAppId the primary key of the science app
	 * @return the science app that was removed
	 * @throws PortalException if a science app with the primary key could not be found
	 */
	public static ScienceApp deleteScienceApp(long scienceAppId)
		throws PortalException {

		return getService().deleteScienceApp(scienceAppId);
	}

	/**
	 * Deletes the science app from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ScienceAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param scienceApp the science app
	 * @return the science app that was removed
	 */
	public static ScienceApp deleteScienceApp(ScienceApp scienceApp) {
		return getService().deleteScienceApp(scienceApp);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sx.spyglass.model.impl.ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sx.spyglass.model.impl.ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ScienceApp fetchScienceApp(long scienceAppId) {
		return getService().fetchScienceApp(scienceAppId);
	}

	/**
	 * Returns the science app matching the UUID and group.
	 *
	 * @param uuid the science app's UUID
	 * @param groupId the primary key of the group
	 * @return the matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchScienceAppByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchScienceAppByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static com.liferay.portal.kernel.json.JSONObject getPseudoScienceApp(
		int scienceAppId) {

		return getService().getPseudoScienceApp(scienceAppId);
	}

	/**
	 * Returns the science app with the primary key.
	 *
	 * @param scienceAppId the primary key of the science app
	 * @return the science app
	 * @throws PortalException if a science app with the primary key could not be found
	 */
	public static ScienceApp getScienceApp(long scienceAppId)
		throws PortalException {

		return getService().getScienceApp(scienceAppId);
	}

	/**
	 * Returns the science app matching the UUID and group.
	 *
	 * @param uuid the science app's UUID
	 * @param groupId the primary key of the group
	 * @return the matching science app
	 * @throws PortalException if a matching science app could not be found
	 */
	public static ScienceApp getScienceAppByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getScienceAppByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.json.JSONArray getScienceAppList(
		String appType) {

		return getService().getScienceAppList(appType);
	}

	/**
	 * Returns a range of all the science apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sx.spyglass.model.impl.ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of science apps
	 */
	public static List<ScienceApp> getScienceApps(int start, int end) {
		return getService().getScienceApps(start, end);
	}

	/**
	 * Returns all the science apps matching the UUID and company.
	 *
	 * @param uuid the UUID of the science apps
	 * @param companyId the primary key of the company
	 * @return the matching science apps, or an empty list if no matches were found
	 */
	public static List<ScienceApp> getScienceAppsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getScienceAppsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of science apps matching the UUID and company.
	 *
	 * @param uuid the UUID of the science apps
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching science apps, or an empty list if no matches were found
	 */
	public static List<ScienceApp> getScienceAppsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getService().getScienceAppsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of science apps.
	 *
	 * @return the number of science apps
	 */
	public static int getScienceAppsCount() {
		return getService().getScienceAppsCount();
	}

	/**
	 * Updates the science app in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ScienceAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param scienceApp the science app
	 * @return the science app that was updated
	 */
	public static ScienceApp updateScienceApp(ScienceApp scienceApp) {
		return getService().updateScienceApp(scienceApp);
	}

	public static ScienceAppLocalService getService() {
		return _service;
	}

	private static volatile ScienceAppLocalService _service;

}