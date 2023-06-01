/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
//Declaração de variaveis
public class Juridica extends Pessoa{
    private String cnpj;
    private String incricaoEstadual;
    //Construtor
    public Juridica(String cnpj, String incricaoEstadual, String nome, String numero) {
        super(nome, numero);
        this.cnpj = cnpj;
        this.incricaoEstadual = incricaoEstadual;
    }
    
    //Getter e Setter
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncricaoEstadual() {
        return incricaoEstadual;
    }

    public void setIncricaoEstadual(String incricaoEstadual) {
        this.incricaoEstadual = incricaoEstadual;
    }
    //ToString
    @Override
    public String toString() {
        return super.toString() +
               "\nCnpj=" + cnpj +
               "\nIncricaoEstadual=" + incricaoEstadual;
    }
  
}
