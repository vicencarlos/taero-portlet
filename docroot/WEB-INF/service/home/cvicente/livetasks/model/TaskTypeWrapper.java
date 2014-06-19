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
 * This class is a wrapper for {@link TaskType}.
 * </p>
 *
 * @author cvicente
 * @see TaskType
 * @generated
 */
public class TaskTypeWrapper implements TaskType, ModelWrapper<TaskType> {
	public TaskTypeWrapper(TaskType taskType) {
		_taskType = taskType;
	}

	@Override
	public Class<?> getModelClass() {
		return TaskType.class;
	}

	@Override
	public String getModelClassName() {
		return TaskType.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("typeId", getTypeId());
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

		Long typeId = (Long)attributes.get("typeId");

		if (typeId != null) {
			setTypeId(typeId);
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
	* Returns the primary key of this task type.
	*
	* @return the primary key of this task type
	*/
	@Override
	public long getPrimaryKey() {
		return _taskType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this task type.
	*
	* @param primaryKey the primary key of this task type
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_taskType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this task type.
	*
	* @return the uuid of this task type
	*/
	@Override
	public java.lang.String getUuid() {
		return _taskType.getUuid();
	}

	/**
	* Sets the uuid of this task type.
	*
	* @param uuid the uuid of this task type
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_taskType.setUuid(uuid);
	}

	/**
	* Returns the type ID of this task type.
	*
	* @return the type ID of this task type
	*/
	@Override
	public long getTypeId() {
		return _taskType.getTypeId();
	}

	/**
	* Sets the type ID of this task type.
	*
	* @param typeId the type ID of this task type
	*/
	@Override
	public void setTypeId(long typeId) {
		_taskType.setTypeId(typeId);
	}

	/**
	* Returns the company ID of this task type.
	*
	* @return the company ID of this task type
	*/
	@Override
	public long getCompanyId() {
		return _taskType.getCompanyId();
	}

	/**
	* Sets the company ID of this task type.
	*
	* @param companyId the company ID of this task type
	*/
	@Override
	public void setCompanyId(long companyId) {
		_taskType.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this task type.
	*
	* @return the user ID of this task type
	*/
	@Override
	public long getUserId() {
		return _taskType.getUserId();
	}

	/**
	* Sets the user ID of this task type.
	*
	* @param userId the user ID of this task type
	*/
	@Override
	public void setUserId(long userId) {
		_taskType.setUserId(userId);
	}

	/**
	* Returns the user uuid of this task type.
	*
	* @return the user uuid of this task type
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskType.getUserUuid();
	}

	/**
	* Sets the user uuid of this task type.
	*
	* @param userUuid the user uuid of this task type
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_taskType.setUserUuid(userUuid);
	}

	/**
	* Returns the group ID of this task type.
	*
	* @return the group ID of this task type
	*/
	@Override
	public long getGroupId() {
		return _taskType.getGroupId();
	}

	/**
	* Sets the group ID of this task type.
	*
	* @param groupId the group ID of this task type
	*/
	@Override
	public void setGroupId(long groupId) {
		_taskType.setGroupId(groupId);
	}

	/**
	* Returns the user name of this task type.
	*
	* @return the user name of this task type
	*/
	@Override
	public java.lang.String getUserName() {
		return _taskType.getUserName();
	}

	/**
	* Sets the user name of this task type.
	*
	* @param userName the user name of this task type
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_taskType.setUserName(userName);
	}

	/**
	* Returns the create date of this task type.
	*
	* @return the create date of this task type
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _taskType.getCreateDate();
	}

	/**
	* Sets the create date of this task type.
	*
	* @param createDate the create date of this task type
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_taskType.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this task type.
	*
	* @return the modified date of this task type
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _taskType.getModifiedDate();
	}

	/**
	* Sets the modified date of this task type.
	*
	* @param modifiedDate the modified date of this task type
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_taskType.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the status of this task type.
	*
	* @return the status of this task type
	*/
	@Override
	public int getStatus() {
		return _taskType.getStatus();
	}

	/**
	* Sets the status of this task type.
	*
	* @param status the status of this task type
	*/
	@Override
	public void setStatus(int status) {
		_taskType.setStatus(status);
	}

	/**
	* Returns the status by user ID of this task type.
	*
	* @return the status by user ID of this task type
	*/
	@Override
	public long getStatusByUserId() {
		return _taskType.getStatusByUserId();
	}

	/**
	* Sets the status by user ID of this task type.
	*
	* @param statusByUserId the status by user ID of this task type
	*/
	@Override
	public void setStatusByUserId(long statusByUserId) {
		_taskType.setStatusByUserId(statusByUserId);
	}

	/**
	* Returns the status by user uuid of this task type.
	*
	* @return the status by user uuid of this task type
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getStatusByUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _taskType.getStatusByUserUuid();
	}

	/**
	* Sets the status by user uuid of this task type.
	*
	* @param statusByUserUuid the status by user uuid of this task type
	*/
	@Override
	public void setStatusByUserUuid(java.lang.String statusByUserUuid) {
		_taskType.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	* Returns the status by user name of this task type.
	*
	* @return the status by user name of this task type
	*/
	@Override
	public java.lang.String getStatusByUserName() {
		return _taskType.getStatusByUserName();
	}

	/**
	* Sets the status by user name of this task type.
	*
	* @param statusByUserName the status by user name of this task type
	*/
	@Override
	public void setStatusByUserName(java.lang.String statusByUserName) {
		_taskType.setStatusByUserName(statusByUserName);
	}

	/**
	* Returns the status date of this task type.
	*
	* @return the status date of this task type
	*/
	@Override
	public java.util.Date getStatusDate() {
		return _taskType.getStatusDate();
	}

	/**
	* Sets the status date of this task type.
	*
	* @param statusDate the status date of this task type
	*/
	@Override
	public void setStatusDate(java.util.Date statusDate) {
		_taskType.setStatusDate(statusDate);
	}

	/**
	* Returns the title of this task type.
	*
	* @return the title of this task type
	*/
	@Override
	public java.lang.String getTitle() {
		return _taskType.getTitle();
	}

	/**
	* Sets the title of this task type.
	*
	* @param title the title of this task type
	*/
	@Override
	public void setTitle(java.lang.String title) {
		_taskType.setTitle(title);
	}

	/**
	* Returns the description of this task type.
	*
	* @return the description of this task type
	*/
	@Override
	public java.lang.String getDescription() {
		return _taskType.getDescription();
	}

	/**
	* Sets the description of this task type.
	*
	* @param description the description of this task type
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_taskType.setDescription(description);
	}

	/**
	* @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	*/
	@Override
	public boolean getApproved() {
		return _taskType.getApproved();
	}

	/**
	* Returns <code>true</code> if this task type is approved.
	*
	* @return <code>true</code> if this task type is approved; <code>false</code> otherwise
	*/
	@Override
	public boolean isApproved() {
		return _taskType.isApproved();
	}

	/**
	* Returns <code>true</code> if this task type is denied.
	*
	* @return <code>true</code> if this task type is denied; <code>false</code> otherwise
	*/
	@Override
	public boolean isDenied() {
		return _taskType.isDenied();
	}

	/**
	* Returns <code>true</code> if this task type is a draft.
	*
	* @return <code>true</code> if this task type is a draft; <code>false</code> otherwise
	*/
	@Override
	public boolean isDraft() {
		return _taskType.isDraft();
	}

	/**
	* Returns <code>true</code> if this task type is expired.
	*
	* @return <code>true</code> if this task type is expired; <code>false</code> otherwise
	*/
	@Override
	public boolean isExpired() {
		return _taskType.isExpired();
	}

	/**
	* Returns <code>true</code> if this task type is inactive.
	*
	* @return <code>true</code> if this task type is inactive; <code>false</code> otherwise
	*/
	@Override
	public boolean isInactive() {
		return _taskType.isInactive();
	}

	/**
	* Returns <code>true</code> if this task type is incomplete.
	*
	* @return <code>true</code> if this task type is incomplete; <code>false</code> otherwise
	*/
	@Override
	public boolean isIncomplete() {
		return _taskType.isIncomplete();
	}

	/**
	* Returns <code>true</code> if this task type is pending.
	*
	* @return <code>true</code> if this task type is pending; <code>false</code> otherwise
	*/
	@Override
	public boolean isPending() {
		return _taskType.isPending();
	}

	/**
	* Returns <code>true</code> if this task type is scheduled.
	*
	* @return <code>true</code> if this task type is scheduled; <code>false</code> otherwise
	*/
	@Override
	public boolean isScheduled() {
		return _taskType.isScheduled();
	}

	@Override
	public boolean isNew() {
		return _taskType.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_taskType.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _taskType.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_taskType.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _taskType.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _taskType.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_taskType.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _taskType.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_taskType.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_taskType.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_taskType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TaskTypeWrapper((TaskType)_taskType.clone());
	}

	@Override
	public int compareTo(home.cvicente.livetasks.model.TaskType taskType) {
		return _taskType.compareTo(taskType);
	}

	@Override
	public int hashCode() {
		return _taskType.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<home.cvicente.livetasks.model.TaskType> toCacheModel() {
		return _taskType.toCacheModel();
	}

	@Override
	public home.cvicente.livetasks.model.TaskType toEscapedModel() {
		return new TaskTypeWrapper(_taskType.toEscapedModel());
	}

	@Override
	public home.cvicente.livetasks.model.TaskType toUnescapedModel() {
		return new TaskTypeWrapper(_taskType.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _taskType.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _taskType.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_taskType.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TaskTypeWrapper)) {
			return false;
		}

		TaskTypeWrapper taskTypeWrapper = (TaskTypeWrapper)obj;

		if (Validator.equals(_taskType, taskTypeWrapper._taskType)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _taskType.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public TaskType getWrappedTaskType() {
		return _taskType;
	}

	@Override
	public TaskType getWrappedModel() {
		return _taskType;
	}

	@Override
	public void resetOriginalValues() {
		_taskType.resetOriginalValues();
	}

	private TaskType _taskType;
}