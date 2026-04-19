package POO.Ex07.Entities;

public class Conta {
    
    private String nome;
    private int numero;
    private double saldo;

    // Construtor para instanciar o objeto com nome e número
    public Conta(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    /* Construtor para instanciar o objeto com nome, número
    e saldo, caso o cliente deseje depositar um valor inicial */
    public Conta(String nome, int numero, double deposito) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = deposito;
    }

    // Método para alterar nome caso o cliente deseje alterar o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para realizar o depósito
    public void setDeposito(double deposito) {
        if (deposito < 0) {
            System.out.println("Valor inválido!");
        } else {
            this.saldo += deposito;
        }
    }

    // Método para realizar o saque
    public void setSaque(double saque) {
        if (saque < 0) {
            System.out.println("Valor inválido!");
        } else if ((saque + 5) > this.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= (saque + 5);
        }
    }

    // Método para exibir saldo
    public double getSaldo() {
        return this.saldo;
    }

    // Método para exibir os dados
    public String getString() {
        return "\nTitular: "
            + nome
            + "\nConta: "
            + numero
            + String.format("\nSaldo: R$%.2f", getSaldo());
    }
}
