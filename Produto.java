public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome + ", preço: " + preco + ", quantidade: " + quantidade + ".");
    }
    public void atualizarQuantidade(int novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidade += novaQuantidade;
            System.out.println("Quantidade atualizada do produto: " + quantidade);
        }else {
            System.out.println("Quantidade inválida.");
        }
    }
    public double calcularValorEstoque() {
        return preco * quantidade;
    }
}
