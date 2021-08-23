package tp1.eje5;

public class Contacto {
    private String nombre;
    private String direccionMail;

    public Contacto(String nombre, String direccionMail) {
        setNombre(nombre);
        setDireccionMail(direccionMail);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionMail() {
        return direccionMail;
    }

    public void setDireccionMail(String direccionMail) {
        this.direccionMail = direccionMail;
    }
}
