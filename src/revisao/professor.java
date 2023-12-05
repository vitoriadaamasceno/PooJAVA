package revisao;

import java.time.LocalDate;
import java.util.ArrayList;

public class professor extends usuario {

    public professor(int idUsuario, String nome, String email, String logradouro, String cidade, String estado, String CEP, int numero) {
        super(idUsuario, nome, email, logradouro, cidade, estado, CEP, numero);
    }

    @Override
    public void realizarEmprestimo(int idEmprestimo, ArrayList<livro> livros) {
        LocalDate hoje = LocalDate.now();

        for (emprestimo emp : emprestimos) {
            if (emp.getDataDevolucaoRealizada() == null) {
                if (emp.getDataDevolucaoPrevista().compareTo(hoje) > 0) {
                    throw new ExitePendenciaException();
                }

            }
        }

        if (livros.size() <= 5) {

            LocalDate data = hoje.plusDays(15);

            emprestimo novoEmprestimo = new emprestimo(idEmprestimo, this, hoje, data);

            novoEmprestimo.livrosEmprestados = livros;

            emprestimos.add(novoEmprestimo);
        } else {
            throw new LimiteExcedidoException();
        }

    }
}
