CREATE DATABASE tienda;

CREATE TABLE productos (
id int not null,
nombre varchar(50) NOT NULL,
descripcion varchar(255) NULL,
PRIMARY KEY (id)
);

INSERT INTO productos(id,nombre,descripcion)
VALUES(1,'Mouse','Raton en aluminio pulido compatible con Mac y Windows.');

INSERT INTO productos(id,nombre,descripcion)
VALUES(1,'Monitor','Pantalla LED 4K, ideal para gaming.');

INSERT INTO productos(id,nombre,descripcion)
VALUES(1,'Parlantes','Monitores acusticos de alta fidelidad con cuatro modos de graduacion.');

--select

SELECT * FROM productos;

SELECT * FROM productos
WHERE id = 1;

UPDATE Productos SET nombre = @nombre, description=@descripcion WHERE id=1;

DELETE FROM productos where id=1;