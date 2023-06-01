/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Fisica fisica = new Fisica("045896584695", "1558888800", LocalDate.of(2000, Month.MARCH, 10), "Bruno", "7185468622");
        Juridica juridica = new Juridica("45.2556-0001-89", "154866", "Silvas", "7133310389");
        
        System.out.println(fisica.toString());
        System.out.println("");
        System.out.println(juridica);
    }
}
