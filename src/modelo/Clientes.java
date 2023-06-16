package modelo;

public class Clientes {

  
    private String nombre;
    private String correo;
    private String contra;
    private int cel;
    
    Clientes sig;

    public Clientes() {
            
    }

    public Clientes(int id, String nombre, String correo, String contra, int cel, String direccion, String MePago) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contra = contra;
        this.cel = cel;
        this.direccion = direccion;
        this.MePago = MePago;
        sig=null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getCel() {
        return cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMePago() {
        return MePago;
    }

    public void setMePago(String MePago) {
        this.MePago = MePago;
    }
    
    

}
