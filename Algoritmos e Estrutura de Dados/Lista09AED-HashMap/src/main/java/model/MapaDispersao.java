/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mdspezia
 */
public class MapaDispersao<T> {

    private ListaEncadeada<NoMapa<T>>[] info;

    public MapaDispersao(int tamanho) {
        this.info = new ListaEncadeada[tamanho];
    }

    private int calcularHash(int chave) {
        int tamanho = info.length;
        return chave % tamanho;
    }

    public void inserir(int chave, T dado) {
        int indice = calcularHash(chave);

        if (info[indice] == null) {
            info[indice] = new ListaEncadeada<>();
        }
        NoMapa noMapa = new NoMapa();
        noMapa.setChave(chave);
        noMapa.setInfo(dado);

        info[indice].inserir(noMapa);
    }

    public void remover(int chave) {
        int indice = calcularHash(chave);
        
        if (info[indice] == null) {
            throw new RuntimeException("Essa chave não existe");
        }
        
        NoMapa noMapa = new NoMapa();
        noMapa.setChave(chave);

        info[indice].retirar(noMapa);
    }

    public T buscar(int chave) {
        int indice = calcularHash(chave);

        if (info[indice] != null) {
            NoMapa<T> noMapa = new NoMapa<>();
            noMapa.setChave(chave);

            NoLista<NoMapa<T>> no = info[indice].buscar(noMapa);
            if (no != null) {
                return no.getInfo().getInfo();
            }
        }
        return null;
    }
}
