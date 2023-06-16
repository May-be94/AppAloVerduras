import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    private List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        Cliente cl1 = new Cliente("joao","joao@email.com","rua 1");
        Cliente cl2 = new Cliente("maria","joao@email.com","rua 1");
        Cliente cl3 = new Cliente("josa","joao@email.com","rua 1");

        Cadastro cadastro = new Cadastro();

        cadastro.cadastrarCliente(cl1,"123");
        cadastro.cadastrarCliente(cl2,"123");
        cadastro.cadastrarCliente(cl3,"123");

        cadastro.exibirClientes();



    }

    public boolean fazerLogin(String nome, String senha) {
            boolean logado = false;
            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getNome().equals(nome) && clientes.get(i).getSenha().equals(senha)){
                    logado = true;
                }
            }
            return logado;
    }
}

