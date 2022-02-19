package com.example.Factura.Implementaciones;

import com.example.Factura.Entidades.Cliente;
import com.example.Factura.Entidades.Empleado;
import com.example.Factura.Interfaces.EmpledoInterface;

import java.util.List;

public class EmpleadoImplementacion implements EmpledoInterface {
    @Override
    public Empleado buscarEmpleadoCedula(String cedula, List<Empleado> listaEmpleados) {
        for (Empleado IteradorEmpleado:listaEmpleados){
            if (cedula.equals(IteradorEmpleado.getCedula()))
                return IteradorEmpleado;
        }
        return null;
    }

    @Override
    public Empleado buscarEmpleadoNombre(String nombre, List<Empleado> listaEmpleados) {
        for (Empleado IteradorEmpleado:listaEmpleados){
            if (nombre.equals(IteradorEmpleado.getNombre()))
                return IteradorEmpleado;
        }
        return null;
    }

    @Override
    public List<Empleado> insertarEmpleado(Empleado empleado, List<Empleado> listaEmpleados) {
        listaEmpleados.add(empleado);
        return listaEmpleados;
    }

    @Override
    public List<Empleado> modificarEmpleado(Empleado empleado, List<Empleado> listaEmpleados) {
        for (Empleado iteradorEmpleado:listaEmpleados){
            if (empleado.getCedula().equals(iteradorEmpleado.getCedula()))
            {
                iteradorEmpleado.setCedula(empleado.getCedula());
                iteradorEmpleado.setNombre(empleado.getNombre());
                iteradorEmpleado.setDireccion(empleado.getDireccion());
                iteradorEmpleado.setTelefono(empleado.getTelefono());
                iteradorEmpleado.setSalario(empleado.getSalario());
            }
        }
        return listaEmpleados;
    }

    @Override
    public List<Empleado> eliminarEmpleado(Empleado empleado, List<Empleado> listaEmpleados) {
        listaEmpleados.remove(empleado);
        return listaEmpleados;
    }
}
