package estruturaCondicional;
import java.util.Scanner;

public class ex11 {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();

        System.out.println("Digite o terceiro número: ");
        num3 = sc.nextDouble();

        if (num1 >=num2 && num1 >=num3) {
            System.out.println("O número "+ num1 +" é maior!");
        }
        else if (num2 >=num1 && num2 >=num3) {
            System.out.println("O número "+ num2 +" é maior!");
        }
        else {
            System.out.println("O número "+ num3 +" é maior!");
        }
                
        sc.close();
    }
}
