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
        depositar(deposito);
    }

    // Método para apenas retornar o número da conta
    public int getNumero() {
        return numero;
    }

    // Método para retornar o nome do titular
    public String getNome() {
        return nome;
    }

    // Método para alterar nome caso o cliente deseje alterar o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para retornar o saldo
    public double getSaldo() {
        return this.saldo;
    }

    // Método para realizar o depósito
    public void depositar(double deposito) {
        if (deposito < 0) {
            System.out.println("Valor inválido!");
        } else {
            this.saldo += deposito;
        }
    }

    // Método para realizar o saque
    public void sacar(double saque) {
        if (saque < 0) {
            System.out.println("Valor inválido!");
        } else if ((saque + 5) > this.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= (saque + 5);
        }
    }

    // Método para exibir os dados
    public String toString() {
        return "\nTitular: "
            + getNome()
            + "\nConta: "
            + getNumero()
            + String.format("\nSaldo: R$%.2f", getSaldo());
    }
}
