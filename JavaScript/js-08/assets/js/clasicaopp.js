class OperacionesAritmeticas{
    constructor(a,b){
        this._a=a;
        this._b=b;
    }
    get a(){
        return this._a;
    }
    set a(a){
        this._a=a;
    }
    get b(){
        return this._b;
    }
    set b(b){
        this._b=b;
    }
    get sumar(){
        return this._a+this._b;
    }
}

let objeto2=new OperacionesAritmeticas(10,5);
console.log(objeto2);
console.log(objeto2.sumar);

let objeto3=new OperacionesAritmeticas(5,20);
console.log(objeto2);
console.log(objeto2.sumar);