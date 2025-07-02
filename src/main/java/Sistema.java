import java.util.Scanner;
public class Sistema {
    private final String formulario;
    private final String DatosAdmi;
        public Sistema(String formulario, String DatosAdmi, String[] catalogo){
            this.formulario=formulario;
            this.DatosAdmi=DatosAdmi;
        }

        public void menuCliente(){
            int opcion ;
             do{ 
                System.out.print("""
                                 [1] Registrarce
                                 [2] Solicitar catalogo
                                 [3] Seleccionar producto
                                 [4] Ver carrito
                                 [5] Procesar boleta
                                 [6] Salir
                                 Ingrese una opcion: 
                                 """);
                Scanner lector = new Scanner(System.in);
                opcion = lector.nextInt();        
                switch(opcion){
                    case 1 :
                            System.out.println("*****************************************************");
                            System.out.println("*Registro                                           *");
                            System.out.println("*****************************************************");
                            System.out.println("*NOMBRE:"                                 +"*") ;
                            System.out.println("*APELLIDO:"                          +"*") ;
                            System.out.println("*Edad:                                *");
                            System.out.println("*Correo: " +  "*");            
                            System.out.println("*****************************************************");
                         
                            break;
                    case 2 : 
                }
             }while(opcion != 6);
                   
        }

    public void menuAdmi(){
            int opcion ;
            int contraseña=1252;
            String nombre= "Miguel";
             do{ 
                System.out.print("""
                                 [1] Ingresar
                                 [2] Salir
                                 Ingrese una opcion: 
                                 """);
                Scanner lector = new Scanner(System.in);
                opcion = lector.nextInt();
                
                switch(opcion){
                    case 1:
                    case 2:
                }
                    
             }while(opcion !=2);
        
}
