create table pokemontable
(
    id   int auto_increment
        primary key,
    name varchar(50) null,
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

INSERT INTO dasherdex.typetable (id, type) VALUES (1, 'Normal');
INSERT INTO dasherdex.typetable (id, type) VALUES (2, 'Water');
INSERT INTO dasherdex.typetable (id, type) VALUES (3, 'Ground');
INSERT INTO dasherdex.typetable (id, type) VALUES (4, 'Electric');
INSERT INTO dasherdex.typetable (id, type) VALUES (5, 'Grass');
INSERT INTO dasherdex.typetable (id, type) VALUES (6, 'Flying');
INSERT INTO dasherdex.typetable (id, type) VALUES (7, 'Poisen');
INSERT INTO dasherdex.typetable (id, type) VALUES (8, 'Fighting');
INSERT INTO dasherdex.typetable (id, type) VALUES (9, 'Rock');
INSERT INTO dasherdex.typetable (id, type) VALUES (10, 'Bug');
INSERT INTO dasherdex.typetable (id, type) VALUES (11, 'Ghost');
INSERT INTO dasherdex.typetable (id, type) VALUES (12, 'Fire');
INSERT INTO dasherdex.typetable (id, type) VALUES (13, 'Ice');
INSERT INTO dasherdex.typetable (id, type) VALUES (14, 'Psychic');
INSERT INTO dasherdex.typetable (id, type) VALUES (15, 'Dragon');