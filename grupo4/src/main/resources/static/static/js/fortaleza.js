function calcFort(passId, fortId) {
    let contrasenia = document.getElementById(passId).value;

    // obtengo la cantidad de caracteres que tiene contrasenia
    let cantCar = contrasenia.length;
    let fort, color;

    if (cantCar >= 0 && cantCar <= 4) {
        fort = "Baja";
        color = "red";
    } else if (cantCar >= 5 && cantCar <= 8) {
        fort = "Media";
        color = "yellow";
    } else {
        fort = "Alta";
        color = "green";
    }

    document.getElementById(fortId).innerHTML = fort;
    document.getElementById(fortId).style.backgroundColor = color;
}

function verPass(passId) {
    let passField = document.getElementById(passId);
    if (passField.type === "password") {
        passField.type = "text";
    } else {
        passField.type = "password";
    }
}
