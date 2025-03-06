/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mdspezia
 */
public class ListaDupla<T> {

    private NoListaDupla primeiro;

    public ListaDupla() {
        primeiro = null;
    }

    public NoListaDupla getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {
        NoListaDupla novo = new NoListaDupla();
        novo.setInfo(valor);
        novo.setProximo(primeiro);
        novo.setAnterior(null);
        if (primeiro != null) {
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
    }

    public NoListaDupla buscar(T valor) {
        NoListaDupla no = primeiro;
        while (no != null) {
            if (no.getInfo() == valor) {
                return no;
            }
            no = no.getProximo();
        }
        return null;
    }

    public void retirar(T valor) {
        NoListaDupla no = buscar(valor);
        if (no != null) {
            if (primeiro == no) {
                primeiro = no.getProximo();
            } else {
                no.getAnterior().setProximo(no.getProximo());
            }
        }
        if (no.getProximo() != null) {
            no.getProximo().setAnterior(no.getAnterior());
        }
    }

    public void exibirOrdemInversa() {
        NoListaDupla no = primeiro;
        while (no != null) {
            
            no = no.getProximo();
        }
    }

    public void liberar() {
        NoListaDupla no = primeiro;
        while (no != null) {
            no.setProximo(null);
            no.setAnterior(null);
            no = no.getProximo();
        }
    }

    public String toString() {
        String S = "";
        NoListaDupla p = primeiro;
        while (p != null) {
            S += p.getInfo();
            if (p.getProximo() != null) {
                S += (", ");
            }
            //p.setProximo(p.getProximo());
            p = p.getProximo();
        }
        return S;
    }
}
