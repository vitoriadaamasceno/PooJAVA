/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulax;

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
        Endereco endereco = new Endereco("Rua alipio dias", "9e", "proximo ao shopping", "Salvador", UnidadeFederativa.BAHIA);
        Advogado adv = new Advogado("1857", "04985869858", "155999988", "113", Setor.JURIDICO, 150, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1999, Month.MARCH, 5), 1, "Maria Vitoria", "71985789586", "maria@gmail.com", endereco);
        System.out.println("Advogado");
        System.out.println(adv);
        System.out.println("");
        Medico medico = new Medico("123", "54765898756", "1589999966", "114", Setor.SAUDE, 15000, Genero.MASCULINO, EstadoCivil.DIVORCIADO, LocalDate.of(1997, Month.APRIL, 15), 2, "Diego Guanabara", "7198547859", "diego@gmail.com", endereco);
        System.out.println("Medico");
        System.out.println(medico);
        System.out.println("");
        System.out.println("Fornecedor");
        Fornecedor fornecedor = new Fornecedor("Roupas", "025-589-0001/13", "1235", 1, "Junior Roupas", "7133310386", "junorroupas@gmail.com", endereco);
        System.out.println(fornecedor);
        System.out.println("");
        System.out.println("Cliente");
        Cliente cliente = new Cliente(1, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1998, Month.FEBRUARY, 17), 1, "Maria Felipa", "7198596258", "mariafelipe@gmail.com", endereco);
        System.out.println(cliente);
    }

}
