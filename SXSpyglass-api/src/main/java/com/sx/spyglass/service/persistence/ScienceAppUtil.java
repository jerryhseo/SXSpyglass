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

package com.sx.spyglass.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.sx.spyglass.model.ScienceApp;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the science app service. This utility wraps <code>com.sx.spyglass.service.persistence.impl.ScienceAppPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ScienceAppPersistence
 * @generated
 */
public class ScienceAppUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ScienceApp scienceApp) {
		getPersistence().clearCache(scienceApp);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, ScienceApp> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ScienceApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ScienceApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ScienceApp> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ScienceApp update(ScienceApp scienceApp) {
		return getPersistence().update(scienceApp);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ScienceApp update(
		ScienceApp scienceApp, ServiceContext serviceContext) {

		return getPersistence().update(scienceApp, serviceContext);
	}

	/**
	 * Returns all the science apps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the science apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByUuid_First(
			String uuid, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByUuid_First(
		String uuid, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByUuid_Last(
			String uuid, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByUuid_Last(
		String uuid, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where uuid = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByUuid_PrevAndNext(
			long scienceAppId, String uuid,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByUuid_PrevAndNext(
			scienceAppId, uuid, orderByComparator);
	}

	/**
	 * Removes all the science apps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of science apps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching science apps
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the science app where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchScienceAppException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByUUID_G(String uuid, long groupId)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the science app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the science app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the science app where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the science app that was removed
	 */
	public static ScienceApp removeByUUID_G(String uuid, long groupId)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of science apps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching science apps
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the science apps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the science apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByUuid_C_PrevAndNext(
			long scienceAppId, String uuid, long companyId,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByUuid_C_PrevAndNext(
			scienceAppId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the science apps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of science apps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching science apps
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the science apps where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the science apps where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByGroupId_First(
			long groupId, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByGroupId_First(
		long groupId, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByGroupId_Last(
			long groupId, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByGroupId_Last(
		long groupId, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where groupId = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByGroupId_PrevAndNext(
			long scienceAppId, long groupId,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByGroupId_PrevAndNext(
			scienceAppId, groupId, orderByComparator);
	}

	/**
	 * Removes all the science apps where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of science apps where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching science apps
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the science apps where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByUserId(long userId) {
		return getPersistence().findByUserId(userId);
	}

	/**
	 * Returns a range of all the science apps where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByUserId(
		long userId, int start, int end) {

		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByUserId(
		long userId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByUserId(
		long userId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByUserId_First(
			long userId, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByUserId_First(
		long userId, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByUserId_Last(
			long userId, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByUserId_Last(
		long userId, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where userId = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByUserId_PrevAndNext(
			long scienceAppId, long userId,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByUserId_PrevAndNext(
			scienceAppId, userId, orderByComparator);
	}

	/**
	 * Removes all the science apps where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByUserId(long userId) {
		getPersistence().removeByUserId(userId);
	}

	/**
	 * Returns the number of science apps where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching science apps
	 */
	public static int countByUserId(long userId) {
		return getPersistence().countByUserId(userId);
	}

	/**
	 * Returns all the science apps where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

	/**
	 * Returns a range of all the science apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByStatus(
		int status, int start, int end) {

		return getPersistence().findByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByStatus(
		int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByStatus(
		int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByStatus_First(
			int status, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByStatus_First(
		int status, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByStatus_Last(
			int status, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByStatus_Last(
		int status, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where status = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByStatus_PrevAndNext(
			long scienceAppId, int status,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByStatus_PrevAndNext(
			scienceAppId, status, orderByComparator);
	}

	/**
	 * Removes all the science apps where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	 * Returns the number of science apps where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching science apps
	 */
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	 * Returns all the science apps where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByG_U(long groupId, long userId) {
		return getPersistence().findByG_U(groupId, userId);
	}

	/**
	 * Returns a range of all the science apps where groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByG_U(
		long groupId, long userId, int start, int end) {

		return getPersistence().findByG_U(groupId, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByG_U(
		long groupId, long userId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByG_U(
			groupId, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByG_U(
		long groupId, long userId, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U(
			groupId, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByG_U_First(
			long groupId, long userId,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByG_U_First(
			groupId, userId, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByG_U_First(
		long groupId, long userId,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByG_U_First(
			groupId, userId, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByG_U_Last(
			long groupId, long userId,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByG_U_Last(
			groupId, userId, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByG_U_Last(
		long groupId, long userId,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByG_U_Last(
			groupId, userId, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByG_U_PrevAndNext(
			long scienceAppId, long groupId, long userId,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByG_U_PrevAndNext(
			scienceAppId, groupId, userId, orderByComparator);
	}

	/**
	 * Removes all the science apps where groupId = &#63; and userId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 */
	public static void removeByG_U(long groupId, long userId) {
		getPersistence().removeByG_U(groupId, userId);
	}

	/**
	 * Returns the number of science apps where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the number of matching science apps
	 */
	public static int countByG_U(long groupId, long userId) {
		return getPersistence().countByG_U(groupId, userId);
	}

	/**
	 * Returns all the science apps where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	 * Returns a range of all the science apps where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByG_S_First(
			long groupId, int status,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByG_S_First(
		long groupId, int status,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByG_S_Last(
			long groupId, int status,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByG_S_Last(
		long groupId, int status,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByG_S_PrevAndNext(
			long scienceAppId, long groupId, int status,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByG_S_PrevAndNext(
			scienceAppId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the science apps where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	 * Returns the number of science apps where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching science apps
	 */
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	 * Returns all the science apps where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByU_S(long userId, int status) {
		return getPersistence().findByU_S(userId, status);
	}

	/**
	 * Returns a range of all the science apps where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByU_S(
		long userId, int status, int start, int end) {

		return getPersistence().findByU_S(userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByU_S(
		long userId, int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByU_S(
			userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByU_S(
		long userId, int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByU_S(
			userId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByU_S_First(
			long userId, int status,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByU_S_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByU_S_First(
		long userId, int status,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByU_S_First(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByU_S_Last(
			long userId, int status,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByU_S_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByU_S_Last(
		long userId, int status,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByU_S_Last(
			userId, status, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByU_S_PrevAndNext(
			long scienceAppId, long userId, int status,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByU_S_PrevAndNext(
			scienceAppId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the science apps where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByU_S(long userId, int status) {
		getPersistence().removeByU_S(userId, status);
	}

	/**
	 * Returns the number of science apps where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching science apps
	 */
	public static int countByU_S(long userId, int status) {
		return getPersistence().countByU_S(userId, status);
	}

	/**
	 * Returns all the science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByG_U_S(
		long groupId, long userId, int status) {

		return getPersistence().findByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns a range of all the science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByG_U_S(
		long groupId, long userId, int status, int start, int end) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByG_U_S(
			groupId, userId, status, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByG_U_S_First(
			long groupId, long userId, int status,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByG_U_S_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByG_U_S_First(
		long groupId, long userId, int status,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByG_U_S_First(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByG_U_S_Last(
			long groupId, long userId, int status,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByG_U_S_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByG_U_S_Last(
		long groupId, long userId, int status,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByG_U_S_Last(
			groupId, userId, status, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByG_U_S_PrevAndNext(
			long scienceAppId, long groupId, long userId, int status,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByG_U_S_PrevAndNext(
			scienceAppId, groupId, userId, status, orderByComparator);
	}

	/**
	 * Removes all the science apps where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public static void removeByG_U_S(long groupId, long userId, int status) {
		getPersistence().removeByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns the number of science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching science apps
	 */
	public static int countByG_U_S(long groupId, long userId, int status) {
		return getPersistence().countByG_U_S(groupId, userId, status);
	}

	/**
	 * Returns all the science apps where appName = &#63;.
	 *
	 * @param appName the app name
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByAppName(String appName) {
		return getPersistence().findByAppName(appName);
	}

	/**
	 * Returns a range of all the science apps where appName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param appName the app name
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByAppName(
		String appName, int start, int end) {

		return getPersistence().findByAppName(appName, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where appName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param appName the app name
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByAppName(
		String appName, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByAppName(
			appName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where appName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param appName the app name
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByAppName(
		String appName, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByAppName(
			appName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where appName = &#63;.
	 *
	 * @param appName the app name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByAppName_First(
			String appName, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByAppName_First(appName, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where appName = &#63;.
	 *
	 * @param appName the app name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByAppName_First(
		String appName, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByAppName_First(
			appName, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where appName = &#63;.
	 *
	 * @param appName the app name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByAppName_Last(
			String appName, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByAppName_Last(appName, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where appName = &#63;.
	 *
	 * @param appName the app name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByAppName_Last(
		String appName, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByAppName_Last(appName, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where appName = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param appName the app name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByAppName_PrevAndNext(
			long scienceAppId, String appName,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByAppName_PrevAndNext(
			scienceAppId, appName, orderByComparator);
	}

	/**
	 * Removes all the science apps where appName = &#63; from the database.
	 *
	 * @param appName the app name
	 */
	public static void removeByAppName(String appName) {
		getPersistence().removeByAppName(appName);
	}

	/**
	 * Returns the number of science apps where appName = &#63;.
	 *
	 * @param appName the app name
	 * @return the number of matching science apps
	 */
	public static int countByAppName(String appName) {
		return getPersistence().countByAppName(appName);
	}

	/**
	 * Returns all the science apps where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByNameVersion(
		String appName, String appVersion) {

		return getPersistence().findByNameVersion(appName, appVersion);
	}

	/**
	 * Returns a range of all the science apps where appName = &#63; and appVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByNameVersion(
		String appName, String appVersion, int start, int end) {

		return getPersistence().findByNameVersion(
			appName, appVersion, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where appName = &#63; and appVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByNameVersion(
		String appName, String appVersion, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByNameVersion(
			appName, appVersion, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where appName = &#63; and appVersion = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByNameVersion(
		String appName, String appVersion, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByNameVersion(
			appName, appVersion, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByNameVersion_First(
			String appName, String appVersion,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByNameVersion_First(
			appName, appVersion, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByNameVersion_First(
		String appName, String appVersion,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByNameVersion_First(
			appName, appVersion, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByNameVersion_Last(
			String appName, String appVersion,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByNameVersion_Last(
			appName, appVersion, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByNameVersion_Last(
		String appName, String appVersion,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByNameVersion_Last(
			appName, appVersion, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where appName = &#63; and appVersion = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByNameVersion_PrevAndNext(
			long scienceAppId, String appName, String appVersion,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByNameVersion_PrevAndNext(
			scienceAppId, appName, appVersion, orderByComparator);
	}

	/**
	 * Removes all the science apps where appName = &#63; and appVersion = &#63; from the database.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 */
	public static void removeByNameVersion(String appName, String appVersion) {
		getPersistence().removeByNameVersion(appName, appVersion);
	}

	/**
	 * Returns the number of science apps where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @return the number of matching science apps
	 */
	public static int countByNameVersion(String appName, String appVersion) {
		return getPersistence().countByNameVersion(appName, appVersion);
	}

	/**
	 * Returns all the science apps where appType = &#63;.
	 *
	 * @param appType the app type
	 * @return the matching science apps
	 */
	public static List<ScienceApp> findByAppType(String appType) {
		return getPersistence().findByAppType(appType);
	}

	/**
	 * Returns a range of all the science apps where appType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param appType the app type
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of matching science apps
	 */
	public static List<ScienceApp> findByAppType(
		String appType, int start, int end) {

		return getPersistence().findByAppType(appType, start, end);
	}

	/**
	 * Returns an ordered range of all the science apps where appType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param appType the app type
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByAppType(
		String appType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findByAppType(
			appType, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps where appType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param appType the app type
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching science apps
	 */
	public static List<ScienceApp> findByAppType(
		String appType, int start, int end,
		OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByAppType(
			appType, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first science app in the ordered set where appType = &#63;.
	 *
	 * @param appType the app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByAppType_First(
			String appType, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByAppType_First(appType, orderByComparator);
	}

	/**
	 * Returns the first science app in the ordered set where appType = &#63;.
	 *
	 * @param appType the app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByAppType_First(
		String appType, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByAppType_First(
			appType, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where appType = &#63;.
	 *
	 * @param appType the app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public static ScienceApp findByAppType_Last(
			String appType, OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByAppType_Last(appType, orderByComparator);
	}

	/**
	 * Returns the last science app in the ordered set where appType = &#63;.
	 *
	 * @param appType the app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public static ScienceApp fetchByAppType_Last(
		String appType, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().fetchByAppType_Last(appType, orderByComparator);
	}

	/**
	 * Returns the science apps before and after the current science app in the ordered set where appType = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param appType the app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp[] findByAppType_PrevAndNext(
			long scienceAppId, String appType,
			OrderByComparator<ScienceApp> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByAppType_PrevAndNext(
			scienceAppId, appType, orderByComparator);
	}

	/**
	 * Removes all the science apps where appType = &#63; from the database.
	 *
	 * @param appType the app type
	 */
	public static void removeByAppType(String appType) {
		getPersistence().removeByAppType(appType);
	}

	/**
	 * Returns the number of science apps where appType = &#63;.
	 *
	 * @param appType the app type
	 * @return the number of matching science apps
	 */
	public static int countByAppType(String appType) {
		return getPersistence().countByAppType(appType);
	}

	/**
	 * Caches the science app in the entity cache if it is enabled.
	 *
	 * @param scienceApp the science app
	 */
	public static void cacheResult(ScienceApp scienceApp) {
		getPersistence().cacheResult(scienceApp);
	}

	/**
	 * Caches the science apps in the entity cache if it is enabled.
	 *
	 * @param scienceApps the science apps
	 */
	public static void cacheResult(List<ScienceApp> scienceApps) {
		getPersistence().cacheResult(scienceApps);
	}

	/**
	 * Creates a new science app with the primary key. Does not add the science app to the database.
	 *
	 * @param scienceAppId the primary key for the new science app
	 * @return the new science app
	 */
	public static ScienceApp create(long scienceAppId) {
		return getPersistence().create(scienceAppId);
	}

	/**
	 * Removes the science app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param scienceAppId the primary key of the science app
	 * @return the science app that was removed
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp remove(long scienceAppId)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().remove(scienceAppId);
	}

	public static ScienceApp updateImpl(ScienceApp scienceApp) {
		return getPersistence().updateImpl(scienceApp);
	}

	/**
	 * Returns the science app with the primary key or throws a <code>NoSuchScienceAppException</code> if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app
	 * @return the science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public static ScienceApp findByPrimaryKey(long scienceAppId)
		throws com.sx.spyglass.exception.NoSuchScienceAppException {

		return getPersistence().findByPrimaryKey(scienceAppId);
	}

	/**
	 * Returns the science app with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app
	 * @return the science app, or <code>null</code> if a science app with the primary key could not be found
	 */
	public static ScienceApp fetchByPrimaryKey(long scienceAppId) {
		return getPersistence().fetchByPrimaryKey(scienceAppId);
	}

	/**
	 * Returns all the science apps.
	 *
	 * @return the science apps
	 */
	public static List<ScienceApp> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the science apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @return the range of science apps
	 */
	public static List<ScienceApp> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the science apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of science apps
	 */
	public static List<ScienceApp> findAll(
		int start, int end, OrderByComparator<ScienceApp> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the science apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ScienceAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of science apps
	 * @param end the upper bound of the range of science apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of science apps
	 */
	public static List<ScienceApp> findAll(
		int start, int end, OrderByComparator<ScienceApp> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the science apps from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of science apps.
	 *
	 * @return the number of science apps
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ScienceAppPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ScienceAppPersistence _persistence;

}