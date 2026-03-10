/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.sx.spyglass.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.sx.spyglass.exception.NoSuchScienceAppException;
import com.sx.spyglass.model.ScienceApp;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the science app service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ScienceAppUtil
 * @generated
 */
@ProviderType
public interface ScienceAppPersistence extends BasePersistence<ScienceApp> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ScienceAppUtil} to access the science app persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the science apps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByUuid(String uuid);

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
	public java.util.List<ScienceApp> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<ScienceApp> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first science app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the last science app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the science apps before and after the current science app in the ordered set where uuid = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public ScienceApp[] findByUuid_PrevAndNext(
			long scienceAppId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of science apps where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching science apps
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the science app where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchScienceAppException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByUUID_G(String uuid, long groupId)
		throws NoSuchScienceAppException;

	/**
	 * Returns the science app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the science app where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the science app where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the science app that was removed
	 */
	public ScienceApp removeByUUID_G(String uuid, long groupId)
		throws NoSuchScienceAppException;

	/**
	 * Returns the number of science apps where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching science apps
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the science apps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<ScienceApp> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<ScienceApp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first science app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the last science app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public ScienceApp[] findByUuid_C_PrevAndNext(
			long scienceAppId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of science apps where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching science apps
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the science apps where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByGroupId(long groupId);

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
	public java.util.List<ScienceApp> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<ScienceApp> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first science app in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the last science app in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the science apps before and after the current science app in the ordered set where groupId = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public ScienceApp[] findByGroupId_PrevAndNext(
			long scienceAppId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of science apps where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching science apps
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the science apps where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByUserId(long userId);

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
	public java.util.List<ScienceApp> findByUserId(
		long userId, int start, int end);

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
	public java.util.List<ScienceApp> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first science app in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByUserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the last science app in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByUserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the science apps before and after the current science app in the ordered set where userId = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public ScienceApp[] findByUserId_PrevAndNext(
			long scienceAppId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByUserId(long userId);

	/**
	 * Returns the number of science apps where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching science apps
	 */
	public int countByUserId(long userId);

	/**
	 * Returns all the science apps where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByStatus(int status);

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
	public java.util.List<ScienceApp> findByStatus(
		int status, int start, int end);

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
	public java.util.List<ScienceApp> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByStatus(
		int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first science app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByStatus_First(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByStatus_First(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the last science app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByStatus_Last(
			int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByStatus_Last(
		int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the science apps before and after the current science app in the ordered set where status = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public ScienceApp[] findByStatus_PrevAndNext(
			long scienceAppId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public void removeByStatus(int status);

	/**
	 * Returns the number of science apps where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching science apps
	 */
	public int countByStatus(int status);

	/**
	 * Returns all the science apps where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByG_U(long groupId, long userId);

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
	public java.util.List<ScienceApp> findByG_U(
		long groupId, long userId, int start, int end);

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
	public java.util.List<ScienceApp> findByG_U(
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByG_U(
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first science app in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByG_U_First(
			long groupId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByG_U_First(
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the last science app in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByG_U_Last(
			long groupId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByG_U_Last(
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public ScienceApp[] findByG_U_PrevAndNext(
			long scienceAppId, long groupId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where groupId = &#63; and userId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 */
	public void removeByG_U(long groupId, long userId);

	/**
	 * Returns the number of science apps where groupId = &#63; and userId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @return the number of matching science apps
	 */
	public int countByG_U(long groupId, long userId);

	/**
	 * Returns all the science apps where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByG_S(long groupId, int status);

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
	public java.util.List<ScienceApp> findByG_S(
		long groupId, int status, int start, int end);

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
	public java.util.List<ScienceApp> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByG_S(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first science app in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByG_S_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByG_S_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the last science app in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByG_S_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByG_S_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public ScienceApp[] findByG_S_PrevAndNext(
			long scienceAppId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeByG_S(long groupId, int status);

	/**
	 * Returns the number of science apps where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching science apps
	 */
	public int countByG_S(long groupId, int status);

	/**
	 * Returns all the science apps where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByU_S(long userId, int status);

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
	public java.util.List<ScienceApp> findByU_S(
		long userId, int status, int start, int end);

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
	public java.util.List<ScienceApp> findByU_S(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByU_S(
		long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first science app in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByU_S_First(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByU_S_First(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the last science app in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByU_S_Last(
			long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByU_S_Last(
		long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public ScienceApp[] findByU_S_PrevAndNext(
			long scienceAppId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByU_S(long userId, int status);

	/**
	 * Returns the number of science apps where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching science apps
	 */
	public int countByU_S(long userId, int status);

	/**
	 * Returns all the science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByG_U_S(
		long groupId, long userId, int status);

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
	public java.util.List<ScienceApp> findByG_U_S(
		long groupId, long userId, int status, int start, int end);

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
	public java.util.List<ScienceApp> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByG_U_S(
		long groupId, long userId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

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
	public ScienceApp findByG_U_S_First(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByG_U_S_First(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public ScienceApp findByG_U_S_Last(
			long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByG_U_S_Last(
		long groupId, long userId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public ScienceApp[] findByG_U_S_PrevAndNext(
			long scienceAppId, long groupId, long userId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where groupId = &#63; and userId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 */
	public void removeByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns the number of science apps where groupId = &#63; and userId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching science apps
	 */
	public int countByG_U_S(long groupId, long userId, int status);

	/**
	 * Returns all the science apps where appName = &#63;.
	 *
	 * @param appName the app name
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByAppName(String appName);

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
	public java.util.List<ScienceApp> findByAppName(
		String appName, int start, int end);

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
	public java.util.List<ScienceApp> findByAppName(
		String appName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByAppName(
		String appName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first science app in the ordered set where appName = &#63;.
	 *
	 * @param appName the app name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByAppName_First(
			String appName,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where appName = &#63;.
	 *
	 * @param appName the app name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByAppName_First(
		String appName,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the last science app in the ordered set where appName = &#63;.
	 *
	 * @param appName the app name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByAppName_Last(
			String appName,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where appName = &#63;.
	 *
	 * @param appName the app name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByAppName_Last(
		String appName,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the science apps before and after the current science app in the ordered set where appName = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param appName the app name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public ScienceApp[] findByAppName_PrevAndNext(
			long scienceAppId, String appName,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where appName = &#63; from the database.
	 *
	 * @param appName the app name
	 */
	public void removeByAppName(String appName);

	/**
	 * Returns the number of science apps where appName = &#63;.
	 *
	 * @param appName the app name
	 * @return the number of matching science apps
	 */
	public int countByAppName(String appName);

	/**
	 * Returns all the science apps where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByNameVersion(
		String appName, String appVersion);

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
	public java.util.List<ScienceApp> findByNameVersion(
		String appName, String appVersion, int start, int end);

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
	public java.util.List<ScienceApp> findByNameVersion(
		String appName, String appVersion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByNameVersion(
		String appName, String appVersion, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first science app in the ordered set where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByNameVersion_First(
			String appName, String appVersion,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByNameVersion_First(
		String appName, String appVersion,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the last science app in the ordered set where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByNameVersion_Last(
			String appName, String appVersion,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByNameVersion_Last(
		String appName, String appVersion,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public ScienceApp[] findByNameVersion_PrevAndNext(
			long scienceAppId, String appName, String appVersion,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where appName = &#63; and appVersion = &#63; from the database.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 */
	public void removeByNameVersion(String appName, String appVersion);

	/**
	 * Returns the number of science apps where appName = &#63; and appVersion = &#63;.
	 *
	 * @param appName the app name
	 * @param appVersion the app version
	 * @return the number of matching science apps
	 */
	public int countByNameVersion(String appName, String appVersion);

	/**
	 * Returns all the science apps where appType = &#63;.
	 *
	 * @param appType the app type
	 * @return the matching science apps
	 */
	public java.util.List<ScienceApp> findByAppType(String appType);

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
	public java.util.List<ScienceApp> findByAppType(
		String appType, int start, int end);

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
	public java.util.List<ScienceApp> findByAppType(
		String appType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findByAppType(
		String appType, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first science app in the ordered set where appType = &#63;.
	 *
	 * @param appType the app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByAppType_First(
			String appType,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the first science app in the ordered set where appType = &#63;.
	 *
	 * @param appType the app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByAppType_First(
		String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the last science app in the ordered set where appType = &#63;.
	 *
	 * @param appType the app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app
	 * @throws NoSuchScienceAppException if a matching science app could not be found
	 */
	public ScienceApp findByAppType_Last(
			String appType,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Returns the last science app in the ordered set where appType = &#63;.
	 *
	 * @param appType the app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching science app, or <code>null</code> if a matching science app could not be found
	 */
	public ScienceApp fetchByAppType_Last(
		String appType,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

	/**
	 * Returns the science apps before and after the current science app in the ordered set where appType = &#63;.
	 *
	 * @param scienceAppId the primary key of the current science app
	 * @param appType the app type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public ScienceApp[] findByAppType_PrevAndNext(
			long scienceAppId, String appType,
			com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
				orderByComparator)
		throws NoSuchScienceAppException;

	/**
	 * Removes all the science apps where appType = &#63; from the database.
	 *
	 * @param appType the app type
	 */
	public void removeByAppType(String appType);

	/**
	 * Returns the number of science apps where appType = &#63;.
	 *
	 * @param appType the app type
	 * @return the number of matching science apps
	 */
	public int countByAppType(String appType);

	/**
	 * Caches the science app in the entity cache if it is enabled.
	 *
	 * @param scienceApp the science app
	 */
	public void cacheResult(ScienceApp scienceApp);

	/**
	 * Caches the science apps in the entity cache if it is enabled.
	 *
	 * @param scienceApps the science apps
	 */
	public void cacheResult(java.util.List<ScienceApp> scienceApps);

	/**
	 * Creates a new science app with the primary key. Does not add the science app to the database.
	 *
	 * @param scienceAppId the primary key for the new science app
	 * @return the new science app
	 */
	public ScienceApp create(long scienceAppId);

	/**
	 * Removes the science app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param scienceAppId the primary key of the science app
	 * @return the science app that was removed
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public ScienceApp remove(long scienceAppId)
		throws NoSuchScienceAppException;

	public ScienceApp updateImpl(ScienceApp scienceApp);

	/**
	 * Returns the science app with the primary key or throws a <code>NoSuchScienceAppException</code> if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app
	 * @return the science app
	 * @throws NoSuchScienceAppException if a science app with the primary key could not be found
	 */
	public ScienceApp findByPrimaryKey(long scienceAppId)
		throws NoSuchScienceAppException;

	/**
	 * Returns the science app with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param scienceAppId the primary key of the science app
	 * @return the science app, or <code>null</code> if a science app with the primary key could not be found
	 */
	public ScienceApp fetchByPrimaryKey(long scienceAppId);

	/**
	 * Returns all the science apps.
	 *
	 * @return the science apps
	 */
	public java.util.List<ScienceApp> findAll();

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
	public java.util.List<ScienceApp> findAll(int start, int end);

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
	public java.util.List<ScienceApp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator);

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
	public java.util.List<ScienceApp> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ScienceApp>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the science apps from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of science apps.
	 *
	 * @return the number of science apps
	 */
	public int countAll();

}