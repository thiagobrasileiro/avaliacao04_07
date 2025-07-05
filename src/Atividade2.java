import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que você deseja pegar emprestado.");
        double valorEmprestado = scanner.nextDouble();
        System.out.println("Digite em quantas parcelas deseja usar para dividir esse valor, de 1 a 24x.");
        int parcelas = scanner.nextInt();
        System.out.println("Digite o valor do seu sálario.");
        double salario = scanner.nextDouble();
        double valorParcela = (valorEmprestado / parcelas);
         if (parcelas <1 || parcelas>24) {
             System.out.println("Empréstimo reprovado, número de parcelas é invalido");
         }else if (valorParcela < salario) {
                System.out.println("empréstimo aprovado, valor de cada parcela é de " + valorParcela);
            } else if (valorParcela > salario) {
                System.out.println("Empréstimo reprovado,parcela muito alta");

            }
        }
    }

