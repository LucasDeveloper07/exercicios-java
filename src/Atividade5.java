import java.util.Locale;
import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int numero, horasTrab;
        double valorHora, salario;

        System.out.println("Digite seu número: ");
        numero = teclado.nextInt();

        System.out.println("Digite suas horas trabalhadas: ");
        horasTrab = teclado.nextInt();

        System.out.println("Digite o valor que receber por hora: ");
        valorHora = teclado.nextDouble();

        salario = valorHora * horasTrab;

        System.out.printf("O seu número é: %d\n", numero);
        System.out.printf("O seu salário é: U$ %.2f\n", salario);

        teclado.close();
    }
}