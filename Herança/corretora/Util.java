/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corretora;

import java.text.NumberFormat;

/**
 *
 * @author Aluno
 */
public class Util {
    
    public static String formatarValor(double getValorDoEmprestimo){
        NumberFormat formatar = NumberFormat.getCurrencyInstance();
        return formatar.format(getValorDoEmprestimo);
    }
}
