public class Cliente {
    IProduto produto;
    ProdutoAdapter repositor;

    public Cliente() {
        produto = new ProdutoEstoque();
        repositor = new ProdutoAdapter(produto);
    }

    public void setProduto(String estoque) {
        produto.setProduto(estoque);
        repositor.estocarProduto();
    }

    public String getProduto() {
        return repositor.valorProduto();
    }

    public float getPreco() {
        return repositor.getPreco();
    }
}
