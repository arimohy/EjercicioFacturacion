package com.example.Factura.Implementaciones;

import com.example.Factura.Entidades.Cliente;
import com.example.Factura.Interfaces.ClienteInterface;

import java.util.List;

public class ClienteImplementacion implements ClienteInterface {
    @Override
    public Cliente buscarClienteCedula(String cedula, List<Cliente> listaClientes) {
        for (Cliente IteradorCliente:listaClientes){
            if (cedula.equals(IteradorCliente.getCedula()))
                return IteradorCliente;
        }
        return null;
    }

    @Override
    public Cliente buscarClienteNombre(String nombre, List<Cliente> listaClientes) {
        for (Cliente IteradorCliente:listaClientes){
            if (nombre.equals(IteradorCliente.getNombre()))
                return IteradorCliente;
        }
        return null;
    }

    @Override
    public List<Cliente> insertarCliente(Cliente cliente, List<Cliente> listaClientes) {
        listaClientes.add(cliente);
        return listaClientes;
    }

    @Override
    public List<Cliente> modificarCliente(Cliente cliente, List<Cliente> listaClientes) {
        for (Cliente iteradorCliente:listaClientes){
            if (cliente.getCedula().equals(iteradorCliente.getCedula())) {
                iteradorCliente.setCedula(cliente.getCedula());
                iteradorCliente.setNombre(cliente.getNombre());
                iteradorCliente.setDireccion(cliente.getDireccion());
                iteradorCliente.setTelefono(cliente.getTelefono());
                iteradorCliente.setNIT(cliente.getNIT());
            }
        }
        return listaClientes;
    }

    @Override
    public List<Cliente> eliminarCliente(Cliente cliente, List<Cliente> listaClientes) {
        boolean remove = listaClientes.remove(cliente);
        //System.out.println(listaClientes.size());
        return listaClientes;

    }
}
