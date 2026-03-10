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
import com.liferay.portal.kernel.test.ReflectionTestUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.kernel.util.Time;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import com.sx.spyglass.exception.NoSuchScienceAppException;
import com.sx.spyglass.model.ScienceApp;
import com.sx.spyglass.service.ScienceAppLocalServiceUtil;
import com.sx.spyglass.service.persistence.ScienceAppPersistence;
import com.sx.spyglass.service.persistence.ScienceAppUtil;

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
public class ScienceAppPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.sx.spyglass.service"));

	@Before
	public void setUp() {
		_persistence = ScienceAppUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<ScienceApp> iterator = _scienceApps.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ScienceApp scienceApp = _persistence.create(pk);

		Assert.assertNotNull(scienceApp);

		Assert.assertEquals(scienceApp.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		ScienceApp newScienceApp = addScienceApp();

		_persistence.remove(newScienceApp);

		ScienceApp existingScienceApp = _persistence.fetchByPrimaryKey(
			newScienceApp.getPrimaryKey());

		Assert.assertNull(existingScienceApp);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addScienceApp();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ScienceApp newScienceApp = _persistence.create(pk);

		newScienceApp.setUuid(RandomTestUtil.randomString());

		newScienceApp.setGroupId(RandomTestUtil.nextLong());

		newScienceApp.setCompanyId(RandomTestUtil.nextLong());

		newScienceApp.setUserId(RandomTestUtil.nextLong());

		newScienceApp.setUserName(RandomTestUtil.randomString());

		newScienceApp.setCreateDate(RandomTestUtil.nextDate());

		newScienceApp.setModifiedDate(RandomTestUtil.nextDate());

		newScienceApp.setStatus(RandomTestUtil.nextInt());

		newScienceApp.setStatusByUserId(RandomTestUtil.nextLong());

		newScienceApp.setStatusByUserName(RandomTestUtil.randomString());

		newScienceApp.setStatusDate(RandomTestUtil.nextDate());

		newScienceApp.setLastPublishDate(RandomTestUtil.nextDate());

		newScienceApp.setAppName(RandomTestUtil.randomString());

		newScienceApp.setAppVersion(RandomTestUtil.randomString());

		newScienceApp.setAppType(RandomTestUtil.randomString());

		newScienceApp.setExeFileName(RandomTestUtil.randomString());

		newScienceApp.setDisplayName(RandomTestUtil.randomString());

		newScienceApp.setDescription(RandomTestUtil.randomString());

		newScienceApp.setStartScript(RandomTestUtil.randomString());

		newScienceApp.setFinishScript(RandomTestUtil.randomString());

		_scienceApps.add(_persistence.update(newScienceApp));

		ScienceApp existingScienceApp = _persistence.findByPrimaryKey(
			newScienceApp.getPrimaryKey());

		Assert.assertEquals(
			existingScienceApp.getUuid(), newScienceApp.getUuid());
		Assert.assertEquals(
			existingScienceApp.getScienceAppId(),
			newScienceApp.getScienceAppId());
		Assert.assertEquals(
			existingScienceApp.getGroupId(), newScienceApp.getGroupId());
		Assert.assertEquals(
			existingScienceApp.getCompanyId(), newScienceApp.getCompanyId());
		Assert.assertEquals(
			existingScienceApp.getUserId(), newScienceApp.getUserId());
		Assert.assertEquals(
			existingScienceApp.getUserName(), newScienceApp.getUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingScienceApp.getCreateDate()),
			Time.getShortTimestamp(newScienceApp.getCreateDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingScienceApp.getModifiedDate()),
			Time.getShortTimestamp(newScienceApp.getModifiedDate()));
		Assert.assertEquals(
			existingScienceApp.getStatus(), newScienceApp.getStatus());
		Assert.assertEquals(
			existingScienceApp.getStatusByUserId(),
			newScienceApp.getStatusByUserId());
		Assert.assertEquals(
			existingScienceApp.getStatusByUserName(),
			newScienceApp.getStatusByUserName());
		Assert.assertEquals(
			Time.getShortTimestamp(existingScienceApp.getStatusDate()),
			Time.getShortTimestamp(newScienceApp.getStatusDate()));
		Assert.assertEquals(
			Time.getShortTimestamp(existingScienceApp.getLastPublishDate()),
			Time.getShortTimestamp(newScienceApp.getLastPublishDate()));
		Assert.assertEquals(
			existingScienceApp.getAppName(), newScienceApp.getAppName());
		Assert.assertEquals(
			existingScienceApp.getAppVersion(), newScienceApp.getAppVersion());
		Assert.assertEquals(
			existingScienceApp.getAppType(), newScienceApp.getAppType());
		Assert.assertEquals(
			existingScienceApp.getExeFileName(),
			newScienceApp.getExeFileName());
		Assert.assertEquals(
			existingScienceApp.getDisplayName(),
			newScienceApp.getDisplayName());
		Assert.assertEquals(
			existingScienceApp.getDescription(),
			newScienceApp.getDescription());
		Assert.assertEquals(
			existingScienceApp.getStartScript(),
			newScienceApp.getStartScript());
		Assert.assertEquals(
			existingScienceApp.getFinishScript(),
			newScienceApp.getFinishScript());
	}

	@Test
	public void testCountByUuid() throws Exception {
		_persistence.countByUuid("");

		_persistence.countByUuid("null");

		_persistence.countByUuid((String)null);
	}

	@Test
	public void testCountByUUID_G() throws Exception {
		_persistence.countByUUID_G("", RandomTestUtil.nextLong());

		_persistence.countByUUID_G("null", 0L);

		_persistence.countByUUID_G((String)null, 0L);
	}

	@Test
	public void testCountByUuid_C() throws Exception {
		_persistence.countByUuid_C("", RandomTestUtil.nextLong());

		_persistence.countByUuid_C("null", 0L);

		_persistence.countByUuid_C((String)null, 0L);
	}

	@Test
	public void testCountByGroupId() throws Exception {
		_persistence.countByGroupId(RandomTestUtil.nextLong());

		_persistence.countByGroupId(0L);
	}

	@Test
	public void testCountByUserId() throws Exception {
		_persistence.countByUserId(RandomTestUtil.nextLong());

		_persistence.countByUserId(0L);
	}

	@Test
	public void testCountByStatus() throws Exception {
		_persistence.countByStatus(RandomTestUtil.nextInt());

		_persistence.countByStatus(0);
	}

	@Test
	public void testCountByG_U() throws Exception {
		_persistence.countByG_U(
			RandomTestUtil.nextLong(), RandomTestUtil.nextLong());

		_persistence.countByG_U(0L, 0L);
	}

	@Test
	public void testCountByG_S() throws Exception {
		_persistence.countByG_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByG_S(0L, 0);
	}

	@Test
	public void testCountByU_S() throws Exception {
		_persistence.countByU_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextInt());

		_persistence.countByU_S(0L, 0);
	}

	@Test
	public void testCountByG_U_S() throws Exception {
		_persistence.countByG_U_S(
			RandomTestUtil.nextLong(), RandomTestUtil.nextLong(),
			RandomTestUtil.nextInt());

		_persistence.countByG_U_S(0L, 0L, 0);
	}

	@Test
	public void testCountByAppName() throws Exception {
		_persistence.countByAppName("");

		_persistence.countByAppName("null");

		_persistence.countByAppName((String)null);
	}

	@Test
	public void testCountByNameVersion() throws Exception {
		_persistence.countByNameVersion("", "");

		_persistence.countByNameVersion("null", "null");

		_persistence.countByNameVersion((String)null, (String)null);
	}

	@Test
	public void testCountByAppType() throws Exception {
		_persistence.countByAppType("");

		_persistence.countByAppType("null");

		_persistence.countByAppType((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		ScienceApp newScienceApp = addScienceApp();

		ScienceApp existingScienceApp = _persistence.findByPrimaryKey(
			newScienceApp.getPrimaryKey());

		Assert.assertEquals(existingScienceApp, newScienceApp);
	}

	@Test(expected = NoSuchScienceAppException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<ScienceApp> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"SXSpyglass_ScienceApp", "uuid", true, "scienceAppId", true,
			"groupId", true, "companyId", true, "userId", true, "userName",
			true, "createDate", true, "modifiedDate", true, "status", true,
			"statusByUserId", true, "statusByUserName", true, "statusDate",
			true, "lastPublishDate", true, "appName", true, "appVersion", true,
			"appType", true, "exeFileName", true, "displayName", true,
			"description", true, "startScript", true, "finishScript", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		ScienceApp newScienceApp = addScienceApp();

		ScienceApp existingScienceApp = _persistence.fetchByPrimaryKey(
			newScienceApp.getPrimaryKey());

		Assert.assertEquals(existingScienceApp, newScienceApp);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ScienceApp missingScienceApp = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingScienceApp);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		ScienceApp newScienceApp1 = addScienceApp();
		ScienceApp newScienceApp2 = addScienceApp();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newScienceApp1.getPrimaryKey());
		primaryKeys.add(newScienceApp2.getPrimaryKey());

		Map<Serializable, ScienceApp> scienceApps =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, scienceApps.size());
		Assert.assertEquals(
			newScienceApp1, scienceApps.get(newScienceApp1.getPrimaryKey()));
		Assert.assertEquals(
			newScienceApp2, scienceApps.get(newScienceApp2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, ScienceApp> scienceApps =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(scienceApps.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		ScienceApp newScienceApp = addScienceApp();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newScienceApp.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, ScienceApp> scienceApps =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, scienceApps.size());
		Assert.assertEquals(
			newScienceApp, scienceApps.get(newScienceApp.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, ScienceApp> scienceApps =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(scienceApps.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		ScienceApp newScienceApp = addScienceApp();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newScienceApp.getPrimaryKey());

		Map<Serializable, ScienceApp> scienceApps =
			_persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, scienceApps.size());
		Assert.assertEquals(
			newScienceApp, scienceApps.get(newScienceApp.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			ScienceAppLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<ScienceApp>() {

				@Override
				public void performAction(ScienceApp scienceApp) {
					Assert.assertNotNull(scienceApp);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		ScienceApp newScienceApp = addScienceApp();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ScienceApp.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"scienceAppId", newScienceApp.getScienceAppId()));

		List<ScienceApp> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(1, result.size());

		ScienceApp existingScienceApp = result.get(0);

		Assert.assertEquals(existingScienceApp, newScienceApp);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ScienceApp.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq(
				"scienceAppId", RandomTestUtil.nextLong()));

		List<ScienceApp> result = _persistence.findWithDynamicQuery(
			dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		ScienceApp newScienceApp = addScienceApp();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ScienceApp.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("scienceAppId"));

		Object newScienceAppId = newScienceApp.getScienceAppId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"scienceAppId", new Object[] {newScienceAppId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingScienceAppId = result.get(0);

		Assert.assertEquals(existingScienceAppId, newScienceAppId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			ScienceApp.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(
			ProjectionFactoryUtil.property("scienceAppId"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"scienceAppId", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testResetOriginalValues() throws Exception {
		ScienceApp newScienceApp = addScienceApp();

		_persistence.clearCache();

		ScienceApp existingScienceApp = _persistence.findByPrimaryKey(
			newScienceApp.getPrimaryKey());

		Assert.assertEquals(
			existingScienceApp.getUuid(),
			ReflectionTestUtil.invoke(
				existingScienceApp, "getOriginalUuid", new Class<?>[0]));
		Assert.assertEquals(
			Long.valueOf(existingScienceApp.getGroupId()),
			ReflectionTestUtil.<Long>invoke(
				existingScienceApp, "getOriginalGroupId", new Class<?>[0]));
	}

	protected ScienceApp addScienceApp() throws Exception {
		long pk = RandomTestUtil.nextLong();

		ScienceApp scienceApp = _persistence.create(pk);

		scienceApp.setUuid(RandomTestUtil.randomString());

		scienceApp.setGroupId(RandomTestUtil.nextLong());

		scienceApp.setCompanyId(RandomTestUtil.nextLong());

		scienceApp.setUserId(RandomTestUtil.nextLong());

		scienceApp.setUserName(RandomTestUtil.randomString());

		scienceApp.setCreateDate(RandomTestUtil.nextDate());

		scienceApp.setModifiedDate(RandomTestUtil.nextDate());

		scienceApp.setStatus(RandomTestUtil.nextInt());

		scienceApp.setStatusByUserId(RandomTestUtil.nextLong());

		scienceApp.setStatusByUserName(RandomTestUtil.randomString());

		scienceApp.setStatusDate(RandomTestUtil.nextDate());

		scienceApp.setLastPublishDate(RandomTestUtil.nextDate());

		scienceApp.setAppName(RandomTestUtil.randomString());

		scienceApp.setAppVersion(RandomTestUtil.randomString());

		scienceApp.setAppType(RandomTestUtil.randomString());

		scienceApp.setExeFileName(RandomTestUtil.randomString());

		scienceApp.setDisplayName(RandomTestUtil.randomString());

		scienceApp.setDescription(RandomTestUtil.randomString());

		scienceApp.setStartScript(RandomTestUtil.randomString());

		scienceApp.setFinishScript(RandomTestUtil.randomString());

		_scienceApps.add(_persistence.update(scienceApp));

		return scienceApp;
	}

	private List<ScienceApp> _scienceApps = new ArrayList<ScienceApp>();
	private ScienceAppPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}