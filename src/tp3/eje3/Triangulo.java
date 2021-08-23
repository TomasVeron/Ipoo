package tp3.eje3;

import tp1.eje1.Punto;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura, Punto origen, String color) {
        super(origen, color);
        setBase(base);
        setAltura(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (getBase() * getAltura()) / 2;
    }

    @Override
    public String nombre() {
        return "Triangulo";
    }
}
