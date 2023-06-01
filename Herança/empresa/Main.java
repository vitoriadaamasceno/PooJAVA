/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

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
       Motoboy motoboy = new Motoboy("CPO7895", "Pontes", "04989784785", "78498755596", Genero.MASCULINO, Setor.OPERACOES, 2000, LocalDate.of(2000, Month.MARCH, 7));
        System.out.println(motoboy);
        System.out.println("");
        Direitor direitor = new Direitor(Bonificacao.DIREITOR,"Maria", "04985798598", "1449999900", Genero.FEMININO, Setor.SAUDE,3000, LocalDate.of(1999, Month.MARCH, 9));
        System.out.println(direitor);
        System.out.println("");
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Matheus", "47869865789", "1886666600", Genero.FEMININO, Setor.FINANCEIRO, 4000, LocalDate.of(2001, Month.APRIL, 5));
        System.out.println(gerente);
    }  
    
}
