const elemento1=document.getElementById('titulo');
console.log(elemento1);
const parrafo1=document.getElementsByClassName('parrafo1')
console.log(parrafo1[1].outerText);

elemento1.textContent="Hola";
parrafo1.textContent="Cambio parrafo";
console.log(elemento1.textContent);
console.log(parrafo1.textContent);
/*
parrafo1[1].style.color='blue';
parrafo1[0].style.backgroundColor='cyan';
*/

console.log(parrafo1[1].classList.contains('colores feos'));
parrafo1[1].classList.add('coloresFeos')

const enlace=document.createElement("a")
enlace.href="https://www.google.com";
enlace.textContent='Ir a Google';
console.log(enlace);

document.body.appendChild(enlace);
console.log(document.body);

//document.body.insertAdjacentElement(pos, elem)

const padre=document.getElementById('padre');
padre.appendChild(enlace);