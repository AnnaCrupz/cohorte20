let imagen=document.getElementsByClassName("contenedor")[0];
const nuevaImg=document.createElement("img");
nuevaImg.src="https://placeimg.com/640/480/tech/grayscale";
nuevaImg.alt="imagen_dummy";
//Insertar elemento
imagen.appendChild(nuevaImg);

//otra forma

const img2=document.getElementById("img");
img2.innerHTML=`<img src="https://placeimg.com/640/480/tech/grayscale" />`


const arreglo=["Juan","Anna","Josué"];
const agregar=document.getElementById("lista");

const lista=document.createElement("ul")
agregar.appendChild(lista)

arreglo.forEach(element => {
    const li = document.createElement("li");
    li.textContent=element;
    lista.appendChild(li)
});

const frutas=["manzana","platano","guayaba"];
const list2=document.getElementById("lista2");

frutas.forEach(element => {
    list2.innerHTML+=`<li>${element}</li>`;
});