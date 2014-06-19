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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link home.cvicente.livetasks.service.http.TaskServiceSoap}.
 *
 * @author cvicente
 * @see home.cvicente.livetasks.service.http.TaskServiceSoap
 * @generated
 */
public class TaskSoap implements Serializable {
	public static TaskSoap toSoapModel(Task model) {
		TaskSoap soapModel = new TaskSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTaskId(model.getTaskId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());
		soapModel.setTypeId(model.getTypeId());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setAsigneeClasName(model.getAsigneeClasName());
		soapModel.setAsigneeClassPK(model.getAsigneeClassPK());
		soapModel.setStatusId(model.getStatusId());
		soapModel.setComment(model.getComment());
		soapModel.setParentTaskId(model.getParentTaskId());

		return soapModel;
	}

	public static TaskSoap[] toSoapModels(Task[] models) {
		TaskSoap[] soapModels = new TaskSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TaskSoap[][] toSoapModels(Task[][] models) {
		TaskSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TaskSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TaskSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TaskSoap[] toSoapModels(List<Task> models) {
		List<TaskSoap> soapModels = new ArrayList<TaskSoap>(models.size());

		for (Task model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TaskSoap[soapModels.size()]);
	}

	public TaskSoap() {
	}

	public long getPrimaryKey() {
		return _taskId;
	}

	public void setPrimaryKey(long pk) {
		setTaskId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTaskId() {
		return _taskId;
	}

	public void setTaskId(long taskId) {
		_taskId = taskId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	public long getTypeId() {
		return _typeId;
	}

	public void setTypeId(long typeId) {
		_typeId = typeId;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getAsigneeClasName() {
		return _asigneeClasName;
	}

	public void setAsigneeClasName(String asigneeClasName) {
		_asigneeClasName = asigneeClasName;
	}

	public long getAsigneeClassPK() {
		return _asigneeClassPK;
	}

	public void setAsigneeClassPK(long asigneeClassPK) {
		_asigneeClassPK = asigneeClassPK;
	}

	public long getStatusId() {
		return _statusId;
	}

	public void setStatusId(long statusId) {
		_statusId = statusId;
	}

	public long getComment() {
		return _comment;
	}

	public void setComment(long comment) {
		_comment = comment;
	}

	public long getParentTaskId() {
		return _parentTaskId;
	}

	public void setParentTaskId(long parentTaskId) {
		_parentTaskId = parentTaskId;
	}

	private String _uuid;
	private long _taskId;
	private long _companyId;
	private long _userId;
	private long _groupId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private int _status;
	private long _statusByUserId;
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
}