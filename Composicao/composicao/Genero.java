/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private final String nome;

    private Genero(String nome) {
        this.nome = nome;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public String getNome() {
        return nome;
    }
}
