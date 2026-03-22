package estruturaCondicional.Switch;
import java.util.Scanner;

public class ex01 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int mes;

        System.out.println("Escolha um número de 1 a 12 para escolher o mês: ");
        mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro - 31 dias");
                break;
            case 2:
                System.out.println("Fevereiro - 28 dias");
                break;
            case 3:
                System.out.println("Março - 31 dias");
                break;
            case 4:
                System.out.println("Abril - 30 dias");
                break;
            case 5:
                System.out.println("Maio - 31 dias");
                break;
            case 6:
                System.out.println("Junho - 30 dias");
                break;
            case 7:
                System.out.println("Julho - 31 dias");
                break;
            case 8:
                System.out.println("Agosto - 31 dias");
                break;
            case 9:
                System.out.println("Setembro - 30 dias");
                break;
            case 10:
                System.out.println("Outubro - 31 dias");
                break;
            case 11:
                System.out.println("Novembro - 30 dias");
                break;
            case 12:
                System.out.println("Dezembro - 31 dias");
                break;
            default:
                System.out.println("Este número é inválido!");
                break;
        }

        sc.close();
    }
}
