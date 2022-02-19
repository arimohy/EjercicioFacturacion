package com.example.Factura.Entidades;

import java.util.Date;

public class Factura {
    private CabeceraFactura cabeceraFactura;
    private FacturaDetalle facturaDetalle;
    private double total;
    private Date fecha;

    public Factura() {
    }

    public Factura(CabeceraFactura cabeceraFactura, FacturaDetalle facturaDetalle, double total, Date fecha) {
        this.cabeceraFactura = cabeceraFactura;
        this.facturaDetalle = facturaDetalle;
        this.total = total;
        this.fecha = fecha;
    }

    public CabeceraFactura getCabeceraFactura() {
        return cabeceraFactura;
    }

    public void setCabeceraFactura(CabeceraFactura cabeceraFactura) {
        this.cabeceraFactura = cabeceraFactura;
    }

    public FacturaDetalle getFacturaDetalle() {
        return facturaDetalle;
    }

    public void setFacturaDetalle(FacturaDetalle facturaDetalle) {
        this.facturaDetalle = facturaDetalle;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
