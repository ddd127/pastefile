create table files
(
    id         bigserial not null primary key,
    time       timestamp,
    code       varchar(255),
    path       varchar(255),
    name       varchar(255),
    media_type varchar(255)
);

create unique index files_id_u_index on files (id);
