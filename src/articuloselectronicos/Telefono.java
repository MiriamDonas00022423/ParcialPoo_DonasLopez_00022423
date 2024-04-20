package articuloselectronicos;

public class Telefono extends ArtículoElectrónico{

    private double peso;
    private int cantidadCamaras;

    public Telefono(String nombre, String modelo,double peso,int cantidadCamaras) {
        super(nombre, modelo);
        this.peso = peso;
        this.cantidadCamaras = cantidadCamaras;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCantidadCamaras() {
        return cantidadCamaras;
    }

    public void setCantidadCamaras(int cantidadCamaras) {
        this.cantidadCamaras = cantidadCamaras;
    }

    @Override
    public double obtenerPrecio() {
        return 250*cantidadCamaras;
    }

    @Override
    public String obtenerDescripcion() {
        String cadena;
        cadena = "El telefono tiene: " + getCantidadCamaras() + " camaras, y su peso es: " + getPeso();
        return cadena;

    }
}
