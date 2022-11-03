let precio=Number(prompt("Ingresa precio"));
let tipoCupon=prompt("Ingrese el tipo de cupon")
tipoCupon=tipoCupon.toLowerCase();
let descuento;

if (isNaN(precio)) {
    alert("Ingresa un precio correcto")
}

switch (tipoCupon) {
    case "Bronce":
    case "bronce":
        descuento=0.05;
        break;
    case "plata":
        descuento=0.10;
        break;
    case "oro":
        descuento=0.20;
        break;
    case "platino":
        descuento=0.25
        break;
    default:
        descuento=0;
        alert("Cupón no valido")
        break;
}
document.write("El precio es $"+precio+  "<br>")
let precioDescuento=precio*(1-descuento)
document.write("El precio con el descuento es $"+precioDescuento)

console.log(`Hola ${tipoCupon}`);

