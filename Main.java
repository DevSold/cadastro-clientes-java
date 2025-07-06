import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClienteService service = new ClienteService();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n====== MENU ======");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar cliente por CPF");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    service.adicionarCliente();
                    break;
                case 2:
                    service.listarClientes();
                    break;
                case 3:
                    service.buscarPorCpf();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
