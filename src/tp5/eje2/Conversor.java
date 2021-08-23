package tp5.eje2;

import java.util.Observable;

public class Conversor extends Observable {
    private Money aConvertir;
    private double dineroInicial;
    private Money convertida;
    private double dineroFinal;

    public Money getaConvertir() {
        return aConvertir;
    }

    public void setaConvertir(Money aConvertir) {
        this.aConvertir = aConvertir;
    }

    public double getDineroInicial() {
        return dineroInicial;
    }

    public void setDineroInicial(double dineroInicial) {
        this.dineroInicial = dineroInicial;
    }

    public Money getConvertida() {
        return convertida;
    }

    public void setConvertida(Money convertida) {
        this.convertida = convertida;
    }

    public double getDineroFinal() {
        return dineroFinal;
    }

    public void setDineroFinal(double dineroFinal) {
        this.dineroFinal = dineroFinal;
    }

    public void convetir() {
        switch (getaConvertir()) {
            case Euro:
                switch (getConvertida()) {
                    case Euro:
                        setDineroFinal(getDineroInicial());
                        break;
                    case Dolar:
                        setDineroFinal(getDineroInicial() * 1.16);
                        break;
                    case Pesos:
                        setDineroFinal(getDineroInicial() * 91.58);
                        break;
                }
                break;
            case Dolar:
                switch (getConvertida()) {
                    case Euro:
                        setDineroFinal(getDineroInicial() * 0.86);
                        break;
                    case Dolar:
                        setDineroFinal(getDineroInicial());
                        break;
                    case Pesos:
                        setDineroFinal(getDineroInicial() * 78.68);
                        break;
                }
                break;
            case Pesos:
                switch (getConvertida()) {
                    case Euro:
                        setDineroFinal(getDineroInicial() * 0.011);
                        break;
                    case Dolar:
                        setDineroFinal(getDineroInicial() * 0.013);
                        break;
                    case Pesos:
                        setDineroFinal(getDineroInicial());
                        break;
                }
                break;
        }
    }

    public void action(Money aConvertir, Money convertida, double dineroInicial) {
        setaConvertir(aConvertir);
        setConvertida(convertida);
        setDineroInicial(dineroInicial);
        convetir();
        setChanged();
        notifyObservers();

    }


}
