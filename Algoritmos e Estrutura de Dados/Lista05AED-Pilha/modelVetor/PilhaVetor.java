/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelVetor;

/**
 *
 * @author Mateus
 */
public class PilhaVetor<T> implements Pilha<T> {

    private T info[];
    private int limite;
    private int tamanho;

    public PilhaVetor(int limite) {
        this.limite = limite;
        info = (T[]) new Object[limite];
        tamanho = 0;
    }

    @Override
    public void push(T valor) throws PilhaCheiaException {
        if (limite == tamanho) {
            throw new PilhaCheiaException();
        }
        this.info[tamanho] = valor;
        tamanho++;
    }

    @Override
    public T pop() throws PilhaVaziaException {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        T valor;
        valor = peek();
        tamanho--;
        return valor;
    }

    @Override
    public T peek() throws PilhaVaziaException{
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        return this.info[tamanho - 1];
    }

    @Override
    public boolean estaVazia() {
        return tamanho == 0;
    }

    @Override
    public void liberar() {
        tamanho = 0;
        info = (T[]) new Object[limite];
    }

    public String toString() {
        String s = "";
        for (int i = tamanho - 1; i >= 0; i--) {
            s += info[i];
            if (i != 0) {
                s += ", ";
            }
        }
        return s;
    }

    public void concatenar(PilhaVetor<T> p) {
        for (int i = tamanho - 1; i >= 0; i--) {
            this.info[tamanho] = p.pop();
        }
    }
}
