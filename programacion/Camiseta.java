public class Camiseta {
    private String equipo;
    private String nombre;
    private String talla;
    private double precio;

    // Constructor
    /**
     * @param equipo
     * @param nombre
     * @param talla
     * @param precio
     */
    public Camiseta(String equipo, String nombre, String talla, double precio) {
        this.equipo = equipo;
        this.nombre = nombre;
        this.talla = talla;
        this.precio = precio;
    }

    // Getters y Setters
    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para mostrar los detalles de la camiseta
    @Override
    public String toString() {
        return "Equipo: " + equipo + ", Nombre: " + nombre + ", Talla: " + talla + ", Precio: $" + precio;
    }
}
