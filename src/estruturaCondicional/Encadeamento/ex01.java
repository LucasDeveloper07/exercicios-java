package estruturaCondicional.Encadeamento;
import java.util.Scanner;

public class ex01 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int codUsuario, qteUsuario;

        double valorTotal;

        System.out.println("Digite o código do produto e a quantidade do item: ");
        codUsuario = teclado.nextInt();
        qteUsuario = teclado.nextInt();

        if (codUsuario == 1) {
            valorTotal = 4.00 * qteUsuario;
        }
        else if (codUsuario == 2) {
            valorTotal = 4.50 * qteUsuario;
        }
        else if (codUsuario == 3) {
            valorTotal = 5.00 * qteUsuario;
        }
        else if (codUsuario == 4) {
            valorTotal = 2.00 * qteUsuario;
        }
        else {
            valorTotal = 1.50 * qteUsuario;
        }

        System.out.printf("O valor total a pagar é de R$%.2f\n", valorTotal);

        teclado.close();
    }
}
