var contador = 0;
setInterval(() =>  {
    document.getElementById('contador').innerHTML = "Contador: " + contador;
    contador++;
}, 1000);