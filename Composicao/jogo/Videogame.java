/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package jogo;

/**
 *
 * @author damascenovi
 */
public class Videogame {
    private Jogo jogo;

//getter e setter
    public Jogo getJogo() {
        return jogo;
    }
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    //metodos
    public void ligar(){
        System.out.println("Ligado");
    }
        
    public void jogar(Jogo jogo){
        System.out.println("jogando " + jogo.toString());
    }
    
        
    public void fechar(){
        System.out.println("Fechado");
    }
    
        
    public void desligar(){
        System.out.println("VideoGame Desligado");
    }


}
