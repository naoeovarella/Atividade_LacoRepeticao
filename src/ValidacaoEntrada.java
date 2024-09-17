import java.util.Scanner;
public class ValidacaoEntrada {
    public static void main(String[] args) {
        // Criar um objeto Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        int idade;

        // Loop para solicitar a idade até que seja fornecida uma idade válida
        do {
            System.out.print("Digite sua idade (maior que 0): ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                System.out.println("Idade inválida. Tente novamente.");
            }
        } while (idade <= 0); // Continua solicitando enquanto a idade for inválida

        // Exibir a idade válida
        System.out.println("Idade válida fornecida: " + idade);

        // Fechar o scanner
        scanner.close();
    }
}
