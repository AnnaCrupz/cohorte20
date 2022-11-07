const numeros=[2,4,6,57,200]

console.log(numeros);
console.log(numeros.length);

numeros.forEach(element => {
    console.log(element);
});

numeros.forEach(function sumar(elemento){
    console.log(elemento*elemento);
})

for (let i = 0; i < numeros.length; i++) {
    console.log(i);
    console.log(numeros[i]);
}

let suma=0;
numeros.forEach(function sumar(elemento){
    suma+=elemento;
})
console.log(suma);

numeros.forEach((el,indice,arreglo)=> {
    console.log(el, indice);
    //console.log(arreglo);
})

let nueArreglo=numeros.map((ele)=>{
    return ele*ele;
});

console.log(nueArreglo);

const frutas=["papaya","manzana","manzana","uva","🍏"];

let filtroFrutas=frutas.filter((fruta)=>fruta !=="manzana");
console.log(filtroFrutas);

let filtroletras=frutas.filter((fruta)=>fruta.length>=3);
console.log(filtroletras);
