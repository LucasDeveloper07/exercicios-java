package Listas;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ex04 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Quantos numeros serao digitados? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i + 1) + "o numero: ");
            int num = sc.nextInt();
            numeros.add(num);
        }

        int numMaior = numeros.get(0);
        int numMenor = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > numMaior) {
                numMaior = numeros.get(i);
            } else if (numeros.get(i) < numMenor) {
                numMenor = numeros.get(i);
            }
        }

        System.out.println("\nNumero maior da lista: " + numMaior);
        System.out.println("Numero menor da lista: " + numMenor);

        sc.close();
    }
}
