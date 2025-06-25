package bebidaDecorator;

public class Canela extends BebidaDecorator {
    public Canela(bebida.Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + " + Canela";
    }

    @Override
    public double getCosto() {
        return bebidaDecorada.getCosto() + 0.20;
    }
}
