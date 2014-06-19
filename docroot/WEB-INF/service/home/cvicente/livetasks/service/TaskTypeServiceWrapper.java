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

package home.cvicente.livetasks.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TaskTypeService}.
 *
 * @author cvicente
 * @see TaskTypeService
 * @generated
 */
public class TaskTypeServiceWrapper implements TaskTypeService,
	ServiceWrapper<TaskTypeService> {
	public TaskTypeServiceWrapper(TaskTypeService taskTypeService) {
		_taskTypeService = taskTypeService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _taskTypeService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_taskTypeService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _taskTypeService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public java.util.List<home.cvicente.livetasks.model.TaskType> getGroupTasksTypes(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeService.getGroupTasksTypes(groupId);
	}

	@Override
	public int getCountGroupTasksTypes(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeService.getCountGroupTasksTypes(groupId);
	}

	@Override
	public java.util.List<home.cvicente.livetasks.model.TaskType> getGroupTasksTypes(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeService.getGroupTasksTypes(groupId, start, end);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TaskTypeService getWrappedTaskTypeService() {
		return _taskTypeService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTaskTypeService(TaskTypeService taskTypeService) {
		_taskTypeService = taskTypeService;
	}

	@Override
	public TaskTypeService getWrappedService() {
		return _taskTypeService;
	}

	@Override
	public void setWrappedService(TaskTypeService taskTypeService) {
		_taskTypeService = taskTypeService;
	}

	private TaskTypeService _taskTypeService;
}