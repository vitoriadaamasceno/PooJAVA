/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Banco contaBancaria = new Banco("Banco do Brasil",1010,"458456-0","Conta Corrente",100,4300);
        Funcionario funcionario = new Funcionario(52,"Maria Vitoria Damasceno","Praça Alcebiades Damasceno",985062854,"maria@gmail.com",contaBancaria);
          System.out.println("Dados do Funcionario: ");
          System.out.println("Codigo Funcionario: " +funcionario.getCodigoFuncionario()); 
          System.out.println("Nome do Funcionario: " +funcionario.getNome()); 
          System.out.println("Endereço do Funcionario: " +funcionario.getEndereço()); 
          System.out.println("Telefone do Funcionario: " +funcionario.getTelefone()); 
          System.out.println("Email do Funcionario: " +funcionario.getEmail()); 
          System.out.println("Conta do Funcionario: " +funcionario.getContaBanco()); 
   
          System.out.println("--------------------------------------------------");
     
        System.out.println("Dados do Banco:");
        System.out.println("Nome do Banco: " +funcionario.getContaBanco().getBanco());
        System.out.println("Agencia : " +funcionario.getContaBanco().getAgencia());
        System.out.println("Numero da conta : " +funcionario.getContaBanco().getNumeroConta());
        System.out.println("Tipo da conta : " +funcionario.getContaBanco().getTipoConta());
        System.out.println("Saldo Atual R$: " +funcionario.getContaBanco().getSaldoAtual());
        System.out.println("Limete de Disponivel R$: " +funcionario.getContaBanco().getLimiteDisponivel());
        
          
    }

}