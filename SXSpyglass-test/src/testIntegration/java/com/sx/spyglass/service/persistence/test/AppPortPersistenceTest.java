/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.sx.spyglass.service.persistence.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import com.sx.spyglass.exception.NoSuchAppPortException;
import com.sx.spyglass.model.AppPort;
import com.sx.spyglass.service.AppPortLocalServiceUtil;
import com.sx.spyglass.service.persistence.AppPortPersistence;
import com.sx.spyglass.service.persistence.AppPortUtil;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class AppPortPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.sx.spyglass.service"));

	@Before
	public void setUp() {
		_persistence = AppPortUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<AppPort> iterator = _appPorts.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AppPort appPort = _persistence.create(pk);

		Assert.assertNotNull(appPort);

		Assert.assertEquals(appPort.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		AppPort newAppPort = addAppPort();

		_persistence.remove(newAppPort);

		AppPort existingAppPort = _persistence.fetchByPrimaryKey(
			newAppPort.getPrimaryKey());

		Assert.assertNull(existingAppPort);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addAppPort();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AppPort newAppPort = _persistence.create(pk);

		newAppPort.setScienceAppId(RandomTestUtil.nextLong());

		newAppPort.setDataTypeId(RandomTestUtil.nextLong());

		newAppPort.setOptionName(RandomTestUtil.randomString());

		newAppPort.setPortType(RandomTestUtil.randomString());

		_appPorts.add(_persistence.update(newAppPort));

		AppPort existingAppPort = _persistence.findByPrimaryKey(
			newAppPort.getPrimaryKey());

		Assert.assertEquals(
			existingAppPort.getAppPortId(), newAppPort.getAppPortId());
		Assert.assertEquals(
			existingAppPort.getScienceAppId(), newAppPort.getScienceAppId());
		Assert.assertEquals(
			existingAppPort.getDataTypeId(), newAppPort.getDataTypeId());
		Assert.assertEquals(
			existingAppPort.getOptionName(), newAppPort.getOptionName());
		Assert.assertEquals(
			existingAppPort.getPortType(), newAppPort.getPortType());
	}

	@Test
	public void testCountByAppId() throws Exception {
		_persistence.countByAppId(RandomTestUtil.nextLong());

		_persistence.countByAppId(0L);
	}

	@Test
	public void testCountByportType() throws Exception {
		_persistence.countByportType("");

		_persistence.countByportType("null");

		_persistence.countByportType((String)null);
	}

	@Test
	public void testCountByAppPortType() throws Exception {
		_persistence.countByAppPortType(RandomTestUtil.nextLong(), "");

		_persistence.countByAppPortType(0L, "null");

		_persistence.countByAppPortType(0L, (String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		AppPort newAppPort = addAppPort();

		AppPort existingAppPort = _persistence.findByPrimaryKey(
			newAppPort.getPrimaryKey());

		Assert.assertEquals(existingAppPort, newAppPort);
	}

	@Test(expected = NoSuchAppPortException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<AppPort> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"SXSpyglass_AppPort", "appPortId", true, "scienceAppId", true,
			"dataTypeId", true, "optionName", true, "portType", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		AppPort newAppPort = addAppPort();

		AppPort existingAppPort = _persistence.fetchByPrimaryKey(
			newAppPort.getPrimaryKey());

		Assert.assertEquals(existingAppPort, newAppPort);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AppPort missingAppPort = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingAppPort);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		AppPort newAppPort1 = addAppPort();
		AppPort newAppPort2 = addAppPort();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAppPort1.getPrimaryKey());
		primaryKeys.add(newAppPort2.getPrimaryKey());

		Map<Serializable, AppPort> appPorts = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, appPorts.size());
		Assert.assertEquals(
			newAppPort1, appPorts.get(newAppPort1.getPrimaryKey()));
		Assert.assertEquals(
			newAppPort2, appPorts.get(newAppPort2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, AppPort> appPorts = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(appPorts.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		AppPort newAppPort = addAppPort();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAppPort.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, AppPort> appPorts = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, appPorts.size());
		Assert.assertEquals(
			newAppPort, appPorts.get(newAppPort.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, AppPort> appPorts = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(appPorts.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		AppPort newAppPort = addAppPort();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newAppPort.getPrimaryKey());

		Map<Serializable, AppPort> appPorts = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, appPorts.size());
		Assert.assertEquals(
			newAppPort, appPorts.get(newAppPort.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			AppPortLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<AppPort>() {

				@Override
				public void performAction(AppPort appPort) {
					Assert.assertNotNull(appPort);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		AppPort newAppPort = addAppPort();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AppPort.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("appPortId", newAppPort.getAppPortId()));

		List<AppPort> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		AppPort existingAppPort = result.get(0);

		Assert.assertEquals(existingAppPort, newAppPort);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AppPort.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("appPortId", RandomTestUtil.nextLong()));

		List<AppPort> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		AppPort newAppPort = addAppPort();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AppPort.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("appPortId"));

		Object newAppPortId = newAppPort.getAppPortId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"appPortId", new Object[] {newAppPortId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingAppPortId = result.get(0);

		Assert.assertEquals(existingAppPortId, newAppPortId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			AppPort.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("appPortId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"appPortId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected AppPort addAppPort() throws Exception {
		long pk = RandomTestUtil.nextLong();

		AppPort appPort = _persistence.create(pk);

		appPort.setScienceAppId(RandomTestUtil.nextLong());

		appPort.setDataTypeId(RandomTestUtil.nextLong());

		appPort.setOptionName(RandomTestUtil.randomString());

		appPort.setPortType(RandomTestUtil.randomString());

		_appPorts.add(_persistence.update(appPort));

		return appPort;
	}

	private List<AppPort> _appPorts = new ArrayList<AppPort>();
	private AppPortPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}