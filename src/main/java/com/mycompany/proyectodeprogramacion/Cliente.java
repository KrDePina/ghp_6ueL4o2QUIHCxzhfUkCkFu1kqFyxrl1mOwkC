package com.mycompany.proyectodeprogramacion;

import java.util.Scanner;
public class Cliente {
    private String Nombre, Correo ;
    private int edad;
    Scanner sc=new Scanner (System.in);
    public Cliente (String nombre, String correo , int edad){
        this.Nombre=nombre;
        this.edad=edad;
        this.Correo=correo;
    }
        public void llenadoFormulario(String nombre,String Apellido, String correo , int edad){
            System.out.println("ingrese su nombre completo : ");
            nombre=sc.nextLine();
            System.out.println("ingrese su edad : ");
            edad=sc.nextInt();
            System.out.println("ingrese su correo electronico : ");
            correo=sc.nextLine();
    }
}
