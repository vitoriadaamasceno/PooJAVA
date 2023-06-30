/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author damascenovi
 */
public class Fornecedor extends Juridico{
    private Setor_Juridica setor;
    private Produto produto;

    public Fornecedor(Setor_Juridica setor, Produto produto, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.setor = setor;
        this.produto = produto;
    }


    public Setor_Juridica getSetor() {
        return setor;
    }

    public void setSetor(Setor_Juridica setor) {
        this.setor = setor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Fornecedor" + super.toString()+  "\nSetor = " + setor.getNome() + "\nProduto = " + produto;
    }
    
    
}
