package desafios.abrindoContas;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta = scanner.nextInt();

        scanner.nextLine(); // Limpa o buffer
        String nomeTitular = scanner.nextLine();

        double saldoInicial = scanner.nextDouble();

        // TODO: Criar uma instância de "ContaBancaria" com os valores de Entrada.
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);

        System.out.println("Informacoes: ");
        // TODO: Imprimir as informações da conta usando o objeto criado no TODO acima.
        conta.exibirInformacoes();

        // Fechar o Scanner para liberar recursos
        scanner.close();
    }
}

class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldoInicial;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldoInicial = saldoInicial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldoInicial;
    }

    // Método para exibir as informações da conta
    public void exibirInformacoes() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Saldo: R$ " + saldoInicial);
    }
}
