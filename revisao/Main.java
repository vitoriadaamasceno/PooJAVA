/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package revisao;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author damascenovi
 */
public class Main {

    public static void main(String[] args) {
//    JURIDICA    
    PrestacaoServico prestacaoservico = new PrestacaoServico(LocalDate.of(2020, Month.MARCH, 7), LocalDate.of(2022, Month.MARCH, 7), "(000-0-000-000)", "0", "Matheus", "(00) 00000-0000", "matheus@gmail.com", new Endereco("Rua 1", "1", "1", "Salvador", UnidadeFederativa.BAHIA));
    Fornecedor fornecedor = new Fornecedor(Setor_Juridica.TECNOLOGIA, new Produto("Celular", "Z", 7000), "00000-00000-000", "1", "Kay", "(00)00000-0000", "kay@gmail.com", new Endereco("Rua 1", "1", "1", "Salvador", UnidadeFederativa.BAHIA));
    
     
        System.out.println(prestacaoservico);
        
        System.out.println(fornecedor);
        
        
        
//    FISICA
     
    Cliente cliente = new Cliente(2, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2003, Month.JUNE, 6), "Ana", "(00) 00000-0000", "Ana@gmail.com", new Endereco("Rua 1", "1", "1", "Salvador", UnidadeFederativa.BAHIA));
        System.out.println("Cliente:");
        System.out.println(cliente);

        
    Direitor direitor = new Direitor("000-000-000-00", "000000000", "1", Setor_Fisica.ENGENHARIA, 1000, Genero.MASCULINO, EstadoCivil.SEPARADO, LocalDate.of(2002, Month.JUNE, 6), "Macita", "(00) 0000-0000", "Macita@gmail.com", new Endereco("Rua 1", "1", "1", "Salvador", UnidadeFederativa.BAHIA));
    Engenheiro engenheiro = new Engenheiro("3", "000.000.000-00", "000.000.0.0.0", "2", Setor_Fisica.ENGENHARIA, 1000, Genero.FEMININO, EstadoCivil.SOLTEIRO, LocalDate.of(2001, Month.JUNE, 6), "Marcia", "(00) 0000-0000", "Marcia@gmail.com",new Endereco("Rua 1", "1", "1", "Salvador", UnidadeFederativa.BAHIA));
    Motoboy motoboy = new Motoboy("5555", "000.000.000-00", "00000000", "5", Setor_Fisica.OPERACOES, 1000, Genero.MASCULINO, EstadoCivil.VIUVO, LocalDate.of(2000, Month.JUNE, 6), "Justin", "(00) 0000-0000", "justin@gmail.com",new Endereco("Rua 1", "1", "1", "Salvador", UnidadeFederativa.BAHIA));
        
        System.out.println(direitor);
        
        System.out.println("");
    direitor.demitir(engenheiro);
        System.out.println("");
     System.out.println("ADMITINDO E DEMITINDO MOTOBOY");
    direitor.admitir(motoboy);
        System.out.println("");
    direitor.demitir(motoboy);
    

    }
}
