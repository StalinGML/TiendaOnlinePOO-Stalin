package com.mycompany.tiendaonlinepoo;

/**
 * Clase base que representa un producto genérico en la tienda.
 * Aplica encapsulación al tener atributos privados.
 */
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio);
    }
}
