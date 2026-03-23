package estruturaCondicional.Switch;
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int idade, estudante, quantIngresso;
        double valorIngresso = 0.0;
        double desconto = 0.50;
        double total;

        System.out.println("Informe a sua idade: ");
        idade = sc.nextInt();

        if (idade <0) {
            System.out.println("Valor inválido!");
        }
        else {
            System.out.println("Informe se você é estudante: ");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            System.out.println();

            estudante = sc.nextInt();

            if (estudante <1 || estudante >2) {
                System.out.println("Opção inválida!");
            }
            else {
                System.out.println("Informe a quantidade de ingressos que você deseja: ");
                quantIngresso = sc.nextInt();

                if (quantIngresso <=0) {
                    System.out.println("Você deve informar a quantidade de ingressos que deseja!");
                }
                else {
                    switch (estudante) {
                        case 1:
                            if (idade <13) {
                                valorIngresso = 10.0;
                                total = (valorIngresso * quantIngresso) - ((valorIngresso * quantIngresso) * desconto);
                            }
                            else if (idade <60) {
                                valorIngresso = 20.0;
                                total = (valorIngresso * quantIngresso) - ((valorIngresso * quantIngresso) * desconto);
                            }
                            else {
                                valorIngresso = 12.0;
                                total = (valorIngresso * quantIngresso) - ((valorIngresso * quantIngresso) * desconto);
                            }

                            System.out.printf("Valor ingresso: R$%.2f\nQuantidade de ingressos: %d\nDesconto: 50%%\nValor total a pagar: R$%.2f", valorIngresso, quantIngresso, total);
                            break;                   
                        default:
                            if (idade <13) {
                                valorIngresso = 10.0;
                                total = valorIngresso * quantIngresso;
                            }
                            else if (idade <60) {
                                valorIngresso = 20.0;
                                total = valorIngresso * quantIngresso;
                            }
                            else {
                                valorIngresso = 12.0;
                                total = valorIngresso * quantIngresso;
                            }
                            System.out.printf("Valor ingresso: R$%.2f\nQuantidade de ingressos: %d\nValor total a pagar: R$%.2f", valorIngresso, quantIngresso, total);
                            break;
                    }
                }
            }
        }

        sc.close();
    }
}
