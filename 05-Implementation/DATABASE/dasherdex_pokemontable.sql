create table pokemontable
(
    pid  int auto_increment
        primary key,
    name varchar(40)  null,
    type varchar(255) null
);

INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (1, 'Pikachu', 'electric');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (2, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (3, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (4, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (5, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (6, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (7, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (8, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (9, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (10, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (11, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (12, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (13, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (14, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (15, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (16, 'Raichou', 'Electric');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (17, 'Charizard', 'Fire');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (18, 'Gardevoir', 'normal');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (19, 'Gardevoir', 'normal');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (20, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (21, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (22, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (23, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (24, 'charizard', 'fire');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (25, '', '');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (26, 'Charizard', 'Fire');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (27, 'Firebirg', 'standard');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (28, 'Pikachu', 'Electric');
INSERT INTO dasherdex.pokemontable (pid, name, type) VALUES (29, 'Charizard', 'Fire');
create table typetable
(
    column_1 int auto_increment
        primary key,
    type     varchar(10) null
);

