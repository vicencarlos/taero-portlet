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
 * Provides a wrapper for {@link TaskTypeLocalService}.
 *
 * @author cvicente
 * @see TaskTypeLocalService
 * @generated
 */
public class TaskTypeLocalServiceWrapper implements TaskTypeLocalService,
	ServiceWrapper<TaskTypeLocalService> {
	public TaskTypeLocalServiceWrapper(
		TaskTypeLocalService taskTypeLocalService) {
		_taskTypeLocalService = taskTypeLocalService;
	}

	/**
	* Adds the task type to the database. Also notifies the appropriate model listeners.
	*
	* @param taskType the task type
	* @return the task type that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.cvicente.livetasks.model.TaskType addTaskType(
		home.cvicente.livetasks.model.TaskType taskType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.addTaskType(taskType);
	}

	/**
	* Creates a new task type with the primary key. Does not add the task type to the database.
	*
	* @param typeId the primary key for the new task type
	* @return the new task type
	*/
	@Override
	public home.cvicente.livetasks.model.TaskType createTaskType(long typeId) {
		return _taskTypeLocalService.createTaskType(typeId);
	}

	/**
	* Deletes the task type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param typeId the primary key of the task type
	* @return the task type that was removed
	* @throws PortalException if a task type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.cvicente.livetasks.model.TaskType deleteTaskType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.deleteTaskType(typeId);
	}

	/**
	* Deletes the task type from the database. Also notifies the appropriate model listeners.
	*
	* @param taskType the task type
	* @return the task type that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.cvicente.livetasks.model.TaskType deleteTaskType(
		home.cvicente.livetasks.model.TaskType taskType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.deleteTaskType(taskType);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _taskTypeLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public home.cvicente.livetasks.model.TaskType fetchTaskType(long typeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.fetchTaskType(typeId);
	}

	/**
	* Returns the task type with the matching UUID and company.
	*
	* @param uuid the task type's UUID
	* @param companyId the primary key of the company
	* @return the matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.cvicente.livetasks.model.TaskType fetchTaskTypeByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.fetchTaskTypeByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the task type matching the UUID and group.
	*
	* @param uuid the task type's UUID
	* @param groupId the primary key of the group
	* @return the matching task type, or <code>null</code> if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.cvicente.livetasks.model.TaskType fetchTaskTypeByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.fetchTaskTypeByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the task type with the primary key.
	*
	* @param typeId the primary key of the task type
	* @return the task type
	* @throws PortalException if a task type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.cvicente.livetasks.model.TaskType getTaskType(long typeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.getTaskType(typeId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the task type with the matching UUID and company.
	*
	* @param uuid the task type's UUID
	* @param companyId the primary key of the company
	* @return the matching task type
	* @throws PortalException if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.cvicente.livetasks.model.TaskType getTaskTypeByUuidAndCompanyId(
		java.lang.String uuid, long companyId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.getTaskTypeByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns the task type matching the UUID and group.
	*
	* @param uuid the task type's UUID
	* @param groupId the primary key of the group
	* @return the matching task type
	* @throws PortalException if a matching task type could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.cvicente.livetasks.model.TaskType getTaskTypeByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.getTaskTypeByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the task types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of task types
	* @param end the upper bound of the range of task types (not inclusive)
	* @return the range of task types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<home.cvicente.livetasks.model.TaskType> getTaskTypes(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.getTaskTypes(start, end);
	}

	/**
	* Returns the number of task types.
	*
	* @return the number of task types
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getTaskTypesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.getTaskTypesCount();
	}

	/**
	* Updates the task type in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param taskType the task type
	* @return the task type that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public home.cvicente.livetasks.model.TaskType updateTaskType(
		home.cvicente.livetasks.model.TaskType taskType)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.updateTaskType(taskType);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _taskTypeLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_taskTypeLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _taskTypeLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	@Override
	public home.cvicente.livetasks.model.TaskType addTaskType(
		java.lang.String title, java.lang.String description, long typeId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.addTaskType(title, description, typeId,
			serviceContext);
	}

	@Override
	public home.cvicente.livetasks.model.TaskType modTaskType(
		home.cvicente.livetasks.model.TaskType taskType,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.modTaskType(taskType, serviceContext);
	}

	@Override
	public java.util.List<home.cvicente.livetasks.model.TaskType> getGroupTasksTypes(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskTypeLocalService.getGroupTasksTypes(groupId);
	}

	@Override
	public void deleteTasksType(long taskTypeId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_taskTypeLocalService.deleteTasksType(taskTypeId);
	}

	@Override
	public void deleteTasksType(home.cvicente.livetasks.model.TaskType taskType)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_taskTypeLocalService.deleteTasksType(taskType);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public TaskTypeLocalService getWrappedTaskTypeLocalService() {
		return _taskTypeLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedTaskTypeLocalService(
		TaskTypeLocalService taskTypeLocalService) {
		_taskTypeLocalService = taskTypeLocalService;
	}

	@Override
	public TaskTypeLocalService getWrappedService() {
		return _taskTypeLocalService;
	}

	@Override
	public void setWrappedService(TaskTypeLocalService taskTypeLocalService) {
		_taskTypeLocalService = taskTypeLocalService;
	}

	private TaskTypeLocalService _taskTypeLocalService;
}