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
public class PilhaVaziaException extends RuntimeException {

    public PilhaVaziaException() {
        super("Pilha está vazia");
    }
    
}
