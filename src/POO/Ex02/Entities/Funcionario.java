package POO.Ex02.Entities;

public class Funcionario {

    public String nome;
    public double salario;
    public double imposto;

    public double salarioLiquido() {

        return (salario - imposto);
    }

    public void aumentoSalario(double aumento) {

        salario = salario + (salario * (aumento / 100));
    }

    public String toString() {

        return nome 
            + ", R$"
            + String.format("%.2f", salarioLiquido());
    }

}