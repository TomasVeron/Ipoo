package tp3.eje3;


import tp1.eje1.Punto;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio, Punto origen, String color) {
        super(origen, color);
        setRadio(radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadio(), 2);
    }

    @Override
    public String nombre() {
        return "Circulo";
    }
}
