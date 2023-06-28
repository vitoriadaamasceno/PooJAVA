/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Direitor extends Funcionario implements Contratacao{

    private double PREMIO = 0.2;

    public Direitor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase + (salarioBase * PREMIO);
    }

    @Override
    public String toString() {
        return super.toString()+ "\nSalarioFinal = " + getSalarioFinal();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Funcinario admitido:\n" + funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcinario demitido:\n" + funcionario);
    }
    
    

}
