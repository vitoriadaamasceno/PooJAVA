/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogame;

/**
 *
 * @author Aluno
 */
public class VideoGame {

    private Jogo jogo;

    public void ligar() {
        System.out.println("Ligado");
    }

    public void jogar(Jogo jogo) {
        this.jogo = jogo;
        jogo.jogar();
    }

    public void fechar() {
        this.jogo.fechar();
    }

    public void desligar() {
        
        System.out.println("Desligar");
    }

}
