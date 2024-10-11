public class Comida extends Produto {
    private double peso;

    public Comida(String nome, double preco, double peso) {
        super(nome, preco);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        return getPreco() * (1 - porcentagem / 100);
    }
}
