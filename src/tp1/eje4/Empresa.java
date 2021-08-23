package tp1.eje4;

import java.util.Vector;

public class Empresa {
    private String nombre;
    private String direccion;
    private Vector<Contenedor> contenedores;

    public Empresa(String nombre, String direccion) {
        setNombre(nombre);
        setDireccion(direccion);
        setContenedores(new Vector<Contenedor>());
    }

    public Empresa() {
        setContenedores(new Vector<Contenedor>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Vector<Contenedor> getContenedores() {
        return contenedores;
    }

    public void setContenedores(Vector<Contenedor> contenedores) {
        this.contenedores = contenedores;
    }

    public void addContenedor(Contenedor p) {
        getContenedores().add(p);
    }


    public float pesoArticulo(Articulo unArticulo) {
        return unArticulo.getPeso();
    }


    public float pesoContenedor(Contenedor unContenedor) {
        return unContenedor.pesoContenedor();
    }

    public float pesoContenedores() {
        float p = 0;
        for (Contenedor c : getContenedores()) {
            p += c.pesoContenedor();
        }
        return p;
    }


    public float valorDeLosArticulos(Contenedor unContenedor) {
        return unContenedor.valorDeLosArticulos();
    }

    public float valorDeTodosLosArticulo() {
        float valor = 0;
        for (Contenedor c : getContenedores()) {
            valor += c.valorDeLosArticulos();
        }
        return valor;
    }


}
