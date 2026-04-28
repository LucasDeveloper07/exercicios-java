package Listas.Ex01.Entities;

public class Funcionario {
    
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentoSalario(double porcent) {
        porcent = porcent / 100;
        double salario = getSalario();

        salario += salario * porcent;
        setSalario(salario);
    }

    public String toString() {
        return "ID: "
            + getId()
            + "\nNome: "
            + getNome()
            + String.format("\nSalario: %.2f", getSalario());
    }
}
