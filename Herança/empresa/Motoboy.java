/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario{
   private String placadaMoto;

    public Motoboy(String placadaMoto, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.placadaMoto = placadaMoto;
    }

    public String getPlacadaMoto() {
        return placadaMoto;
    }

    public void setPlacadaMoto(String placadaMoto) {
        this.placadaMoto = placadaMoto;
    }

    @Override
    public double getSalarioFinal() {
       return salarioBase;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nPlacadaMoto= " + placadaMoto + 
                "\nSalario Final= " + getSalarioFinal(); 
    }
   
}
