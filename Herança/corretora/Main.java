/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package corretora;

/**
 *
 * @author damascenovi
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Tipos de Emprestimos");        
        System.out.println("");
        System.out.println("Cliente tipo 1 - Comum:");
        ClienteComum clientecomum = new ClienteComum("Maria Vitoria", "049859889689");
        System.out.println(clientecomum);
        System.out.println("");
        System.out.println("Cliente tipo 2- Empregado:");
        ClienteEmpregado clienteEmpregado = new ClienteEmpregado(1000, "Anita Gabriele", "045896988255");
        System.out.println(clienteEmpregado);
        System.out.println("");
        System.out.println("Cliente tipo 3 - Cargo de Chefia");
        ClienteCargodeChefia clienteChefia = new ClienteCargodeChefia(1000, "Bruna Silva", "18498522889");
        System.out.println(clienteChefia);
        
    }
}
