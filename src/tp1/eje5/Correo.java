package tp1.eje5;

import java.util.Vector;

public class Correo {
    private String asunto;
    private String texto;
    private Boolean leido;
    private Contacto origen;
    private Vector<Contacto> destino;

    public Correo(String asunto, String texto, Boolean leido, Contacto origen, Contacto destino) {
        setAsunto(asunto);
        setTexto(texto);
        setLeido(leido);
        setOrigen(origen);
        setDestino(new Vector<Contacto>());
        getDestino().add(destino);
    }

    public Correo(String asunto, String texto, Boolean leido, Contacto origen, Vector<Contacto> destinos) {
        setAsunto(asunto);
        setTexto(texto);
        setLeido(leido);
        setOrigen(origen);
        setDestino(destinos);
    }

    public Correo() {
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Boolean getLeido() {
        return leido;
    }

    public void setLeido(Boolean leido) {
        this.leido = leido;
    }

    public Contacto getOrigen() {
        return origen;
    }

    public void setOrigen(Contacto origen) {
        this.origen = origen;
    }

    public Vector<Contacto> getDestino() {
        return destino;
    }

    public void setDestino(Vector<Contacto> destino) {
        this.destino = destino;
    }
}
