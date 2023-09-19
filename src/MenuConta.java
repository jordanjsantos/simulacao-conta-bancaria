import java.util.Locale;
import java.util.Scanner;

public class MenuConta {

    int saldo = 1000;

    public void criarConta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Conta criada com sucesso");
    }

    public void sacar(double saldo) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o valor do saque: ");
        double valorSaque = scanner.nextDouble();

        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Saque realizado com sucesso");
            System.out.println("Seu saldo é de: " + (saldo - valorSaque));
        }
    }

    public void depositar(double saldo) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o valor do depósito: ");
        double valorDeposito = scanner.nextDouble();

        System.out.println("Depósito realizado com sucesso");
        System.out.println("Seu saldo é de: " + (saldo - valorDeposito));
    }

    public void transferir(double saldo) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o valor da transferência: ");
        double valorTransferencia = scanner.nextDouble();

        System.out.println("Digite o número da conta de destino: ");
        int numeroContaDestino = scanner.nextInt();

        if (valorTransferencia > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            System.out.println("Saque realizado com sucesso");
            System.out.println("Seu saldo é de: " + (saldo - valorTransferencia));
        }
    }

    public void sair() {
        System.out.println("Obrigado por utilizar nossos serviços");
    }

}
