package test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import model.ListaEncadeada;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mateus
 */
public class ListaEncadeadaTeste {

    @Test
    public void Teste1() {
        ListaEncadeada lista = new ListaEncadeada();
        assertTrue(lista.estaVazia());
    }
    
    @Test
    public void Teste2() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        assertFalse(lista.estaVazia());
    }
    
    @Test
    public void Teste3() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
    }
    
    @Test
    public void Teste4() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
    }
    
    @Test
    public void Teste5() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.buscar(20), 3);
    }
    
    @Test
    public void Teste6() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.buscar(15), 3);
    }
    
    @Test
    public void Teste7() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.buscar(50), null);
    }
    
    @Test
    public void Teste8() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(20);
        assertEquals("15, 10, 5", lista.toString());
    }
    
    @Test
    public void Teste9() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        lista.retirar(15);
        assertEquals("20, 10, 5", lista.toString());
    }
    
    @Test
    public void Teste10() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.obterNo(0), 20);
    }
    
    @Test
    public void Teste11() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
    }
    
    @Test
    public void Teste12() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
    }
    
    @Test
    public void Teste13() {
        ListaEncadeada lista = new ListaEncadeada();
        assertEquals(lista.obterComprimento(), 0);
    }
    
    @Test
    public void Teste14() {
        ListaEncadeada lista = new ListaEncadeada();
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        assertEquals(lista.obterComprimento(), 4);
    }
}
