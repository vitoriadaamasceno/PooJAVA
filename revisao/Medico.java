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
public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor_Fisica setor, double salario, Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadocivil, dataNascimento, nome, telefone, email, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }
    @Override
    public String toString() {
        return "\nMedico" + "\nCrm=" + crm + "\nSalario = " +  Util.formatarMoney(getSalarioFinal());
    }

    
    
}
