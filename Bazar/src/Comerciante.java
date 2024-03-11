import java.util.ArrayList;

public class Comerciante {
    private int id_comerciante;
    private String nombre;
    private String email;
    private String contrasena;
    private ArrayList<Producto> producto = new ArrayList<>();

    public Comerciante(){
    }

    public Comerciante(int id_comerciante, String nombre, String email, String contrasena){
        this.id_comerciante = id_comerciante;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
    }

    public int iniciarSesion(String email, String contrasena){
        if (this.email.equals(email) && this.contrasena.equals(contrasena) ) {
            return 1;
        } else {
            return 0;
        }
    }

    public void agregarProducto(Producto produc){
        this.producto.add(produc);
    }

    public void verProductos(){
        for(int i=0; i<producto.size(); i++){
            System.out.println(producto.get(i).toString());
        }
    }

    public int getId_comerciante() {
        return id_comerciante;
    }

    public void setId_comerciante(int id_comerciante) {
        this.id_comerciante = id_comerciante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
