create table lvt_Task (
	uuid_ VARCHAR(75) null,
	taskId LONG not null primary key,
	companyId LONG,
	userId LONG,
	groupId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	typeId LONG,
	title VARCHAR(75) null,
	description VARCHAR(75) null
);

create table lvt_TaskType (
	uuid_ VARCHAR(75) null,
	typeId LONG not null primary key,
	companyId LONG,
	userId LONG,
	groupId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	title VARCHAR(75) null,
	description VARCHAR(75) null
);