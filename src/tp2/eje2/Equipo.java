package tp2.eje2;

import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;
    private String directorTecnico;

    public Equipo(String nombre, List<Jugador> jugadores, String directorTecnico) {
        setNombre(nombre);
        setJugadores(jugadores);
        setDirectorTecnico(directorTecnico);
    }

    public Equipo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }
}
