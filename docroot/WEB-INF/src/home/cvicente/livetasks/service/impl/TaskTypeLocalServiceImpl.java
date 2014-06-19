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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.service.ServiceContext;

import home.cvicente.livetasks.model.Task;
import home.cvicente.livetasks.model.TaskType;
import home.cvicente.livetasks.service.base.TaskTypeLocalServiceBaseImpl;

/**
 * The implementation of the task type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link home.cvicente.livetasks.service.TaskTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author cvicente
 * @see home.cvicente.livetasks.service.base.TaskTypeLocalServiceBaseImpl
 * @see home.cvicente.livetasks.service.TaskTypeLocalServiceUtil
 */
public class TaskTypeLocalServiceImpl extends TaskTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link home.cvicente.livetasks.service.TaskTypeLocalServiceUtil} to access the task type local service.
	 */
	public TaskType addTaskType(String title, String description, long typeId,ServiceContext serviceContext) throws SystemException, PortalException
	{
		long userId=serviceContext.getUserId();

		TaskType taskType=taskTypePersistence.create(counterLocalService.increment(Task.class.getName()));
		taskType.setCompanyId(serviceContext.getCompanyId());
		taskType.setGroupId(serviceContext.getScopeGroupId());
		taskType.setUserId(userId);
		taskType.setDescription(description);
		taskType.setTitle(title);
		taskType.setStatus(WorkflowConstants.STATUS_APPROVED);
		taskType.setExpandoBridgeAttributes(serviceContext);
		taskTypePersistence.update(taskType);
        try
        {
        resourceLocalService.addResources(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(),
                        userId,TaskType.class.getName(), taskType.getPrimaryKey(), false,true, true);
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
       
 
		return taskType;
	}
	public TaskType modTaskType(TaskType taskType,ServiceContext serviceContext) throws SystemException, PortalException
	{
		long userId=serviceContext.getUserId();
		taskType.setExpandoBridgeAttributes(serviceContext);
		taskTypePersistence.update(taskType);
        try
        {
        resourceLocalService.addResources(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(),
                        userId,TaskType.class.getName(), taskType.getPrimaryKey(), false,true, true);
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
       
 
		return taskType;
	}
	public List<TaskType> getGroupTasksTypes(long groupId) throws SystemException
	{
		return taskTypePersistence.findByGroupId(groupId);
	}
	public void deleteTasksType(long taskTypeId) throws PortalException, SystemException
	{
		deleteTasksType(taskTypePersistence.fetchByPrimaryKey(taskTypeId));
	}
	public void deleteTasksType(TaskType taskType) throws PortalException, SystemException
	{
		resourceLocalService.deleteResource(taskType.getCompanyId(), TaskType.class.getName(),ResourceConstants.SCOPE_INDIVIDUAL, taskType.getPrimaryKey());
		taskTypePersistence.remove(taskType);
		
	}
}