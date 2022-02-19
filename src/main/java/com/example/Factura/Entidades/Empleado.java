package com.example.Factura.Entidades;

public class Empleado extends Persona{
    private double salario;

    public Empleado(double salario) {
        this.salario = salario;
    }

    public Empleado(String cedula, String nombre, String direccion, String telefono, double salario) {
        super(cedula, nombre, direccion, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
