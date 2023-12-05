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
public class emprestimo {
    private int idEmprestimo;
    private usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoRealizada;

    ArrayList<livro> livrosEmprestados = new ArrayList();

    public emprestimo(int idEmprestimo, usuario usuario, LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista) {
        this.idEmprestimo = idEmprestimo;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucaoRealizada = null;
    }

    public ArrayList<livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public LocalDate getDataDevolucaoRealizada() {
        return dataDevolucaoRealizada;
    }

    

    public void devolverEmp(LocalDate dtDevolucao) {
        this.dataDevolucaoRealizada = dtDevolucao;
        for(livro livroEmp : livrosEmprestados){
            livroEmp.devolver();
        }     
    }

   
    
}
