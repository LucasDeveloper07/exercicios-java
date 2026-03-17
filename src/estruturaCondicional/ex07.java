package estruturaCondicional;
import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double x, y;

        System.out.println("Digite dois números com uma casa decimal (x, y): ");
        x = teclado.nextDouble();
        y = teclado.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x == 0) {
            System.out.println("Eixo y");
        }
        else if (y == 0) {
            System.out.println("Eixo x");
        }
        else if (x >0 && y >0) {
            System.out.println("Q1");
        }
        else if (x <0 && y >0) {
            System.out.println("Q2");
        }
        else if (x <0 && y <0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        teclado.close();
    }
}
