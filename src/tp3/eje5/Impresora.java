package tp3.eje5;

import java.util.ArrayList;
import java.util.List;

public class Impresora {
    private List<Documento> trabajosEnCola;
    private boolean encendida;
    private boolean imprimiendo;

    public Impresora(boolean encendida, boolean imprimiendo) {
        setEncendida(encendida);
        setImprimiendo(imprimiendo);
        setTrabajosEnCola(new ArrayList<Documento>());
    }

    public List<Documento> getTrabajosEnCola() {
        return trabajosEnCola;
    }

    public void setTrabajosEnCola(List<Documento> trabajosEnCola) {
        this.trabajosEnCola = trabajosEnCola;
    }

    public boolean isEncendida() {
        return encendida;
    }

    private void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public boolean isImprimiendo() {
        return imprimiendo;
    }

    private void setImprimiendo(boolean imprimiendo) {
        this.imprimiendo = imprimiendo;
    }

    public void addDocumento(Documento documento) {
        getTrabajosEnCola().add(documento);
    }

    public void update() {
        if (!getTrabajosEnCola().isEmpty()) {
            setEncendida(true);
            setImprimiendo(true);
        } else {
            setEncendida(false);
            setImprimiendo(false);
        }
    }

    public void imprimirTodo() {
        update();
        for (Documento d : getTrabajosEnCola()) {
            d.imprimite();
        }
        getTrabajosEnCola().clear();
        update();
    }

    public void imprimir(Documento documento) {
        documento.imprimite();
    }
}
