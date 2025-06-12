/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mdspezia
 */
public abstract class OrdenacaoAbstract<T> /*implements Comparable*/ {

    private int[] info;

    public int[] getInfo() {
        return info;
    }

    public void setInfo(int[] info) {
        this.info = info;
    }

    public void trocar(int a, int b) {
        int temp = info[a];
        info[a] = info[b];
        info[b] = temp;
    }

    public abstract void ordernar();
}
