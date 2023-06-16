public class Entregador {
    private String nome;
    private int idEntregador;
    private String celular;
    private String veiculo;
    private int idVeiculo;

    public Entregador(String nome, int idEntregador, String celular, String veiculo, int idVeiculo) {
        this.nome = nome;
        this.idEntregador = idEntregador;
        this.celular = celular;
        this.veiculo = veiculo;
        this.idVeiculo = idVeiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdEntregador() {
        return idEntregador;
    }

    public void setIdEntregador(int idEntregador) {
        this.idEntregador = idEntregador;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    @Override
    public String toString() {
        return "Entregador{" +
                "nome='" + nome + '\'' +
                ", idEntregador=" + idEntregador +
                ", celular='" + celular + '\'' +
                ", veiculo='" + veiculo + '\'' +
                ", idVeiculo=" + idVeiculo +
                '}';
    }
}
