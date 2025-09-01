create table FOO_AppPort (
	appPortId LONG not null primary key,
	scienceAppId LONG,
	dataTypeId LONG,
	optionName VARCHAR(75) null,
	portType VARCHAR(75) null
);

create table FOO_ScienceApp (
	uuid_ VARCHAR(75) null,
	scienceAppId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	lastPublishDate DATE null,
	appName VARCHAR(75) null,
	appVersion VARCHAR(75) null,
	appType VARCHAR(75) null,
	exeFileName VARCHAR(75) null,
	displayName STRING null,
	description STRING null,
	startScript VARCHAR(75) null,
	finishScript VARCHAR(75) null
);

create table SXSpyglass_AppPort (
	appPortId LONG not null primary key,
	scienceAppId LONG,
	dataTypeId LONG,
	optionName VARCHAR(75) null,
	portType VARCHAR(75) null
);

create table SXSpyglass_ScienceApp (
	uuid_ VARCHAR(75) null,
	scienceAppId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	lastPublishDate DATE null,
	appName VARCHAR(75) null,
	appVersion VARCHAR(75) null,
	appType VARCHAR(75) null,
	exeFileName VARCHAR(75) null,
	displayName STRING null,
	description STRING null,
	startScript VARCHAR(75) null,
	finishScript VARCHAR(75) null
);