import java.util.Scanner;
public class ContagemRegressiva {
    public static void main(String[] args) {
        // Criar um objeto Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário insira um número inicial
        System.out.print("Digite um número inicial para a contagem regressiva: ");
        int numero = scanner.nextInt();

        // Executar a contagem regressiva usando um loop while
        while (numero >= 0) {
            System.out.println(numero);
            numero--; // Decrementa o número em 1 a cada iteração
        }

        // Fechar o scanner
        scanner.close();

        System.out.println("Contagem regressiva finalizada!");
    }
}

