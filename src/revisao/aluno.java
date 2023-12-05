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
public class aluno extends usuario{

    public aluno(int idUsuario, String nome, String email, String logradouro, String cidade, String estado, String CEP, int numero) {
        super(idUsuario, nome, email, logradouro, cidade, estado, CEP, numero);
    }

    @Override
    public void realizarEmprestimo(int idEmprestimo, ArrayList<livro> livros) {
        LocalDate hoje = LocalDate.now();

        for(emprestimo emp : emprestimos){
            if (emp.getDataDevolucaoRealizada()==null){
                if (emp.getDataDevolucaoPrevista().compareTo(hoje)>0){
                    throw new ExitePendenciaException();
                }

            }
        }

        if (livros.size()<=3) {

            LocalDate data = hoje.plusDays(5);

            emprestimo novoEmprestimo = new emprestimo(idEmprestimo, this, hoje, data);

            novoEmprestimo.livrosEmprestados = livros;
            
            emprestimos.add(novoEmprestimo);
        }else{
            throw new LimiteExcedidoException();
        }

    }
}

 
