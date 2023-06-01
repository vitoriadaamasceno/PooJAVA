/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Genero genero;
    protected Setor setor;
    protected double salarioBase;
    protected LocalDate dataAdmissao;
    


    public Funcionario(String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.setor = setor;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }
    
    public abstract double getSalarioFinal();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "\nNome= " + nome + "\nCpf=" + cpf + "\nRg=" + rg + "\nGenero=" + genero + "\nSetor=" + setor + "\nSalarioBase=" + salarioBase + "\nDataAdmissao=" + dataAdmissao;
    }
    
    
    
}
