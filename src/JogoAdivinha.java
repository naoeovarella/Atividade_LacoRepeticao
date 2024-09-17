import java.util.Scanner;
import java.util.Random;
public class JogoAdivinha {
    public static void main(String[] args) {
        // Criar um objeto Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Criar um objeto Random para gerar o número aleatório
        Random random = new Random();

        // Gerar um número aleatório entre 1 e 100
        int numeroAleatorio = random.nextInt(100) + 1;
        int palpite;

        // Iniciar o jogo
        System.out.println("Tente adivinhar o número que estou pensando (entre 1 e 100).");

        // Continuar pedindo palpites até o usuário acertar
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroAleatorio) {
                System.out.println("Muito baixo! Tente novamente.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Muito alto! Tente novamente.");
            }
        } while (palpite != numeroAleatorio); // Continua enquanto o palpite estiver errado

        // Quando o usuário acerta
        System.out.println("Parabéns! Você adivinhou o número correto: " + numeroAleatorio);

        // Fechar o scanner
        scanner.close();
    }
}
