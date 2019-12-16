create table pokemontable
(
    pid  int auto_increment
        primary key,
    name varchar(40) null,
    type int         null,
    constraint pokemontable_typetable_id_fk
        foreign key (type) references typetable (id)
);


create table typetable
(
    id   int auto_increment
        primary key,
    type varchar(10) null
);

