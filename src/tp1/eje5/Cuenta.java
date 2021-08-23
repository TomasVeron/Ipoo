package tp1.eje5;

public class Cuenta {
    private String nombreUsuario;
    private String direccionMail;
    private String servidorEntrada;
    private String servidorSalida;

    public Cuenta(String nombreUsuario, String direccionMail, String servidorEntrada, String servidorSalida) {
        setNombreUsuario(nombreUsuario);
        setDireccionMail(direccionMail);
        setServidorEntrada(servidorEntrada);
        setServidorSalida(servidorSalida);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDireccionMail() {
        return direccionMail;
    }

    public void setDireccionMail(String direccionMail) {
        this.direccionMail = direccionMail;
    }

    public String getServidorEntrada() {
        return servidorEntrada;
    }

    public void setServidorEntrada(String servidorEntrada) {
        this.servidorEntrada = servidorEntrada;
    }

    public String getServidorSalida() {
        return servidorSalida;
    }

    public void setServidorSalida(String servidorSalida) {
        this.servidorSalida = servidorSalida;
    }
}
