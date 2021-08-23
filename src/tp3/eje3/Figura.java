package tp3.eje3;

import tp1.eje1.Punto;

public abstract class Figura implements FiguraGeometrica {
    private Punto origen;
    private String color;

    public Figura(Punto origen, String color) {
        setColor(color);
        setOrigen(origen);
    }

    public Punto getOrigen() {
        return origen;
    }

    public void setOrigen(Punto origen) {
        this.origen = origen;
    }


    @Override
    public void mover(int unPunto, String dirección) {
        switch (dirección.toLowerCase()) {
            case "north":
                getOrigen().setY(getOrigen().getY() + unPunto);
                System.out.println("x: " + getOrigen().getX() + "y: " + getOrigen().getY());
                break;
            case "south":
                getOrigen().setY(getOrigen().getY() - unPunto);
                System.out.println("x: " + getOrigen().getX() + "y: " + getOrigen().getY());
                break;
            case "west":
                getOrigen().setX(getOrigen().getX() - unPunto);
                System.out.println("x: " + getOrigen().getX() + "y: " + getOrigen().getY());
                break;
            case "east":
                getOrigen().setX(getOrigen().getX() + unPunto);
                System.out.println("x: " + getOrigen().getX() + "y: " + getOrigen().getY());
                break;
        }
    }

    @Override
    public abstract String nombre();

    @Override
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}


