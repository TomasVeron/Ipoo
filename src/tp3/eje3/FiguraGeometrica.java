package tp3.eje3;

public interface FiguraGeometrica {

    public double area();

    public void mover(int unPunto, String dirección);

    public String nombre();

    public String getColor();

    public default void imprimir() {
        System.out.println("Nombre: " + this.nombre() + " color: " + this.getColor() + " area: " + this.area());
    }


}
