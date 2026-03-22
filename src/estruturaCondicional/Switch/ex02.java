package estruturaCondicional.Switch;
import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcao, quant, pagamento;
        double desconto = 0.10;
        double total;

        System.out.println("CARDÁPIO");

        System.out.println();

        System.out.println("1 - X-Burger (R$10)");
        System.out.println("2 - X-Salada (R$12)");
        System.out.println("3 - Refrigerante (R$8)");
        System.out.println("4 - Suco (R$6)");
        
        System.out.println();

        System.out.println("Escolha a opção que você deseja: ");
        opcao = sc.nextInt();
        
        if (opcao <1 || opcao >4) {
            System.out.println("Opção inválida!");
        }
        else {
            System.out.println("Qual a quantidade que você deseja deste item?");
            quant = sc.nextInt();

            if (quant <=0) {
                System.out.println("Você deve informar a quantidade que deseja do item!");
            }
            else {
                System.out.println();

                System.out.println("Formas de pagamento");

                System.out.println();

                System.out.println("1 - Dinheiro");
                System.out.println("2 - Cartão");

                System.out.println();

                System.out.println("Informe a forma de pagamento desejada");
                pagamento = sc.nextInt();

                if (pagamento <1 || pagamento >2) {
                    System.out.println("Forma de pagamento inválida!");
                }
                else {
                    switch (opcao) {
                        case 1:
                            if (pagamento == 1) {
                                total = 10.0 * quant;
                                total -= (total * desconto);
                            }
                            else {
                                total = 10.0 * quant;
                            }
                            break;
                        case 2:
                            if (pagamento == 1) {
                                total = 12.0 * quant;
                                total -= (total * desconto);
                            }
                            else {
                                total = 12.0 * quant;
                            }
                            break;
                        case 3:
                            if (pagamento == 1) {
                                total = 8.0 * quant;
                                total -= (total * desconto);
                            }
                            else {
                                total = 8.0 * quant;
                            }
                            break;
                        default:
                            if (pagamento == 1) {
                                total = 6.0 * quant;
                                total -= (total * desconto);
                            }
                            else {
                                total = 6.0 * quant;
                            }
                            break;
                    }

                    switch (opcao) {
                        case 1:
                            System.out.printf("Produto: X-Burger\nQuantidade de itens: %d\nValor total a pagar: R$%.2f", quant, total);
                            break;
                        case 2:
                            System.out.printf("Produto: X-Salada\nQuantidade de itens: %d\nValor total a pagar: R$%.2f", quant, total);
                            break;
                        case 3:
                            System.out.printf("Produto: Refrigerante\nQuantidade de itens: %d\nValor total a pagar: R$%.2f", quant, total);
                            break;            
                        default:
                            System.out.printf("Produto: Suco\nQuantidade de itens: %d\nValor total a pagar: R$%.2f", quant, total);
                            break;
                    }
                }
            }
        }

        sc.close();
    }
}
