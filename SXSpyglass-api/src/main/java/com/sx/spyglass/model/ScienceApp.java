/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.sx.spyglass.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the ScienceApp service. Represents a row in the &quot;SXSpyglass_ScienceApp&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ScienceAppModel
 * @generated
 */
@ImplementationClassName("com.sx.spyglass.model.impl.ScienceAppImpl")
@ProviderType
public interface ScienceApp extends PersistedModel, ScienceAppModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.sx.spyglass.model.impl.ScienceAppImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ScienceApp, String> UUID_ACCESSOR =
		new Accessor<ScienceApp, String>() {

			@Override
			public String get(ScienceApp scienceApp) {
				return scienceApp.getUuid();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<ScienceApp> getTypeClass() {
				return ScienceApp.class;
			}

		};

	public static final Accessor<ScienceApp, Long> SCIENCE_APP_ID_ACCESSOR =
		new Accessor<ScienceApp, Long>() {

			@Override
			public Long get(ScienceApp scienceApp) {
				return scienceApp.getScienceAppId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ScienceApp> getTypeClass() {
				return ScienceApp.class;
			}

		};

}