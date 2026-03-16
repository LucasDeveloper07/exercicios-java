import java.util.Scanner;

public class Atividade1 {

    static Scanner teclado = new Scanner(System.in);
    
    public static void mediaPonderada() {

        double a, b, c, mediaPonderada;

        int p1 = 2;
        int p2 = 3;
        int p3 = 5;

        System.out.println("Digite o primeiro número: ");
        a = teclado.nextDouble();

        System.out.println("Digite o segundo número: ");
        b = teclado.nextDouble();

        System.out.println("Digite o terceiro número: ");
        c = teclado.nextDouble();

        mediaPonderada = ((a * p1) + (b * p2) + (c * p3)) / (p1 + p2 + p3);

        System.out.printf("A média ponderada é: %.2f\n", mediaPonderada);
    }
    public static void main(String[] args) {
        
        mediaPonderada();
        
        teclado.close();
    }
}
