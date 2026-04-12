package POO.Ex03.Entities;

public class Aluno {
    
    public String nome;
    public double p1;
    public double p2;
    public double p3;

    public double notaAluno() {

        double nota = (p1 + p2 + p3);

        return nota;
    }

    public String toString() {

        if (notaAluno() < 60) {
            
            return nome
                + "\nNota final: "
                + String.format("%.2f", notaAluno())
                + "\nReprovado!"
                + "\nFaltaram "
                + String.format("%.2f", (60 - notaAluno()))
                + " pontos";
            }
        else {
            
            return nome 
                + "\nNota final: "
                + String.format("%.2f", notaAluno())
                + "\nAprovado!";
        }
    }
}
