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
public class Gerente extends CargodeConfianca implements Autenticavel{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }
    
    @Override
    public double getSalarioFinal() {
        return salarioBase + (salarioBase*super.bonificacao.GERENTE.valor);
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nSalario Final= " + Util.formatarMonetario(getSalarioFinal());
    }
    
    
}
