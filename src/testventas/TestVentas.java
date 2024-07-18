/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testventas;

import testventas.ventas.Cliente;
import testventas.ventas.Orden;
import testventas.ventas.Producto;
import testventas.ventas.TipoPago;


/**
 *
 * @author HP
 */
public class TestVentas {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
            
        // Crear clientes
        Cliente cliente1 = new Cliente("Elizabeth Castillo", TipoPago.CONTADO);
        Cliente cliente2 = new Cliente("Fabiola Lopez", TipoPago.CREDITO);

        // Crear productos
        Producto producto1 = new Producto("Eyeliner", 10);
        Producto producto2 = new Producto("Foundation Clinique", 34);
        Producto producto3 = new Producto("Primer elf", 12);

        // Crear una orden y agregar productos
        Orden orden1 = new Orden(cliente1);
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        // Mostrar la orden
        mostrarOrden(orden1);

        Orden orden2 = new Orden(cliente2);
        orden2.agregarProducto(producto3);

       
        mostrarOrden(orden2);
    }

    // Método para mostrar los detalles de la orden en consola
    public static void mostrarOrden(Orden orden) {
        System.out.println("Orden ID: " + orden.getIdOrden());
        System.out.println("Cliente: " + orden.getCliente());
        System.out.println("Fecha: " + orden.getFecha());
        System.out.println("Productos:");
        for (Producto producto : orden.getProductos()) {
            System.out.println(producto);
        }
        System.out.println("Total: $" + orden.calcularTotal());
        System.out.println("---------------------------------------------------");
    }
}
   
    
