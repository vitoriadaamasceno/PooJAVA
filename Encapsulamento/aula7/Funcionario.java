/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    private int id;
    private String nome;
    private String rg;
    private String cpf;
    private String matricula;
    private LocalDate dataNascimento;
    private Genero genero;
    private Setor setor;
    private double salario;
    private String telefone;
    private String email;
    private Endereco endereco;

    public Funcionario(int id, String nome, String rg, String cpf, String matricula, LocalDate dataNascimento, Genero genero, Setor setor, double salario, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.setor = setor;
        this.salario = salario;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
        return "\n Id=" + id +
               "\n Nome=" + nome + 
               "\n Rg=" + rg + 
               "\n Cpf=" + cpf +
               "\n Matricula=" + matricula + 
               "\n DataNascimento=" + dataNascimento + 
               "\n Genero=" + genero.getTexto() +
               "\n setor=" + setor.getNome() + 
               "\n salario=" + salario + 
               "\n Telefone=" + telefone + 
               "\n email=" + email + 
               "\n\n endereco= \n" + endereco;
    }
    
    
}
