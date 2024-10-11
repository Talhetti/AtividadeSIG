import java.util.ArrayList;
import java.util.List;

public class Estoque {
    public List<Produto> produtos;

    public Estoque(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void exibirPrecosComDesconto(List<Produto> produtos) {
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " R$ " + produto.calcularDesconto(10));
        }
    }
}