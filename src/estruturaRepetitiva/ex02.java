package estruturaRepetitiva;
import java.util.Scanner;

public class ex02 {
    
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Insira duas coordenadas do plano cartesiano: ");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x !=0 && y !=0) {
            if (x >0 && y >0) {
                System.out.println("Primeiro quadrante");
            }
            else if (x <0 && y >0) {
                System.out.println("Segundo quadrante");
            }
            else if (x <0 && y<0) {
                System.out.println("Terceiro quadrante");
            }
            else {
                System.out.println("Quarto quadrante");
            }
            
            x = sc.nextInt();
            y = sc.nextInt();
        }

        System.out.println();

        sc.close();
    }
}
