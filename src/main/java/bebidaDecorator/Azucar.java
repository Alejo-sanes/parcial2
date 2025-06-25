package bebidaDecorator;

public class Azucar extends BebidaDecorator {
    public Azucar(bebida.Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + " + Azúcar";
    }

    @Override
    public double getCosto() {
        return bebidaDecorada.getCosto() + 0.10;
    }
}
