package Listas.Ex01.Entities;

public class Funcionario {
    
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentoSalario(double porcent) {
        porcent = porcent / 100;
        salario += salario * porcent;
    }

    public String toString() {
        return "ID: "
            + id
            + "\nNome: "
            + nome
            + String.format("\nSalario: R$%.2f", salario);
    }
}
