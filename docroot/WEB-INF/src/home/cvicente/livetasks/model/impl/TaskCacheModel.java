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

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import home.cvicente.livetasks.model.Task;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Task in entity cache.
 *
 * @author cvicente
 * @see Task
 * @generated
 */
public class TaskCacheModel implements CacheModel<Task>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(41);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", taskId=");
		sb.append(taskId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append(", typeId=");
		sb.append(typeId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", asigneeClasName=");
		sb.append(asigneeClasName);
		sb.append(", asigneeClassPK=");
		sb.append(asigneeClassPK);
		sb.append(", statusId=");
		sb.append(statusId);
		sb.append(", comment=");
		sb.append(comment);
		sb.append(", parentTaskId=");
		sb.append(parentTaskId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Task toEntityModel() {
		TaskImpl taskImpl = new TaskImpl();

		if (uuid == null) {
			taskImpl.setUuid(StringPool.BLANK);
		}
		else {
			taskImpl.setUuid(uuid);
		}

		taskImpl.setTaskId(taskId);
		taskImpl.setCompanyId(companyId);
		taskImpl.setUserId(userId);
		taskImpl.setGroupId(groupId);

		if (userName == null) {
			taskImpl.setUserName(StringPool.BLANK);
		}
		else {
			taskImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			taskImpl.setCreateDate(null);
		}
		else {
			taskImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			taskImpl.setModifiedDate(null);
		}
		else {
			taskImpl.setModifiedDate(new Date(modifiedDate));
		}

		taskImpl.setStatus(status);
		taskImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			taskImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			taskImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			taskImpl.setStatusDate(null);
		}
		else {
			taskImpl.setStatusDate(new Date(statusDate));
		}

		taskImpl.setTypeId(typeId);

		if (title == null) {
			taskImpl.setTitle(StringPool.BLANK);
		}
		else {
			taskImpl.setTitle(title);
		}

		if (description == null) {
			taskImpl.setDescription(StringPool.BLANK);
		}
		else {
			taskImpl.setDescription(description);
		}

		if (asigneeClasName == null) {
			taskImpl.setAsigneeClasName(StringPool.BLANK);
		}
		else {
			taskImpl.setAsigneeClasName(asigneeClasName);
		}

		taskImpl.setAsigneeClassPK(asigneeClassPK);
		taskImpl.setStatusId(statusId);
		taskImpl.setComment(comment);
		taskImpl.setParentTaskId(parentTaskId);

		taskImpl.resetOriginalValues();

		return taskImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		taskId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		groupId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		status = objectInput.readInt();
		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
		typeId = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		asigneeClasName = objectInput.readUTF();
		asigneeClassPK = objectInput.readLong();
		statusId = objectInput.readLong();
		comment = objectInput.readLong();
		parentTaskId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(taskId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(groupId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeInt(status);
		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
		objectOutput.writeLong(typeId);

		if (title == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (asigneeClasName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(asigneeClasName);
		}

		objectOutput.writeLong(asigneeClassPK);
		objectOutput.writeLong(statusId);
		objectOutput.writeLong(comment);
		objectOutput.writeLong(parentTaskId);
	}

	public String uuid;
	public long taskId;
	public long companyId;
	public long userId;
	public long groupId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;
	public long typeId;
	public String title;
	public String description;
	public String asigneeClasName;
	public long asigneeClassPK;
	public long statusId;
	public long comment;
	public long parentTaskId;
}