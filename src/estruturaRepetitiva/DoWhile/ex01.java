package estruturaRepetitiva.DoWhile;
import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String senhaCorreta = "123456";
        String senhaDigitada;
        int tentativas = 0;

        do {
            System.out.println("Digite a senha: ");
            senhaDigitada = sc.next();

            tentativas += 1;
        } while (!senhaDigitada.equals(senhaCorreta) && tentativas != 3);

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso bloqueado!");
        }

        sc.close();
    }
}
