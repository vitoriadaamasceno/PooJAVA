/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package televisaoo;

/**
 *
 * @author damascenovi
 */
public class Televisao {

    private boolean ligada;
    private int canal;
    private int volume;

    public Televisao() {
        this.ligada = false;
        this.canal = 1;
        this.volume = 0;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void Ligar() {
        ligada = true;
        System.out.println("A TV esta ligada");
    }

    public void Desligar() {
        ligada = false;
        canal = 1;
        volume = 0;
        System.out.println("A TV foi desligada , Volume: " + this.volume + " e no Canal: " + canal);
    }

    public void AlterarCanal(int canal) {
        switch (canal) {
            case 1:
                System.out.println("Alterado para canal 1");
                break;
            case 3:
                System.out.println("Alterado para canal 3");
                break;
            case 5:
                System.out.println("Alterado para canal 5");
                break;
            case 7:
                System.out.println("Alterado para canal 7");
                break;
            case 11:
                System.out.println("Alterado para canal 11");
                break;
            default:
                System.out.println("Canal nao existe");
                break;
        }

    }
    
    public void AumentarVolume(){
        if(ligada== true){
            volume ++;
            System.out.println("Aumentar volume ++ :" + volume);
        }else{
            System.out.println("Tv esta desligada");
        }
    }
    
        public void DiminuirVolume(){
        if(ligada== true){
            volume --;
            System.out.println("Diminuir Volume -- :" + volume);
        }else{
            System.out.println("Tv esta desligada");
        }
    }

}
