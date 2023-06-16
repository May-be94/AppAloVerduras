import java.util.Date;

public class Pedido {
    private int numeroPedido;
    private Date dataPedido;
    private Carrinho carrinho;

    public Pedido(int numeroPedido, Date dataPedido, Carrinho carrinho) {
        this.numeroPedido = numeroPedido;
        this.dataPedido = dataPedido;
        this.carrinho = carrinho;
    }

    public Pedido() {
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}
