-- auto-generated definition
create table "user"
(
    id       integer     not null
        constraint table_name_pk
            primary key,
    login    varchar(64) not null,
    password varchar(64) not null,
    nickname varchar(32)
);

alter table "user"
    owner to postgres;

create unique index table_name_id_uindex
    on "user" (id);

create unique index table_name_login_uindex
    on "user" (login);


-- auto-generated definition
create table product
(
    id          integer not null
        constraint product_pk
            primary key,
    name        text    not null,
    producer    integer not null,
    rating      double precision,
    description text    not null
);

alter table product
    owner to postgres;

create unique index product_id_uindex
    on product (id);

create unique index product_name_uindex
    on product (name);


-- auto-generated definition
create table company
(
    id          integer     not null
        constraint company_pk
            primary key,
    name        varchar(64) not null,
    owner       integer     not null,
    rating      double precision,
    description text        not null
);

alter table company
    owner to postgres;

create unique index company_id_uindex
    on company (id);

create unique index company_name_uindex
    on company (name);

create table comment
(
    id     integer  not null
        constraint comment_pk
            primary key,
    author integer  not null,
    rating smallint not null,
    text   text
);

alter table comment
    owner to postgres;

create unique index comment_id_uindex
    on comment (id);
