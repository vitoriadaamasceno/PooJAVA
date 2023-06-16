/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autentificacao;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
   public static void main(String[] args){
       System.out.println("Gerente");
       Gerente gerente = new Gerente(Bonificacao.GERENTE, "Bruno", "054665896798", "15885985965", Genero.MASCULINO, 1500, LocalDate.of(1999, Month.MARCH, 5), LocalDate.of(2022, Month.APRIL, 6));
       System.out.println(gerente);
       if (gerente instanceof Autenticavel){
           System.out.println("Acesso Permitido");
       }
       else{
           System.out.println("Acesso negado");
       }
       System.out.println("");
       System.out.println("Motoboy");
       Motoboy motoboy = new Motoboy("558963", "Matheus", "04589685963", "15599855965", Genero.MASCULINO, 500, LocalDate.of(1998, Month.MARCH, 5), LocalDate.of(2020, Month.MARCH, 10));
       System.out.println(motoboy);
       if (motoboy instanceof Autenticavel){
           System.out.println("Acesso Permitido");
       }
       else{
           System.out.println("Acesso negado");
       }
       System.out.println("");
       Direitor direitor = new Direitor(Bonificacao.DIREITOR, "Diego ","48598596385", "1558969815", Genero.MASCULINO, 1200, LocalDate.of(1997, Month.AUGUST, 5), LocalDate.of(2019, Month.MARCH, 8));
       System.out.println(direitor);
       if (direitor instanceof Autenticavel){
           System.out.println("Acesso Permitido");
       }
       else{
           System.out.println("Acesso negado");
       }
   }
}
