package tp2.eje1;

import java.util.Date;

public class Plato {

    private String nombre;
    private float valor;
    private Date fechaDisponible;

    public Plato(String nombre, float valor, Date fechaDisponible) {
        setNombre(nombre);
        setValor(valor);
        setFechaDisponible(fechaDisponible);
    }

    public Plato() {
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getFechaDisponible() {
        return fechaDisponible;
    }

    public void setFechaDisponible(Date fechaDisponible) {
        this.fechaDisponible = fechaDisponible;
    }
}
