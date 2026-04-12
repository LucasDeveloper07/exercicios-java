package POO.Ex04.Application;

import java.util.Scanner;
import POO.Ex04.Util.Conversor;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double dolar = sc.nextDouble();

        System.out.println("Quantos dólares você deseja comprar?");
        double compra = sc.nextDouble();

        double result = Conversor.compraDolar(dolar, compra);

        System.out.printf("O valor da compra em reais é: R$%.2f\n", result);

        sc.close();
    }
}
