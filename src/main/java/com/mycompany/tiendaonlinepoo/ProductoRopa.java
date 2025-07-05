package com.mycompany.tiendaonlinepoo;

/**
 * Clase que representa un producto de ropa.
 * También hereda de Producto, demostrando herencia.
 */
public class ProductoRopa extends Producto {
    private String talla;

    public ProductoRopa(String nombre, double precio, String talla) {
        super(nombre, precio);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Ropa: " + getNombre() + ", Precio: $" + getPrecio() + ", Talla: " + talla);
    }
}
