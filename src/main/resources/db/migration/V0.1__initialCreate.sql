create table employee
(
    id        integer      not null
        constraint employee_pk
            primary key,
    name      varchar(256) not null,
    surname   varchar(256),
    lastname  varchar(256),
    birthdate date         not null
);

alter table employee
    owner to postgres;

create unique index employee_id_uindex
    on employee (id);
