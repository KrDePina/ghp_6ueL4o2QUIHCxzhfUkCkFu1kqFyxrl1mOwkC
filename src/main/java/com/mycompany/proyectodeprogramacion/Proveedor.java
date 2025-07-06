package com.mycompany.proyectodeprogramacion;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tupux
 */
public class Proveedor {
        private String nombre;
        private String ruc;
        private boolean aprobado;

        public Proveedor(String nombre, String ruc) {
            this.nombre = nombre;
            this.ruc = ruc;
        }

        public String getNombre() {
            return nombre;
        }

        public String getRuc() {
            return ruc;
        }

        public boolean isAprobado() {
            return aprobado;
        }

        public void setAprobado(boolean aprobado) {
            this.aprobado = aprobado;
        }
    }

    // Clase Sistema
    class Sistema {

        // Evalúa al proveedor (simula verificación de datos)
        public boolean evaluarProveedor(Proveedor proveedor) {
            // Aquí se puede simular una lógica más compleja
            return proveedor.getRuc() != null && proveedor.getRuc().length() == 11;
        }

        // Registra al proveedor si está aprobado
        public void registrarProveedor(Proveedor proveedor) {
            if (proveedor.isAprobado()) {
                System.out.println("Proveedor aprobado: registro completado.");
            } else {
                System.out.println("Proveedor desaprobado: no se registró.");
            }
        }
    }

    // Clase Administrador
    class Administrador {

        public void gestionarProveedor() {
            // Solicita datos al proveedor
            Proveedor proveedor = solicitarDatosProveedor();

            // Evalúa datos en el sistema
            Sistema sistema = new Sistema();
            boolean resultado = sistema.evaluarProveedor(proveedor);
            proveedor.setAprobado(resultado);

            // Muestra mensaje de estado
            String estado = resultado ? "Aprobado" : "Desaprobado";
            System.out.println("Resultado de evaluación: " + estado);

            // Si fue aprobado, registrar proveedor
            sistema.registrarProveedor(proveedor);
        }

        private Proveedor solicitarDatosProveedor() {
            // Simulación de ingreso de datos
            String nombre = "Proveedor SAC";
            String ruc = "20123456789";
            System.out.println("Datos enviados por el proveedor: " + nombre + ", RUC: " + ruc);
            return new Proveedor(nombre, ruc);
        }
    }

    // Clase principal
    public class GestionProveedorApp {
        public static void main(String[] args) {
            Administrador admin = new Administrador();
            admin.gestionarProveedor();
        }
    }
}
