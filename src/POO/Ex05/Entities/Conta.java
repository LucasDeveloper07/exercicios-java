package POO.Ex05.Entities;

import java.util.Random;

public class Conta {
    
    public String titular;
    public String cpf;
    public String agencia;
    public String numero;
    public double saldo;

    public Conta() {
        gerarDadosConta();
    }

    public void gerarDadosConta() {
        
        Random random = new Random();

        int digito = random.nextInt(10);
        int agencia = 1000 + random.nextInt(9000);
        int numero = 10000 + random.nextInt(90000);

        this.agencia = agencia + "-" + digito;
        this.numero = numero + "-" + digito;
    }

    
    public void deposito(double valor) {
        
        if (valor <=0) {
            System.out.println("Valor inválido!\n");
        }
        else {
            saldo += valor;

            System.out.printf("\nValor depositado: %.2f\n", valor);
            System.out.printf("Saldo: R$%.2f\n\n", saldo);
        }
    }
    
    public void saque(double valor) {
        
        if (valor + 5 > saldo) {
            System.out.println("Saldo insuficiente para este saque!\n");
        }
        else {
            saldo -= (valor + 5);

                System.out.printf("\nValor sacado: %.2f\n", valor);
                System.out.println("Taxa: R$5,00");
                System.out.printf("Saldo: R$%.2f\n\n", saldo);
        }
    }
    
    public String toString() {

        return "\nTitular da conta: "
            + titular
            + "\nCPF: " 
            + cpf
            + "\nAgência: "
            + agencia
            + "\nNúmero da conta: "
            + numero
            + "\nSaldo: R$"
            + String.format("%.2f\n", saldo);
    }
}
    