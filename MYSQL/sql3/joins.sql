select  b.idCategoria, a.nombre
from tiendita.categoria as a
inner join tiendita.productos as b
on a.id=b.idCategoria
group by nombre;

select * from productos as p
inner join categoria as c
where p.idCategoria=c.id;

select * from productos as p
inner join categoria as c
on p.idCategoria=c.id;

select p.nombre,p.precio,p.existencia,c.nombre from productos as p
inner join categoria as c
on p.idCategoria=c.id;