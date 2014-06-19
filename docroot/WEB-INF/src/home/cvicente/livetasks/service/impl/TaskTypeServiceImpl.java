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

package home.cvicente.livetasks.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import home.cvicente.livetasks.model.TaskType;
import home.cvicente.livetasks.service.base.TaskTypeServiceBaseImpl;

/**
 * The implementation of the task type remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link home.cvicente.livetasks.service.TaskTypeService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author cvicente
 * @see home.cvicente.livetasks.service.base.TaskTypeServiceBaseImpl
 * @see home.cvicente.livetasks.service.TaskTypeServiceUtil
 */
public class TaskTypeServiceImpl extends TaskTypeServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link home.cvicente.livetasks.service.TaskTypeServiceUtil} to access the task type remote service.
	 */
	public List<TaskType> getGroupTasksTypes(long groupId) throws SystemException
		{
			return taskTypePersistence.filterFindByGroupId(groupId);
		}
	public int getCountGroupTasksTypes(long groupId) throws SystemException
	{
		return taskTypePersistence.filterCountByGroupId(groupId);
	}
	 public List<TaskType> getGroupTasksTypes(long groupId,int start,int end) throws SystemException
		{
			return taskTypePersistence.filterFindByGroupId(groupId, start, end);
		}
}