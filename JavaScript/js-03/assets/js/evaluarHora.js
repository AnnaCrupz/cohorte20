let hora= 1;
/*Number(prompt("Ingresa la hora"));*/

if (hora>=6 && hora<=11) {
    document.write("Buenos dias")
} else if(hora>=12 && hora<=18){
    document.write("Buenas tardes")
}  else if(hora>=19 && hora<=23){
    document.write("Buenas noches")
}  else if(hora>=0 && hora<=5){
    document.write("Dejame dormir")
} else{
    document.write("Algo malió sal")
}

document.write("<br>")


let dia=5;
switch (dia) {
    case 1:
        document.write("Lunes")
        break;
    case 2:
        document.write("Martes")
        break;
    case 3:
        document.write("Miercoles")
        break;
    case 4:
        document.write("Jueves")
        break;
    case 5:
        document.write("Viernes")
        break;
    case 6:
        document.write("Sabado")
        break;
    case 7:
        document.write("Sabado")
        break;
    default:
        break;
}
