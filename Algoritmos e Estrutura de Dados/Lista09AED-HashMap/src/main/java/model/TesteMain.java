/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author mdspezia
 */
public class TesteMain {
    public static void main(String[] args) {
        MapaDispersao<Aluno> mapa = new MapaDispersao(53);
        Aluno ob1 = new Aluno(12000, "Jean", LocalDate.of(2000, Month.JANUARY, 1));
        mapa.inserir(12000, ob1);
        System.out.println(mapa.buscar(12000).getNome());
    }
}
