package bebida;

public class Te implements Bebida {
    @Override
    public String getDescripcion() {
        return "Té";
    }

    @Override
    public double getCosto() {
        return 1.50;
    }
}
