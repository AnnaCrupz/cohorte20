select * from tiendita.productos;

truncate tiendita.productos;

set Foreign_key_checks=1;

select idCategoria, count(nombre) from tiendita.productos group by idCategoria;