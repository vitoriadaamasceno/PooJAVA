/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corretora;

/**
 *
 * @author damascenovi
 */
public class ClienteCargodeChefia extends PessoaFisica{
    private double salarioBase;
    private double BONUS = 0.3;

    public ClienteCargodeChefia(double salarioBase, String nome, String cpf) {
        super(nome, cpf);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBONUS() {
        return BONUS;
    }

    public void setBONUS(double BONUS) {
        this.BONUS = BONUS;
    }
    
    @Override
    public double getValorDoEmprestimo() {
        return salarioBase*2 + (salarioBase*BONUS);
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nValor de Emprestimo: " + Util.formatarValor(getValorDoEmprestimo());
    }
    
}
