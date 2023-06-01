/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    private int codigoFuncionario;
    private String nome;
    private String endereço;
    private double telefone;
    private String email;
    private Banco contaBanco;

    public Funcionario(int codigoFuncionario, String nome, String endereço, double telefone, String email, Banco contaBanco) {
        this.codigoFuncionario = codigoFuncionario;
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.contaBanco = contaBanco;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Banco getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(Banco contaBanco) {
        this.contaBanco = contaBanco;
    }

}
