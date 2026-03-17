import java.util.Scanner;

public class Atividade2 {

    static Scanner teclado = new Scanner(System.in);

    public static void calculoViagem() {

        double distanciaKm, velocidadeMedia, consumoCombustivel, tempoViagem, combustivelNecessario;

        System.out.println("Digite a distância em Km: ");
        distanciaKm = teclado.nextDouble();

        System.out.println("Digite a velocidade média: ");
        velocidadeMedia = teclado.nextDouble();

        System.out.println("Digite o consumo de combustível do carro em km/L: ");
        consumoCombustivel = teclado.nextDouble();

        tempoViagem = distanciaKm / velocidadeMedia;
        combustivelNecessario = distanciaKm / consumoCombustivel;

        System.out.printf("O tempo da viagem será de %.2f horas\n", tempoViagem);
        System.out.printf("O combustível necessário para completar a viagem é de %.2f L\n", combustivelNecessario);
    }
    public static void main(String[] args) {
       
        calculoViagem();

        teclado.close();
    }
}