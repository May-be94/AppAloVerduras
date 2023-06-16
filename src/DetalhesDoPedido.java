public class DetalhesDoPedido {
    private final Pedido pedido;
    private final String enderecoEntrega;
    private final String formaPagamento;

    public DetalhesDoPedido(Pedido pedido, String enderecoEntrega, String formaPagamento) {
        this.pedido = pedido;
        this.enderecoEntrega = enderecoEntrega;
        this.formaPagamento = formaPagamento;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
}