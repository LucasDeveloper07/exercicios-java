package Listas.Ex06.Entities;

public class Funcionario {
    
    private Integer id;
    private String nome;

    public Funcionario(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ID: "
            + id
            + "\nNome: "
            + nome;
    }
}
