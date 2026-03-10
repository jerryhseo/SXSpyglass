/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.sx.spyglass.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.sx.spyglass.model.AppPort;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the app port service. This utility wraps <code>com.sx.spyglass.service.persistence.impl.AppPortPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AppPortPersistence
 * @generated
 */
public class AppPortUtil {

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
	public static void clearCache(AppPort appPort) {
		getPersistence().clearCache(appPort);
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
	public static Map<Serializable, AppPort> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AppPort> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AppPort> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AppPort> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AppPort> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AppPort update(AppPort appPort) {
		return getPersistence().update(appPort);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AppPort update(
		AppPort appPort, ServiceContext serviceContext) {

		return getPersistence().update(appPort, serviceContext);
	}

	/**
	 * Returns all the app ports where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @return the matching app ports
	 */
	public static List<AppPort> findByAppId(long dataTypeId) {
		return getPersistence().findByAppId(dataTypeId);
	}

	/**
	 * Returns a range of all the app ports where dataTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param dataTypeId the data type ID
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @return the range of matching app ports
	 */
	public static List<AppPort> findByAppId(
		long dataTypeId, int start, int end) {

		return getPersistence().findByAppId(dataTypeId, start, end);
	}

	/**
	 * Returns an ordered range of all the app ports where dataTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param dataTypeId the data type ID
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app ports
	 */
	public static List<AppPort> findByAppId(
		long dataTypeId, int start, int end,
		OrderByComparator<AppPort> orderByComparator) {

		return getPersistence().findByAppId(
			dataTypeId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the app ports where dataTypeId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param dataTypeId the data type ID
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching app ports
	 */
	public static List<AppPort> findByAppId(
		long dataTypeId, int start, int end,
		OrderByComparator<AppPort> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByAppId(
			dataTypeId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public static AppPort findByAppId_First(
			long dataTypeId, OrderByComparator<AppPort> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchAppPortException {

		return getPersistence().findByAppId_First(
			dataTypeId, orderByComparator);
	}

	/**
	 * Returns the first app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public static AppPort fetchByAppId_First(
		long dataTypeId, OrderByComparator<AppPort> orderByComparator) {

		return getPersistence().fetchByAppId_First(
			dataTypeId, orderByComparator);
	}

	/**
	 * Returns the last app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public static AppPort findByAppId_Last(
			long dataTypeId, OrderByComparator<AppPort> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchAppPortException {

		return getPersistence().findByAppId_Last(dataTypeId, orderByComparator);
	}

	/**
	 * Returns the last app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public static AppPort fetchByAppId_Last(
		long dataTypeId, OrderByComparator<AppPort> orderByComparator) {

		return getPersistence().fetchByAppId_Last(
			dataTypeId, orderByComparator);
	}

	/**
	 * Returns the app ports before and after the current app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param appPortId the primary key of the current app port
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app port
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	public static AppPort[] findByAppId_PrevAndNext(
			long appPortId, long dataTypeId,
			OrderByComparator<AppPort> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchAppPortException {

		return getPersistence().findByAppId_PrevAndNext(
			appPortId, dataTypeId, orderByComparator);
	}

	/**
	 * Removes all the app ports where dataTypeId = &#63; from the database.
	 *
	 * @param dataTypeId the data type ID
	 */
	public static void removeByAppId(long dataTypeId) {
		getPersistence().removeByAppId(dataTypeId);
	}

	/**
	 * Returns the number of app ports where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @return the number of matching app ports
	 */
	public static int countByAppId(long dataTypeId) {
		return getPersistence().countByAppId(dataTypeId);
	}

	/**
	 * Returns all the app ports where portType = &#63;.
	 *
	 * @param portType the port type
	 * @return the matching app ports
	 */
	public static List<AppPort> findByportType(String portType) {
		return getPersistence().findByportType(portType);
	}

	/**
	 * Returns a range of all the app ports where portType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param portType the port type
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @return the range of matching app ports
	 */
	public static List<AppPort> findByportType(
		String portType, int start, int end) {

		return getPersistence().findByportType(portType, start, end);
	}

	/**
	 * Returns an ordered range of all the app ports where portType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param portType the port type
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app ports
	 */
	public static List<AppPort> findByportType(
		String portType, int start, int end,
		OrderByComparator<AppPort> orderByComparator) {

		return getPersistence().findByportType(
			portType, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the app ports where portType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param portType the port type
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching app ports
	 */
	public static List<AppPort> findByportType(
		String portType, int start, int end,
		OrderByComparator<AppPort> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByportType(
			portType, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public static AppPort findByportType_First(
			String portType, OrderByComparator<AppPort> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchAppPortException {

		return getPersistence().findByportType_First(
			portType, orderByComparator);
	}

	/**
	 * Returns the first app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public static AppPort fetchByportType_First(
		String portType, OrderByComparator<AppPort> orderByComparator) {

		return getPersistence().fetchByportType_First(
			portType, orderByComparator);
	}

	/**
	 * Returns the last app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public static AppPort findByportType_Last(
			String portType, OrderByComparator<AppPort> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchAppPortException {

		return getPersistence().findByportType_Last(
			portType, orderByComparator);
	}

	/**
	 * Returns the last app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public static AppPort fetchByportType_Last(
		String portType, OrderByComparator<AppPort> orderByComparator) {

		return getPersistence().fetchByportType_Last(
			portType, orderByComparator);
	}

	/**
	 * Returns the app ports before and after the current app port in the ordered set where portType = &#63;.
	 *
	 * @param appPortId the primary key of the current app port
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app port
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	public static AppPort[] findByportType_PrevAndNext(
			long appPortId, String portType,
			OrderByComparator<AppPort> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchAppPortException {

		return getPersistence().findByportType_PrevAndNext(
			appPortId, portType, orderByComparator);
	}

	/**
	 * Removes all the app ports where portType = &#63; from the database.
	 *
	 * @param portType the port type
	 */
	public static void removeByportType(String portType) {
		getPersistence().removeByportType(portType);
	}

	/**
	 * Returns the number of app ports where portType = &#63;.
	 *
	 * @param portType the port type
	 * @return the number of matching app ports
	 */
	public static int countByportType(String portType) {
		return getPersistence().countByportType(portType);
	}

	/**
	 * Returns all the app ports where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @return the matching app ports
	 */
	public static List<AppPort> findByAppPortType(
		long dataTypeId, String portType) {

		return getPersistence().findByAppPortType(dataTypeId, portType);
	}

	/**
	 * Returns a range of all the app ports where dataTypeId = &#63; and portType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @return the range of matching app ports
	 */
	public static List<AppPort> findByAppPortType(
		long dataTypeId, String portType, int start, int end) {

		return getPersistence().findByAppPortType(
			dataTypeId, portType, start, end);
	}

	/**
	 * Returns an ordered range of all the app ports where dataTypeId = &#63; and portType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching app ports
	 */
	public static List<AppPort> findByAppPortType(
		long dataTypeId, String portType, int start, int end,
		OrderByComparator<AppPort> orderByComparator) {

		return getPersistence().findByAppPortType(
			dataTypeId, portType, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the app ports where dataTypeId = &#63; and portType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching app ports
	 */
	public static List<AppPort> findByAppPortType(
		long dataTypeId, String portType, int start, int end,
		OrderByComparator<AppPort> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByAppPortType(
			dataTypeId, portType, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first app port in the ordered set where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public static AppPort findByAppPortType_First(
			long dataTypeId, String portType,
			OrderByComparator<AppPort> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchAppPortException {

		return getPersistence().findByAppPortType_First(
			dataTypeId, portType, orderByComparator);
	}

	/**
	 * Returns the first app port in the ordered set where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public static AppPort fetchByAppPortType_First(
		long dataTypeId, String portType,
		OrderByComparator<AppPort> orderByComparator) {

		return getPersistence().fetchByAppPortType_First(
			dataTypeId, portType, orderByComparator);
	}

	/**
	 * Returns the last app port in the ordered set where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public static AppPort findByAppPortType_Last(
			long dataTypeId, String portType,
			OrderByComparator<AppPort> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchAppPortException {

		return getPersistence().findByAppPortType_Last(
			dataTypeId, portType, orderByComparator);
	}

	/**
	 * Returns the last app port in the ordered set where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public static AppPort fetchByAppPortType_Last(
		long dataTypeId, String portType,
		OrderByComparator<AppPort> orderByComparator) {

		return getPersistence().fetchByAppPortType_Last(
			dataTypeId, portType, orderByComparator);
	}

	/**
	 * Returns the app ports before and after the current app port in the ordered set where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param appPortId the primary key of the current app port
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app port
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	public static AppPort[] findByAppPortType_PrevAndNext(
			long appPortId, long dataTypeId, String portType,
			OrderByComparator<AppPort> orderByComparator)
		throws com.sx.spyglass.exception.NoSuchAppPortException {

		return getPersistence().findByAppPortType_PrevAndNext(
			appPortId, dataTypeId, portType, orderByComparator);
	}

	/**
	 * Removes all the app ports where dataTypeId = &#63; and portType = &#63; from the database.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 */
	public static void removeByAppPortType(long dataTypeId, String portType) {
		getPersistence().removeByAppPortType(dataTypeId, portType);
	}

	/**
	 * Returns the number of app ports where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @return the number of matching app ports
	 */
	public static int countByAppPortType(long dataTypeId, String portType) {
		return getPersistence().countByAppPortType(dataTypeId, portType);
	}

	/**
	 * Caches the app port in the entity cache if it is enabled.
	 *
	 * @param appPort the app port
	 */
	public static void cacheResult(AppPort appPort) {
		getPersistence().cacheResult(appPort);
	}

	/**
	 * Caches the app ports in the entity cache if it is enabled.
	 *
	 * @param appPorts the app ports
	 */
	public static void cacheResult(List<AppPort> appPorts) {
		getPersistence().cacheResult(appPorts);
	}

	/**
	 * Creates a new app port with the primary key. Does not add the app port to the database.
	 *
	 * @param appPortId the primary key for the new app port
	 * @return the new app port
	 */
	public static AppPort create(long appPortId) {
		return getPersistence().create(appPortId);
	}

	/**
	 * Removes the app port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appPortId the primary key of the app port
	 * @return the app port that was removed
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	public static AppPort remove(long appPortId)
		throws com.sx.spyglass.exception.NoSuchAppPortException {

		return getPersistence().remove(appPortId);
	}

	public static AppPort updateImpl(AppPort appPort) {
		return getPersistence().updateImpl(appPort);
	}

	/**
	 * Returns the app port with the primary key or throws a <code>NoSuchAppPortException</code> if it could not be found.
	 *
	 * @param appPortId the primary key of the app port
	 * @return the app port
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	public static AppPort findByPrimaryKey(long appPortId)
		throws com.sx.spyglass.exception.NoSuchAppPortException {

		return getPersistence().findByPrimaryKey(appPortId);
	}

	/**
	 * Returns the app port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appPortId the primary key of the app port
	 * @return the app port, or <code>null</code> if a app port with the primary key could not be found
	 */
	public static AppPort fetchByPrimaryKey(long appPortId) {
		return getPersistence().fetchByPrimaryKey(appPortId);
	}

	/**
	 * Returns all the app ports.
	 *
	 * @return the app ports
	 */
	public static List<AppPort> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the app ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @return the range of app ports
	 */
	public static List<AppPort> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the app ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of app ports
	 */
	public static List<AppPort> findAll(
		int start, int end, OrderByComparator<AppPort> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the app ports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AppPortModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of app ports
	 * @param end the upper bound of the range of app ports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of app ports
	 */
	public static List<AppPort> findAll(
		int start, int end, OrderByComparator<AppPort> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the app ports from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of app ports.
	 *
	 * @return the number of app ports
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AppPortPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(AppPortPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile AppPortPersistence _persistence;

}