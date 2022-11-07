//Las clases son plantillas
//Un objeto es una instancia de una clase
class PersonaClass{ //Todas las clases extienden de la clase padre
    constructor(nombre,apellido){
        this._nombre=nombre;
        this._apellido=apellido;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido=apellido;
    }
    nombreCompleto(){
        return this._nombre+' '+this._apellido;
    }
    toString(){
        return this.nombreCompleto();
    }
}
let persona1=new PersonaClass("Juan","Acosta"); //JavaScript guarda un espacio en memoria
console.log(persona1);
console.log(persona1.nombre); //Manda llamar directamente get
persona1.nombre="Juan Carlos";
console.log(persona1.nombre);
//Hoisting: llamar una función antes de ser definida, en las clases no funciona
console.log(persona1.toString()); //Aplica polimorfismo
//Herencia
class Empleado extends PersonaClass{
    constructor(nombre,apellido,departamento){
        super(nombre, apellido); //llama am constructor de la clase padre
        this._departamento=departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento=departamento;
    } //Sobreescritura modifica el comportamiento definido de la clase padre
    nombreCompleto(){
        return super.nombreCompleto() +', '+this._departamento
    }
}
//crear un objeto de la clase que hereda
let empleado1=new Empleado('Diana','Sandoval','Arquitectura');
console.log(empleado1);
console.log(empleado1.apellido);
console.log(empleado1.nombreCompleto());
console.log(empleado1.toString());
//polimorfismo: lo que se manda llamar depende del clase con que se este apuntando multiples formas en tiempo de ejecución
