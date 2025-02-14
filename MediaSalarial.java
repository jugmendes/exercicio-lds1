package exercicios;
import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o salário do funcionário " + i + ": ");
            soma += scanner.nextDouble();
        }

        double media = soma / 5;
        System.out.printf("A média de salários desta empresa é R$ %.2f%n", media);
        scanner.close();
    }
}
