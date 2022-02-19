package com.example.Factura.Entidades;

import java.util.List;

public class FacturaDetalle {
    private List<Producto> listaProducto;
    private double subtotal;

    public FacturaDetalle() {
    }

    public FacturaDetalle(List<Producto> listaProducto, double subtotal) {
        this.listaProducto = listaProducto;
        this.subtotal = subtotal;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
