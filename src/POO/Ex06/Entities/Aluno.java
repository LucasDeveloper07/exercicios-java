package POO.Ex06.Entities;

public class Aluno {
    
    private String nome;
    private String curso;
    private double p1;
    private double p2;
    private double p3;
    
    public Aluno(String nome, String curso) {
        
        this.nome = nome;
        this.curso = curso;
    }

    public boolean setP1(double p1) {

        if (p1 >=0 && p1 <=10) {
            
            this.p1 = p1;

            return true;
        } else {
            return false;
        }
    }
    
    public boolean setP2(double p2) {
        
        if (p2 >=0 && p2 <=10) {
            
            this.p2 = p2;

            return true;
        } else {
            return false;
        }
    }
            
    public boolean setP3(double p3) {
        
        if (p3 >=0 && p3 <=10) {
            
            this.p3 = p3;

            return true;
        } else {
            return false;
        }
    }

    public double getMedia() {

        double media = (this.p1 + this.p2 + this.p3) / 3;

        return media;
    }

    public String getSituacao() {

        if (getMedia() >= 6) {
            
            return "Aprovado!";
        }
        else {
            return "Reprovado!";
        }
    }

    public String toString() {

        return "\nAluno: "
            + nome
            + "\nCurso: "
            + curso
            + "\nMédia: "
            + String.format("%.2f\n", getMedia())
            + "Situação: "
            + String.format("%s\n", getSituacao());
    }
}