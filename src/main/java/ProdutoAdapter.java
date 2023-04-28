public class ProdutoAdapter extends ProdutoPreco{
    private IProduto produtoEstoque;

    public ProdutoAdapter(IProduto produtoEstoque) {
        this.produtoEstoque = produtoEstoque;
    }

    public String valorProduto() {
        if (this.getPreco() >= 19.0f)
            produtoEstoque.setProduto("Arroz");
        else
        if (this.getPreco() >= 12.0f)
            produtoEstoque.setProduto("Feijão");
        else
        if (this.getPreco() >= 5.0f)
            produtoEstoque.setProduto("Macarrão");
        else
            produtoEstoque.setProduto("Sem Produto");
        return produtoEstoque.getProduto();
    }

    public void estocarProduto() {
        if (produtoEstoque.getProduto().equals("Arroz"))
            this.setPreco(19.0f);
        else
        if (produtoEstoque.getProduto().equals("Feijão"))
            this.setPreco(12.0f);
        else
        if (produtoEstoque.getProduto().equals("Macarrão"))
            this.setPreco(5.0f);
        else
            this.setPreco(0.0f);
    }
}
