package tp2.eje2;

public class Jugador {
    private String nombre;
    private String posicion;

    public Jugador(String nombre, String posicion) {
        setNombre(nombre);
        setPosicion(posicion);
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
