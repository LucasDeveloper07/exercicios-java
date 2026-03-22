package estruturaCondicional.Aninhamento;
import java.util.Scanner;

public class ex04 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String usuario = "LucasFelipe";
        String senha = "Lucas@123";

        String validUsuario, validSenha;

        System.out.println("Informe o seu usuário: ");
        validUsuario = sc.next();

        if (usuario.equals(validUsuario)) {
            System.out.println("Usuário correto!");
            System.out.println("Informe a sua senha: ");
            validSenha = sc.next();

            if (senha.equals(validSenha)) {
                System.out.println("Acesso permitido!");
            }
            else {
                System.out.println("Acesso negado!");
            }
        }
        else {
            System.out.println("Este usuário não existe!");
        }

        sc.close();
    }
}
