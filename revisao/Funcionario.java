/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

import java.time.LocalDate;

/**
 *
 * @author damascenovi
 */
public abstract class Funcionario  extends Fisica implements SalarioFinal{
    protected String cpf;
    protected String rg;
    protected String matricula;
    protected Setor_Fisica setor;
    protected double salario;

    public Funcionario(String cpf, String rg, String matricula, Setor_Fisica setor, double salario, Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(genero, estadocivil, dataNascimento, nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
        this.setor = setor;
        this.salario = salario;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Setor_Fisica getSetor() {
        return setor;
    }

    public void setSetor(Setor_Fisica setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCpf=" + cpf + "\nRg = " + rg + "\nMatricula = " + matricula + "\nSetor=" + setor.getNome() + "\nSalario = " + Util.formatarMoney(salario);
    }
    
    
    
   
}
