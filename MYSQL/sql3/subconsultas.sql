/*subconsultas*/
select * from tiendita.productos
where idCategoria=2 and precio>10 and existencia between 5 and 20 and fecha_alta is not null;

select * from tiendita.productos
where idCategoria>2;

select id from tiendita.categoria where id>3;

select * from tiendita.categoria;

select * from tiendita.productos where idCategoria>3;

