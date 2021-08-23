package tp2.eje4;

public abstract class Componente {
    private int numero;
    private String nombre;


    public Componente(int numero, String nombre) {
        setNombre(nombre);
        setNumero(numero);
    }

    public Componente() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract float getPrecio();

    public abstract void setPrecio(float precio);

    public abstract float getTiempoDeObra();

    public abstract void setTiempoDeObra(float tiempoDeObra);
}
