let constructor=function(){
    valorA=10;
    valorB=20;
    //declarando el objeto
    let persona={
        nombre:'Pedro',
        apellido:'Lara',
        suma: function(valorA,valorB){
            return valorA+valorB;
        },
        get _nombre (){
            return this.nombre;
        },
        set _nombre(nombre){
            this.nombre=nombre;
        }
    }
    return persona;
}

let objeto1=new constructor(10,5)
console.log(objeto1);
console.log(objeto1.nombre);
console.log(objeto1.suma);