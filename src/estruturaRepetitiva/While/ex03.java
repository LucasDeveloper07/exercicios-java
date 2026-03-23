package estruturaRepetitiva.While;
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int combustivel;
        
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Digite o número referente ao tipo de combustivel abastecido: ");
        combustivel = sc.nextInt();

        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool += 1;
            }
            else if (combustivel == 2) {
                gasolina += 1;
            }
            else if (combustivel == 3) {
                diesel += 1;
            }

            combustivel = sc.nextInt();
        }

        System.out.println("Muito obrigado!");
        System.out.printf("Alcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);

        sc.close();
    }
}
