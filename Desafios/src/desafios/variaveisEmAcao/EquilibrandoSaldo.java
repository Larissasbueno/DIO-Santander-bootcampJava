package desafios.variaveisEmAcao;

import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

        // Calcula o saldo atualizado
        saldoAtual += valorDeposito - valorRetirada;

        // Formata o saldo com uma casa decimal
        saldoAtual = Math.round(saldoAtual * 10.0) / 10.0;

        // Imprime o saldo atualizado na conta
        System.out.println("Saldo atualizado na conta: " + saldoAtual);
    }
}
