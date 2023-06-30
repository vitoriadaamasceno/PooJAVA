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
public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String crea, String cpf, String rg, String matricula, Setor_Fisica setor, double salario, Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadocivil, dataNascimento, nome, telefone, email, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }
    
    @Override
    public double getSalarioFinal() {
        return salario;
    }
    @Override
    public String toString() {
        return "\nEngenheiro" + super.toString() + "\nCrea=" + crea + "\nSalario = " + Util.formatarMoney(getSalarioFinal());
    }


    
    
}
