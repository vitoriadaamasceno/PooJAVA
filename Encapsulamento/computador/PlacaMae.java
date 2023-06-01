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
public class PlacaMae {
    private String marca;
    private String modelo;
    private String soquete;

    public PlacaMae(String marca, String modelo, String soquete) {
        this.marca = marca;
        this.modelo = modelo;
        this.soquete = soquete;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSoquete() {
        return soquete;
    }

    public void setSoquete(String soquete) {
        this.soquete = soquete;
    }
    
    
}
