public class Pedido {
    private Frete frete;

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public double calcularFrete(double peso) {
        return frete.calcular(peso);
    }
}