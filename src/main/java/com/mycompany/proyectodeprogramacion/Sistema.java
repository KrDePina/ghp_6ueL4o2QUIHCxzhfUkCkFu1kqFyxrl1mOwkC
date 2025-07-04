package com.mycompany.proyectodeprogramacion;
import java.util.Scanner;
public class Sistema {
    private String formulario;
    private String DatosAdmi;

    public Sistema(String datosAdmi, String formulario) {
        DatosAdmi = datosAdmi;
        this.formulario = formulario;
    }

    public static void menuCliente(){
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

    public void static String menuAdmi() {
        int opcion;
        int contraseña = 1252;
        String nombre = "Miguel";
        do {
            System.out.print("""
                    [1] Ingresar
                    [2] Salir
                    Ingrese una opcion: 
                    """);
            Scanner lector = new Scanner(System.in);
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    int opcion1;
                    do {
                        System.out.print("""
                         [1] Administrador
                         [2] Vendedor
                         Ingrese una opcion: 
                         """);
                        switch (opcion1){
                            case 1:
                                System.out.println("*****************************************************");
                                System.out.println("*Registro                                           *");
                                System.out.println("*****************************************************");
                                System.out.println("*NOMBRE:"                                 +"*") ;
                                System.out.println("*APELLIDO:"                          +"*") ;
                                System.out.println("*Edad:                                *");
                                System.out.println("*Correo: " +  "*");
                                System.out.println("*****************************************************");
                            case 2:
                        }
                    }while (opcion1 != 2);
                    break;
                case 2:
            }

        } while (opcion != 2);

    }
}
