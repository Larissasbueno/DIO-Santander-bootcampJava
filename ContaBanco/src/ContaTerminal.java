import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para receber entrada do usuário via terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número da Agência
        System.out.print("Programa: \"Por favor, digite o número da Agência!\": ");
        String agencia = scanner.nextLine();

        // Solicita ao usuário que insira o número da Conta
        System.out.print("Programa: \"Agora, digite o número da Conta!\": ");
        int numero = scanner.nextInt();

        // Limpa o buffer do Scanner
        scanner.nextLine();

        // Solicita ao usuário que insira o nome do cliente
        System.out.print("Programa: \"Por favor, digite o nome do Cliente!\": ");
        String nomeCliente = scanner.nextLine();

        // Solicita ao usuário que insira o saldo
        System.out.print("Programa: \"Digite o saldo da conta!\": ");
        double saldo = scanner.nextDouble();

        // Fecha o Scanner, pois não será mais utilizado
        scanner.close();

        // Exibe as informações da conta bancária
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}

