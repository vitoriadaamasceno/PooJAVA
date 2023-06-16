/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autentificacao;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Direitor extends CargodeConfianca implements Autenticavel {

    private double PREMIO = 0.1;

    public Direitor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase + (salarioBase+super.bonificacao.DIREITOR.valor)+ (salarioBase*PREMIO);
    }

    @Override
    public String toString() {
        return  super.toString()+
                "\nSalario Final= "+ Util.formatarMonetario(getSalarioFinal());
    }

}
