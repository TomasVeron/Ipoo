package tp2.eje3;

//abstract builder
public abstract class PanBuilder {
    protected Pan pan;

    public Pan getPan() {
        return pan;
    }

    public void newPan() {
        this.pan = new Pan();
    }

    public abstract void comprobarTemp();

    public abstract void prepararAguaConSal();

    public abstract void preparaLevadura();

    public abstract void aniadirAguayMezclar();

    public abstract void aniadirHarinayRemover();

    public abstract void amasar();

    public abstract void dejarReposar();

    public abstract void cortarlaMasa();

    public abstract void llevaralHorno();

}
