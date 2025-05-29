/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;


import java.time.LocalDate;
import java.time.Month;
import model.Aluno;
import model.MapaDispersao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mdspezia
 */
public class MapaDispersaoTeste {
    
    private static MapaDispersao<Aluno> mapa;
    
    @BeforeEach
    public void setUp() {
        mapa = new MapaDispersao(53);
    }

    @Test
    public void Teste01() {
        Aluno ob1 = new Aluno(12000, "Jean", LocalDate.of(2000, Month.JANUARY, 1));
        mapa.inserir(12000, ob1);
        assertTrue(mapa.buscar(12000).equals(ob1));
    }
    
    @Test
    public void Teste02() {
        
    }
    
    @Test
    public void Teste03() {
        
    }
}
