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

package home.cvicente.livetasks.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import home.cvicente.livetasks.model.Task;
import home.cvicente.livetasks.model.TaskModel;
import home.cvicente.livetasks.model.TaskSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Task service. Represents a row in the &quot;taero_Task&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link home.cvicente.livetasks.model.TaskModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TaskImpl}.
 * </p>
 *
 * @author cvicente
 * @see TaskImpl
 * @see home.cvicente.livetasks.model.Task
 * @see home.cvicente.livetasks.model.TaskModel
 * @generated
 */
public class TaskModelImpl extends BaseModelImpl<Task> implements TaskModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a task model instance should use the {@link home.cvicente.livetasks.model.Task} interface instead.
	 */
	public static final String TABLE_NAME = "taero_Task";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "taskId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "status", Types.INTEGER },
			{ "statusByUserId", Types.BIGINT },
			{ "statusByUserName", Types.VARCHAR },
			{ "statusDate", Types.TIMESTAMP },
			{ "typeId", Types.BIGINT },
			{ "title", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "asigneeClasName", Types.VARCHAR },
			{ "asigneeClassPK", Types.BIGINT },
			{ "statusId", Types.BIGINT },
			{ "comment_", Types.BIGINT },
			{ "parentTaskId", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table taero_Task (uuid_ VARCHAR(75) null,taskId LONG not null primary key,companyId LONG,userId LONG,groupId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusDate DATE null,typeId LONG,title VARCHAR(75) null,description VARCHAR(75) null,asigneeClasName VARCHAR(75) null,asigneeClassPK LONG,statusId LONG,comment_ LONG,parentTaskId LONG)";
	public static final String TABLE_SQL_DROP = "drop table taero_Task";
	public static final String ORDER_BY_JPQL = " ORDER BY task.taskId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY taero_Task.taskId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.home.cvicente.livetasks.model.Task"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.home.cvicente.livetasks.model.Task"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.home.cvicente.livetasks.model.Task"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long UUID_COLUMN_BITMASK = 4L;
	public static long TASKID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Task toModel(TaskSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Task model = new TaskImpl();

		model.setUuid(soapModel.getUuid());
		model.setTaskId(soapModel.getTaskId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setStatus(soapModel.getStatus());
		model.setStatusByUserId(soapModel.getStatusByUserId());
		model.setStatusByUserName(soapModel.getStatusByUserName());
		model.setStatusDate(soapModel.getStatusDate());
		model.setTypeId(soapModel.getTypeId());
		model.setTitle(soapModel.getTitle());
		model.setDescription(soapModel.getDescription());
		model.setAsigneeClasName(soapModel.getAsigneeClasName());
		model.setAsigneeClassPK(soapModel.getAsigneeClassPK());
		model.setStatusId(soapModel.getStatusId());
		model.setComment(soapModel.getComment());
		model.setParentTaskId(soapModel.getParentTaskId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Task> toModels(TaskSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Task> models = new ArrayList<Task>(soapModels.length);

		for (TaskSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.home.cvicente.livetasks.model.Task"));

	public TaskModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _taskId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTaskId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _taskId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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
		attributes.put("asigneeClasName", getAsigneeClasName());
		attributes.put("asigneeClassPK", getAsigneeClassPK());
		attributes.put("statusId", getStatusId());
		attributes.put("comment", getComment());
		attributes.put("parentTaskId", getParentTaskId());

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

		String asigneeClasName = (String)attributes.get("asigneeClasName");

		if (asigneeClasName != null) {
			setAsigneeClasName(asigneeClasName);
		}

		Long asigneeClassPK = (Long)attributes.get("asigneeClassPK");

		if (asigneeClassPK != null) {
			setAsigneeClassPK(asigneeClassPK);
		}

		Long statusId = (Long)attributes.get("statusId");

		if (statusId != null) {
			setStatusId(statusId);
		}

		Long comment = (Long)attributes.get("comment");

		if (comment != null) {
			setComment(comment);
		}

		Long parentTaskId = (Long)attributes.get("parentTaskId");

		if (parentTaskId != null) {
			setParentTaskId(parentTaskId);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getTaskId() {
		return _taskId;
	}

	@Override
	public void setTaskId(long taskId) {
		_taskId = taskId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_status = status;
	}

	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	@Override
	public String getStatusByUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getStatusByUserId(), "uuid",
			_statusByUserUuid);
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		_statusByUserUuid = statusByUserUuid;
	}

	@Override
	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return StringPool.BLANK;
		}
		else {
			return _statusByUserName;
		}
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	@Override
	public long getTypeId() {
		return _typeId;
	}

	@Override
	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	@Override
	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public String getAsigneeClasName() {
		if (_asigneeClasName == null) {
			return StringPool.BLANK;
		}
		else {
			return _asigneeClasName;
		}
	}

	@Override
	public void setAsigneeClasName(String asigneeClasName) {
		_asigneeClasName = asigneeClasName;
	}

	@Override
	public long getAsigneeClassPK() {
		return _asigneeClassPK;
	}

	@Override
	public void setAsigneeClassPK(long asigneeClassPK) {
		_asigneeClassPK = asigneeClassPK;
	}

	@Override
	public long getStatusId() {
		return _statusId;
	}

	@Override
	public void setStatusId(long statusId) {
		_statusId = statusId;
	}

	@Override
	public long getComment() {
		return _comment;
	}

	@Override
	public void setComment(long comment) {
		_comment = comment;
	}

	@Override
	public long getParentTaskId() {
		return _parentTaskId;
	}

	@Override
	public void setParentTaskId(long parentTaskId) {
		_parentTaskId = parentTaskId;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Task.class.getName()));
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #isApproved}
	 */
	@Override
	public boolean getApproved() {
		return isApproved();
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Task.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Task toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Task)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		TaskImpl taskImpl = new TaskImpl();

		taskImpl.setUuid(getUuid());
		taskImpl.setTaskId(getTaskId());
		taskImpl.setCompanyId(getCompanyId());
		taskImpl.setUserId(getUserId());
		taskImpl.setGroupId(getGroupId());
		taskImpl.setUserName(getUserName());
		taskImpl.setCreateDate(getCreateDate());
		taskImpl.setModifiedDate(getModifiedDate());
		taskImpl.setStatus(getStatus());
		taskImpl.setStatusByUserId(getStatusByUserId());
		taskImpl.setStatusByUserName(getStatusByUserName());
		taskImpl.setStatusDate(getStatusDate());
		taskImpl.setTypeId(getTypeId());
		taskImpl.setTitle(getTitle());
		taskImpl.setDescription(getDescription());
		taskImpl.setAsigneeClasName(getAsigneeClasName());
		taskImpl.setAsigneeClassPK(getAsigneeClassPK());
		taskImpl.setStatusId(getStatusId());
		taskImpl.setComment(getComment());
		taskImpl.setParentTaskId(getParentTaskId());

		taskImpl.resetOriginalValues();

		return taskImpl;
	}

	@Override
	public int compareTo(Task task) {
		long primaryKey = task.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Task)) {
			return false;
		}

		Task task = (Task)obj;

		long primaryKey = task.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		TaskModelImpl taskModelImpl = this;

		taskModelImpl._originalUuid = taskModelImpl._uuid;

		taskModelImpl._originalCompanyId = taskModelImpl._companyId;

		taskModelImpl._setOriginalCompanyId = false;

		taskModelImpl._originalGroupId = taskModelImpl._groupId;

		taskModelImpl._setOriginalGroupId = false;

		taskModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Task> toCacheModel() {
		TaskCacheModel taskCacheModel = new TaskCacheModel();

		taskCacheModel.uuid = getUuid();

		String uuid = taskCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			taskCacheModel.uuid = null;
		}

		taskCacheModel.taskId = getTaskId();

		taskCacheModel.companyId = getCompanyId();

		taskCacheModel.userId = getUserId();

		taskCacheModel.groupId = getGroupId();

		taskCacheModel.userName = getUserName();

		String userName = taskCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			taskCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			taskCacheModel.createDate = createDate.getTime();
		}
		else {
			taskCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			taskCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			taskCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		taskCacheModel.status = getStatus();

		taskCacheModel.statusByUserId = getStatusByUserId();

		taskCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = taskCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			taskCacheModel.statusByUserName = null;
		}

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			taskCacheModel.statusDate = statusDate.getTime();
		}
		else {
			taskCacheModel.statusDate = Long.MIN_VALUE;
		}

		taskCacheModel.typeId = getTypeId();

		taskCacheModel.title = getTitle();

		String title = taskCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			taskCacheModel.title = null;
		}

		taskCacheModel.description = getDescription();

		String description = taskCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			taskCacheModel.description = null;
		}

		taskCacheModel.asigneeClasName = getAsigneeClasName();

		String asigneeClasName = taskCacheModel.asigneeClasName;

		if ((asigneeClasName != null) && (asigneeClasName.length() == 0)) {
			taskCacheModel.asigneeClasName = null;
		}

		taskCacheModel.asigneeClassPK = getAsigneeClassPK();

		taskCacheModel.statusId = getStatusId();

		taskCacheModel.comment = getComment();

		taskCacheModel.parentTaskId = getParentTaskId();

		return taskCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", taskId=");
		sb.append(getTaskId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", statusByUserId=");
		sb.append(getStatusByUserId());
		sb.append(", statusByUserName=");
		sb.append(getStatusByUserName());
		sb.append(", statusDate=");
		sb.append(getStatusDate());
		sb.append(", typeId=");
		sb.append(getTypeId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", asigneeClasName=");
		sb.append(getAsigneeClasName());
		sb.append(", asigneeClassPK=");
		sb.append(getAsigneeClassPK());
		sb.append(", statusId=");
		sb.append(getStatusId());
		sb.append(", comment=");
		sb.append(getComment());
		sb.append(", parentTaskId=");
		sb.append(getParentTaskId());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(64);

		sb.append("<model><model-name>");
		sb.append("home.cvicente.livetasks.model.Task");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>taskId</column-name><column-value><![CDATA[");
		sb.append(getTaskId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserId</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusByUserName</column-name><column-value><![CDATA[");
		sb.append(getStatusByUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusDate</column-name><column-value><![CDATA[");
		sb.append(getStatusDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>typeId</column-name><column-value><![CDATA[");
		sb.append(getTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asigneeClasName</column-name><column-value><![CDATA[");
		sb.append(getAsigneeClasName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>asigneeClassPK</column-name><column-value><![CDATA[");
		sb.append(getAsigneeClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>statusId</column-name><column-value><![CDATA[");
		sb.append(getStatusId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comment</column-name><column-value><![CDATA[");
		sb.append(getComment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>parentTaskId</column-name><column-value><![CDATA[");
		sb.append(getParentTaskId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Task.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Task.class };
	private String _uuid;
	private String _originalUuid;
	private long _taskId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserUuid;
	private String _statusByUserName;
	private Date _statusDate;
	private long _typeId;
	private String _title;
	private String _description;
	private String _asigneeClasName;
	private long _asigneeClassPK;
	private long _statusId;
	private long _comment;
	private long _parentTaskId;
	private long _columnBitmask;
	private Task _escapedModel;
}