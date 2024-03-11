public class Cliente {
    private int id_cliente;
    private String nombre;
    private String email;
    private String contrasena;

    public Cliente(){
    }

    public Cliente(int id_cliente, String nombre, String email, String contrasena){
        this.id_cliente = id_cliente;
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

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
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
