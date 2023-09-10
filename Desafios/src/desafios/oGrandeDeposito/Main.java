package desafios.oGrandeDeposito;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0;
        double valor = scanner.nextDouble();

        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.printf("Saldo atual: R$ %.2f\n", saldo);
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");
        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
    }
}