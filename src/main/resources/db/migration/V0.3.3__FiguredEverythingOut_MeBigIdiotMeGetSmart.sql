create sequence product_id_seq
    as integer;

alter table product
    alter column id set default nextval('public.product_id_seq'::regclass);

alter sequence product_id_seq owned by product.id;

create sequence employee_id_seq
    as integer;

alter table employee
    alter column id set default nextval('public.employee_id_seq'::regclass);

alter sequence employee_id_seq owned by employee.id;

create sequence company_id_seq
    as integer;

alter table company
    alter column id set default nextval('public.company_id_seq'::regclass);

alter sequence company_id_seq owned by company.id;

create sequence comment_id_seq
    as integer;

alter table comment
    alter column id set default nextval('public.comment_id_seq'::regclass);

alter sequence comment_id_seq owned by comment.id;

create sequence client_id_seq
    as integer;

alter table client
    alter column id set default nextval('public.client_id_seq'::regclass);

alter sequence client_id_seq owned by client.id;
