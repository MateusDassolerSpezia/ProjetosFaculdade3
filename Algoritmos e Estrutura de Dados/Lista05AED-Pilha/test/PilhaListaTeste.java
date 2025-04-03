/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import modelLista.PilhaLista;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mateus
 */
public class PilhaListaTeste {
    
    /*private static PilhaLista pilha;
    
    @BeforeEach
    public void setUp() {
        pilha = new PilhaLista();
    }*/
    
    @Test
    public void Test01() {
        PilhaLista pilha = new PilhaLista();
        assertTrue(pilha.estaVazia());
    }
    
    @Test
    public void Test02() {
        PilhaLista pilha = new PilhaLista();
        assertFalse(pilha.estaVazia());
    }
    
    @Test
    public void Test03() {
        PilhaLista pilha = new PilhaLista();
        assertTrue(pilha.estaVazia());
    }
    
    @Test
    public void Test04() {
        PilhaLista pilha = new PilhaLista();
        assertTrue(pilha.estaVazia());
    }
    
    @Test
    public void Test05() {
        PilhaLista pilha = new PilhaLista();
        assertTrue(pilha.estaVazia());
    }
}
    
