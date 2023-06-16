import java.time.LocalDate;

public class Estoque {
    private String tipoProduto;
    private int idProduto;
    private LocalDate validade;

    public Estoque(String tipoProduto, int idProduto, LocalDate validade) {
        this.tipoProduto = tipoProduto;
        this.idProduto = idProduto;
        this.validade = validade;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }


    public String toString() {
        return "Estoque{" +
                "tipoProduto='" + tipoProduto + '\'' +
                ", idProduto=" + idProduto +
                ", validade=" + validade +
                '}';
    }
}
