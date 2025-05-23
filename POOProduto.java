public class POOProduto {

    public static void main(String[] args) {
        
        Produto produto1 = new Produto("vassoura", 20, 50);

        produto1.exibirDetalhes();

        produto1.atualizarQuantidade(10);

        System.out.println(produto1.calcularValorEstoque());
    }
    
}
