package tp2.eje4;

import java.util.ArrayList;
import java.util.List;

public class Kit extends Componente {

    private float precio;
    private float tiempoDeObra;
    private List<Componente> kits;

    public Kit(int numero, String nombre) {
        super(numero, nombre);
        setKits(new ArrayList<Componente>());
        setPrecio(getPrecio());
        setTiempoDeObra(getTiempoDeObra());
    }

    @Override
    public float getPrecio() {
        float total = 0;
        for (Componente p : getKits()) {
            total += p.getPrecio();
        }
        return total * 0.90f;
    }

    @Override
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public List<Componente> getKits() {
        return kits;
    }

    public void setKits(List<Componente> kits) {
        this.kits = kits;
    }

    public void addComponente(Componente componente) {
        getKits().add(componente);
    }

    @Override
    public float getTiempoDeObra() {
        float total = 0;
        for (Componente p : getKits()) {
            total += p.getTiempoDeObra();
        }
        return total;
    }

    @Override
    public void setTiempoDeObra(float tiempoDeObra) {
        this.tiempoDeObra = tiempoDeObra;
    }
}
