import java.util.Locale;
import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double a, b, c;
        double pi = 3.14159;
        double areaTria, areaCirc, areaTrap, areaQuad, areaReta;

        System.out.println("Digite o valor de A, B e C: ");
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();

        areaTria = (a * c) / 2;
        areaCirc = pi * Math.pow(c, 2);
        areaTrap = ((a + b) * c) / 2;
        areaQuad = Math.pow(b, 2);
        areaReta = a * b;

        System.out.printf("Área do triângulo: %.3f\n", areaTria);
        System.out.printf("Área do círculo: %.3f\n", areaCirc);
        System.out.printf("Área do trapézio: %.3f\n", areaTrap);
        System.out.printf("Área do quadrado: %.3f\n", areaQuad);
        System.out.printf("Área do retângulo: %.3f\n", areaReta);

        teclado.close();
    }
}