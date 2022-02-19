package com.example.Factura.Entidades;

import java.util.Objects;

public class Cliente extends Persona {
    private String NIT;

    public Cliente(String NIT) {
        this.NIT = NIT;
    }

    public Cliente(String cedula, String nombre, String direccion, String telefono, String NIT) {
        super(cedula, nombre, direccion, telefono);
        this.NIT = NIT;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "NIT='" + NIT + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(getNIT(), cliente.getNIT());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNIT());
    }
}
