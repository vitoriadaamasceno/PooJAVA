/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impressora;

/**
 *
 * @author Aluno
 */
public class Epson implements Impressora{

    @Override
    public void imprimir() {
        System.out.println("---Impressora Epson---");
        System.out.println("Preparando tonner");
        System.out.println("Imprimindo...");
    }
    
}
