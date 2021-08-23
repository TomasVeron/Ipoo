package tp2.eje3;

//director
public class Cocina {
    private PanBuilder panBuilder;

    public Cocina() {

    }

    public void setPanBuilder(PanBuilder pb) {
        this.panBuilder = pb;
    }

    public PanBuilder getPanBuilder() {
        return panBuilder;
    }

    public Pan getPan() {
        return getPanBuilder().getPan();
    }

    public void hacerPan() {
        getPanBuilder().comprobarTemp();
        getPanBuilder().prepararAguaConSal();
        getPanBuilder().preparaLevadura();
        getPanBuilder().aniadirAguayMezclar();
        getPanBuilder().aniadirHarinayRemover();
        getPanBuilder().amasar();
        getPanBuilder().dejarReposar();
        getPanBuilder().cortarlaMasa();
        getPanBuilder().llevaralHorno();
    }

}
