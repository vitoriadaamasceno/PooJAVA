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
public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String telefone;
    protected String email;
    protected Endereco endereco;

    public Pessoa(int id, String nome, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "\nPessoa= " + 
               "\nID: " + id + 
               "\nNome: " + nome + 
               "\nTelefone: " + telefone + 
               "\nEmail:" + email +
               "\n Endereço=" + endereco;
    }

}
