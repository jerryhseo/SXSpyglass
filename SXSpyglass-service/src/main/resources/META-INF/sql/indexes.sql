create index IX_6B01EC91 on FOO_AppPort (dataTypeId, portType[$COLUMN_LENGTH:75$]);
create index IX_77E479DE on FOO_AppPort (portType[$COLUMN_LENGTH:75$]);

create index IX_10E02B6B on FOO_ScienceApp (appName[$COLUMN_LENGTH:75$], appVersion[$COLUMN_LENGTH:75$]);
create index IX_D7FF3C2F on FOO_ScienceApp (appType[$COLUMN_LENGTH:75$]);
create index IX_7B1C4054 on FOO_ScienceApp (groupId, status);
create index IX_F159708E on FOO_ScienceApp (groupId, userId, status);
create index IX_EF85FBA2 on FOO_ScienceApp (status);
create index IX_16B1FDDC on FOO_ScienceApp (userId, status);
create index IX_863A83B0 on FOO_ScienceApp (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BAF03632 on FOO_ScienceApp (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_6DEA58B0 on SXSpyglass_AppPort (dataTypeId, portType[$COLUMN_LENGTH:75$]);
create index IX_EDEEDC7D on SXSpyglass_AppPort (portType[$COLUMN_LENGTH:75$]);

create index IX_FB5E0BCA on SXSpyglass_ScienceApp (appName[$COLUMN_LENGTH:75$], appVersion[$COLUMN_LENGTH:75$]);
create index IX_F4FB730E on SXSpyglass_ScienceApp (appType[$COLUMN_LENGTH:75$]);
create index IX_731F2833 on SXSpyglass_ScienceApp (groupId, status);
create index IX_AF22096D on SXSpyglass_ScienceApp (groupId, userId, status);
create index IX_3AC7ECE3 on SXSpyglass_ScienceApp (status);
create index IX_A2D31E1D on SXSpyglass_ScienceApp (userId, status);
create index IX_8E9497B1 on SXSpyglass_ScienceApp (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_47115673 on SXSpyglass_ScienceApp (uuid_[$COLUMN_LENGTH:75$], groupId);