package bebida;

public class Chocolate implements Bebida {
    @Override
    public String getDescripcion() {
        return "Chocolate";
    }

    @Override
    public double getCosto() {
        return 2.50;
    }
}
