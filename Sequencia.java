package exercicios;
import java.util.Scanner;
public class Sequencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x = scanner.nextInt();

        while (x != 1) {
            System.out.print(x + " -> ");
            x = (x % 2 == 0) ? x / 2 : 3 * x + 1;
        }

        System.out.println(x);
        scanner.close();
    }
}
