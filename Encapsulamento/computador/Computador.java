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
public class Computador {

        private Memoria memoria;
        private PlacaMae placamae;
        private DispositivoArmazenamento dispositivoArmazenamento;
        private Processador processador;

    public Computador(Memoria memoria, PlacaMae placamae, DispositivoArmazenamento dispositivoArmazenamento, Processador processador) {
        this.memoria = memoria;
        this.placamae = placamae;
        this.dispositivoArmazenamento = dispositivoArmazenamento;
        this.processador = processador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public PlacaMae getPlacamae() {
        return placamae;
    }

    public void setPlacamae(PlacaMae placamae) {
        this.placamae = placamae;
    }

    public DispositivoArmazenamento getDispositivoArmazenamento() {
        return dispositivoArmazenamento;
    }

    public void setDispositivoArmazenamento(DispositivoArmazenamento dispositivoArmazenamento) {
        this.dispositivoArmazenamento = dispositivoArmazenamento;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

}
