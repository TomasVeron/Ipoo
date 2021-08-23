package tp4.eje3;

public class SinTrabajoEnColaException extends Exception {

    private String nombre;

    public SinTrabajoEnColaException(String nom) {
        this.nombre = nom;
    }

    @Override
    public String getMessage() {
        return "La cola " + nombre + " no tiene trabajos para procesar. ";
    }
}
