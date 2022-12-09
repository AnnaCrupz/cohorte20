SELECT idCategoria,nombre, precio,existencia
FROM tiendita.productos
WHERE idCategoria=2;

SELECT idCategoria,SUM(precio)
from tiendita.productos
group by idCategoria
order by idCategoria;

/* max() min() */
select MIN(existencia) as Minimo, MAX(existencia) as Maximo
from tiendita.productos;

select * from tiendita.productos
order by nombre ASC;

/*Operadores*/
select * from tiendita.productos
where idCategoria=1 and existencia>=10 and existencia<=20;

select * from tiendita.productos
where idCategoria=1 or existencia>=20;

select * from tiendita.productos
where idCategoria!=1 ;

select * from tiendita.productos
where precio is not null;

/*Beetween*/
select * from tiendita.productos
where precio between 5 and 10;

select * from tiendita.productos
where precio not between 5 and 10;