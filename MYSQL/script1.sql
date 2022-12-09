
select * from productos;


select * from categoria;
use tiendita;

UPDATE `tiendita`.`productos` SET `idCategoria` = '1' WHERE (`idProducto` = '1');
UPDATE `tiendita`.`productos` SET `idCategoria` = '6' WHERE (`idProducto` = '22');
UPDATE `tiendita`.`productos` SET `nombre` = 'Chilindrina' WHERE (`idProducto` = '22');
UPDATE `tiendita`.`productos` SET `idCategoria` = '6' WHERE (`idProducto` = '23');

Alter table productos add column marca varchar(20) not null;

UPDATE `tiendita`.`productos` SET `marca` = 'Sonrics' WHERE (`idProducto` = '1');
UPDATE `tiendita`.`productos` SET `marca` = 'Tia Rosa' WHERE (`idProducto` = '22');
UPDATE `tiendita`.`productos` SET `marca` = 'Marias' WHERE (`idProducto` = '23');
UPDATE `tiendita`.`productos` SET `marca` = 'Trident' WHERE (`idProducto` = '24');

UPDATE `tiendita`.`productos` SET precio = replace(precio,1.00,2.00);
SET SQL_SAFE_UPDATES = 0;

set Foreign_key_checks=0;
truncate tiendita.productos;
set Foreign_key_checks=1;

select * from tiendita.categoria where id=3;
select * from tiendita.categoria where id>2;

select * from tiendita.productos group by idCategoria=10;