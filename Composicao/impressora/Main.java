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
public class Main {
    public static void main(String[] args) {
        ImpressoraLocal impressoralocal = new ImpressoraLocal();
        
        impressoralocal.instalar(new Hp());
        impressoralocal.imprimir();
    }
}
