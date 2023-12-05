/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public abstract class usuario {
    
    
    private int idUsuario;
    private String nome;
    private String email;
    private String logradouro;
    private String cidade;
    private String estado;
    private String CEP;
    private int numero;

    ArrayList<emprestimo>  emprestimos = new ArrayList();

    public usuario(int idUsuario, String nome, String email, String logradouro, String cidade, String estado, String CEP, int numero) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
        this.numero = numero;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void devolverLivro(int idEmprestimo){
        LocalDate hoje = LocalDate.now();
        int tam = emprestimos.size();
        emprestimo emp;
        boolean achou=false;
        
        int p;
        for(p=0;p<tam;p++){
            emp = emprestimos.get(p);
            if (emp.getIdEmprestimo()== idEmprestimo){
                achou=true;
                if (emp.getDataDevolucaoRealizada()==null){
                    //devolver os livros
                    emp.devolverEmp(hoje);
                }else{
                    throw new EmprestimoNaoPendenteException();
                }
            }
        }
        if (!achou){
            throw new EmprestimoNaoEncontradoException();
        }
        
        
        
    }
    
    public abstract void realizarEmprestimo(int idEmprestimo, ArrayList<livro> livros);
    
    

    
}
