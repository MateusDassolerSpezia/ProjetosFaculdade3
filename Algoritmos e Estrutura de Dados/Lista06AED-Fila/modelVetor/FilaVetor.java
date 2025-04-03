/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelVetor;

/**
 *
 * @author Mateus
 */
public class FilaVetor<T> implements Fila<T> {

    private T[] info;
    private int limite;
    private int tamanho;
    private int inicio;

    public FilaVetor(int limite) {
        this.limite = limite;
        info = (T[]) new Object[limite];
        tamanho = 0;
        inicio = 0;
    }

    @Override
    public void inserir(T valor) throws FilaCheiaException {
        if (limite == tamanho) {
            throw new FilaCheiaException();
        }
        int posicaoInserir;
        posicaoInserir = (inicio + tamanho) % limite;
        info[posicaoInserir] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public T peek() throws FilaVaziaException {
        if (estaVazia()) {
            throw new FilaVaziaException();
        }
        return info[inicio];
    }

    @Override
    public T retirar() {
        T valor = peek();
        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    @Override
    public void liberar() {
        info = (T[]) new Object[limite];
        tamanho = 0;
    }

    public FilaVetor criarFilaConcatenada(FilaVetor f2) {
        return null;
    }
    
    public String toString() {
        String s = "";
        for (int i = inicio; i < tamanho; i++) {
            s += info[i];
            if (i < tamanho - 1) {
                s += ", ";
            }
        }
        return s;
    }

    public int getLimite() {
        return limite;
    }
    
}
