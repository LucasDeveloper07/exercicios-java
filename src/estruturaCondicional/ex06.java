package estruturaCondicional;
import java.util.Scanner;

public class ex06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero;

        System.out.println("Digite um número de 0 a 100: ");
        numero = teclado.nextDouble();

        if (numero >=0 && numero <=25) {
            System.out.println("Este número está entre 0 e 25");
        }
        else if (numero >25 && numero <=50) {
            System.out.println("Este número está entre 25 e 50");
        }
        else if (numero >50 && numero <=75) {
            System.out.println("Este número está entre 50 e 75");
        }
        else if (numero >75 && numero <=100) {
            System.out.println("Este número está entre 75 e 100");
        }
        else {
            System.out.println("Este número está fora do intervalo");
        }

        teclado.close();
    }
}
