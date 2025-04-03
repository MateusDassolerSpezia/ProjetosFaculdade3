/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;



import modelVetor.FilaCheiaException;
import modelVetor.FilaVaziaException;
import modelVetor.FilaVetor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mateus
 */
public class FilaVetorTeste {
    
    @Test
    public void Teste01() {
        FilaVetor fila = new FilaVetor(5);
        assertTrue(fila.estaVazia());
    }
    
    @Test
    public void Teste02() {
        FilaVetor fila = new FilaVetor(5);
        fila.inserir(10);
        assertFalse(fila.estaVazia());
    }
    
    @Test
    public void Teste03() {
        FilaVetor fila = new FilaVetor(10);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        assertEquals(fila.retirar(), 10);
        assertEquals(fila.retirar(), 20);
        assertEquals(fila.retirar(), 30);
        assertTrue(fila.estaVazia());
    }
    
    @Test
    public void Teste04() {
        FilaVetor fila = new FilaVetor(3);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        assertThrows(FilaCheiaException.class, ()->{fila.inserir(40);});
    }
    
    @Test
    public void Teste05() {
        FilaVetor fila = new FilaVetor(3);
        assertThrows(FilaVaziaException.class, ()->{fila.retirar();});
    }
    
    @Test
    public void Teste06() {
        FilaVetor fila = new FilaVetor(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        assertEquals(fila.peek(), 10);
        assertEquals(fila.retirar(), 10);
    }
    
    @Test
    public void Teste07() {
        FilaVetor fila = new FilaVetor(5);
        fila.inserir(10);
        fila.inserir(20);
        fila.inserir(30);
        fila.liberar();
        assertTrue(fila.estaVazia());
    }
    
    @Test
    public void Teste08() {
        
    }
}
