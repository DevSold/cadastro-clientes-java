import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void adicionarCliente() {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        Cliente novo = new Cliente(nome, cpf, email);
        clientes.add(novo);
        System.out.println("Cliente adicionado com sucesso!");
    }

    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        System.out.println("\n--- Lista de Clientes ---");
        for (Cliente c : clientes) {
            c.exibir();
        }
    }

    public void buscarPorCpf() {
        System.out.print("Digite o CPF para busca: ");
        String cpfBusca = scanner.nextLine();

        boolean encontrado = false;
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpfBusca)) {
                c.exibir();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Cliente não encontrado.");
        }
    }
}
