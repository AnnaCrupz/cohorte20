let arre=[[1,2,3],
        [4,5,6],
        [7,8,9]];

console.log(arre[1][1]);
console.log(arre[0]);
console.log(arre.length);

let subA=[1,2,3];
let subB=[4,5];
let subC=[7,8,9];

let arregloS=[subA,subB,subC];
console.log(arregloS);

for (const key in arregloS) {
    if (Object.hasOwnProperty.call(arregloS, key)) {
        const element = arregloS[key];
        console.log(element);
    }
}

for (let index = 0; index < arregloS.length; index++) {
    const element = arregloS[index];
    console.log(element);
}

arregloS.forEach(element => {
    console.log(element);
});


for (let i = 0; i < arregloS.length; i++) {
    for (let a = 0; a < arregloS[i].length; a++) {
            const element = arregloS[i][a];
            console.log(element);
    }
}
let contador=0;
while (contador<arregloS.length) {
    console.log(arregloS[contador]);
    contador++;
}

let c=0;
while (c<=10) {
    console.log(c);
    c++;
}

let d=0;
do {
    console.log(d);
    d++;
} while (d<=10);

let palabra="hola";
console.log(`El tamaño de ${palabra} es ${palabra.length}`);

/*
let fila=0;
while (fila<arregloS.length) {
    for (let columna = 0; columna < arregloS[fila].length; columna++) {
        const element = arregloS[fila][columna];
        console.log(element);
    }
    fila++;
}
*/
let fila=0;
do {
    for (let columna = 0; columna < arregloS[fila].length; columna++) {
        const element = arregloS[fila][columna];
        console.log(element);
    }
    fila++;
    console.log("-------");
} while (fila<arregloS.length);

let a=[[2,2,2],[1,3,4],[6,1,5]];
let b=[[1,2,3],[4,5,6],[7,8,9]];

let c_=[];

for (let indexA = 0; indexA < a.length; indexA++) {
    let fila=[];
    for (let indexAA = 0; indexAA < a[indexA].length; indexAA++) {
            console.log(a[indexA][indexAA]*b[indexAA][indexA]);
            let elementos=a[indexA][indexAA]*b[indexAA][indexA];
            fila.push(elementos);
        }
        c_.push(fila);
    }
    console.log(c_);


