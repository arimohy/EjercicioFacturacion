package com.example.Factura.Entidades;

import java.util.Objects;

public class Producto {
    private String nombre;
    private String categoria;
    private double precioUnitario;
    private int stock;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precioUnitario, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", stock=" + stock +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.getPrecioUnitario(), getPrecioUnitario()) == 0 && getStock() == producto.getStock() && Objects.equals(getNombre(), producto.getNombre()) && Objects.equals(getCategoria(), producto.getCategoria());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getCategoria(), getPrecioUnitario(), getStock());
    }
}
