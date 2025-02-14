package exercicios;
import java.util.Scanner;
public class Circunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();

        double area = PI * raio * raio;
        double perimetro = 2 * PI * raio;

        System.out.printf("A área é %.2f cm²%n", area);
        System.out.printf("O perímetro é %.2f cm%n", perimetro);
        scanner.close();
    }
}
