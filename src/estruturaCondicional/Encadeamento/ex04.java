package estruturaCondicional.Encadeamento;
import java.util.Locale;
import java.util.Scanner;

public class ex04 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Digite o seu salário: ");
        salario = teclado.nextDouble();


        if (salario <=2000.00) {
            imposto = 0;
        }
        else if (salario <=3000.00) {
            imposto = (salario - 2000) * 0.08;
        }
        else if (salario <=4500.00) {
            imposto = ((3000 - 2000) * 0.08) + ((salario - 3000) * 0.18);
        }
        else {
            imposto = ((3000 - 2000) * 0.08) + ((4500 - 3000) * 0.18) + ((salario - 4500) * 0.28);
        }

        if (imposto == 0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("US$%.2f\n", imposto);
        }

        teclado.close();
    }
}

