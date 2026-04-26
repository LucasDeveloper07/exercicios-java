package vetores.Ex03.Entities;

public class Pessoa {
    
    private String nome;
    private int idade;
    private double altura;

    // Construtor para iniciar os atributos
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Método para retornar o nome
    public String getNome() {
        return nome;
    }

    // Método para retornar idade
    public int getIdade() {
        return idade;
    }

    // Método para retornar a altura
    public double getAltura() {
        return altura;
    }
    // Não coloquei métodos setters, pois os atributos já são iniciados obrigatoriamente na instanciação do objeto
}
