//let miNombre=prompt("¿Cual es tu nombre?")
function saludoPer(nombre){
    alert("Mi nombre es: "+miNombre);
}
//saludoPer(miNombre)

function sumar(){
    //let num1=parseInt(prompt("Ingrese el valor 1"));
    //let num2=parseInt(prompt("Ingresa el valor 2"));
    let num1=5;
    let num2=2;
    miSuma="Suma: "+(num1+num2)
    return miSuma
}

console.log(sumar());
//alert(sumar())

function restar() {
    let num1=5;
    let num2=2;
    miResta="Resta: "+(num1-num2)
    return miResta
}
console.log(restar());

function dividir() {
    let num1=5;
    let num2=2;
    miResta="División: "+(num1/num2)
    return miResta
}
console.log(dividir());


function multiplicacion() {
    let num1=5;
    let num2=2;
    miResta="Multiplicacion: "+(num1*num2)
    return miResta
}
console.log(multiplicacion());

function modulo() {
    let num1=5;
    let num2=2;
    miResta="Modulo: "+(num1%num2)
    return miResta
}
console.log(modulo());

function incremento() {
    let num1=9;
    num1++;
    return num1
}
console.log(incremento());

function adicionales(){
    let num=5;
    num/=num
    return num
}
console.log(adicionales());

function divisionCero(){
    let dividendo=5;
    let divisor=0;
    if (divisor==0) {
        division="Division entre 0"
    } else {
        division=dividendo/divisor
    }
    return division
}
console.log(divisionCero());

function mayor() {
    let valido1=6;
    let valido2=10;
    if (valido1>valido2) {
        resultado="El mayor es: "+valido1
    } else {
      if (valido1<valido2) {
        resultado="El mayor es: "+valido2
      } else {
        resultado="Son iguales"
      }  
    }
    return resultado
}
console.log(mayor());

function edad(){
    let miEdad=0;
    if (miEdad>=18) {
        resultado="Es mayor de edad"
    }
    else {
        resultado="Es menor de edad"
    }
    return resultado
}
console.log(edad());
//Operadores logicos
function conjuncion(valor1,valor2) {
    if (valor1 && valor2) {
        console.log("Valor 1 y Valor 2 son verdaderos");
    } else {
        console.log("Un valor o ambos son falso");
    }
}
conjuncion(true,true)

function disyuncion(valor1,valor2){
    if(valor1 || valor2){
        console.log("La disyuncion es verdadero");
    } else{
        console.log("La disyuncion es falsa");
    }
}
disyuncion(false,false)

function negacion(valor1) {
    if (!(!valor1)) {
        console.log("El valor con doble negacion es: "+valor1);
    } else {
        console.log("El valor negado es: "+!valor1);
    }
}
negacion(false)