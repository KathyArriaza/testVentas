/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testventas.ventas;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *
 * @author HP
 */
public class Orden {
     private int idOrden;
    private List<Producto> productos;
    private Cliente cliente;
    private Date fecha;
    private static int contadorOrdenes;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(Cliente cliente) {
        this.idOrden = ++contadorOrdenes;
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.fecha = new Date();
    }

    public int getIdOrden() {
        return idOrden;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void agregarCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        if (this.productos.size() < MAX_PRODUCTOS) {
            this.productos.add(producto);
        } else {
            System.out.println("Se ha superado el máximo de productos en la orden");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden ID: " + idOrden);
        System.out.println("Cliente: " + cliente);
        System.out.println("Fecha: " + fecha);
        System.out.println("Productos:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("Total: $" + calcularTotal());
    }
}
