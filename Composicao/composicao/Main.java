/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motoboy moto = new Motoboy("155245826", "Diego Pontes", LocalDate.of(1999, Month.MARCH, 5), Genero.FEMININO, Setor.OPERACOES, 1500);
        Direitor direitor = new Direitor("Matheus Fagundes", LocalDate.of(1998, Month.MARCH, 10), Genero.FEMININO, Setor.FINANCEIRO, 4000);
        System.out.println(direitor);
        System.out.println("");
        direitor.admitir(moto);
    }
    
}
