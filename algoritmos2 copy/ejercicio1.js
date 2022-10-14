let num1=parseInt(prompt("Ingresa el primer numero"))
let num2=parseInt(prompt("Ingresa el segundo numero"))
let num3=parseInt(prompt("Ingresa el tercer numero"))

function numeroMayor(){
    if (num1<num2 && num1<num3) {
        if(num2<num3){
            ordenMayor= [num1,num2,num3]
            ordenMenor= [num3,num2,num1]
        } else{
            ordenMayor= [num1,num3,num2]
            ordenMenor= [num2,num3,num1]
        }
    } else if(num2<num1 && num2<num3){
        if(num1<num3){
            ordenMayor= [num2,num1,num3]
            ordenMenor= [num3,num1,num2]
        } else{
            ordenMayor= [num2,num3,num1]
            ordenMenor= [num1,num3,num2]
        }
    } else if(num3<num2 && num3<num1){
        if(num1<num2){
            ordenMayor= [num3,num1,num2]
            ordenMenor= [num2,num1,num3]
        } else{
            ordenMayor= [num3,num2,num1]
            ordenMenor= [num1,num2,num3]
        }
    } 
     else {
        orden= "Error al ingresar numeros"
        }
    return alert(ordenMenor+"\n"+ordenMayor);
    }

    numeroMayor()