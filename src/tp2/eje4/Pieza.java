package tp2.eje4;

public class Pieza extends Componente {

    private float precio;
    private float tiempoDeObra;

    public Pieza(int numero, String nombre, float tiempoDeObra, float precio) {
        super(numero, nombre);
        setTiempoDeObra(tiempoDeObra);
        setPrecio(precio);
    }

    public Pieza() {
    }

    @Override
    public float getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public float getTiempoDeObra() {
        return tiempoDeObra;
    }

    @Override
    public void setTiempoDeObra(float tiempoDeObra) {
        this.tiempoDeObra = tiempoDeObra;
    }
}
