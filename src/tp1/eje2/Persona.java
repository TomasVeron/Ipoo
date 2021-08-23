package tp1.eje2;

import java.util.Date;

public class Persona {

    private String nombre;
    private String apellido;
    private Date fechaNac;
    private int dni;
    private int edad;

    public Persona(String nombre, String apellido, Date fechaNac, int dni, int edad) {
        setNombre(nombre);
        setApellido(apellido);
        setFechaNac(fechaNac);
        setDni(dni);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
