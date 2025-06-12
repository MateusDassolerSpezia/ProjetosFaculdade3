/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mdspezia
 */
public class OrdenacaoMergeSort<T> extends OrdenacaoAbstract<T> {

    @Override
    public void ordernar() {
        int n = getInfo().length - 1;
        mergeSort(0, n);
    }

    private void mergeSort(int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(inicio, meio);
            mergeSort(meio + 1, fim);
            merge(inicio, fim, meio);
        }
    }

    private void merge(int inicio, int fim, int meio) {
        int tamEsquerda = meio - inicio + 1;
        int esquerda[] = new int[tamEsquerda];
        for (int i = 0; i < tamEsquerda; i++) {
            esquerda[i] = getInfo()[inicio + i];
        }

        int tamDireita = fim - meio;
        int direita[] = new int[tamDireita];
        for (int i = 0; i < tamDireita; i++) {
            direita[i] = getInfo()[meio + 1 + i];
        }

        int cEsq = 0;
        int cDir = 0;

        for (int i = inicio; i <= fim; i++) {
            if (cEsq < tamEsquerda && cDir < tamDireita) {
                if (esquerda[cEsq] < direita[cDir]) {
                    getInfo()[i] = esquerda[cEsq];
                    cEsq++;
                } else {
                    getInfo()[i] = direita[cDir];
                    cDir++;
                }
            } else {
                break;
            }
        }

        int i = inicio + cEsq + cDir;

        while (cEsq < tamEsquerda) {
            getInfo()[i] = esquerda[cEsq];
            cEsq++;
            i++;
        }

        while (cDir < tamDireita) {
            getInfo()[i] = direita[cDir];
            cDir++;
            i++;
        }
    }
}
