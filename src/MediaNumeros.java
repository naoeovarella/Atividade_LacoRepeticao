import java.util.Scanner;
public class MediaNumeros {
    public static void main(String[] args) {
        // Criar um objeto Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário o número de entradas "n"
        System.out.print("Quantos números você deseja inserir? ");
        int n = scanner.nextInt();

        // Variável para armazenar a soma dos números
        double soma = 0;

        // Loop para solicitar "n" números e calcular a soma
        for (int i = 1; i <= n; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = scanner.nextDouble();
            soma += numero; // Adiciona o número à soma
        }

        // Calcular a média
        double media = soma / n;

        // Exibir o resultado
        System.out.println("A média dos números inseridos é: " + media);

        // Fechar o scanner
        scanner.close();
    }
}
