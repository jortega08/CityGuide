# AGREGAR Y QUITAR COLUMNAS
#
# ALTER TABLE <nombre_tabla>
#ADD COLUMN <nombre_columna_nueva><tipo_dato(tamaño)>
#
#ALTER TABLE <nombre_tabla>
#DROP COLUMN <nombre_columna_nueva>
#
#////////////////Desarrollo/////////////////

USE SAKILA;

DROP TABLE IF EXISTS KOI;

CREATE TABLE KOI
SELECT CITY_ID, PHONE, DISTRICT, LOCATION FROM ADDRESS;

SELECT * FROM KOI;

TRUNCATE TABLE KOI;

SELECT * FROM KOI;

ALTER TABLE KOI
DROP COLUMN DISTRICT;

SELECT * FROM KOI;

ALTER TABLE KOI
DROP COLUMN NUEVO_REGISTRO;

ALTER TABLE KOI
ADD COLUMN NUEVO_DISTRITO VARCHAR (20);

SHOW TABLES;

DROP TABLE KOI;

SHOW TABLES;