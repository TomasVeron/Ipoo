package tp1.eje4;

import java.util.Date;

public class ProductosSimples extends Articulo {

    private String nombre;
    private Date fechaVencimiento;
    private float peso;
    private float valor;

    public ProductosSimples(float valor, float peso, String nombre, Date fechaVencimiento) {
        setNombre(nombre);
        setFechaVencimiento(fechaVencimiento);
        setValor(valor);
        setPeso(peso);
    }


    public ProductosSimples() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public float getValor() {
        return valor;
    }
}
