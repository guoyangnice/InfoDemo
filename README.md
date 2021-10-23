# InfoDemo
建表语句：
```
create table info
(
id               int auto_increment,
department       varchar(256) null,
name             varchar(32)  null,
office_phone     varchar(32)  null,
department_phone varchar(32)  null,
self_phone       varchar(32)  null,
family_phone     varchar(32)  null,
position         varchar(128) null,
constraint info_id_uindex
unique (id)
);

create index name__index
on info (name);

alter table info
add primary key (id);
```

### 注意这里没有使用spring标准的架构开发