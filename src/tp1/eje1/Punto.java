package tp1.eje1;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void sumar(int x) {
        setX(getX() + x);
        setY(getY() + x);
    }

    public void sumar(Punto unPunto) {
        setX(getX() + unPunto.getX());
        setY(getY() + unPunto.getY());
    }

    public double distancia(Punto unPunto) {
        return Math.sqrt(Math.pow(unPunto.getX() - getX(), 2) + Math.pow(unPunto.getY() - getY(), 2));
    }


}
