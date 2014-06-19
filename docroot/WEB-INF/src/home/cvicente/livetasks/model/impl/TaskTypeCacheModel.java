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

import home.cvicente.livetasks.model.TaskType;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TaskType in entity cache.
 *
 * @author cvicente
 * @see TaskType
 * @generated
 */
public class TaskTypeCacheModel implements CacheModel<TaskType>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", typeId=");
		sb.append(typeId);
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
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TaskType toEntityModel() {
		TaskTypeImpl taskTypeImpl = new TaskTypeImpl();

		if (uuid == null) {
			taskTypeImpl.setUuid(StringPool.BLANK);
		}
		else {
			taskTypeImpl.setUuid(uuid);
		}

		taskTypeImpl.setTypeId(typeId);
		taskTypeImpl.setCompanyId(companyId);
		taskTypeImpl.setUserId(userId);
		taskTypeImpl.setGroupId(groupId);

		if (userName == null) {
			taskTypeImpl.setUserName(StringPool.BLANK);
		}
		else {
			taskTypeImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			taskTypeImpl.setCreateDate(null);
		}
		else {
			taskTypeImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			taskTypeImpl.setModifiedDate(null);
		}
		else {
			taskTypeImpl.setModifiedDate(new Date(modifiedDate));
		}

		taskTypeImpl.setStatus(status);
		taskTypeImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			taskTypeImpl.setStatusByUserName(StringPool.BLANK);
		}
		else {
			taskTypeImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			taskTypeImpl.setStatusDate(null);
		}
		else {
			taskTypeImpl.setStatusDate(new Date(statusDate));
		}

		if (title == null) {
			taskTypeImpl.setTitle(StringPool.BLANK);
		}
		else {
			taskTypeImpl.setTitle(title);
		}

		if (description == null) {
			taskTypeImpl.setDescription(StringPool.BLANK);
		}
		else {
			taskTypeImpl.setDescription(description);
		}

		taskTypeImpl.resetOriginalValues();

		return taskTypeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		typeId = objectInput.readLong();
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
		title = objectInput.readUTF();
		description = objectInput.readUTF();
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

		objectOutput.writeLong(typeId);
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
	}

	public String uuid;
	public long typeId;
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
	public String title;
	public String description;
}