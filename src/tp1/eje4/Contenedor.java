package tp1.eje4;

import java.util.Vector;

public class Contenedor {
    private int nroIdentificacion;
    private String paisDest;
    private float pesoMax;
    private Vector<Articulo> articulos;

    public Contenedor(int nroIdentificacion, String paisDest, float pesoMax) {
        setNroIdentificacion(nroIdentificacion);
        setPaisDest(paisDest);
        setPesoMax(pesoMax);
        setArticulos(new Vector<Articulo>());
    }

    public Contenedor() {
        setArticulos(new Vector<Articulo>());
    }

    public int getNroIdentificacion() {
        return nroIdentificacion;
    }

    public void setNroIdentificacion(int nroIdentificacion) {
        this.nroIdentificacion = nroIdentificacion;
    }

    public String getPaisDest() {
        return paisDest;
    }

    public void setPaisDest(String paisDest) {
        this.paisDest = paisDest;
    }

    public float getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(float pesoMax) {
        this.pesoMax = pesoMax;
    }

    public Vector<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Vector<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void addArticulo(Articulo p) {
        if (getPesoMax() > pesoContenedor()) {
            getArticulos().add(p);
        }
    }

    public float pesoContenedor() {
        float peso = 0;
        for (Articulo a : getArticulos()) {
            peso += a.getPeso();
        }
        return peso;
    }


    public float valorDeLosArticulos() {
        float valor = 0;
        for (Articulo a : getArticulos()) {
            valor += a.getValor();
        }
        return valor;
    }
}
