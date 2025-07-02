import java.util.Scanner;
public class Cliente {
    private String Nombre ;
    private String Apellido;
    private String Correo ;
    private int edad;
    Scanner sc=new Scanner (System.in);
    public Cliente (String nombre,String Apellido, String correo , int edad){
        this.Nombre=nombre;
        this.edad=edad;
        this.Apellido=Apellido;
        this.Correo=correo;
    }
        public void llenadoFormulario(String nombre,String Apellido, String correo , int edad){
            
        }
}
