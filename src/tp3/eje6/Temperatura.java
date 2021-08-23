package tp3.eje6;

public class Temperatura {

    private double valor;
    private Escala escala;

    public Temperatura(double valor, Escala escala) {
        setValor(valor);
        setEscala(escala);
    }

    public Temperatura() {
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

    public int comparteTo(Temperatura t) {
        return (int) (getValor() - t.getValor());
    }
}
