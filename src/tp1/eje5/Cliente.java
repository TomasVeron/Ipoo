package tp1.eje5;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Cuenta cuenta;
    private List<Contacto> contactos;
    private List<Correo> recibidos;
    private List<Correo> enviados;

    public Cliente(Cuenta cuenta) {
        setCuenta(cuenta);
        setContactos(new ArrayList<Contacto>());
        setEnviados(new ArrayList<Correo>());
        setRecibidos(new ArrayList<Correo>());
    }

    public Cliente() {
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    public List<Correo> getRecibidos() {
        return recibidos;
    }

    public void setRecibidos(List<Correo> recibidos) {
        this.recibidos = recibidos;
    }

    public List<Correo> getEnviados() {
        return enviados;
    }

    public void setEnviados(List<Correo> enviados) {
        this.enviados = enviados;
    }

    public int cantidadCorreos() {
        return getEnviados().size() + getRecibidos().size();
    }

    public int cantidadCorreosRecividos() {
        return getRecibidos().size();
    }

    public int cantidadCorreosEnviados() {
        return getEnviados().size();
    }

    public int CantidadCorreosNoLeidos() {
        int a = 0;
        for (Correo c : getRecibidos())
            if (!c.getLeido()) a += 1;
        return a;
    }

    public int CantidadContactos() {
        return getContactos().size();
    }

    public void AgregarCorreoRecibido(Correo unCorreo) {
        getRecibidos().add(unCorreo);
    }

    public void EnviarCorreo(String asunto, String texto, Contacto destino) {
        getEnviados().add(new Correo(asunto, texto, false, new Contacto(getCuenta().getNombreUsuario(), getCuenta().getDireccionMail()), destino));
    }

}
