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
public class Hp implements Impressora{

    @Override
    public void imprimir() {
        System.out.println("---Impressora HP---");
        System.out.println("Preparando cartucho ");
        System.out.println("Imprimindo...");
    }
}
