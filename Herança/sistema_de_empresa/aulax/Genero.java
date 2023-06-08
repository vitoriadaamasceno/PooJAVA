/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulax;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO('M',"Masculino"),
    FEMININO('F',"Feminino");
    
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
