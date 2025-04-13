/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mateus
 */
public class ArvoreBinaria<T> {

    private NoArvoreBinaria raiz;

    public ArvoreBinaria() {
        raiz = null;
    }

    public void setRaiz(NoArvoreBinaria raiz) {
        this.raiz = raiz;
    }

    public boolean estaVazia() {
        return raiz == null;
    }

    public boolean pertence(T info) {
        return pertence(raiz, info);
    }

    private boolean pertence(NoArvoreBinaria no, T info) {
        if (no == null) {
            return false;
        } else {
            return no.getInfo() == info || pertence((T) no.getEsquerda().getInfo()) || pertence((T) no.getDireita().getInfo());
        }
        /* (no.info = info)
ou pertence(no.esq, info)
ou pertence(no.dir, info);
         */
    }

    @Override
    public String toString() {
        return null;
    }

    private String arvorePre(NoArvoreBinaria no) {
        return null;
    }

    public int contarNos() {
        return 0;
    }

    private int contarNos(NoArvoreBinaria no) {
        return 0;
    }
}
