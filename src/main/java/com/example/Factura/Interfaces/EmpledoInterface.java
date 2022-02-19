package com.example.Factura.Interfaces;

import com.example.Factura.Entidades.Cliente;
import com.example.Factura.Entidades.Empleado;

import java.util.List;

public interface EmpledoInterface {

    Empleado buscarEmpleadoCedula(String cedula, List<Empleado> listaEmpleados);
    Empleado buscarEmpleadoNombre(String nombre,List<Empleado> listaEmpleados);
    List<Empleado> insertarEmpleado(Empleado empleado, List<Empleado> listaEmpleados);
    List<Empleado> modificarEmpleado(Empleado empleado, List<Empleado> listaEmpleados);
    List<Empleado> eliminarEmpleado(Empleado empleado, List<Empleado> listaEmpleados);
}
