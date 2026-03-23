package estruturaRepetitiva.For;
import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1, num2; 
        int num3 = 0;
        int num4 = 0;

        System.out.println("Digite um número inteiro: ");
        num1 = sc.nextInt();

        for (int i=0; i<num1; i++) {
            num2 = sc.nextInt();

            if (num2 >=10 && num2 <=20) {
                num3 += 1;
            }
            else {
                num4 += 1;
            }
        }

        System.out.println(num3 +" in");
        System.out.println(num4 +" out");


        sc.close();
    }
}
