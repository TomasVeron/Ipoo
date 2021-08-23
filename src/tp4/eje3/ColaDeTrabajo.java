package tp4.eje3;

import java.util.LinkedList;
import java.util.Queue;

public class ColaDeTrabajo {
    private String nombre;
    private boolean lista;
    private Queue<Trabajo> colaDeTrabajos;

    public ColaDeTrabajo(String nombre, boolean lista) {
        setNombre(nombre);
        setLista(lista);
        setColaDeTrabajos(new LinkedList<>());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLista() {
        return lista;
    }

    public void setLista(boolean lista) {
        this.lista = lista;
    }

    public Queue<Trabajo> getColaDeTrabajos() {
        return colaDeTrabajos;
    }

    public void setColaDeTrabajos(Queue<Trabajo> colaDeTrabajos) {
        this.colaDeTrabajos = colaDeTrabajos;
    }

    public Trabajo sacar() throws NoListaException, SinTrabajoEnColaException {
        if (!isLista()) {
            throw new NoListaException(getNombre(), getColaDeTrabajos().size());
        }
        if (getColaDeTrabajos().size() == 0) {
            throw new SinTrabajoEnColaException(getNombre());
        }
        return getColaDeTrabajos().poll();
    }

    public void poner(Trabajo t) {
        getColaDeTrabajos().add(t);
    }
}
