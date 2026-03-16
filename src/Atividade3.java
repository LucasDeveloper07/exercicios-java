import java.util.Scanner;

public class Atividade3 {
    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);

        double pi = 3.14159;
        double raio, area;

        System.out.println("Digite o raio do circulo: ");
        raio = teclado.nextDouble();

        area = pi * Math.pow(raio, 2);

        System.out.printf("O valor da área deste circulo é: %.4f", area);

        teclado.close();
    }
}