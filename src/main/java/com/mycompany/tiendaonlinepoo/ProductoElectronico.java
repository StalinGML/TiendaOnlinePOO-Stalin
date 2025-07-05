package com.mycompany.tiendaonlinepoo;

/**
 * Clase que representa un producto electrónico.
 * Hereda de Producto para aplicar el concepto de herencia.
 */
public class ProductoElectronico extends Producto {
    private int garantiaMeses;

    public ProductoElectronico(String nombre, double precio, int garantiaMeses) {
        super(nombre, precio);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electrónico: " + getNombre() + ", Precio: $" + getPrecio() + ", Garantía: " + garantiaMeses + " meses");
    }
}
