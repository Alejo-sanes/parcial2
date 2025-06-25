package bebidaDecorator;

import bebida.Bebida;

public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebidaDecorada) {
        this.bebidaDecorada = bebidaDecorada;
    }
}
