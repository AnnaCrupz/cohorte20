let nombre="Ana Karen Escobar Cruz"
console.log(nombre);

function miNombre() {
    let nombre="Ana";
    console.log(nombre);
    
}
miNombre()

function funcion1() {
    let valor=2;
    valor+=3;
    return valor;
}
let resultado= funcion1();
console.log("El resultado es ",resultado);

function funcion1v2() {
    let valor1=2;
    valor1+=3;
    console.log("El resultado de la suma es: ", valor1);
}

funcion1v2()

variableGlobal=1
function funcion3() {
    variableLocal="El valor es: "
    console.log(variableLocal+variableGlobal);
}

funcion3()

function funcion4(valor=10) {
    let numero=6;
    numero*=valor;
    return numero ;
}
let salida=funcion4(4);
console.log(salida);

//Funcion anonima
let funcion0=function (parametro) {
    parametro*=2;
    return parametro
}

console.log("Llamando a la funcion anonima", funcion0(5));

let function01=function(caracteres){
    return "Hola "+caracteres;
}('Lunes');
console.log(function01);

let suma=(x,y)=>{
    return x+y;
}

let resultado2=suma(5,10);
console.log(resultado2);

function calcularPrecioTotal(precio,porcentajeImpuesto){
    let impuesto=1+(porcentajeImpuesto/100);
    let envio=10;
    let precioTotal=(precio*impuesto)+envio;
    return precioTotal;
}

let resultado3=calcularPrecioTotal(23.34,16)
console.log("El resultado es: $",resultado3);

let precioTotal=function (precio,porcentajeImpuesto) {
    let impuesto=1+(porcentajeImpuesto/100);
    let envio=10;
    let precioTotal=(precio*impuesto)+envio;
    return precioTotal;
}

console.log(precioTotal(23.34,16));

let precioTotalFlecha=(precio,porcentajeImpuesto)=>{
    let impuesto=1+(porcentajeImpuesto/100);
    let envio=10;
    let precioTotal=(precio*impuesto)+envio;
    return precioTotal;
}
console.log(precioTotalFlecha(23.34,16));

let miObjeto={
    nombre:"Juan",
    edad:30,
    datos: function () {   
        let mensaje= "Tu nombre es: "+this.nombre;
        mensaje+=" tienes "+this.edad;
        console.log(mensaje);
    }
};
miObjeto.datos()

let constructor=function(){
    let obejetoPersona={
        nombre:"Juan",
        nss:2357,
        datosPersona: function () {
            let msj="eres "+this.nombre+" nss: "+this.nss;
            console.log(msj);
        },
        otroMetodo: function (parametro) {
            let numero=8;
            console.log("La suma es "+(numero+parametro));
        }
    }
    return obejetoPersona;
}
let varObjReg=constructor();
console.log(varObjReg.datosPersona());
console.log(varObjReg.otroMetodo(5));



function Persona(nombre, nss){
    this.nombre=nombre,
    this.nss=nss,
    this.datosPersonales=function () {
        let msj="Eres "+this.nombre+" con nss"+this.nss;
        return msj
    }
}

let Persona1=new Persona("Juan",2354)
console.log(Persona1);
console.log(Persona1.datosPersonales());


let precioTotalConstruct=function (precio,impuesto) {
    this.impuesto=impuesto;
    this.costoImpuesto=1+(impuesto/100);
    this.precio=precio;
    this.costoEnvio=10;
    this.costoTotal=function(){
        let total=(this.precio*this.costoImpuesto)+this.costoEnvio;
        return total;
    }
}
let compra1=new precioTotalConstruct(500,16);
console.log(compra1.costoTotal());