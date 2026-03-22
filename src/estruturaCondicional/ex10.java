package estruturaCondicional;
import java.util.Scanner;

public class ex10 {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        double num1, num2, resultado;
        int operacao;

        System.out.println("Informe um número que será calculado (A): ");
        num1 = sc.nextDouble();

        System.out.println("Informe outro número que será calculado (B): ");
        num2 = sc.nextDouble();

        System.out.println("Agora escolha a operação desejada: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        operacao = sc.nextInt();

        if (operacao == 1) {
            resultado = num1 + num2;
            System.out.println("O resultado desta operação é: "+ resultado);
        }
        else {
            if (operacao == 2) {
                resultado = num1 - num2;
                System.out.println("O resultado desta operação é: "+ resultado);
            }
            else {
                if (operacao == 3) {
                    resultado = num1 * num2;
                    System.out.println("O resultado desta operação é: "+ resultado);
                }
                else {
                    if (operacao == 4) {
                        if (num2 == 0) {
                            System.out.println("O número não pode ser dividido por zero!");
                        }
                        else {
                            resultado = num1 / num2;
                            System.out.println("O resultado desta operação é: "+ resultado);
                        }
                    }
                    else {
                        System.out.println("Operação inválida!");
                    }
                }
            }
        }

        sc.close();
    }
}
