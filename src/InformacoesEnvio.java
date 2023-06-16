public class InformacoesEnvio {
    private int numeroPedido;
    private int numeroProduto;
    private String nomeProduto;
    private int quantidade;
    private double valorUnitario;
    private double subtotal;

    public InformacoesEnvio(int numeroPedido, int numeroProduto, String nomeProduto, int quantidade, double valorUnitario) {
        this.numeroPedido = numeroPedido;
        this.numeroProduto = numeroProduto;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.subtotal = quantidade * valorUnitario;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getNumeroProduto() {
        return numeroProduto;
    }

    public void setNumeroProduto(int numeroProduto) {
        this.numeroProduto = numeroProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        calcularSubtotal();
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
        calcularSubtotal();
    }

    public double getSubtotal() {
        return subtotal;
    }

    private void calcularSubtotal() {
        this.subtotal = quantidade * valorUnitario;
    }

    @Override
    public String toString() {
        return "InformacoesEnvio{" +
                "numeroPedido=" + numeroPedido +
                ", numeroProduto=" + numeroProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", quantidade=" + quantidade +
                ", valorUnitario=" + valorUnitario +
                ", subtotal=" + subtotal +
                '}';
    }
}
