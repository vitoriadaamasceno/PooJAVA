/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autentificacao;

/**
 *
 * @author Aluno
 */
public enum Bonificacao {
    GERENTE(0.2),
    DIREITOR(0.4);

    protected double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
