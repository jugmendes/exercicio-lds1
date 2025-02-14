package exercicios;
import java.util.Scanner;
import java.util.Random;
public class Advinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(101);
        int tentativas = 10;

        System.out.println("Adivinhe o número entre 0 e 100!");

        while (tentativas > 0) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou!");
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            tentativas--;
            System.out.println("Tentativas restantes: " + tentativas);
        }

        if (tentativas == 0) {
            System.out.println("Fim do jogo! O número era: " + numeroSecreto);
        }

        scanner.close();
    }

}
