package com.example.Factura.Interfaces;

import com.example.Factura.Entidades.Cliente;
import com.example.Factura.Entidades.Producto;

import java.util.List;

public interface ProductoInterface {


    Producto buscarProductoNombre(String nombre,List<Producto> listaProducto);
    List<Producto> insertarProducto(Producto producto, List<Producto> listaProducto);
    List<Producto> modificarProducto(Producto producto, List<Producto> listaProducto);
    List<Producto> eliminarProducto(Producto producto, List<Producto> listaProducto);

}
