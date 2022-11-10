let x=10;
console.log(x);

let persona={ //objeto literal
    nombre:"Juan",
    apellido:'Perez',
    nombreCompleto: function(){
        return this.nombre+' '+this.apellido;
    },
    get datosPersonales(){
        return this.nombre+' '+this.apellido;
    }
}

console.log(persona);
console.log(persona.nombreCompleto());
console.log(typeof(persona));
console.log(persona.datosPersonales);

let persona1=new Object();
persona1.edad=22;
console.log(persona1);
console.log(persona1.edad);

for (propiedad in persona) {
   console.log(propiedad);
   console.log(persona[propiedad]);
}

for (propiedad in persona1) {
    console.log(propiedad);
    console.log(persona1[propiedad]);
 }

 persona.tel='552233311';
 console.log(persona);
 console.log(persona.datosPersonales);
console.log(persona.tel);
delete persona.tel;
delete persona.nombreCompleto;
console.log(persona);

let personaArreglo=Object.values(persona);
console.log(personaArreglo);
let personaString=JSON.stringify(persona);
console.log(personaString);