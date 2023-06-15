package modelo;

public class Productos {

    private int cod;
    private String nombre;
    private double precio;
    private String info;
    private int cant;
    private String marca;
    private Productos sig;
    private Productos ant;

    public Productos() {
    }
    
    

    public Productos(int cod, String nombre, double precio, String info, 
            int cant, String marca) {
        this.cod = cod;
        this.nombre = nombre;
        this.precio = precio;
        this.info = info;
        this.cant = cant;
        this.marca=marca;
        sig = null;
        ant = null;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
