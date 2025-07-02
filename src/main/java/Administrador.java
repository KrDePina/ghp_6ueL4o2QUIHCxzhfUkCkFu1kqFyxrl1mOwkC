import java.util.Scanner;
import java.util.ArrayList;        
public class Administrador {
    private final String Nombre ;
    private final String Credencial ;
    private final  int Contrasena;
    private final String catalogo[];
    Scanner sc= new Scanner (System.in);
    public Administrador (String nombre, String credencial , int contrasena, String[] catalogo){
        this.Contrasena=contrasena;
        this.Credencial=credencial;
        this.Nombre=nombre;
        this.catalogo=catalogo;
    }
    public void Datos(String Nombre ,String Credencial,int Contrasena ){
        System.out.println("Ingrese su Nombre: " );
        Nombre=sc.nextLine();
        System.out.println("Ingrese su Credencial: ");
        Credencial=sc.nextLine();
        System.out.println("Ingrese la Contraseña: ");
        Contrasena=sc.nextInt();         
    }
    
    public void catalog(String [] catalogo){
       String producto;
       int precio; 
       ArrayList<String> Productos = new ArrayList<>();
       ArrayList<Integer> Precios = new ArrayList<>();
       System.out.println("Ingrese el producto");
       producto=sc.nextLine();
       Productos.add(producto);
       System.out.println("ingrese el precio");
       precio=sc.nextInt();
       Precios.add(precio);
    }

}
