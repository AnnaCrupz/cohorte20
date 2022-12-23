import userEvent from "@testing-library/user-event";
import React from "react";

const Componente=()=>{
    let nombre="PedroQueGustoDeVerte";
    let pass="1234";
    let usuario={
        name:"Pedro",
        age:"18"
    }
    /* Esto es un comentario en React */
    return(
        <>
    <header>
        <p>Este es el primer componente</p>
        <ul>
            <li>Hola</li>
            <li>Adios</li>
        </ul>
        <p>Segunda lista</p>
        <ul>
        <li>Nombre: {nombre}</li>
            <li>Pass: {pass}</li>
        </ul>
        <p>Otra lista</p>
        <ul>
        <li>Name: {usuario.name}</li>
            <li>Age: {usuario.age}</li>
        </ul>
    </header>
    </>
    )
}
export default Componente
