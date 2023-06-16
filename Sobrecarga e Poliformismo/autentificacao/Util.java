/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autentificacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.NumberFormat;

/**
 *
 * @author Aluno
 */
public class Util {
    
    public static String formatarData(LocalDate dataNascimento){
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return formatar.format(dataNascimento);
    }
    public static String formatarMonetario(double salarioBase){
        NumberFormat formatar = NumberFormat.getCurrencyInstance();
        return formatar.format(salarioBase);
    }
}
