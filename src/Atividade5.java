import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 7");
        int numeroDigitado= scanner.nextInt();
        switch (numeroDigitado){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Número invalido, digite um número entre 1 e 7");
        }
    }
}
