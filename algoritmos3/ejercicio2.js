const personas=["Maria","Dani","Luis","Juan","Camila"]
console.log(personas);

//Elimina a "Dani"
personas.splice(1,1)
//personas.splice(personas.indexOf("Dani"), 1);
console.log(personas);

//Elimina a Juan
personas.splice(2,1)
console.log(personas);

//Agrega a Luis al inicio del arreglo
personas.unshift("Luis")
console.log(personas);
//personas.splice(0,0,"Luis")

//Agrega tu nombre al arreglo
let miNombre="Ana"
personas.push(miNombre)
console.log(personas);

//Mostrar la posicion del nombre de Maria
console.log(personas.indexOf("Maria"));

//Mostrar la posicion de tu nombre
console.log(personas.indexOf(miNombre))

