package desafios.cofreSeguro;
import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {
    private int senha;
    private boolean aberto = false;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }

    public void abrirCofre(int senhaDigitada) {
        if (validarSenha(senhaDigitada)) {
            System.out.println("Cofre aberto!");
            aberto = true;
        } else {
            System.out.println("Senha incorreta!");
        }
    }

    public boolean isAberto() {
        return aberto;
    }
}

class CofreFisico extends Cofre {
    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }
}

public class Desafio {
    public static void main(String[] args) {
        // Lê o tipo de cofre (primeira linha da entrada)
        Scanner scanner = new Scanner(System.in);
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            // Se o cofre for digital, solicita a senha
            int senha = scanner.nextInt();
            CofreDigital cofreDigital = new CofreDigital(senha);

            // Exibe as informações do cofre antes de verificar a senha
            cofreDigital.imprimirInformacoes();

            // Abre o cofre se a senha estiver correta
            int senhaDigitada = scanner.nextInt();
            cofreDigital.abrirCofre(senhaDigitada);
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            // Se o cofre for físico, cria o cofre e exibe as informações
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
        }

        scanner.close();
    }
}

