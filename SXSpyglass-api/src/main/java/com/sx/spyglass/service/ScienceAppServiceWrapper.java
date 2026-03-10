/**
 * SPDX-FileCopyrightText: (c) 2026 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.sx.spyglass.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ScienceAppService}.
 *
 * @author Brian Wing Shun Chan
 * @see ScienceAppService
 * @generated
 */
public class ScienceAppServiceWrapper
	implements ScienceAppService, ServiceWrapper<ScienceAppService> {

	public ScienceAppServiceWrapper(ScienceAppService scienceAppService) {
		_scienceAppService = scienceAppService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _scienceAppService.getOSGiServiceIdentifier();
	}

	@Override
	public ScienceAppService getWrappedService() {
		return _scienceAppService;
	}

	@Override
	public void setWrappedService(ScienceAppService scienceAppService) {
		_scienceAppService = scienceAppService;
	}

	private ScienceAppService _scienceAppService;

}