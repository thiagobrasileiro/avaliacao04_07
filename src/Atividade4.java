import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Digite um nota de 0 a 100");
        int nota= scanner.nextInt();
if (nota <=100 && nota>=90){
    System.out.println("Sua nota é 'A'");
} else if (nota>=80 && nota<=89) {
    System.out.println("Sua nota é 'B'");
} else if (nota>=70 && nota<=79) {
    System.out.println("Sua nota é 'C'");
} else if (nota>=60 && nota<=69) {
    System.out.println("Sua nota é 'D'");
}else if (nota<=59){
    System.out.println("Sua nota é 'E'");
}
    }
}
