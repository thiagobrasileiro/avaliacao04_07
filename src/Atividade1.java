import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Faça seu Login digitando seu nome de usuário");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Digite sua Senha");
        int senha = scanner.nextInt();
        if (senha == 1234 && nomeUsuario.equalsIgnoreCase("admin")) {
            System.out.println("Login bem-sucedido");
        } else {
            System.out.println("Login inválido, conta bloqueada");
        }
    }
}
