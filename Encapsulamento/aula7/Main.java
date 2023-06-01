/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

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
        Endereco endereco = new Endereco("Rua alimpio", "9", "Proximo ao bar", "485968", "Salvador", UnidadeFederativa.BAHIA);
        Funcionario funcionario = new Funcionario (78, "Pontes", "1558888800", "049.695.659-89", "2158953", LocalDate.of(2023,Month.APRIL, 10), Genero.FEMININO, Setor.JURIDICO, 155.00, "7198525644", "damasceno@gmail.com", endereco);
        
        System.out.println(funcionario);
  }
}