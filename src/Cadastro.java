import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Cliente> clientes;

    public Cadastro() {
        clientes = new ArrayList<>();
    }

    private void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    private void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void exibirClientes() {
        System.out.println("Lista de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public void cadastrarCliente(Cliente cliente, String senha) {
        cliente.setSenha(senha);
        adicionarCliente(cliente);
        System.out.println("Cliente cadastrado: " + cliente.toString());
    }

}
