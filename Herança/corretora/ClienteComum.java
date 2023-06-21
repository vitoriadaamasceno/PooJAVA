/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corretora;

/**
 *
 * @author damascenovi
 */
public class ClienteComum extends PessoaFisica {

    public ClienteComum(String nome, String cpf) {
        super(nome, cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public double getValorDoEmprestimo() {
       return 1000;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nValor de Emprestimo: " + Util.formatarValor(getValorDoEmprestimo());
    }
    
    
}
