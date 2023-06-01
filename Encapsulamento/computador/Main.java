/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computador;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Processador processador = new Processador("Daten", "A575", "85");
        PlacaMae placaMae = new PlacaMae("NOC", "B856", "85"); 
        Memoria memoria = new Memoria("LG", "C586", 150.0);
        DispositivoArmazenamento dispositivoArmazenamento = new DispositivoArmazenamento("Darzen","D563",200.0);
        
        Computador computador = new Computador(memoria,placaMae,dispositivoArmazenamento,processador);
        
        System.out.println("Marca do Processador: "+ computador.getProcessador().getMarca());
        System.out.println("Marca do Memoria: "+ computador.getMemoria().getMarca());
        System.out.println("Marca do Placa Mãe: "+ computador.getPlacamae().getMarca());
        System.out.println("Marca do Dispositivo de Armazenamento: "+ computador.getDispositivoArmazenamento().getMarca());
    }
}
