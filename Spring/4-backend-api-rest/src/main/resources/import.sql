/*Datos de prueba*/

INSERT INTO regiones (id, nombre) VALUES (1, 'Sudamerica');
INSERT INTO regiones (id, nombre) VALUES (2, 'Centroamerica');
INSERT INTO regiones (id, nombre) VALUES (3, 'Norteamerica');
INSERT INTO regiones (id, nombre) VALUES (4, 'Europa');
INSERT INTO regiones (id, nombre) VALUES (5, 'Asia');
INSERT INTO regiones (id, nombre) VALUES (6, 'Africa');
INSERT INTO regiones (id, nombre) VALUES (7, 'Oceania');
INSERT INTO regiones (id, nombre) VALUES (8, 'Antartida');

INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (1,'Andres', 'Guzman', 'angres@mail.com', '2020-01-05');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2,'Carlos', 'Perez', 'carlos@mail.com', '2021-11-15');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4,'Victor', 'Juaquin', 'victor@mail.com', '2020-08-09');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (5,'Reina', 'Lopez', 'reina@mail.com', '2020-09-19');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6,'Isabel', 'Lopez', 'isabel@mail.com', '2020-09-19');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (4,'Regina', 'Ramirez', 'regina@mail.com', '2020-09-19');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (6,'Paco', 'Perez', 'paco@mail.com', '2020-09-19');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (2,'Memo', 'Veltran', 'luis@mail.com', '2020-09-19');
INSERT INTO clientes (region_id, nombre, apellido, email, create_at) VALUES (8,'Luis', 'Rodriguez', 'memo@mail.com', '2020-09-19');


INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres', '$2a$10$850AZrzwkF9QAfT/nzC7puZTtRkInP57KRUj72QErK3Wab9kk03Cy', 1, 'Andres', 'Guzman', 'profesor@mail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$RK2jvuHp89pxgwCoI8lmd.jDwV.aAQBtx07dFtwVi3vN6I4p8qyRC', 1, 'Jhon', 'Doe', 'jhon.doe@mail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);



