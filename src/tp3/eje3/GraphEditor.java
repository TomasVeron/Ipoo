package tp3.eje3;

import java.util.ArrayList;
import java.util.List;

public class GraphEditor {
    private int dimencion;
    private List<FiguraGeometrica> figuras;

    public GraphEditor(int dimencion) {
        setFiguras(new ArrayList<FiguraGeometrica>());
        setDimencion(dimencion);
    }

    public List<FiguraGeometrica> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<FiguraGeometrica> figuras) {
        this.figuras = figuras;
    }

    public int getDimencion() {
        return dimencion;
    }

    public void setDimencion(int dimencion) {
        this.dimencion = dimencion;
    }

    public void addFigura(FiguraGeometrica figura) {
        getFiguras().add(figura);
    }

    public void removeFigura(FiguraGeometrica figura) {
        getFiguras().remove(figura);
    }

    public double areaAcumulada() {
        double total = 0;
        for (FiguraGeometrica f : getFiguras()) {
            total += f.area();
        }
        return total;
    }

    public void mover(int unPunto, String direccion) {
        for (FiguraGeometrica f : getFiguras()) {
            f.mover(unPunto, direccion);
        }
    }
}

