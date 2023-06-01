/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {

    /**
     *
     */
    BAHIA("Bahia","BA"),
    SAO_PAULO("São Paulo","SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");

    private final String nome;
    private final String sigla;

    private UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    
    
 
}
