package tp3.eje5;

public class Archivo implements Documento {
    private String documento;
    private String tipo;

    public Archivo(String documento, String tipo) {
        setDocumento(documento);
        setTipo(tipo);
    }

    public Archivo() {
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void imprimite() {
        System.out.println("tipo: " + getTipo() + "\n" + getDocumento());
    }
}
