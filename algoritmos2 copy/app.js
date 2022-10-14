//Una funcion es una accion 
function funcionSuma(a,b){  //declarar o implementar un funcion
    return a+b;
}

x=funcionSuma(5,3);
console.log(x);

let a=10;
let b=2

//operador aritmetico de suma +
suma=a+b
console.log(suma)
//operador aritmetico de resta -
resta=a-b
console.log(resta)
//operador aritmetico de producto *
multiplicacion=a*b
console.log(multiplicacion)
//operador aritmetico de division
division=a/b
console.log(division)
//operador aritmetico de modulo
modulo=a%b
console.log(modulo);
//Operador aritmetico de exponenciacion
exponente=a**b
console.log(exponente)

//pre-incremento
incremento=++a;
console.log(incremento);
a++; //postincremento
console.log(a);
//decremento
dism=--b;
console.log(dism);
//Operador de asignacion compuesto
a+=2   //a=a+2
console.log(a)
a-=2    //a=a-3
console.log(a);
a*=a
console.log(a);
a/=a
console.log(a)

//Operadores de comparacion
let c="10",d=10;
console.log(c==d);
console.log(c===d);
console.log(c!=d);
console.log(c!==d);
// == comparacion-> comparacion debil compara el contenido, no distingue tipo
// === comparacion estricta, distingue entre tipos
