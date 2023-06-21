/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogo;

/**
 *
 * @author damascenovi
 */
public class Main {
    public static void main(String[] args) {
        
        Videogame video = new Videogame();
        video.ligar();
        Xadrez xadrez = new Xadrez();
        //xadrez.jogar();
        video.jogar(xadrez);
        video.desligar();
    }
}
