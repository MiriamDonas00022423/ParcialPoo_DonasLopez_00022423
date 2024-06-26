package articuloselectronicos;

public abstract class ArtículoElectrónico implements obtenerPrecioYdescripcion{
    private String nombre;
    private String modelo;
    private String descripcion;
    private double precio;

    public ArtículoElectrónico(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


}
