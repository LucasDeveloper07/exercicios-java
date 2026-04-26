package vetores.Ex10.Entities;

public class Pessoa {
    
    private String nome;
    private int idade;

    // Construtor para que o objeto ja seja iniciado com nome e idade
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para retornar o nome
    public String getNome() {
        return nome;
    }

    // Método para retornar a idade
    public int getIdade() {
        return idade;
    }
}
