/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package revisao;

/**
 *
 * @author damascenovi
 */
public enum Genero {
    MASCULINO('M', "Masculino"),
    FEMININO('F', "Feminino");

    protected char caractere;
    protected String nome;

    private Genero(char caractere, String nome) {
        this.caractere = caractere;
        this.nome = nome;
    }

    public char getCaractere() {
        return caractere;
    }

    public String getNome() {
        return nome;
    }

}
