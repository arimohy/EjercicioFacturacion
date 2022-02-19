package com.example.Factura.Interfaces;

import com.example.Factura.Entidades.Cliente;

import java.util.List;

public interface ClienteInterface {

    Cliente buscarClienteCedula(String cedula, List<Cliente> listaClientes);
    Cliente buscarClienteNombre(String nombre,List<Cliente> listaClientes);
    List<Cliente> insertarCliente(Cliente cliente, List<Cliente> listaClientes);
    List<Cliente> modificarCliente(Cliente cliente, List<Cliente> listaClientes);
    List<Cliente> eliminarCliente(Cliente cliente, List<Cliente> listaClientes);

}
