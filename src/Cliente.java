import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String email;
    private String endereco;
    private String  senha;
    private LocalDate dataCadastro;

   public Cliente(String nome, String email, String endereco) {
       this.nome = nome;
       this.email = email;
       this.endereco = endereco;
       this.dataCadastro = LocalDate.now();

   }

    public Cliente(String nome, String email, String endereco, String senha) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.senha = senha;
        this.dataCadastro = LocalDate.now();
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", senha='" + senha + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }
}
