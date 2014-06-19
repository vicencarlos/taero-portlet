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

package home.cvicente.livetasks.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Task}.
 * </p>
 *
 * @author cvicente
 * @see Task
 * @generated
 */
public class TaskWrapper implements Task, ModelWrapper<Task> {
	public TaskWrapper(Task task) {
		_task = task;
	}

	@Override
	public Class<?> getModelClass() {
		return Task.class;
	}

	@Override
	public String getModelClassName() {
		return Task.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("taskId", getTaskId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());
		attributes.put("typeId", getTypeId());
		attributes.put("title", getTitle());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long taskId = (Long)attributes.get("taskId");

		if (taskId != null) {
			setTaskId(taskId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}

		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	/**
	* Returns the primary key of this task.
	*
	* @return the primary key of this task
	*/
	@Override
	public long getPrimaryKey() {
		return _task.getPrimaryKey();
	}

	/**
	* Sets the primary key of this task.
	*
	* @param primaryKey the primary key of this task
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_task.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this task.
	*
	* @return the uuid of this task
	*/
	@Override
	public java.lang.String getUuid() {
		return _task.getUuid();
	}

	/**
	* Sets the uuid of this task.
	*
	* @param uuid the uuid of this task
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_task.setUuid(uuid);
	}

	/**
	* Returns the task ID of this task.
	*
	* @return the task ID of this task
	*/
	@Override
	public long getTaskId() {
		return _task.getTaskId();
	}

	/**
	* Sets the task ID of this task.
	*
	* @param taskId the task ID of this task
	*/
	@Override
	public void setTaskId(long taskId) {
		_task.setTaskId(taskId);
	}

	/**
	* Returns the company ID of this task.
	*
	* @return the company ID of this task
	*/
	@Override
	public long getCompanyId() {
		return _task.getCompanyId();
	}

	/**
	* Sets the company ID of this task.
	*
	* @param companyId the company ID of this task
	*/
	@Override
	public void setCompanyId(long companyId) {
		_task.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this task.
	*
	* @return the user ID of this task
	*/
	@Override
	public long getUserId() {
		return _task.getUserId();
	}

	/**
	* Sets the user ID of this task.
	*
	* @param userId the user ID of this task
	*/
	@Override
	public void setUserId(long userId) {
		_task.setUserId(userId);
	}

	/**
	* Returns the user uuid of this task.
	*
	* @return the user uuid of this task
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _task.getUserUuid();
	}

	/**
	* Sets the user uuid of this task.
	*
	* @param userUuid the user uuid of this task
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_task.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this task.
	*
	* @return the group ID of this task
	*/
	@Override
	public long getGroupId() {
		return _task.getGroupId();
	}

	/**
	* Sets the group ID of this task.
	*
	* @param groupId the group ID of this task
	*/
	@Override
	public void setGroupId(long groupId) {
		_task.setGroupId(groupId);
	}

	/**
	* Returns the user name of this task.
	*
	* @return the user name of this task
	*/
	@Override
	public java.lang.String getUserName() {
		return _task.getUserName();
	}

	/**
	* Sets the user name of this task.
	*
	* @param userName the user name of this task
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_task.setUserName(userName);
	}

	/**
	* Returns the create date of this task.
	*
	* @return the create date of this task
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _task.getCreateDate();
	}

	/**
	* Sets the create date of this task.
	*
	* @param createDate the create date of this task
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_task.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this task.
	*
	* @return the modified date of this task
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _task.getModifiedDate();
	}

	/**
	* Sets the modified date of this task.
	*
	* @param modifiedDate the modified date of this task
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_task.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this task.
	*
	* @return the status of this task
	*/
	@Override
	public int getStatus() {
		return _task.getStatus();
	}

	/**
	* Sets the status of this task.
	*
	* @param status the status of this task
	*/
	@Override
	public void setStatus(int status) {
		_task.setStatus(status);
	}

	/**
	* Returns the status by user ID of this task.
	*
	* @return the status by user ID of this task
	*/
	@Override
	public long getStatusByUserId() {
		return _task.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this task.
	*
	* @param statusByUserId the status by user ID of this task
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_task.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this task.
	*
	* @return the status by user uuid of this task
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _task.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this task.
	*
	* @param statusByUserUuid the status by user uuid of this task
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_task.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status by user name of this task.
	*
	* @return the status by user name of this task
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _task.getStatusByUserName();
	}

	/**
	* Sets the status by user name of this task.
	*
	* @param statusByUserName the status by user name of this task
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_task.setStatusByUserName(statusByUserName);
	}

	/**
	* Returns the status date of this task.
	*
	* @return the status date of this task
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _task.getStatusDate();
	}

	/**
	* Sets the status date of this task.
	*
	* @param statusDate the status date of this task
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_task.setStatusDate(statusDate);
	}

	/**
	* Returns the type ID of this task.
	*
	* @return the type ID of this task
	*/
	@Override
	public long getTypeId() {
		return _task.getTypeId();
	}

	/**
	* Sets the type ID of this task.
	*
	* @param typeId the type ID of this task
	*/
	@Override
	public void setTypeId(long typeId) {
		_task.setTypeId(typeId);
	}

	/**
	* Returns the title of this task.
	*
	* @return the title of this task
	*/
	@Override
	public java.lang.String getTitle() {
		return _task.getTitle();
	}

	/**
	* Sets the title of this task.
	*
	* @param title the title of this task
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_task.setTitle(title);
	}

	/**
	* Returns the description of this task.
	*
	* @return the description of this task
	*/
	@Override
	public java.lang.String getDescription() {
		return _task.getDescription();
	}

	/**
	* Sets the description of this task.
	*
	* @param description the description of this task
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_task.setDescription(description);
	}

	/**
	* @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	*/
	@Override
	public boolean getApproved() {
		return _task.getApproved();
	}

	/**
	* Returns <code>true</code> if this task is approved.
	*
	* @return <code>true</code> if this task is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _task.isApproved();
	}

	/**
	* Returns <code>true</code> if this task is denied.
	*
	* @return <code>true</code> if this task is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _task.isDenied();
	}

	/**
	* Returns <code>true</code> if this task is a draft.
	*
	* @return <code>true</code> if this task is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _task.isDraft();
	}

	/**
	* Returns <code>true</code> if this task is expired.
	*
	* @return <code>true</code> if this task is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _task.isExpired();
	}

	/**
	* Returns <code>true</code> if this task is inactive.
	*
	* @return <code>true</code> if this task is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _task.isInactive();
	}

	/**
	* Returns <code>true</code> if this task is incomplete.
	*
	* @return <code>true</code> if this task is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _task.isIncomplete();
	}

	/**
	* Returns <code>true</code> if this task is pending.
	*
	* @return <code>true</code> if this task is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _task.isPending();
	}

	/**
	* Returns <code>true</code> if this task is scheduled.
	*
	* @return <code>true</code> if this task is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _task.isScheduled();
	}

	@Override
	public boolean isNew() {
		return _task.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_task.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _task.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_task.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _task.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _task.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_task.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _task.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_task.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_task.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_task.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TaskWrapper((Task)_task.clone());
	}

	@Override
	public int compareTo(home.cvicente.livetasks.model.Task task) {
		return _task.compareTo(task);
	}

	@Override
	public int hashCode() {
		return _task.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<home.cvicente.livetasks.model.Task> toCacheModel() {
		return _task.toCacheModel();
	}

	@Override
	public home.cvicente.livetasks.model.Task toEscapedModel() {
		return new TaskWrapper(_task.toEscapedModel());
	}

	@Override
	public home.cvicente.livetasks.model.Task toUnescapedModel() {
		return new TaskWrapper(_task.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _task.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _task.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_task.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TaskWrapper)) {
			return false;
		}

		TaskWrapper taskWrapper = (TaskWrapper)obj;

		if (Validator.equals(_task, taskWrapper._task)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _task.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Task getWrappedTask() {
		return _task;
	}

	@Override
	public Task getWrappedModel() {
		return _task;
	}

	@Override
	public void resetOriginalValues() {
		_task.resetOriginalValues();
	}

	private Task _task;
}