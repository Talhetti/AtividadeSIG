public class Bijuteria extends Produto {
    private String peso;

    public Bijuteria(String nome, double preco, String peso) {
        super(nome, preco);
        this.peso = peso;
    }

    public String getMaterial() {
        return peso;
    }

    public int getValorMaterial() {
        if (peso.equals("Ouro")) {
            return 70;
        } else if (peso.equals("Prata")) {
            return 50;
        } else {
            return 30;
        }
    }

    @Override
    public double calcularDesconto(double porcentagem) {
        double ValorMaterial = getValorMaterial();
        return getPreco() * (200 - porcentagem + ValorMaterial/ 100);
    }
}
