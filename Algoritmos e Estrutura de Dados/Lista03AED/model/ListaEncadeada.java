/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mdspezia
 */
public class ListaEncadeada<T> {

    private NoLista primeiro;

    public ListaEncadeada() {
        primeiro = null;
    }

    public NoLista getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {
        NoLista novo = new NoLista();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        primeiro = novo;
    }

    public Boolean estaVazia() {
        return (primeiro == null);
    }

    public NoLista buscar(T info) {
        NoLista p = primeiro;
        while (p != null) {
            if (p.getInfo() == info) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T info) {
        NoLista anterior = null;
        NoLista p = primeiro;

        while (p != null && p.getInfo() != info) {
            anterior = p;
            p = p.getProximo();
        }
        if (p != null) {
            if (p == primeiro) {
                primeiro = p.getProximo();
            }
            anterior.setProximo(p.getProximo());
        }
    }

    public int obterComprimento() {
        return 0;
    }

    public NoLista obterNo(int idx) {
        return null;
    }

    public String toString() {
        NoLista p = primeiro;
        while (p != null) {
            System.out.println(p.getInfo());
            while (p.getProximo() != null) {
                System.out.println(", ");
            }
            p = p.getProximo();
        }
        return null;
    }

}
