var primer = 0,
  segundo = "_",
  cont = 0,
  simbolo = "_",
  eleccion = false;
document.getElementById("prime").innerHTML = primer;
document.getElementById("segund").innerHTML = segundo;
document.getElementById("simbolo").innerHTML = simbolo;

function sumar(elec) {
  if (eleccion == true) {
    segundo = segundo * 10 + elec;
    console.log(segundo);
    document.getElementById("segund").innerHTML = segundo;
    document.getElementById("sn").value = segundo;
  } else {
    segundo = 0;
    primer = primer * 10 + elec;
    console.log(primer);
    document.getElementById("prime").innerHTML = primer;
    document.getElementById("pn").value = primer;
  }
}
function elegir(s) {
  eleccion = true;
  simbolo = s;
  document.getElementById("simbolo").innerHTML = simbolo;

  switch (simbolo) {
    case "+":
      document.getElementById("op").value = "s";
      break;
    case "-":
      document.getElementById("op").value = "r";
      break;
    case "X":
      document.getElementById("op").value = "m";
      break;
    case "/":
      document.getElementById("op").value = "d";
      break;

    default:
      break;
  }
  console.log(document.getElementById("op").value);
}
function borrar() {
  (primer = 0), (segundo = "_"), (simbolo = "_"), (eleccion = false);
  document.getElementById("prime").innerHTML = primer;
  document.getElementById("segund").innerHTML = segundo;
  document.getElementById("simbolo").innerHTML = simbolo;
}
