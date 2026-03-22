package estruturaCondicional.Encadeamento;
import java.util.Scanner;

public class ex07 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nota;
        String situacao;

        System.out.println("Insira a nota do aluno (de 0 a 10): ");
        nota = sc.nextDouble();

        if (nota <0 || nota >10) {
            System.out.println("Nota inválida!");
        }
        else {
            
            if (nota <5) {
                situacao = "Ruim";
            }
            else if (nota <6) {
                situacao = "Regular";
            }
            else if (nota <8) {
                situacao = "Bom";
            }
            else {
                situacao = "Excelente";
            }
        
            if (nota >=6) {
                System.out.println(situacao +" - Aprovado");
            }
            else {
                System.out.println(situacao +" - Reprovado");
            }
        }

        sc.close();
    }
}
