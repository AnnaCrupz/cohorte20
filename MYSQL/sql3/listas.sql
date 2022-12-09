/*listas*/
select * from tiendita.productos
where precio in (10,11,12);

select * from tiendita.productos
where precio not in (10,11,12);

select * from tiendita.productos
where date(fecha_alta) between '2015-01-01' and '2016-01-01';

select * from tiendita.productos
where precio=(5+5);

select idCategoria, avg(precio) as promedio_precio from tiendita.productos where idCategoria=1;