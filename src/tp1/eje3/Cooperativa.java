package tp1.eje3;

import java.util.Vector;

public class Cooperativa {

    private Vector<Chofer> socios;
    private Vector<Colectivo> colectivos;

    public Cooperativa() {
        setSocios(new Vector<Chofer>());
        setColectivos(new Vector<Colectivo>());
    }

    public Vector<Chofer> getSocios() {
        return socios;
    }

    public void setSocios(Vector<Chofer> socios) {
        this.socios = socios;
    }

    public Vector<Colectivo> getColectivos() {
        return colectivos;
    }

    public void setColectivos(Vector<Colectivo> colectivos) {
        this.colectivos = colectivos;
    }

    public Chofer realizarViaje(int cantPasajeros, float cantKmts) {
        Chofer c = new Chofer();
        for (Chofer x : getSocios())
            if (x.puedeLlevar() >= cantPasajeros) {
                c = x;
                break;
            }
        c.registrarKm(cantKmts);
        return c;
    }

    public void addSocio(Chofer c) {
        getSocios().add(c);
        getColectivos().add(c.getColectivo());
    }

    public Colectivo mayorKilometro() {
        float c = 0;
        Colectivo colectivo = new Colectivo();
        for (Colectivo x : getColectivos()) {
            if (x.getKmRecorridos() > c) {
                c = x.getKmRecorridos();
                colectivo = x;
            }
        }
        return colectivo;
    }


}
