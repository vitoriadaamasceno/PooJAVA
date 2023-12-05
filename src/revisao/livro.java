/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class livro {
    private int ISBN;
    private String titulo;
    private int anoPublicacao;
    private int quantExemplares;
    private categoria categoriaLivro;

    private ArrayList<autor> autores = new ArrayList();


    public livro(int ISBN, String titulo, int anoPublicacao, int quantExemplares, categoria categoriaLivro, ArrayList<autor> autores) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        if (anoPublicacao > 0) {
            this.anoPublicacao = anoPublicacao;
        }else{
            throw new ValorInvalidoException("Ano de Publicação inválido!");
        }
        if (quantExemplares > 0){
            this.quantExemplares = quantExemplares;
        }else{
            throw new ValorInvalidoException("Quantidade de Exemplares inválido!");
        }

        this.categoriaLivro = categoriaLivro;

        if (autores.size() > 0){
            this.autores = autores;
        }else{
            throw new ValorInvalidoException("Livro sem autor!");
        }
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public categoria getCategoriaLivro() {
        return categoriaLivro;
    }

    public int getQuantExemplares() {
        return quantExemplares;
    }

    public void setQuantExemplares(int quantExemplares) throws QuantidadeInvalidaException {
        if (quantExemplares>=0){
            this.quantExemplares = this.quantExemplares + quantExemplares;
        }else{
            throw new QuantidadeInvalidaException();
        }
    }
    
    public void devolver(){
        this.quantExemplares++;
    }
    
    
    public void emprestar(){
        this.quantExemplares--;
    }
    
    
    
    

    
}
