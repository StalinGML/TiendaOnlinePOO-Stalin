package com.mycompany.tiendaonlinepoo;

/**
 * Clase que representa un carrito de compras.
 * Contiene un arreglo de productos y métodos para gestionarlos.
 */
public class CarritoDeCompras {
    private Producto[] productos;
    private int indice;

    public CarritoDeCompras(int capacidad) {
        productos = new Producto[capacidad];
        indice = 0;
    }

    public void agregarProducto(Producto p) {
        if (indice < productos.length) {
            productos[indice] = p;
            indice++;
            System.out.println("Producto agregado al carrito: " + p.getNombre());
        } else {
            System.out.println("Carrito lleno. No se pueden agregar más productos.");
        }
    }

    public void mostrarCarrito() {
        System.out.println("\nContenido del carrito:");
        for (int i = 0; i < indice; i++) {
            productos[i].mostrarDetalles();
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < indice; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }
}
