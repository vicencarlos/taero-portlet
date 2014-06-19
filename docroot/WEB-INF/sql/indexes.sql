create index IX_72EFBFD4 on lvt_Task (uuid_);
create index IX_78A9D7D4 on lvt_Task (uuid_, companyId);
create unique index IX_24AE4356 on lvt_Task (uuid_, groupId);

create index IX_5236062E on lvt_TaskType (companyId);
create index IX_84464030 on lvt_TaskType (groupId);
create index IX_174E1EBA on lvt_TaskType (uuid_);
create index IX_31DF4D2E on lvt_TaskType (uuid_, companyId);
create unique index IX_FB954730 on lvt_TaskType (uuid_, groupId);

create index IX_A3351C3F on taero_Task (uuid_);
create index IX_E9F31A89 on taero_Task (uuid_, companyId);
create unique index IX_F162AF4B on taero_Task (uuid_, groupId);

create index IX_FDF9C799 on taero_TaskType (companyId);
create index IX_8651605B on taero_TaskType (groupId);
create index IX_B3694DA5 on taero_TaskType (uuid_);
create index IX_82AE2D63 on taero_TaskType (uuid_, companyId);
create unique index IX_3F98B0A5 on taero_TaskType (uuid_, groupId);