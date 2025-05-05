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

function criaParagrafo() {
    var vNovoParagrafo = document.createElement('p');
    vNovoParagrafo.innerHTML = 'Novo parágrafo';
    var vElementoPai = document.getElementById('novoP');
    vElementoPai.appendChild(vNovoParagrafo);
}

function criaTarefa() {
    var vElementoInput = document.getElementById('itemTarefa');
    var vElementoLista = document.getElementById('listaTarefas');
    var vItemLista = document.createElement('li');
    vItemLista.innerHTML = vElementoInput.value;
    vElementoLista.appendChild(vItemLista);

    vElementoInput.value = '';
    vElementoInput.focus();
}

function criaInicio() {
    var vElementoInput = document.getElementById('itemTarefa');
    var vElementoLista = document.getElementById('listaTarefas');
    var vItemLista = document.createElement('li');
    vItemLista.innerHTML = vElementoInput.value;

    vElementoLista.insertBefore(vItemLista, vElementoLista.firstChild);

    vElementoInput.value = '';
    vElementoInput.focus();
}