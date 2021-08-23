package tp3.eje5;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeInformacion {
    private List<Impresora> impresoras;

    public SistemaDeInformacion() {
        setImpresoras(new ArrayList<Impresora>());
    }


    public List<Impresora> getImpresoras() {
        return impresoras;
    }

    public void setImpresoras(List<Impresora> impresoras) {
        this.impresoras = impresoras;
    }

    public void addImpresora(Impresora impresora) {
        getImpresoras().add(impresora);
    }

    public void removeImpresora(Impresora impresora) {
        getImpresoras().remove(impresora);
    }

    public void mostrarEstado(Impresora impresora) {
        System.out.println(String.format("encendida: %s\nimprimiendo: %s", impresora.isEncendida(), impresora.isImprimiendo()));
    }
}

