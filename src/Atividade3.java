import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tarifa = 4.00;
        System.out.println(" Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println("Você é estudante?");
        System.out.println("n-para não");
        System.out.println("s-para sim");
        String estudante = scanner.next();
        if (idade < 6 || idade > 65) {
            System.out.println("o valor a pagar é R$ 0.0");
        }else if (idade > 6 && idade < 25 && estudante.equals("s")) {
            System.out.println("você pagara o valor de " + tarifa/2);
        }else if (idade<6 && idade>25 && estudante.equals("n")){
            System.out.println("Você pagara o valor de " + tarifa);
        }else {
            System.out.println("você pagara o valor de " + tarifa);
        }
    }
}
