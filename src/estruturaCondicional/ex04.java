package estruturaCondicional;

import java.util.Scanner;

public class ex04 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int horaInicio, horaFim, duracaoTotal;

        System.out.println("Informe a hora em que o jogo começou e a hora que o jogo terminou: "); // O jogo tem duração mínima de 1 hora e máxima de 24 horas
        horaInicio = teclado.nextInt();
        horaFim = teclado.nextInt();

        if (horaFim > horaInicio) {
            duracaoTotal = horaFim - horaInicio;
        }
        else {
            duracaoTotal = (24 - horaInicio) + horaFim;
        }

        System.out.println("O jogo durou "+ duracaoTotal +" hora(as)");

        teclado.close();
    }
}
