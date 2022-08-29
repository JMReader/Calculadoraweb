var primer = 0, segundo=0, cont =0, simbolo = "+", eleccion = false;


document.getElementById('prime').innerHTML = primer;
document.getElementById("segund").innerHTML = segundo;
document.getElementById("simbolo").innerHTML = simbolo;

function sumar(){
primer = primer + 1;
console.log(primer);
document.getElementById('prime').innerHTML = primer;
}
function elegir(s){
 simbolo = s;
 document.getElementById("simbolo").innerHTML = simbolo;
}