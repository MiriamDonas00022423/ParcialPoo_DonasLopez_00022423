package articuloselectronicos;

public class Laptop extends ArtículoElectrónico{

    private String color;
    private double ancho;

    public Laptop(String nombre, String modelo,String color, double ancho) {
        super(nombre, modelo);
        this.color = color;
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    @Override
    public double obtenerPrecio() {
        return 800*ancho;
    }

    @Override
    public String obtenerDescripcion() {
        String cadena;
        cadena = "Este articulo es de color: " + getColor() + " y tiene un ancho de: " + getAncho();
        return cadena;
    }
}
