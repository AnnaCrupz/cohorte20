class Persona{
    constructor(nombre,apellido){
        this._nombre=nombre;
        this._apellido=apellido
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre=nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido=apellido;
    }
    get nombreCompleto(){
        return this._nombre+' '+this._apellido;
    }
}

let persona1=new Persona("Juan","Perez");
console.log(persona1);
console.log(persona1.nombre);
persona1.nombre="Juan Carlos";
console.log(persona1.nombre);
console.log(persona1.nombreCompleto);

class Empleado extends Persona{
        constructor(nombre,apellido,empresa){
            super(nombre, apellido); //llama am constructor de la clase padre
            this._empresa=empresa;
        }
        get empresa(){
            return this._empresa=empresa;
        }
        set empresa(empresa){
            this._empresa=empresa;
        }
    }

let empleado1=new Empleado(persona1.nombre,persona1.apellido,"bimbo");
console.log(empleado1);
console.log(empleado1.nombreCompleto);