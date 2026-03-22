package estruturaCondicional.Aninhamento;
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("Informe o lado A do triângulo: ");
        a = sc.nextDouble();
    
        System.out.println("Informe o lado B do triângulo: ");
        b = sc.nextDouble();

        System.out.println("Informe o lado C do triângulo: ");
        c = sc.nextDouble();

        if (a <b + c && b <a + c && c <a + b) {
            if (a == b && b == c) {
                System.out.println("Triângulo equilátero");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Triângulo isósceles");
            }
            else {
                System.out.println("Triângulo escaleno");
            }
        }
        else {
            System.out.println("Esses valores não formam um triângulo");
        }

        sc.close();
    }
}
