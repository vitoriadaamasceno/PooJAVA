
package aplicacao;

import revisao.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Revisao {
    static int numEmp = 0;
    static Scanner teclado = new Scanner(System.in);
    
    static ArrayList<usuario> listaUsuarios = new ArrayList();
    static ArrayList<categoria> listaCategorias = new ArrayList();
    static ArrayList<autor> listaAutores = new ArrayList();
    static ArrayList<livro> listaLivros = new ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here
        int opcao;
        
        
        System.out.println("Bem vindo ao Sistema de Venda de Ingresso");
        LocalDate dtHoje = LocalDate.now(); 
        
        do{
            System.out.println("1 - Cadastrar Usuário");
            System.out.println("2 - Cadastrar Categoria");
            System.out.println("3 - Cadastrar Autor");
            System.out.println("4 - Cadastrar Livro");
            System.out.println("5 - Realizar Empréstimo");
            System.out.println("6 - Devolver Livros Emprestados");
            System.out.println("7 - Encerrar");
            System.out.println("Digite a opcao desejada: ");       
            opcao = teclado.nextInt();
            
            switch (opcao) {
                    case 1: {
                        cadastrarUsuario();
                        break;                        
                    }
                    case 2: {
                        cadastrarCategoria();
                        break;                        
                    }
                    case 3: {
                        cadastrarAutor();
                        break;                        
                    }
                    case 4: {
                        cadastrarLivro();
                        break;                        
                    }
                    case 5: {
                        realizarEmprestimo();
                        break;                        
                    }
                    case 6: {
                        devolverLivro();
                        break;
                    }
                    case 7: {
                        System.out.println("Programa encerrado!");
                        break;                        
                    }                    
                    default:{
                        System.out.println("Opcao invalida. Digite novamente");;                        
                    }
                    
            }
        
        }while(opcao!=7);
    }

    private static void devolverLivro() {
        //Exibir os usuários cadastrados
        int indexUsuario = 0;
        for (usuario usuarios : listaUsuarios) {
            System.out.println(indexUsuario + " - " + usuarios.getNome());
            indexUsuario++;
        }

        System.out.println("Digite o número do usuário");
        indexUsuario = teclado.nextInt();

        usuario usuarioEmp = listaUsuarios.get(indexUsuario);

        //Apresenta todos os emprestimos do usuario
        int indexEmp = 0;
        for (emprestimo emprestimos : usuarioEmp.getEmprestimos()) {
            if (emprestimos.getDataDevolucaoRealizada() == null) {
                System.out.println(indexEmp + " - " + emprestimos.getIdEmprestimo() + " - " + emprestimos.getDataEmprestimo());
                indexEmp++;
            }

            System.out.println("Digite o número do emprestimo");
            indexEmp = teclado.nextInt();

            int idEmprestimoDev = usuarioEmp.getEmprestimos().get(indexEmp).getIdEmprestimo();

            try {
                usuarioEmp.devolverLivro(idEmprestimoDev);
                System.out.println("Livros devolvidos");
            } catch (EmprestimoNaoEncontradoException e) {
                System.out.println("Emprestimo não localizado!");
            } catch (EmprestimoNaoPendenteException e) {
                System.out.println("Livros já devolvidos!");
            }
        }
    }

    private static void cadastrarUsuario() {

        int idUser;
        String nomeUser;
        String emailUser;
        String logradouroUser = "";
        String cidadeUser = "";
        String estadoUser = "";
        String CEPUser = "";
        int numeroUser = 0;
        
        String tipoUsuario = "";
        
        usuario novoUsuario = null;
        
        System.out.println("Cadastro de Usuario");
        
        System.out.println("Id do usuário: ");
        idUser = teclado.nextInt();
        
        System.out.println("Nome: ");
        nomeUser = teclado.next();
        
        System.out.println("email: ");
        emailUser = teclado.next();
        
        //ler os demais dadoos do usuário
        
        System.out.println("Digite A para Aluno ou P para Professor");
        tipoUsuario = teclado.next();
        
        if((tipoUsuario.equalsIgnoreCase("A")||(tipoUsuario.equalsIgnoreCase("P"))) ){
            //é igual a A ou P
            if (tipoUsuario.equalsIgnoreCase("A")){
                novoUsuario = new aluno(idUser,nomeUser,emailUser,logradouroUser,cidadeUser,estadoUser,CEPUser, numeroUser);
            }else{
                //novoUsuario = new professor(idUser,nomeUser,emailUser,logradouroUser,cidadeUser,estadoUser,CEPUser, numeroUser); necessário imnplementar a clkasse professor
            }
            listaUsuarios.add(novoUsuario);
            
            System.out.println("Usuario cadastrado com sucesso!");
        }else{    
            System.out.println("Opcao Inválida. Tente novamente!");
        }
                
        
    }

    private static void cadastrarCategoria() {
        int idCateg;
        String nomeCateg;
        
        System.out.println("Cadastro de Categorias");
        
        System.out.println("Id da Categoria: ");
        idCateg = teclado.nextInt();
        
        System.out.println("Nome da Categoria: ");
        nomeCateg = teclado.next();

        categoria novaCategoria = new categoria(idCateg, nomeCateg);
        listaCategorias.add(novaCategoria);
        System.out.println("Categoria cadastrada com sucesso!");
                
    }

    private static void cadastrarAutor() {
        int idAutor;
        String nomeAutor;

        System.out.println("Cadastro de Autor");

        System.out.println("Id do Autor: ");
        idAutor = teclado.nextInt();

        System.out.println("Nome do Autor: ");
        nomeAutor = teclado.next();

        autor novoAutor = new autor(idAutor, nomeAutor);
        listaAutores.add(novoAutor);
        System.out.println("Autor cadastrado com sucesso!");
    }

    private static void cadastrarLivro() {
        
        int ISBNLiv;
        String tituloLiv;
        int anoPublicacaoLiv;
        int quantExemplaresLiv;
        categoria categoriaLivroLiv;
        ArrayList<autor> listaAutoresLiv = new ArrayList();
        
        livro novoLivro = null;
        
        System.out.println("Cadastro de Livro");
        
        System.out.println("ISBN do livro: ");
        ISBNLiv = teclado.nextInt();
        
        System.out.println("Titulo: ");
        tituloLiv = teclado.next();
        
        System.out.println("Ano de Publicacao: ");
        anoPublicacaoLiv = teclado.nextInt();
        
        System.out.println("Quantidade de Exemplares: ");
        quantExemplaresLiv = teclado.nextInt();
        
        //exibir todas categorias
        int indexCat = 0;
        for(categoria catLivro : listaCategorias){
            System.out.println(indexCat + " - " + catLivro.getNomeCategoria());
            indexCat++;
        }
        
        System.out.println("Digite o número da categoria do livro");
        indexCat = teclado.nextInt();

        //exibir todos autores
        int indexAutor = 0;
        for(autor autoresLivro : listaAutores){
            System.out.println(indexAutor + " - " + autoresLivro.getNomeAutor());
            indexAutor++;
        }

        autor autorLiv = null;
        int continuar;

        do {
            System.out.println("Digite o número do autor do livro");
            indexAutor = teclado.nextInt();
            if (listaAutoresLiv.indexOf(listaAutores.get(indexAutor))>=0) {
                System.out.println("Autor já cadastrado");
            }else {
                listaAutoresLiv.add(listaAutoresLiv.get(indexAutor));
            }
            System.out.println("O livro tem outro autor? Digite 1 para SIM ou outro valor para NÃO");
            continuar = teclado.nextInt();

        }while(continuar == 1);

        try {
            livro novolivro = new livro(ISBNLiv, tituloLiv, anoPublicacaoLiv, quantExemplaresLiv, listaCategorias.get(indexCat), listaAutoresLiv);
            listaLivros.add(novoLivro);
            System.out.println("Livro cadastrado com sucesso!");
        }catch (ValorInvalidoException e) {
            System.out.println("Valor inválido! Verifique os valores informados!");
        }
        
    }
    
    private static void realizarEmprestimo() {
        //Exibir os usuários cadastrados
        int indexUsuario = 0;
        for(usuario usuarios : listaUsuarios){
            System.out.println(indexUsuario + " - " + usuarios.getNome());
            indexUsuario++;
        }

        System.out.println("Digite o número do usuário");
        indexUsuario = teclado.nextInt();

        usuario usuarioEmp = listaUsuarios.get(indexUsuario);

        // Exibir os livros

        int continuar, indexLivro=0;
        ArrayList<livro> listaLivroEmp = new ArrayList();

        do {
            System.out.println("Digite o número do livro");
            indexLivro = teclado.nextInt();
            if (listaLivroEmp.indexOf(listaLivros.get(indexLivro))>=0) {
                System.out.println("Livro já selecionado");
            }else {
                listaLivroEmp.add(listaLivroEmp.get(indexLivro));
            }
            System.out.println("Deseja outro livro? Digite 1 para SIM ou outro valor para NÃO");
            continuar = teclado.nextInt();

        }while(continuar == 1);

        try {
            numEmp++;
            usuarioEmp.realizarEmprestimo(numEmp, listaLivroEmp);
            System.out.println("Empréstimo cadastrado com sucesso!");
        }catch (ExitePendenciaException e) {
            System.out.println("Emprestimo não pode ser realizado, pois existem pendencias!");
        }catch (LimiteExcedidoException e) {
            System.out.println("Emprestimo não pode ser realizado, pois o limite de livros foi excedido!");
        }
    }


    public static ArrayList<autor> getListaAutores() {
        return listaAutores;
    }
}
