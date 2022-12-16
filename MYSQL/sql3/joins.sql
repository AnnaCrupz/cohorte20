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

select p.nombre, p.precio, p.existencia, t.nombre 
from productos as p
left join temp as t
on p.idCategoria=t.idTemp;

select t.nombre,p.nombre, p.precio, p.existencia
from productos as p
right join temp as t
on p.idCategoria=t.idTemp;

select * from tiendita.categoria UNION
select * from tiendita.proveedores;

/*Multiconsulta*/
select * from proveedores;
select * from categoria;
select * from productos;
select * from detalle_producto_proveedor;

select p.idProducto, p.nombre, p.precio, p.existencia, c.nombre as categoria, prov.nombre as proveedor
from productos as p
inner join detalle_producto_proveedor as d
on p.idProducto=d.idProducto
left join categoria as c
on p.idCategoria=c.id
left join proveedores as prov
on prov.id=d.idProveedor
where p.existencia>10;
;