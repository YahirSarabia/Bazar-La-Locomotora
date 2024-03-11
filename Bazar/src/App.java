import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente(1,"Ramon","Ramon@gmail.com","hola123");
        Comerciante comerciante1 = new Comerciante(1,"Jose","Jose@gmail.com","adios123");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Hello, World!");
        int opcion;
        do{
            System.out.println("1. Iniciar Sesión comerciante");
            System.out.println("2. Iniciar Sesión cliente");
            System.out.println("3. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("email: ");
                    teclado.nextLine();
                    String email = teclado.nextLine();
                    System.out.println("contraseña: ");
                    String contrasena = teclado.nextLine();

                    if (email.equals(comerciante1.getEmail()) && contrasena.equals(comerciante1.getContrasena())) {
                        mostrarMenuComerciante(comerciante1);
                    } else {
                        System.out.println("No se ha podido iniciar sesión");
                    }
                    break;
                case 2:
                    System.out.println("email: ");
                    teclado.nextLine();
                    String email2 = teclado.nextLine();
                    System.out.println("contraseña: ");
                    String contrasena2 = teclado.nextLine();

                    if (email2.equals(cliente1.getEmail()) && contrasena2.equals(cliente1.getContrasena())) {
                        mostrarMenuCliente(cliente1, comerciante1);
                    } else {
                        System.out.println("No se ha podido iniciar sesión");
                    }
                    break;
                default:
                    break;
            }
        }while(opcion!=3);
    }
    
    public static void mostrarMenuCliente(Cliente cliente1, Comerciante comerciante1) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Ver productos");
            System.out.println("3. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    comerciante1.verProductos();
                    break;
                case 2:
                    System.out.println("Ha cerrado sesión");
                    break;
                default:
                    break;
            }
        }while(opcion!=2);
    }

    public static void mostrarMenuComerciante(Comerciante comerciante1) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1. Ver productos");
            System.out.println("2. Agregar productos");
            System.out.println("3. Salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    comerciante1.verProductos();
                    break;
                case 2:
                    System.out.println("Agrega el id del producto: ");
                    int id_producto = teclado.nextInt(); 
                    System.out.println("Agrega el nombre del producto: ");
                    teclado.nextLine();
                    String nombre = teclado.nextLine();
                    System.out.println("Agrega el descripcion del producto: ");
                    teclado.nextLine();
                    String descripcion = teclado.nextLine();
                    System.out.println("Agrega el precio del producto: ");
                    float precio = teclado.nextFloat();
                    System.out.println("Agrega el cantidad del producto: ");
                    int cantidad = teclado.nextInt();
                    comerciante1.agregarProducto(new Producto(id_producto,nombre,descripcion,precio,cantidad));
                    break;
                case 3:
                    System.out.println("Ha cerrado sesión");
                    break;
                default:
                    break;
            }
        }while(opcion!=3);
    }
}
