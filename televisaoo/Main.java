import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        
        Televisao TVsala = new Televisao();
        Televisao TVquarto = new Televisao();
        
        do{
            
            System.out.println("======= TV SALA =======");
            System.out.println("Status: " +  TVsala.isLigada());
            System.out.println("Volume: " + TVsala.getVolume());
            System.out.println("Canal: " + TVsala.getCanal());
            System.out.println("=======================");
            
            System.out.println("1 - LigarDesligar");
            System.out.println("2 - Alterar o canal");
            System.out.println("3 - Aumentar Volume");
            System.out.println("4 - Diminuir Volume");
            System.out.println("5 - Encerrar");
            
            System.out.println("Digite a opcao desejada: ");
            
            opcao = teclado.nextInt();
            
            switch (opcao) {
                case 1:
                    TVsala.LigarDesligar();		
                    break;
                case 2:
    		        TVsala.AlterarCanal(7);
                    break;
                case 3:
    		        TVsala.AumentarVolume();
                    break;
                case 4:
                    TVsala.DiminuirVolume();
    		        break;
    		    case 5:
                    System.out.println("Até mais...");
    		        break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            
            
    	}while (opcao != 5);
	}
}
