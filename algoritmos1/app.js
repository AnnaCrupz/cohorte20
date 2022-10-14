// comentario sencillo en javascript
/* Para generar un bloque de comentarios se utiliza 
Shift+Alt+A */

//generar una notificacion en el navegador
//alert("Hola mundo desde Visual Studio Code!!");
// declaracion de una variable
var nombre="Ana";
let miVariable; //Let para variables que pueden mutar su valor
const variableConstante=1; //constant para variables que no cambian
miVariable="Hola";
console.log(nombre)
console.log(miVariable);
console.log(variableConstante);
//Sintaxis de declaracion de variables
//Se puede declarar sin usar Let, constant o var
name="Juan";    //No es una buena practica
console.log(name);
//Buenas practicas para nombrar variables
let nombreCompleto; //Notacion de camello o altas y bajas
/* No usar numeros al inicio de una variable
Se puede utilizar _ $
No utilizar palabras reservadas */

//Mutacion de valor
miVariable="Adios";
console.log(miVariable);

var num1=10;
let num2=11
let num3=10.5;

 //Alt+Shift+Arriba duplica el texto

 console.log(num1,num2,num3);
 console.log(num1 + num2 + num3);
 console.log("Texto a consola")
 var Verdadero=true;
 var Falso=false;
 console.log(Verdadero);
 console.log(Falso);
 let valorNulo=null;
 console.log(valorNulo)

let varUn  //undefinied--estado
console.log(varUn);
console.log(varUn+1)
var varUn2
console.log(varUn2);

//Tipos de dato en JavaScript
//operador typeof- nos describe el tipo de dato
let a=1;
let b="Hola";
let c=true
let d ={
    nombre : "Ana",
    apellido : "Cruz",
    edad: 22
}

console.log(typeof a);
console.log(typeof (b));
console.log(typeof c);
console.log(typeof null);
console.log(typeof d);

//Tipo de dato function
function miFuncion(){
    console.log(typeof miFuncion);
}
miFuncion()

//Tipo de dato Symbol
var simbolo=Symbol("mi simbolo")
console.log(typeof simbolo);

//Tipo clase
class Persona{
    constructor(nombre, apellido){
        this.nombre=nombre;
    this.apellido=apellido;
    }
}
console.log(typeof Persona);

var array=['BMW','Audi','Volvo'];
console.log(typeof array);

 //Concatenado 
 console.log(1+"1");
 console.log(nombre+219)
 console.log("Hola"+' '+nombre)
 x=nombre+' '+(2+6)
 console.log(x)
x=2+6+' '+nombre //Contexto string
console.log(x);


