/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author damascenovi
 */
public class Endereco {
    protected String logadouro;
    protected String numero;
    protected String complemento;
    protected String cidade;
    protected UnidadeFederativa uf;

    public Endereco(String logadouro, String numero, String complemento, String cidade, UnidadeFederativa uf) {
        this.logadouro = logadouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.uf = uf;
    }

    
    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public UnidadeFederativa getUf() {
        return uf;
    }

    public void setUf(UnidadeFederativa uf) {
        this.uf = uf;
    }
    
    @Override
    public String toString() {
        return "\nLogadouro: " + logadouro
                + "\nNumero: " + numero
                + "\nComplemento: " + complemento
                + "\nCidade: " + cidade
                + "\nUF: " + uf.getSigla();
    }
}
