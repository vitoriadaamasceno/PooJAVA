/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corretora;

/**
 *
 * @author damascenovi
 */
public class ClienteEmpregado extends PessoaFisica {

    private double SalarioBase;

    public ClienteEmpregado(double SalarioBase, String nome, String cpf) {
        super(nome, cpf);
        this.SalarioBase = SalarioBase;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    @Override
    public double getValorDoEmprestimo() {
        return SalarioBase * 2;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nValor de Emprestimo: " + Util.formatarValor(getValorDoEmprestimo());
    }

}
