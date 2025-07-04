package com.mycompany.proyectodeprogramacion;

import org.jetbrains.annotations.Unmodifiable;

import java.util.Scanner;
import java.util.ArrayList;        
public class Administrador {
    private final String Nombre ;
    private final String Credencial ;
    private final  int Contrasena;
    private final String catalogo[];
    static Scanner sc= new Scanner (System.in);
    public Administrador(String nombre, String credencial, int contrasena, String[] catalogo) {
        Nombre = nombre;
        Credencial = credencial;
        Contrasena = contrasena;
        this.catalogo = catalogo;
    }
    public static String Nombre(String Nombre){
        System.out.println("Ingrese su Nombre: " );
        Nombre=sc.nextLine();
        return Nombre;
    }
    public static int Credencial (int credencial){
        System.out.println("Ingrese su credencial: ");
        credencial=sc.nextInt();
        return credencial;
    }
    public static int Contrasena(int contrasena){
        System.out.println("Ingrese su contraseña: ");
        contrasena= sc.nextInt();
        return contrasena;
    }
    
    public static  String  Producto(String [] producto){
       String Producto;
       ArrayList<String> Productos = new ArrayList<>();
       System.out.println("Ingrese el producto");
       Producto=sc.nextLine();
       Productos.add(Producto);
       return Producto;
    }
    public static int[] Precios (int[] precios){
        int precio;
        System.out.println("ingrese el precio");
        ArrayList<Integer> Precios = new ArrayList<>();
        precio=sc.nextInt();
        Precios.add(precio);
        return precios;
    }

}
