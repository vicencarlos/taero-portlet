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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.StagedGroupedModel;
import com.liferay.portal.model.WorkflowedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TaskType service. Represents a row in the &quot;taero_TaskType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link home.cvicente.livetasks.model.impl.TaskTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link home.cvicente.livetasks.model.impl.TaskTypeImpl}.
 * </p>
 *
 * @author cvicente
 * @see TaskType
 * @see home.cvicente.livetasks.model.impl.TaskTypeImpl
 * @see home.cvicente.livetasks.model.impl.TaskTypeModelImpl
 * @generated
 */
public interface TaskTypeModel extends BaseModel<TaskType>, StagedGroupedModel,
	WorkflowedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a task type model instance should use the {@link TaskType} interface instead.
	 */

	/**
	 * Returns the primary key of this task type.
	 *
	 * @return the primary key of this task type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this task type.
	 *
	 * @param primaryKey the primary key of this task type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this task type.
	 *
	 * @return the uuid of this task type
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this task type.
	 *
	 * @param uuid the uuid of this task type
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the type ID of this task type.
	 *
	 * @return the type ID of this task type
	 */
	public long getTypeId();

	/**
	 * Sets the type ID of this task type.
	 *
	 * @param typeId the type ID of this task type
	 */
	public void setTypeId(long typeId);

	/**
	 * Returns the company ID of this task type.
	 *
	 * @return the company ID of this task type
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this task type.
	 *
	 * @param companyId the company ID of this task type
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this task type.
	 *
	 * @return the user ID of this task type
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this task type.
	 *
	 * @param userId the user ID of this task type
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this task type.
	 *
	 * @return the user uuid of this task type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this task type.
	 *
	 * @param userUuid the user uuid of this task type
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the group ID of this task type.
	 *
	 * @return the group ID of this task type
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this task type.
	 *
	 * @param groupId the group ID of this task type
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user name of this task type.
	 *
	 * @return the user name of this task type
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this task type.
	 *
	 * @param userName the user name of this task type
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this task type.
	 *
	 * @return the create date of this task type
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this task type.
	 *
	 * @param createDate the create date of this task type
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this task type.
	 *
	 * @return the modified date of this task type
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this task type.
	 *
	 * @param modifiedDate the modified date of this task type
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this task type.
	 *
	 * @return the status of this task type
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this task type.
	 *
	 * @param status the status of this task type
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this task type.
	 *
	 * @return the status by user ID of this task type
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this task type.
	 *
	 * @param statusByUserId the status by user ID of this task type
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this task type.
	 *
	 * @return the status by user uuid of this task type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getStatusByUserUuid() throws SystemException;

	/**
	 * Sets the status by user uuid of this task type.
	 *
	 * @param statusByUserUuid the status by user uuid of this task type
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this task type.
	 *
	 * @return the status by user name of this task type
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this task type.
	 *
	 * @param statusByUserName the status by user name of this task type
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this task type.
	 *
	 * @return the status date of this task type
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this task type.
	 *
	 * @param statusDate the status date of this task type
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the title of this task type.
	 *
	 * @return the title of this task type
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this task type.
	 *
	 * @param title the title of this task type
	 */
	public void setTitle(String title);

	/**
	 * Returns the description of this task type.
	 *
	 * @return the description of this task type
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this task type.
	 *
	 * @param description the description of this task type
	 */
	public void setDescription(String description);

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved()}
	 */
	@Override
	public boolean getApproved();

	/**
	 * Returns <code>true</code> if this task type is approved.
	 *
	 * @return <code>true</code> if this task type is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this task type is denied.
	 *
	 * @return <code>true</code> if this task type is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this task type is a draft.
	 *
	 * @return <code>true</code> if this task type is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this task type is expired.
	 *
	 * @return <code>true</code> if this task type is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this task type is inactive.
	 *
	 * @return <code>true</code> if this task type is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this task type is incomplete.
	 *
	 * @return <code>true</code> if this task type is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this task type is pending.
	 *
	 * @return <code>true</code> if this task type is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this task type is scheduled.
	 *
	 * @return <code>true</code> if this task type is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(TaskType taskType);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TaskType> toCacheModel();

	@Override
	public TaskType toEscapedModel();

	@Override
	public TaskType toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}