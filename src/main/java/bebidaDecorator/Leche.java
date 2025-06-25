package bebidaDecorator;

public class Leche extends BebidaDecorator {
    public Leche(bebida.Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + " + Leche";
    }

    @Override
    public double getCosto() {
        return bebidaDecorada.getCosto() + 0.30;
    }
}
