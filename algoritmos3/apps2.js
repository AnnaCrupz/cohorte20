emoji="😂"  //para agregar emojis se utiliza Win+.
console.log(emoji);

const frutas=["uva","🍉","Pera"]
console.log(frutas.length);

//Metodo
//push() agrega elementos al final del arreglo
let num=frutas.push("Guayaba") //Al guardarlo manda solo el numero de elementos
frutas.push("🍍") // la forma correcta es esta
console.log(frutas);
console.log(num);

//unshift() agrega elementos al inicio
frutas.unshift("🍏")
console.log(frutas);

//pop() elimina un elemnto al final
frutas.pop()
console.log(frutas);
let elementoEliminado=frutas.pop()
console.log(elementoEliminado);
console.log(frutas);
//shift() elimina un elemento del final
elementoEliminado2=frutas.shift()
console.log(elementoEliminado2);
console.log(frutas);

console.log(frutas.indexOf("Guayaba"))
frutas.sort()
console.log(frutas);

const numeros=[1,34,6,9]
console.log(numeros);
numeros.sort(function order(a,b){return a -b})
console.log(numeros);