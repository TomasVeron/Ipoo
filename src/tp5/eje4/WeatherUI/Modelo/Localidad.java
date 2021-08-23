package tp5.eje4.WeatherUI.Modelo;


public class Localidad {
    private String ciudad;
    private String provincia;
    private String pais;

    public Localidad(String ciudad, String provincia, String pais) {
        setCiudad(ciudad);
        setPais(pais);
        setProvincia(provincia);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


}
