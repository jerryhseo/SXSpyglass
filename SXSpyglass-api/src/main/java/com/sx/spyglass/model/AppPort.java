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
 * The extended model interface for the AppPort service. Represents a row in the &quot;SXSpyglass_AppPort&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AppPortModel
 * @generated
 */
@ImplementationClassName("com.sx.spyglass.model.impl.AppPortImpl")
@ProviderType
public interface AppPort extends AppPortModel, PersistedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.sx.spyglass.model.impl.AppPortImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AppPort, Long> APP_PORT_ID_ACCESSOR =
		new Accessor<AppPort, Long>() {

			@Override
			public Long get(AppPort appPort) {
				return appPort.getAppPortId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AppPort> getTypeClass() {
				return AppPort.class;
			}

		};

}