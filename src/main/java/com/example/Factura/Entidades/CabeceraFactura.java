package com.example.Factura.Entidades;

public class CabeceraFactura {
    private int nroFactura;
    private Cliente cliente;
    private Empleado empleado;

    public CabeceraFactura() {
    }

    public CabeceraFactura(int nroFactura, Cliente cliente, Empleado empleado) {
        this.nroFactura = nroFactura;
        this.cliente = cliente;
        this.empleado = empleado;
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}
