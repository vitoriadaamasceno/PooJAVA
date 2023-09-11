/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package DataHora;

import java.util.Scanner;

/**
 *
 * @author damascenovi
 */
public class Main {

    public static void main(String[] args) {
        //lend
        Scanner scanner = new Scanner(System.in);
        DataHora[] aulas = new DataHora[10];

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Informe a data da aula, com dia/mes/ano e hora da aula, com hora:minuto:segundo");
                int dia = scanner.nextInt();
                int mes = scanner.nextInt();
                int ano = scanner.nextInt();
                int hora = scanner.nextInt();
                int minuto = scanner.nextInt();
                int segundo = scanner.nextInt();

                DataHora dataHora = new DataHora(dia, mes, ano, hora, minuto, segundo);

                if (dataHora.validaData(dia, mes, ano) && dataHora.validaHora(hora, minuto, segundo)) {
                    aulas[i] = dataHora;
                    System.out.println("Data e hora da aula registradas!");
                } else {
                    System.out.println("Data e hora inválidas. Tente novamente.");
                    i--;
                }
            } catch (Exception e) {
                System.out.println("Formato invalido! Tente novamente!" + e.getMessage());
                i--;
            }

        }

        System.out.println("Quer consultar ou adiar aula? Se quiser adiar, digite 1; se quiser consultar, digite 2.");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 2: {
                // Consultar
                System.out.println("Qual aula deseja consultar?");
                int aula = scanner.nextInt();
                if (aula < 10 && aulas[aula] != null) {
                    Data dataAula = aulas[aula];
                    System.out.println("Data da aula " + aula + ": " + dataAula.getDia() + "/" + dataAula.getMes() + "/" + dataAula.getAno());
                } else {
                    System.out.println("Aula não existe");
                }
                break;
            }
            case 1: {
                // Adiar
                System.out.println("Qual aula deseja adiar?");
                int aula = scanner.nextInt();
                if (aula < 10 && aulas[aula] != null) {
                    System.out.println("Quantos dias deseja adiar?");
                    int diasAdiados = scanner.nextInt();
                    if (diasAdiados >= 0) {
                        if (aulas[aula].passaTempo(-diasAdiados)) {
                            System.out.println("Aula adiada!");
                        } else {
                            System.out.println("Data inválida!");
                        }
                    } else {
                        System.out.println("Operação inválida, verifique o valor a ser adiado!");
                    }
                } else {
                    System.out.println("Aula não existe");
                }
                break;
            }
            default:
                System.out.println("Opção inválida. Digite 1 para adiar ou 2 para consultar.");
                break;
        }
    }
}
