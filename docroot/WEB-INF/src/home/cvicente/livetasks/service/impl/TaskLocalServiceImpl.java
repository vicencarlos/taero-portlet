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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.service.ServiceContext;

import home.cvicente.livetasks.model.Task;
import home.cvicente.livetasks.service.base.TaskLocalServiceBaseImpl;

/**
 * The implementation of the task local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link home.cvicente.livetasks.service.TaskLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author cvicente
 * @see home.cvicente.livetasks.service.base.TaskLocalServiceBaseImpl
 * @see home.cvicente.livetasks.service.TaskLocalServiceUtil
 */
public class TaskLocalServiceImpl extends TaskLocalServiceBaseImpl 
{
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link home.cvicente.livetasks.service.TaskLocalServiceUtil} to access the task local service.
	 */
	public Task addTask(String title, String description, long typeId,ServiceContext serviceContext) throws SystemException, PortalException
	{
		long userId=serviceContext.getUserId();

		Task task=taskPersistence.create(counterLocalService.increment(Task.class.getName()));
		task.setCompanyId(serviceContext.getCompanyId());
		task.setGroupId(serviceContext.getScopeGroupId());
		task.setUserId(userId);
		task.setDescription(description);
		task.setTitle(title);
		task.setStatus(WorkflowConstants.STATUS_APPROVED);
		task.setExpandoBridgeAttributes(serviceContext);
		taskPersistence.update(task);
		
        try
        {
        resourceLocalService.addResources(serviceContext.getCompanyId(), serviceContext.getScopeGroupId(),
                        userId,Task.class.getName(), task.getPrimaryKey(), false,true, true);
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
        assetEntryLocalService.updateEntry( userId,
        		 task.getGroupId(),
        		 new java.util.Date(System.currentTimeMillis()),
                null,
                Task.class.getName(),
                task.getTaskId(),
                task.getUuid(),
                task.getTypeId(),
               serviceContext.getAssetCategoryIds(),
               serviceContext.getAssetTagNames(),
                true,
                new java.util.Date(System.currentTimeMillis()),
                null,
                null,
                ContentTypes.TEXT_HTML, task.getTitle(),
                task.getDescription(), task.getDescription(),
                null,
                null,
                 0,
                 0,
                 0,
                 true);
 
		return task;
	}
}