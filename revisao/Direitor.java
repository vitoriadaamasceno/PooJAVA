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
public class Direitor extends Funcionario implements Contratacao {

    private double PREMIO = 0.2;

    public Direitor(String cpf, String rg, String matricula, Setor_Fisica setor, double salario, Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadocivil, dataNascimento, nome, telefone, email, endereco);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        return super.salario + (super.salario * PREMIO);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Funcionario Admitido:\n" + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcionario demitido" + funcionario.getNome());
    }

    @Override
    public String toString() {
        return "\nDireitor" + super.toString() + "\nPREMIO=" + (PREMIO * 100) + "%" + "\nSalario = " +  Util.formatarMoney(getSalarioFinal());
    }

}
