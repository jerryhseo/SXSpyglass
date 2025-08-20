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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.sx.spyglass.exception.NoSuchAppPortException;
import com.sx.spyglass.model.AppPort;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the app port service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AppPortUtil
 * @generated
 */
@ProviderType
public interface AppPortPersistence extends BasePersistence<AppPort> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AppPortUtil} to access the app port persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the app ports where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @return the matching app ports
	 */
	public java.util.List<AppPort> findByAppId(long dataTypeId);

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
	public java.util.List<AppPort> findByAppId(
		long dataTypeId, int start, int end);

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
	public java.util.List<AppPort> findByAppId(
		long dataTypeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator);

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
	public java.util.List<AppPort> findByAppId(
		long dataTypeId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public AppPort findByAppId_First(
			long dataTypeId,
			com.liferay.portal.kernel.util.OrderByComparator<AppPort>
				orderByComparator)
		throws NoSuchAppPortException;

	/**
	 * Returns the first app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public AppPort fetchByAppId_First(
		long dataTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator);

	/**
	 * Returns the last app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public AppPort findByAppId_Last(
			long dataTypeId,
			com.liferay.portal.kernel.util.OrderByComparator<AppPort>
				orderByComparator)
		throws NoSuchAppPortException;

	/**
	 * Returns the last app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public AppPort fetchByAppId_Last(
		long dataTypeId,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator);

	/**
	 * Returns the app ports before and after the current app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param appPortId the primary key of the current app port
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app port
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	public AppPort[] findByAppId_PrevAndNext(
			long appPortId, long dataTypeId,
			com.liferay.portal.kernel.util.OrderByComparator<AppPort>
				orderByComparator)
		throws NoSuchAppPortException;

	/**
	 * Removes all the app ports where dataTypeId = &#63; from the database.
	 *
	 * @param dataTypeId the data type ID
	 */
	public void removeByAppId(long dataTypeId);

	/**
	 * Returns the number of app ports where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @return the number of matching app ports
	 */
	public int countByAppId(long dataTypeId);

	/**
	 * Returns all the app ports where portType = &#63;.
	 *
	 * @param portType the port type
	 * @return the matching app ports
	 */
	public java.util.List<AppPort> findByportType(String portType);

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
	public java.util.List<AppPort> findByportType(
		String portType, int start, int end);

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
	public java.util.List<AppPort> findByportType(
		String portType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator);

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
	public java.util.List<AppPort> findByportType(
		String portType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public AppPort findByportType_First(
			String portType,
			com.liferay.portal.kernel.util.OrderByComparator<AppPort>
				orderByComparator)
		throws NoSuchAppPortException;

	/**
	 * Returns the first app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public AppPort fetchByportType_First(
		String portType,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator);

	/**
	 * Returns the last app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public AppPort findByportType_Last(
			String portType,
			com.liferay.portal.kernel.util.OrderByComparator<AppPort>
				orderByComparator)
		throws NoSuchAppPortException;

	/**
	 * Returns the last app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public AppPort fetchByportType_Last(
		String portType,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator);

	/**
	 * Returns the app ports before and after the current app port in the ordered set where portType = &#63;.
	 *
	 * @param appPortId the primary key of the current app port
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next app port
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	public AppPort[] findByportType_PrevAndNext(
			long appPortId, String portType,
			com.liferay.portal.kernel.util.OrderByComparator<AppPort>
				orderByComparator)
		throws NoSuchAppPortException;

	/**
	 * Removes all the app ports where portType = &#63; from the database.
	 *
	 * @param portType the port type
	 */
	public void removeByportType(String portType);

	/**
	 * Returns the number of app ports where portType = &#63;.
	 *
	 * @param portType the port type
	 * @return the number of matching app ports
	 */
	public int countByportType(String portType);

	/**
	 * Returns all the app ports where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @return the matching app ports
	 */
	public java.util.List<AppPort> findByAppPortType(
		long dataTypeId, String portType);

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
	public java.util.List<AppPort> findByAppPortType(
		long dataTypeId, String portType, int start, int end);

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
	public java.util.List<AppPort> findByAppPortType(
		long dataTypeId, String portType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator);

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
	public java.util.List<AppPort> findByAppPortType(
		long dataTypeId, String portType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first app port in the ordered set where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public AppPort findByAppPortType_First(
			long dataTypeId, String portType,
			com.liferay.portal.kernel.util.OrderByComparator<AppPort>
				orderByComparator)
		throws NoSuchAppPortException;

	/**
	 * Returns the first app port in the ordered set where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public AppPort fetchByAppPortType_First(
		long dataTypeId, String portType,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator);

	/**
	 * Returns the last app port in the ordered set where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	public AppPort findByAppPortType_Last(
			long dataTypeId, String portType,
			com.liferay.portal.kernel.util.OrderByComparator<AppPort>
				orderByComparator)
		throws NoSuchAppPortException;

	/**
	 * Returns the last app port in the ordered set where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port, or <code>null</code> if a matching app port could not be found
	 */
	public AppPort fetchByAppPortType_Last(
		long dataTypeId, String portType,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator);

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
	public AppPort[] findByAppPortType_PrevAndNext(
			long appPortId, long dataTypeId, String portType,
			com.liferay.portal.kernel.util.OrderByComparator<AppPort>
				orderByComparator)
		throws NoSuchAppPortException;

	/**
	 * Removes all the app ports where dataTypeId = &#63; and portType = &#63; from the database.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 */
	public void removeByAppPortType(long dataTypeId, String portType);

	/**
	 * Returns the number of app ports where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @return the number of matching app ports
	 */
	public int countByAppPortType(long dataTypeId, String portType);

	/**
	 * Caches the app port in the entity cache if it is enabled.
	 *
	 * @param appPort the app port
	 */
	public void cacheResult(AppPort appPort);

	/**
	 * Caches the app ports in the entity cache if it is enabled.
	 *
	 * @param appPorts the app ports
	 */
	public void cacheResult(java.util.List<AppPort> appPorts);

	/**
	 * Creates a new app port with the primary key. Does not add the app port to the database.
	 *
	 * @param appPortId the primary key for the new app port
	 * @return the new app port
	 */
	public AppPort create(long appPortId);

	/**
	 * Removes the app port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appPortId the primary key of the app port
	 * @return the app port that was removed
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	public AppPort remove(long appPortId) throws NoSuchAppPortException;

	public AppPort updateImpl(AppPort appPort);

	/**
	 * Returns the app port with the primary key or throws a <code>NoSuchAppPortException</code> if it could not be found.
	 *
	 * @param appPortId the primary key of the app port
	 * @return the app port
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	public AppPort findByPrimaryKey(long appPortId)
		throws NoSuchAppPortException;

	/**
	 * Returns the app port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appPortId the primary key of the app port
	 * @return the app port, or <code>null</code> if a app port with the primary key could not be found
	 */
	public AppPort fetchByPrimaryKey(long appPortId);

	/**
	 * Returns all the app ports.
	 *
	 * @return the app ports
	 */
	public java.util.List<AppPort> findAll();

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
	public java.util.List<AppPort> findAll(int start, int end);

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
	public java.util.List<AppPort> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator);

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
	public java.util.List<AppPort> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AppPort>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the app ports from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of app ports.
	 *
	 * @return the number of app ports
	 */
	public int countAll();

}