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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AppPortLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AppPortLocalService
 * @generated
 */
public class AppPortLocalServiceWrapper
	implements AppPortLocalService, ServiceWrapper<AppPortLocalService> {

	public AppPortLocalServiceWrapper(AppPortLocalService appPortLocalService) {
		_appPortLocalService = appPortLocalService;
	}

	/**
	 * Adds the app port to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppPortLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appPort the app port
	 * @return the app port that was added
	 */
	@Override
	public com.sx.spyglass.model.AppPort addAppPort(
		com.sx.spyglass.model.AppPort appPort) {

		return _appPortLocalService.addAppPort(appPort);
	}

	/**
	 * Creates a new app port with the primary key. Does not add the app port to the database.
	 *
	 * @param appPortId the primary key for the new app port
	 * @return the new app port
	 */
	@Override
	public com.sx.spyglass.model.AppPort createAppPort(long appPortId) {
		return _appPortLocalService.createAppPort(appPortId);
	}

	/**
	 * Deletes the app port from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppPortLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appPort the app port
	 * @return the app port that was removed
	 */
	@Override
	public com.sx.spyglass.model.AppPort deleteAppPort(
		com.sx.spyglass.model.AppPort appPort) {

		return _appPortLocalService.deleteAppPort(appPort);
	}

	/**
	 * Deletes the app port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppPortLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appPortId the primary key of the app port
	 * @return the app port that was removed
	 * @throws PortalException if a app port with the primary key could not be found
	 */
	@Override
	public com.sx.spyglass.model.AppPort deleteAppPort(long appPortId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appPortLocalService.deleteAppPort(appPortId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appPortLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _appPortLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _appPortLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sx.spyglass.model.impl.AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _appPortLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sx.spyglass.model.impl.AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _appPortLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _appPortLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _appPortLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.sx.spyglass.model.AppPort fetchAppPort(long appPortId) {
		return _appPortLocalService.fetchAppPort(appPortId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _appPortLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the app port with the primary key.
	 *
	 * @param appPortId the primary key of the app port
	 * @return the app port
	 * @throws PortalException if a app port with the primary key could not be found
	 */
	@Override
	public com.sx.spyglass.model.AppPort getAppPort(long appPortId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appPortLocalService.getAppPort(appPortId);
	}

	/**
	 * Returns a range of all the app ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.sx.spyglass.model.impl.AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @return the range of app ports
	 */
	@Override
	public java.util.List<com.sx.spyglass.model.AppPort> getAppPorts(
		int start, int end) {

		return _appPortLocalService.getAppPorts(start, end);
	}

	/**
	 * Returns the number of app ports.
	 *
	 * @return the number of app ports
	 */
	@Override
	public int getAppPortsCount() {
		return _appPortLocalService.getAppPortsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _appPortLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _appPortLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _appPortLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the app port in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AppPortLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param appPort the app port
	 * @return the app port that was updated
	 */
	@Override
	public com.sx.spyglass.model.AppPort updateAppPort(
		com.sx.spyglass.model.AppPort appPort) {

		return _appPortLocalService.updateAppPort(appPort);
	}

	@Override
	public AppPortLocalService getWrappedService() {
		return _appPortLocalService;
	}

	@Override
	public void setWrappedService(AppPortLocalService appPortLocalService) {
		_appPortLocalService = appPortLocalService;
	}

	private AppPortLocalService _appPortLocalService;

}