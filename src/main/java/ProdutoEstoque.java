public class ProdutoEstoque implements IProduto{
    private String estoque;

    @Override
    public String getProduto() {
        return this.estoque;
    }

    @Override
    public void setProduto(String estoque) {
        this.estoque = estoque;
    }
}
