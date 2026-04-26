package vetores.Ex11.Entities;

public class Aluno {
    
    private String nome;
    private double p1;
    private double p2;

    public Aluno(String nome, double p1, double p2) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
    }

    public String getNome() {
        return nome;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }
}
