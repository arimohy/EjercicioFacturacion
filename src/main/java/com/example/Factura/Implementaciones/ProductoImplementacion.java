package com.example.Factura.Implementaciones;

import com.example.Factura.Entidades.Cliente;
import com.example.Factura.Entidades.Empleado;
import com.example.Factura.Entidades.Producto;
import com.example.Factura.Interfaces.ProductoInterface;

import java.util.List;

public class ProductoImplementacion implements ProductoInterface {
    @Override
    public Producto buscarProductoNombre(String nombre, List<Producto> listaProducto) {
        for (Producto IteradorProducto:listaProducto){
            if (nombre.equals(IteradorProducto.getNombre()))
                return IteradorProducto;
        }
        return null;
    }
    @Override
    public List<Producto> insertarProducto(Producto producto, List<Producto> listaProducto) {
        listaProducto.add(producto);
        return listaProducto;
    }

    @Override
    public List<Producto> modificarProducto(Producto producto, List<Producto> listaProducto) {
        for (Producto iteradorProducto:listaProducto){
            if (producto.getNombre().equals(iteradorProducto.getNombre())) {
                iteradorProducto.setNombre(producto.getNombre());
                iteradorProducto.setCategoria(producto.getCategoria());
                iteradorProducto.setPrecioUnitario(producto.getPrecioUnitario());
                iteradorProducto.setStock(producto.getStock());
            }
        }
        return listaProducto;
    }

    @Override
    public List<Producto> eliminarProducto(Producto producto, List<Producto> listaProducto) {
        listaProducto.remove(producto);

        return listaProducto;
    }


}

