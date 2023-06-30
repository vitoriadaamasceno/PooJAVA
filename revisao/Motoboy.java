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
public class Motoboy extends Funcionario {

    private String carteiradeHabilitacao;

    public Motoboy(String carteiradeHabilitacao, String cpf, String rg, String matricula, Setor_Fisica setor, double salario, Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadocivil, dataNascimento, nome, telefone, email, endereco);
        this.carteiradeHabilitacao = carteiradeHabilitacao;
    }

    public String getCarteiradeHabilitacao() {
        return carteiradeHabilitacao;
    }

    public void setCarteiradeHabilitacao(String carteiradeHabilitacao) {
        this.carteiradeHabilitacao = carteiradeHabilitacao;
    }

    @Override
    public double getSalarioFinal() {
        return salario;
    }

    @Override
    public String toString() {
        return "\nMotoboy"+  super.toString() + "\nCarteiradeHabilitacao = " + carteiradeHabilitacao + "\nSalario = " + Util.formatarMoney(getSalarioFinal()) ;
    }
    
    

}
