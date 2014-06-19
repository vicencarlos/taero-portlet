/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package home.cvicente.livetasks.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import home.cvicente.livetasks.model.TaskType;
import home.cvicente.livetasks.service.TaskTypeLocalServiceUtil;

/**
 * @author cvicente
 * @generated
 */
public abstract class TaskTypeActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public TaskTypeActionableDynamicQuery() throws SystemException {
		setBaseLocalService(TaskTypeLocalServiceUtil.getService());
		setClass(TaskType.class);

		setClassLoader(home.cvicente.livetasks.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("typeId");
	}
}