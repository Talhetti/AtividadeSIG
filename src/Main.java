public class Main {
    public static void main(String[] args) {
        Estoque p = new Estoque();
        Produto bijuteria = new Bijuteria("Anel", 10, "Ouro");
        Produto comida = new Comida("Bolo", 5, 0.2);
        p.adicionarProduto(bijuteria);
        p.adicionarProduto(comida);
        p.removerProduto(comida);
        p.exibirPrecosComDesconto(p.produtos);
    }
}