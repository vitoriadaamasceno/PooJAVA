/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.time.LocalDate;

/**
 *
 * @author damascenovi
 */
public class Direitor extends CargodeConfianca{
    private final double premio = 0.1;
    
    public Direitor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalarioFinal() {
        double salarioAcrescimo= salarioBase + (salarioBase *Bonificacao.DIREITOR.getValor());
        return salarioAcrescimo+(salarioBase*premio);
    }
    @Override
    public String toString() {
        return super.toString() +
                "\nSalario Final = " + getSalarioFinal();
    }
}
