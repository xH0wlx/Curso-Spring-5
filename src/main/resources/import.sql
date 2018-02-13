/* Populate Tables */
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(1, 'Andres', 'Guzman', 'profesor@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(2, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(3, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(4, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(5, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(6, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(7, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(8, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(9, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(10, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(11, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(12, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(13, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(14, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(15, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(16, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(17, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(18, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(19, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(20, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(21, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(22, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(23, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(24, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
INSERT INTO clientes (id_cliente, nombre, apellido, email, created_at, foto) VALUES(25, 'Jhon', 'Doe', 'john.doe@bolsadeideas.com', '2017-08-28', '');
                        
/* Populate tabla productos */
INSERT INTO productos (nombre, precio, created_at) VALUES('Panasonic Pantalla LCD', 25990, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Sony Cámara digital DSC-W320B', 123490, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Apple IPod Shuffle', 149990, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Sony Notebook Z110', 379990, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Hewlett Packard Multifuncional F2280', 69990, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Bianchi Bicicleta Aro 26', 69990, NOW());
INSERT INTO productos (nombre, precio, created_at) VALUES('Mica Comoda 5 Cajones', 299990, NOW());

/* Creamos algunas facturas */
INSERT INTO facturas (descripcion, observacion, cliente_id_cliente, created_at) VALUES ('Factura equipos de oficina', null, 1, NOW());
INSERT INTO factura_items (cantidad, factura_id_factura, producto_id_producto) VALUES (1, 1, 1);
INSERT INTO factura_items (cantidad, factura_id_factura, producto_id_producto) VALUES (2, 1, 4);
INSERT INTO factura_items (cantidad, factura_id_factura, producto_id_producto) VALUES (1, 1, 5);
INSERT INTO factura_items (cantidad, factura_id_factura, producto_id_producto) VALUES (1, 1, 7);

INSERT INTO facturas (descripcion, observacion, cliente_id_cliente, created_at) VALUES ('Factura Bicicleta', 'Alguna nota importante!', 1, NOW());
INSERT INTO factura_items (cantidad, factura_id_factura, producto_id_producto) VALUES(3, 2, 6);