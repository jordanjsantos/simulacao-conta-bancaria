import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao banco");
        System.out.println("------------------");
        System.out.println("Digite 1 para criar uma conta");
        System.out.println("Digite 2 para sacar");
        System.out.println("Digite 3 para depositar");
        System.out.println("Digite 4 para transferir");
        System.out.println("Digite 5 para sair");
        int opcao = scanner.nextInt();

        MenuConta menuConta = new MenuConta();

        if (opcao == 1) {
            menuConta.criarConta();
        } else if (opcao == 2) {
            menuConta.sacar(opcao);
        } else if (opcao == 3) {
            menuConta.depositar(opcao);
        } else if (opcao == 4) {
            menuConta.transferir(opcao);
        } else if (opcao == 5) {
            menuConta.sair();
        } else {
            System.out.println("Opção inválida");
        }
    }

}