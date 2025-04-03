/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelLista;

import modelVetor.*;

/**
 *
 * @author Mateus
 */
public class PilhaLista<T> implements Pilha<T> {
    
    private ListaEncadeada<T> lista;
    
    @Override
    public void push(T info) {
        lista.inserir(info);
    }
    
    @Override
    public T pop() {
        T valor;
        valor = peek();
        lista.retirar(valor);
        return valor;
    }
    
   @Override
    public T peek() {
        if(estaVazia()) {
            throw new PilhaVaziaException();
        }
        lista.getPrimeiro().getInfo();
        return (T) lista;
    }
    
    @Override
    public boolean estaVazia() {
        return lista.getPrimeiro() == null;
    }
    
    @Override
    public void liberar()  {
        
    }
}
