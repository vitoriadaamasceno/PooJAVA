/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrescrita;

public class Main {

    public static void main(String[] args) {
      Soma soma = new Soma();
      Subtracao sub = new Subtracao();
      Multiplicacao mult = new Multiplicacao();
      
        System.out.println("Operaçao Matematica");
        System.out.println(soma.calcular(8.5,10));
        System.out.println(sub.calcular(20,10));
        System.out.println(mult.calcular(2,10));
    }
    
}
