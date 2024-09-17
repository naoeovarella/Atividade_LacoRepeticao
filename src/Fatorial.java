import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        // Criar um objeto Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário insira um número
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        // Variável para armazenar o fatorial
        int fatorial = 1;
        int i = numero;

        // Calcular o fatorial usando um loop do-while
        do {
            fatorial *= i; // Multiplica o fatorial pelo valor atual de i
            i--;           // Decrementa o valor de i
        } while (i > 0);   // Continua o loop até que i seja igual a 0

        // Exibir o resultado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        // Fechar o scanner
        scanner.close();
    }
}

