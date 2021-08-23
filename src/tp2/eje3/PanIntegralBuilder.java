package tp2.eje3;

public class PanIntegralBuilder extends PanBuilder {

    public PanIntegralBuilder() {
        super.newPan();
    }

    @Override
    public void comprobarTemp() {
        System.out.println("Comprobando temperatura");
    }

    @Override
    public void prepararAguaConSal() {
        System.out.println("preparando el agua con sal");
    }

    @Override
    public void preparaLevadura() {
        System.out.println("Preparando la levadura");
    }

    @Override
    public void aniadirAguayMezclar() {
        System.out.println("Aniadiendo el agua y luego mezclar");
    }

    @Override
    public void aniadirHarinayRemover() {
        pan.setMasa("harina con el grano de trigo entero");
        System.out.println("aniadiendo la " + pan.getMasa() + " y luego mezclar");
    }

    @Override
    public void amasar() {
        System.out.println("amasando");
    }

    @Override
    public void dejarReposar() {
        System.out.println("dejando reposar la harina");
    }

    @Override
    public void cortarlaMasa() {
        System.out.println("cortando la masa");
    }

    @Override
    public void llevaralHorno() {
        System.out.println("llevando al horno\nListo Pan integral hecho!");
    }
}
