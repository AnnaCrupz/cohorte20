/*
const foo= () =>console.log("first");
const bar= () =>setTimeout(()=>console.log("Second"));
const baz= () =>console.log("third");

bar();
foo();
baz();

const nombre2 = () =>{
    const nombres=["Juan","Carlos","Edgar"];
    setTimeout(() => {
        return nombres; 
    }, 3000);
}

//console.log(nombre());
/*
const url="https://pokeapi.co/api/v2/pokemon/25";

const pokedex=()=>{
    fetch(url).then((datos)=> datos.json())
    .then(pokemon=>{console.log(pokemon)})
    .catch(error=>console.log(error))
};

const nombre = () => {
    const nombres = ["Pepe", "Pancho", "María"];

    

    /* setTimeout(() => {
        return nombres;
    }, 0); */
    /*
    const nombre = () => {
        const nombres = ["Pepe", "Pancho", "María"];
    
        
    
        /* setTimeout(() => {
            return nombres;
        }, 0); */
    /*
    return new Promise((resolve, reject) => { //resolve -- proceso exitoso
        setTimeout(() => {
                                //reject -- proceso no exitoso
           if(true){
            resolve(nombres);
           }else{
            reject("No hay nombres");
           }
           
        }, 1000)
    });
}
    nombre().then(nombres => console.log(nombres)).catch(error => console.warn(error));
*/

const cartaPokemon = document.getElementById('pokemon');
const nombrePokemon = document.getElementById('nombre');
const imagen = document.getElementById('img');



const pokedex = async (numero) => {
    try {
        const url =`https://pokeapi.co/api/v2/pokemon/${numero}`;
        const respuesta = await fetch(url);
        const pokemon = await respuesta.json();
        
        console.log(pokemon.name);

        const datos = {
            nombre: pokemon.name,
            imagen: pokemon.sprites.other['official-artwork'].front_default,
        }

        console.log(datos.imagen);

        nombrePokemon.textContent = datos.nombre;
        imagen.innerHTML = `
            <img src="${datos.imagen}" alt="imagen de ${datos.nombre}" width="250"/>
        `;
        
        
    } catch (error) {


        
    }
}


formulario.addEventListener('submit',(evento)=>{
    evento.preventDefault();
    const valor=document.getElementById('id1').value;
    console.log(valor);
    pokedex(valor);
    formulario.reset;
})