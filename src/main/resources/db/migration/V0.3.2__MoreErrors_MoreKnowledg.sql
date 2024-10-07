-- auto-generated definition
create table "client"
(
    id       integer     not null
        constraint table_name_pk
            primary key,
    login    varchar(255) not null,
    password varchar(255) not null,
    nickname varchar(255)
);

alter table "client"
    owner to postgres;

create unique index table_name_id_uindex
    on "client" (id);

create unique index table_name_login_uindex
    on "client" (login);
