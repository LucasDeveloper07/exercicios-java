package vetores.Ex03.Application;

import java.util.Scanner;

import vetores.Ex03.Entities.Pessoa;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        sc.nextLine();

        Pessoa[] vect = new Pessoa[n]; // Vetor com o tamanho que o usuário digitar

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da "+ (i + 1) +"a pessoa:");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Pessoa(nome, idade, altura); // Instanciação do objeto , utilizando um construtor para iniciar os atributos
        } 

        double somaAltura = 0.0;
        
        for (int i = 0; i < vect.length; i++) {
            somaAltura += vect[i].getAltura(); // Soma da altura das pessoas através da chamada .getAltura()
        }
        
        double mediaAltura = somaAltura / vect.length; // Média da altura das pessoas
        System.out.printf("\nAltura média: %.2f\n", mediaAltura);

        double pessoas16Anos = 0.0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) { // Contador para as pessoas com menos de 16 anos, assim, podendo calcular a porcentagem
                pessoas16Anos += 1;
            }
        }

        double quantPessoas16 = (pessoas16Anos / vect.length) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", quantPessoas16);

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) { // Condição para imprimir o nome das pessoas com menos de 16 anos
                System.out.println(vect[i].getNome());
            }    
        }

        sc.close();
    }
}
