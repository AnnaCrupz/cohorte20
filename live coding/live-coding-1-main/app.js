// Escribe tu código aquí.
let palabra="hola";
let arreglo=["Manzana","Jicama","Hi"];



function ingreso(palabra,arreglo) {
    let arreglo2=[];

    arreglo.forEach(element => {
        if (palabra.length<element.length) {
            arreglo2.push(element);
        }
    });

    return arreglo2;
}
arreglo2=ingreso(palabra,arreglo);
//
lista="";
arreglo2.forEach(element => {
    console.log(element);
    lista+=`<li>`+ element+ `</li>`
});
document.getElementById("lista").innerHTML=lista;

