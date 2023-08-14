/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package televisaoo;

/**
 *
 * @author damascenovi
 */
public class Main {

    public static void main(String[] args) {
        Televisao TVsala = new Televisao();
        Televisao TVquarto = new Televisao();
        
        TVsala.Desligar();
        TVsala.AlterarCanal(7);
        TVsala.AumentarVolume();
        TVsala.DiminuirVolume();
        
        TVquarto.Ligar();
        TVquarto.AlterarCanal(5);
        TVquarto.AumentarVolume();
        TVquarto.AumentarVolume();
        TVquarto.AumentarVolume();
        TVquarto.DiminuirVolume();
        
        
    }
}
