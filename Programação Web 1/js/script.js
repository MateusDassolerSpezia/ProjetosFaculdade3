document.getElementById('elemento_h3').innerHTML = 'Conteúdo inicial do elemento';

function alteraH3() {
    var vElemento = document.getElementById('elemento_h3');
    vElemento.innerHTML = 'Conteúdo alterado';
}

function alteraEstilo() {
    var vElemento = document.getElementById('elemento_h3');
    vElemento.style.textAlign = 'right';
}

function ativaClasse1() {
    document.getElementById('elemento_h3').classList.add('classe1');
}

function ativaClasse2() {
    document.getElementById('elemento_h3').classList.add('classe2');
}