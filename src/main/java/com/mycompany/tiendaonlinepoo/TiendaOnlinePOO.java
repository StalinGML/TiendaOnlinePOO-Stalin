package com.mycompany.tiendaonlinepoo;

/**
 * Clase principal que contiene el método main.
 * Permite probar la funcionalidad del sistema de tienda online.
 */
public class TiendaOnlinePOO {
    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("       SISTEMA DE TIENDA ONLINE       ");
        System.out.println("       Stalin's Digital Market        ");
        System.out.println("======================================\n");

        // Crear un carrito de compras con capacidad para 5 productos
        CarritoDeCompras carrito = new CarritoDeCompras(5);

        // Crear productos
        Producto p1 = new Producto("PS5 Digital", 725.50);
        ProductoElectronico p2 = new ProductoElectronico("Iphone 16 Pro max", 1399.99, 12);
        ProductoRopa p3 = new ProductoRopa("Camiseta Nike", 29.99, "M");
       
        // Agregar productos al carrito
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        // Mostrar los productos agregados en el carrito
        carrito.mostrarCarrito();
        // Calcular y mostrar el total a pagar
        System.out.printf("\nTotal a pagar: $%.2f%n", carrito.calcularTotal());
    }
}