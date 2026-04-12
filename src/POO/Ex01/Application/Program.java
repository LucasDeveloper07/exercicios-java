package POO.Ex01.Application;

import java.util.Scanner;
import POO.Ex01.Entities.Rectangle;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Informe a largura do retângulo: ");
        rectangle.largura = sc.nextDouble();

        System.out.println("Informe a altura do retângulo: ");
        rectangle.altura = sc.nextDouble();

        System.out.printf("Área: %.2f\n", rectangle.Area());
        System.out.printf("Perímetro: %.2f\n", rectangle.Perimetro());
        System.out.printf("Diagonal: %.2f\n", rectangle.Diagonal());

        sc.close();
    }
}
