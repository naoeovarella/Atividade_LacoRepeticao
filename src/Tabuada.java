import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        // Criar um objeto Scanner para obter a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário insira um número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        // Exibir a tabuada de 1 a 10 usando um loop for
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fechar o scanner
        scanner.close();
    }
}

