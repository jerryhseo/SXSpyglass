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

package com.sx.spyglass.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.sx.spyglass.exception.NoSuchAppPortException;
import com.sx.spyglass.model.AppPort;
import com.sx.spyglass.model.impl.AppPortImpl;
import com.sx.spyglass.model.impl.AppPortModelImpl;
import com.sx.spyglass.service.persistence.AppPortPersistence;
import com.sx.spyglass.service.persistence.AppPortUtil;
import com.sx.spyglass.service.persistence.impl.constants.SXSpyglassPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the app port service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AppPortPersistence.class)
public class AppPortPersistenceImpl
	extends BasePersistenceImpl<AppPort> implements AppPortPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AppPortUtil</code> to access the app port persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AppPortImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByAppId;
	private FinderPath _finderPathWithoutPaginationFindByAppId;
	private FinderPath _finderPathCountByAppId;

	/**
	 * Returns all the app ports where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @return the matching app ports
	 */
	@Override
	public List<AppPort> findByAppId(long dataTypeId) {
		return findByAppId(
			dataTypeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AppPort> findByAppId(long dataTypeId, int start, int end) {
		return findByAppId(dataTypeId, start, end, null);
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
	@Override
	public List<AppPort> findByAppId(
		long dataTypeId, int start, int end,
		OrderByComparator<AppPort> orderByComparator) {

		return findByAppId(dataTypeId, start, end, orderByComparator, true);
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
	@Override
	public List<AppPort> findByAppId(
		long dataTypeId, int start, int end,
		OrderByComparator<AppPort> orderByComparator, boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByAppId;
				finderArgs = new Object[] {dataTypeId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByAppId;
			finderArgs = new Object[] {
				dataTypeId, start, end, orderByComparator
			};
		}

		List<AppPort> list = null;

		if (useFinderCache) {
			list = (List<AppPort>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AppPort appPort : list) {
					if (dataTypeId != appPort.getDataTypeId()) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_APPPORT_WHERE);

			sb.append(_FINDER_COLUMN_APPID_DATATYPEID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AppPortModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(dataTypeId);

				list = (List<AppPort>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	@Override
	public AppPort findByAppId_First(
			long dataTypeId, OrderByComparator<AppPort> orderByComparator)
		throws NoSuchAppPortException {

		AppPort appPort = fetchByAppId_First(dataTypeId, orderByComparator);

		if (appPort != null) {
			return appPort;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("dataTypeId=");
		sb.append(dataTypeId);

		sb.append("}");

		throw new NoSuchAppPortException(sb.toString());
	}

	/**
	 * Returns the first app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port, or <code>null</code> if a matching app port could not be found
	 */
	@Override
	public AppPort fetchByAppId_First(
		long dataTypeId, OrderByComparator<AppPort> orderByComparator) {

		List<AppPort> list = findByAppId(dataTypeId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	@Override
	public AppPort findByAppId_Last(
			long dataTypeId, OrderByComparator<AppPort> orderByComparator)
		throws NoSuchAppPortException {

		AppPort appPort = fetchByAppId_Last(dataTypeId, orderByComparator);

		if (appPort != null) {
			return appPort;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("dataTypeId=");
		sb.append(dataTypeId);

		sb.append("}");

		throw new NoSuchAppPortException(sb.toString());
	}

	/**
	 * Returns the last app port in the ordered set where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port, or <code>null</code> if a matching app port could not be found
	 */
	@Override
	public AppPort fetchByAppId_Last(
		long dataTypeId, OrderByComparator<AppPort> orderByComparator) {

		int count = countByAppId(dataTypeId);

		if (count == 0) {
			return null;
		}

		List<AppPort> list = findByAppId(
			dataTypeId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AppPort[] findByAppId_PrevAndNext(
			long appPortId, long dataTypeId,
			OrderByComparator<AppPort> orderByComparator)
		throws NoSuchAppPortException {

		AppPort appPort = findByPrimaryKey(appPortId);

		Session session = null;

		try {
			session = openSession();

			AppPort[] array = new AppPortImpl[3];

			array[0] = getByAppId_PrevAndNext(
				session, appPort, dataTypeId, orderByComparator, true);

			array[1] = appPort;

			array[2] = getByAppId_PrevAndNext(
				session, appPort, dataTypeId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppPort getByAppId_PrevAndNext(
		Session session, AppPort appPort, long dataTypeId,
		OrderByComparator<AppPort> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_APPPORT_WHERE);

		sb.append(_FINDER_COLUMN_APPID_DATATYPEID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(AppPortModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(dataTypeId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(appPort)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AppPort> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app ports where dataTypeId = &#63; from the database.
	 *
	 * @param dataTypeId the data type ID
	 */
	@Override
	public void removeByAppId(long dataTypeId) {
		for (AppPort appPort :
				findByAppId(
					dataTypeId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(appPort);
		}
	}

	/**
	 * Returns the number of app ports where dataTypeId = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @return the number of matching app ports
	 */
	@Override
	public int countByAppId(long dataTypeId) {
		FinderPath finderPath = _finderPathCountByAppId;

		Object[] finderArgs = new Object[] {dataTypeId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_APPPORT_WHERE);

			sb.append(_FINDER_COLUMN_APPID_DATATYPEID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(dataTypeId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_APPID_DATATYPEID_2 =
		"appPort.dataTypeId = ?";

	private FinderPath _finderPathWithPaginationFindByportType;
	private FinderPath _finderPathWithoutPaginationFindByportType;
	private FinderPath _finderPathCountByportType;

	/**
	 * Returns all the app ports where portType = &#63;.
	 *
	 * @param portType the port type
	 * @return the matching app ports
	 */
	@Override
	public List<AppPort> findByportType(String portType) {
		return findByportType(
			portType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AppPort> findByportType(String portType, int start, int end) {
		return findByportType(portType, start, end, null);
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
	@Override
	public List<AppPort> findByportType(
		String portType, int start, int end,
		OrderByComparator<AppPort> orderByComparator) {

		return findByportType(portType, start, end, orderByComparator, true);
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
	@Override
	public List<AppPort> findByportType(
		String portType, int start, int end,
		OrderByComparator<AppPort> orderByComparator, boolean useFinderCache) {

		portType = Objects.toString(portType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByportType;
				finderArgs = new Object[] {portType};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByportType;
			finderArgs = new Object[] {portType, start, end, orderByComparator};
		}

		List<AppPort> list = null;

		if (useFinderCache) {
			list = (List<AppPort>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AppPort appPort : list) {
					if (!portType.equals(appPort.getPortType())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_APPPORT_WHERE);

			boolean bindPortType = false;

			if (portType.isEmpty()) {
				sb.append(_FINDER_COLUMN_PORTTYPE_PORTTYPE_3);
			}
			else {
				bindPortType = true;

				sb.append(_FINDER_COLUMN_PORTTYPE_PORTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AppPortModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPortType) {
					queryPos.add(portType);
				}

				list = (List<AppPort>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	@Override
	public AppPort findByportType_First(
			String portType, OrderByComparator<AppPort> orderByComparator)
		throws NoSuchAppPortException {

		AppPort appPort = fetchByportType_First(portType, orderByComparator);

		if (appPort != null) {
			return appPort;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("portType=");
		sb.append(portType);

		sb.append("}");

		throw new NoSuchAppPortException(sb.toString());
	}

	/**
	 * Returns the first app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port, or <code>null</code> if a matching app port could not be found
	 */
	@Override
	public AppPort fetchByportType_First(
		String portType, OrderByComparator<AppPort> orderByComparator) {

		List<AppPort> list = findByportType(portType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port
	 * @throws NoSuchAppPortException if a matching app port could not be found
	 */
	@Override
	public AppPort findByportType_Last(
			String portType, OrderByComparator<AppPort> orderByComparator)
		throws NoSuchAppPortException {

		AppPort appPort = fetchByportType_Last(portType, orderByComparator);

		if (appPort != null) {
			return appPort;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("portType=");
		sb.append(portType);

		sb.append("}");

		throw new NoSuchAppPortException(sb.toString());
	}

	/**
	 * Returns the last app port in the ordered set where portType = &#63;.
	 *
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port, or <code>null</code> if a matching app port could not be found
	 */
	@Override
	public AppPort fetchByportType_Last(
		String portType, OrderByComparator<AppPort> orderByComparator) {

		int count = countByportType(portType);

		if (count == 0) {
			return null;
		}

		List<AppPort> list = findByportType(
			portType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AppPort[] findByportType_PrevAndNext(
			long appPortId, String portType,
			OrderByComparator<AppPort> orderByComparator)
		throws NoSuchAppPortException {

		portType = Objects.toString(portType, "");

		AppPort appPort = findByPrimaryKey(appPortId);

		Session session = null;

		try {
			session = openSession();

			AppPort[] array = new AppPortImpl[3];

			array[0] = getByportType_PrevAndNext(
				session, appPort, portType, orderByComparator, true);

			array[1] = appPort;

			array[2] = getByportType_PrevAndNext(
				session, appPort, portType, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppPort getByportType_PrevAndNext(
		Session session, AppPort appPort, String portType,
		OrderByComparator<AppPort> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_APPPORT_WHERE);

		boolean bindPortType = false;

		if (portType.isEmpty()) {
			sb.append(_FINDER_COLUMN_PORTTYPE_PORTTYPE_3);
		}
		else {
			bindPortType = true;

			sb.append(_FINDER_COLUMN_PORTTYPE_PORTTYPE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(AppPortModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindPortType) {
			queryPos.add(portType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(appPort)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AppPort> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app ports where portType = &#63; from the database.
	 *
	 * @param portType the port type
	 */
	@Override
	public void removeByportType(String portType) {
		for (AppPort appPort :
				findByportType(
					portType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(appPort);
		}
	}

	/**
	 * Returns the number of app ports where portType = &#63;.
	 *
	 * @param portType the port type
	 * @return the number of matching app ports
	 */
	@Override
	public int countByportType(String portType) {
		portType = Objects.toString(portType, "");

		FinderPath finderPath = _finderPathCountByportType;

		Object[] finderArgs = new Object[] {portType};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_APPPORT_WHERE);

			boolean bindPortType = false;

			if (portType.isEmpty()) {
				sb.append(_FINDER_COLUMN_PORTTYPE_PORTTYPE_3);
			}
			else {
				bindPortType = true;

				sb.append(_FINDER_COLUMN_PORTTYPE_PORTTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindPortType) {
					queryPos.add(portType);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_PORTTYPE_PORTTYPE_2 =
		"appPort.portType = ?";

	private static final String _FINDER_COLUMN_PORTTYPE_PORTTYPE_3 =
		"(appPort.portType IS NULL OR appPort.portType = '')";

	private FinderPath _finderPathWithPaginationFindByAppPortType;
	private FinderPath _finderPathWithoutPaginationFindByAppPortType;
	private FinderPath _finderPathCountByAppPortType;

	/**
	 * Returns all the app ports where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @return the matching app ports
	 */
	@Override
	public List<AppPort> findByAppPortType(long dataTypeId, String portType) {
		return findByAppPortType(
			dataTypeId, portType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AppPort> findByAppPortType(
		long dataTypeId, String portType, int start, int end) {

		return findByAppPortType(dataTypeId, portType, start, end, null);
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
	@Override
	public List<AppPort> findByAppPortType(
		long dataTypeId, String portType, int start, int end,
		OrderByComparator<AppPort> orderByComparator) {

		return findByAppPortType(
			dataTypeId, portType, start, end, orderByComparator, true);
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
	@Override
	public List<AppPort> findByAppPortType(
		long dataTypeId, String portType, int start, int end,
		OrderByComparator<AppPort> orderByComparator, boolean useFinderCache) {

		portType = Objects.toString(portType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByAppPortType;
				finderArgs = new Object[] {dataTypeId, portType};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByAppPortType;
			finderArgs = new Object[] {
				dataTypeId, portType, start, end, orderByComparator
			};
		}

		List<AppPort> list = null;

		if (useFinderCache) {
			list = (List<AppPort>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AppPort appPort : list) {
					if ((dataTypeId != appPort.getDataTypeId()) ||
						!portType.equals(appPort.getPortType())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_APPPORT_WHERE);

			sb.append(_FINDER_COLUMN_APPPORTTYPE_DATATYPEID_2);

			boolean bindPortType = false;

			if (portType.isEmpty()) {
				sb.append(_FINDER_COLUMN_APPPORTTYPE_PORTTYPE_3);
			}
			else {
				bindPortType = true;

				sb.append(_FINDER_COLUMN_APPPORTTYPE_PORTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AppPortModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(dataTypeId);

				if (bindPortType) {
					queryPos.add(portType);
				}

				list = (List<AppPort>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public AppPort findByAppPortType_First(
			long dataTypeId, String portType,
			OrderByComparator<AppPort> orderByComparator)
		throws NoSuchAppPortException {

		AppPort appPort = fetchByAppPortType_First(
			dataTypeId, portType, orderByComparator);

		if (appPort != null) {
			return appPort;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("dataTypeId=");
		sb.append(dataTypeId);

		sb.append(", portType=");
		sb.append(portType);

		sb.append("}");

		throw new NoSuchAppPortException(sb.toString());
	}

	/**
	 * Returns the first app port in the ordered set where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching app port, or <code>null</code> if a matching app port could not be found
	 */
	@Override
	public AppPort fetchByAppPortType_First(
		long dataTypeId, String portType,
		OrderByComparator<AppPort> orderByComparator) {

		List<AppPort> list = findByAppPortType(
			dataTypeId, portType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AppPort findByAppPortType_Last(
			long dataTypeId, String portType,
			OrderByComparator<AppPort> orderByComparator)
		throws NoSuchAppPortException {

		AppPort appPort = fetchByAppPortType_Last(
			dataTypeId, portType, orderByComparator);

		if (appPort != null) {
			return appPort;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("dataTypeId=");
		sb.append(dataTypeId);

		sb.append(", portType=");
		sb.append(portType);

		sb.append("}");

		throw new NoSuchAppPortException(sb.toString());
	}

	/**
	 * Returns the last app port in the ordered set where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching app port, or <code>null</code> if a matching app port could not be found
	 */
	@Override
	public AppPort fetchByAppPortType_Last(
		long dataTypeId, String portType,
		OrderByComparator<AppPort> orderByComparator) {

		int count = countByAppPortType(dataTypeId, portType);

		if (count == 0) {
			return null;
		}

		List<AppPort> list = findByAppPortType(
			dataTypeId, portType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public AppPort[] findByAppPortType_PrevAndNext(
			long appPortId, long dataTypeId, String portType,
			OrderByComparator<AppPort> orderByComparator)
		throws NoSuchAppPortException {

		portType = Objects.toString(portType, "");

		AppPort appPort = findByPrimaryKey(appPortId);

		Session session = null;

		try {
			session = openSession();

			AppPort[] array = new AppPortImpl[3];

			array[0] = getByAppPortType_PrevAndNext(
				session, appPort, dataTypeId, portType, orderByComparator,
				true);

			array[1] = appPort;

			array[2] = getByAppPortType_PrevAndNext(
				session, appPort, dataTypeId, portType, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AppPort getByAppPortType_PrevAndNext(
		Session session, AppPort appPort, long dataTypeId, String portType,
		OrderByComparator<AppPort> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_APPPORT_WHERE);

		sb.append(_FINDER_COLUMN_APPPORTTYPE_DATATYPEID_2);

		boolean bindPortType = false;

		if (portType.isEmpty()) {
			sb.append(_FINDER_COLUMN_APPPORTTYPE_PORTTYPE_3);
		}
		else {
			bindPortType = true;

			sb.append(_FINDER_COLUMN_APPPORTTYPE_PORTTYPE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(AppPortModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(dataTypeId);

		if (bindPortType) {
			queryPos.add(portType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(appPort)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AppPort> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the app ports where dataTypeId = &#63; and portType = &#63; from the database.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 */
	@Override
	public void removeByAppPortType(long dataTypeId, String portType) {
		for (AppPort appPort :
				findByAppPortType(
					dataTypeId, portType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(appPort);
		}
	}

	/**
	 * Returns the number of app ports where dataTypeId = &#63; and portType = &#63;.
	 *
	 * @param dataTypeId the data type ID
	 * @param portType the port type
	 * @return the number of matching app ports
	 */
	@Override
	public int countByAppPortType(long dataTypeId, String portType) {
		portType = Objects.toString(portType, "");

		FinderPath finderPath = _finderPathCountByAppPortType;

		Object[] finderArgs = new Object[] {dataTypeId, portType};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_APPPORT_WHERE);

			sb.append(_FINDER_COLUMN_APPPORTTYPE_DATATYPEID_2);

			boolean bindPortType = false;

			if (portType.isEmpty()) {
				sb.append(_FINDER_COLUMN_APPPORTTYPE_PORTTYPE_3);
			}
			else {
				bindPortType = true;

				sb.append(_FINDER_COLUMN_APPPORTTYPE_PORTTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(dataTypeId);

				if (bindPortType) {
					queryPos.add(portType);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_APPPORTTYPE_DATATYPEID_2 =
		"appPort.dataTypeId = ? AND ";

	private static final String _FINDER_COLUMN_APPPORTTYPE_PORTTYPE_2 =
		"appPort.portType = ?";

	private static final String _FINDER_COLUMN_APPPORTTYPE_PORTTYPE_3 =
		"(appPort.portType IS NULL OR appPort.portType = '')";

	public AppPortPersistenceImpl() {
		setModelClass(AppPort.class);

		setModelImplClass(AppPortImpl.class);
		setModelPKClass(long.class);
	}

	/**
	 * Caches the app port in the entity cache if it is enabled.
	 *
	 * @param appPort the app port
	 */
	@Override
	public void cacheResult(AppPort appPort) {
		entityCache.putResult(
			entityCacheEnabled, AppPortImpl.class, appPort.getPrimaryKey(),
			appPort);

		appPort.resetOriginalValues();
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the app ports in the entity cache if it is enabled.
	 *
	 * @param appPorts the app ports
	 */
	@Override
	public void cacheResult(List<AppPort> appPorts) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (appPorts.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AppPort appPort : appPorts) {
			if (entityCache.getResult(
					entityCacheEnabled, AppPortImpl.class,
					appPort.getPrimaryKey()) == null) {

				cacheResult(appPort);
			}
			else {
				appPort.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all app ports.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AppPortImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the app port.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AppPort appPort) {
		entityCache.removeResult(
			entityCacheEnabled, AppPortImpl.class, appPort.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AppPort> appPorts) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AppPort appPort : appPorts) {
			entityCache.removeResult(
				entityCacheEnabled, AppPortImpl.class, appPort.getPrimaryKey());
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				entityCacheEnabled, AppPortImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new app port with the primary key. Does not add the app port to the database.
	 *
	 * @param appPortId the primary key for the new app port
	 * @return the new app port
	 */
	@Override
	public AppPort create(long appPortId) {
		AppPort appPort = new AppPortImpl();

		appPort.setNew(true);
		appPort.setPrimaryKey(appPortId);

		return appPort;
	}

	/**
	 * Removes the app port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param appPortId the primary key of the app port
	 * @return the app port that was removed
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	@Override
	public AppPort remove(long appPortId) throws NoSuchAppPortException {
		return remove((Serializable)appPortId);
	}

	/**
	 * Removes the app port with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the app port
	 * @return the app port that was removed
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	@Override
	public AppPort remove(Serializable primaryKey)
		throws NoSuchAppPortException {

		Session session = null;

		try {
			session = openSession();

			AppPort appPort = (AppPort)session.get(
				AppPortImpl.class, primaryKey);

			if (appPort == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAppPortException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(appPort);
		}
		catch (NoSuchAppPortException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected AppPort removeImpl(AppPort appPort) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(appPort)) {
				appPort = (AppPort)session.get(
					AppPortImpl.class, appPort.getPrimaryKeyObj());
			}

			if (appPort != null) {
				session.delete(appPort);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (appPort != null) {
			clearCache(appPort);
		}

		return appPort;
	}

	@Override
	public AppPort updateImpl(AppPort appPort) {
		boolean isNew = appPort.isNew();

		if (!(appPort instanceof AppPortModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(appPort.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(appPort);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in appPort proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AppPort implementation " +
					appPort.getClass());
		}

		AppPortModelImpl appPortModelImpl = (AppPortModelImpl)appPort;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(appPort);

				appPort.setNew(false);
			}
			else {
				appPort = (AppPort)session.merge(appPort);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!_columnBitmaskEnabled) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {appPortModelImpl.getDataTypeId()};

			finderCache.removeResult(_finderPathCountByAppId, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByAppId, args);

			args = new Object[] {appPortModelImpl.getPortType()};

			finderCache.removeResult(_finderPathCountByportType, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByportType, args);

			args = new Object[] {
				appPortModelImpl.getDataTypeId(), appPortModelImpl.getPortType()
			};

			finderCache.removeResult(_finderPathCountByAppPortType, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByAppPortType, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((appPortModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByAppId.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					appPortModelImpl.getOriginalDataTypeId()
				};

				finderCache.removeResult(_finderPathCountByAppId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByAppId, args);

				args = new Object[] {appPortModelImpl.getDataTypeId()};

				finderCache.removeResult(_finderPathCountByAppId, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByAppId, args);
			}

			if ((appPortModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByportType.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					appPortModelImpl.getOriginalPortType()
				};

				finderCache.removeResult(_finderPathCountByportType, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByportType, args);

				args = new Object[] {appPortModelImpl.getPortType()};

				finderCache.removeResult(_finderPathCountByportType, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByportType, args);
			}

			if ((appPortModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByAppPortType.
					 getColumnBitmask()) != 0) {

				Object[] args = new Object[] {
					appPortModelImpl.getOriginalDataTypeId(),
					appPortModelImpl.getOriginalPortType()
				};

				finderCache.removeResult(_finderPathCountByAppPortType, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByAppPortType, args);

				args = new Object[] {
					appPortModelImpl.getDataTypeId(),
					appPortModelImpl.getPortType()
				};

				finderCache.removeResult(_finderPathCountByAppPortType, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByAppPortType, args);
			}
		}

		entityCache.putResult(
			entityCacheEnabled, AppPortImpl.class, appPort.getPrimaryKey(),
			appPort, false);

		appPort.resetOriginalValues();

		return appPort;
	}

	/**
	 * Returns the app port with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the app port
	 * @return the app port
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	@Override
	public AppPort findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAppPortException {

		AppPort appPort = fetchByPrimaryKey(primaryKey);

		if (appPort == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAppPortException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return appPort;
	}

	/**
	 * Returns the app port with the primary key or throws a <code>NoSuchAppPortException</code> if it could not be found.
	 *
	 * @param appPortId the primary key of the app port
	 * @return the app port
	 * @throws NoSuchAppPortException if a app port with the primary key could not be found
	 */
	@Override
	public AppPort findByPrimaryKey(long appPortId)
		throws NoSuchAppPortException {

		return findByPrimaryKey((Serializable)appPortId);
	}

	/**
	 * Returns the app port with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param appPortId the primary key of the app port
	 * @return the app port, or <code>null</code> if a app port with the primary key could not be found
	 */
	@Override
	public AppPort fetchByPrimaryKey(long appPortId) {
		return fetchByPrimaryKey((Serializable)appPortId);
	}

	/**
	 * Returns all the app ports.
	 *
	 * @return the app ports
	 */
	@Override
	public List<AppPort> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<AppPort> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<AppPort> findAll(
		int start, int end, OrderByComparator<AppPort> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<AppPort> findAll(
		int start, int end, OrderByComparator<AppPort> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<AppPort> list = null;

		if (useFinderCache) {
			list = (List<AppPort>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_APPPORT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_APPPORT;

				sql = sql.concat(AppPortModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AppPort>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the app ports from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AppPort appPort : findAll()) {
			remove(appPort);
		}
	}

	/**
	 * Returns the number of app ports.
	 *
	 * @return the number of app ports
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_APPPORT);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "appPortId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_APPPORT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AppPortModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the app port persistence.
	 */
	@Activate
	public void activate() {
		AppPortModelImpl.setEntityCacheEnabled(entityCacheEnabled);
		AppPortModelImpl.setFinderCacheEnabled(finderCacheEnabled);

		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AppPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AppPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll",
			new String[0]);

		_finderPathCountAll = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByAppId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AppPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByAppId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AppPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAppId",
			new String[] {Long.class.getName()},
			AppPortModelImpl.DATATYPEID_COLUMN_BITMASK);

		_finderPathCountByAppId = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAppId",
			new String[] {Long.class.getName()});

		_finderPathWithPaginationFindByportType = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AppPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByportType",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByportType = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AppPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByportType",
			new String[] {String.class.getName()},
			AppPortModelImpl.PORTTYPE_COLUMN_BITMASK);

		_finderPathCountByportType = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByportType",
			new String[] {String.class.getName()});

		_finderPathWithPaginationFindByAppPortType = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AppPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAppPortType",
			new String[] {
				Long.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByAppPortType = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, AppPortImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAppPortType",
			new String[] {Long.class.getName(), String.class.getName()},
			AppPortModelImpl.DATATYPEID_COLUMN_BITMASK |
			AppPortModelImpl.PORTTYPE_COLUMN_BITMASK);

		_finderPathCountByAppPortType = new FinderPath(
			entityCacheEnabled, finderCacheEnabled, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAppPortType",
			new String[] {Long.class.getName(), String.class.getName()});

		_setAppPortUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setAppPortUtilPersistence(null);

		entityCache.removeCache(AppPortImpl.class.getName());

		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private void _setAppPortUtilPersistence(
		AppPortPersistence appPortPersistence) {

		try {
			Field field = AppPortUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, appPortPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = SXSpyglassPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
		super.setConfiguration(configuration);

		_columnBitmaskEnabled = GetterUtil.getBoolean(
			configuration.get(
				"value.object.column.bitmask.enabled.com.sx.spyglass.model.AppPort"),
			true);
	}

	@Override
	@Reference(
		target = SXSpyglassPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SXSpyglassPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private boolean _columnBitmaskEnabled;

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_APPPORT =
		"SELECT appPort FROM AppPort appPort";

	private static final String _SQL_SELECT_APPPORT_WHERE =
		"SELECT appPort FROM AppPort appPort WHERE ";

	private static final String _SQL_COUNT_APPPORT =
		"SELECT COUNT(appPort) FROM AppPort appPort";

	private static final String _SQL_COUNT_APPPORT_WHERE =
		"SELECT COUNT(appPort) FROM AppPort appPort WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "appPort.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AppPort exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AppPort exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AppPortPersistenceImpl.class);

}