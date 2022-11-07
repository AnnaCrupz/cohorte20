//let edad= Number(prompt("Ingresa tu edad"));

/*
if (condition) {
    bloque
} */

if (edad>0 && edad<=17) {
    document.write("Tas chiquito")
} else if(edad===18){
    document.write("Eres mayor de edad")
} else if(edad>18){
    document.write("Tas ruco")
} else
    document.write("No es un numero valido")


let edad1=18;

edad1>=18?console.log("Es mayor de edad"):console.log("Tas chiquito");

console.log(`Yo soy Ana y soy ${edad>=18 ? "mayor de edad":"menor de edad"}`);