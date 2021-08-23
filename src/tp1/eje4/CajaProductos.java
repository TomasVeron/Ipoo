package tp1.eje4;

import java.util.Vector;

public class CajaProductos extends Articulo {

    private Vector<ProductosSimples> productos;
    private float peso;
    private float valor;

    public CajaProductos() {
        setProductos(new Vector<ProductosSimples>());
        setValor(getValor());
        setPeso(getPeso());
    }


    public Vector<ProductosSimples> getProductos() {
        return productos;
    }

    public void setProductos(Vector<ProductosSimples> productos) {
        this.productos = productos;
    }

    public void addProducto(ProductosSimples p) {
        this.setPeso(this.getPeso() + p.getPeso());
        this.setValor(this.getValor() + p.getValor());
        getProductos().add(p);
    }

    @Override
    public float getValor() {
        float v = 0;
        for (ProductosSimples p : getProductos()) {
            v += p.getValor();
        }
        return v;
    }

    @Override
    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public float getPeso() {
        float p = 0;
        for (ProductosSimples x : getProductos()) {
            p += x.getPeso();
        }
        return p;
    }
}
