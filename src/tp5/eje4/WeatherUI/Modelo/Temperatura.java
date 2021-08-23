package tp5.eje4.WeatherUI.Modelo;

public class Temperatura implements Comparable<Temperatura> {

    private double valor;
    private Escala escala;

    public Temperatura(double valor, Escala escala) {
        setValor(valor);
        setEscala(escala);
    }

    public Temperatura() {
    }

    public Temperatura(double valor) {
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Escala getEscala() {
        return escala;
    }

    public void setEscala(Escala escala) {
        this.escala = escala;
    }


    @Override
    public int compareTo(Temperatura o) {
        return (int) (getValor() - o.getValor());
    }
}
