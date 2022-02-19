package com.example.Factura;

import com.example.Factura.Entidades.*;
import com.example.Factura.Implementaciones.ClienteImplementacion;
import com.example.Factura.Implementaciones.EmpleadoImplementacion;
import com.example.Factura.Implementaciones.ProductoImplementacion;
import com.example.Factura.Interfaces.ClienteInterface;
import com.example.Factura.Interfaces.EmpledoInterface;
import com.example.Factura.Interfaces.ProductoInterface;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class FacturaApplication {
	public static void PruebaClases(){
		Factura factura =new Factura();
		factura.setCabeceraFactura(new CabeceraFactura(1,
				new Cliente("1254", "jnjnj", "kmkk", "mkmkm", "123456"),
				new Empleado("1452", "yhomi", "yyyy", "ijijij",12)));
		Producto producto =new Producto("arroz", "ddd", 5, 5);
		List<Producto> listproducto=new ArrayList<Producto>();
		listproducto.add((producto));
		FacturaDetalle facturaDetalle=new FacturaDetalle(listproducto, 15);
		factura.setFacturaDetalle(facturaDetalle);

	}
	public static void PruebaInterfazCliente(){
		ClienteInterface clienteImp=new ClienteImplementacion();
		List<Cliente> clienteList=new ArrayList<>();
		clienteList.add(new Cliente("1254", "yhomira", "kmkk", "mkmkm", "123456"));
		clienteList.add(new Cliente("75002268", "alexandra", "cusco", "mkmkm", "123456"));

		//probando
		//busqueda por cedula
		System.out.println("Prueba de busqueda por cedula");
		Cliente cliente1 = clienteImp.buscarClienteCedula("1254", clienteList);
		Cliente cliente2 = clienteImp.buscarClienteCedula("12545", clienteList);
		existecliente(cliente1);
		existecliente(cliente2);
		//busqueda por nombre
		System.out.println("Prueba de busqueda por nombre");
		Cliente cliente3 = clienteImp.buscarClienteNombre("sandra", clienteList);
		Cliente cliente4 = clienteImp.buscarClienteNombre("yhomira", clienteList);
		existecliente(cliente3);
		existecliente(cliente4);
		//insertar
		System.out.println("Insersion:");
		List<Cliente> clienteListInsertada = clienteImp.insertarCliente(new Cliente("1111", "katherin", "kmkk", "mkmkm", "123456"), clienteList);
		Cliente cliente5 = clienteImp.buscarClienteCedula("1111", clienteListInsertada);
		existecliente(cliente5);
		System.out.println("Modificaion:");
		List<Cliente> clienteListModifica = clienteImp.modificarCliente(new Cliente("1111", "juan", "kmkk", "mkmkm", "123456"), clienteListInsertada);
		Cliente cliente6 = clienteImp.buscarClienteCedula("1111", clienteListModifica);
		existecliente(cliente6);
		System.out.println("Eliminar:");
		List<Cliente> clienteListEliminada = clienteImp.eliminarCliente(new Cliente("1111", "juan", "kmkk", "mkmkm", "123456"), clienteListModifica);
		Cliente cliente7=clienteImp.buscarClienteCedula("1111",clienteListEliminada);
		existecliente(cliente7);
	}
	public static void existecliente(Cliente cliente1){
		if(cliente1 !=null)
			System.out.println("El cliente es :"+cliente1.getNombre());
		else
			System.out.println("El cliente no existe");

	}
	public static void PruebaInterfazEmpleado(){
		EmpledoInterface empleadoImp=new EmpleadoImplementacion();
		List<Empleado> clienteList=new ArrayList<>();
		clienteList.add(new Empleado("1254", "yhomira", "kmkk", "mkmkm", 100));
		clienteList.add(new Empleado("75002268", "alexandra", "cusco", "mkmkm", 200));

		//probando
		//busqueda por cedula
		System.out.println("Prueba de busqueda por cedula");
		Empleado empleado1 = empleadoImp.buscarEmpleadoCedula("1254", clienteList);
		Empleado empleado2 = empleadoImp.buscarEmpleadoCedula("12545", clienteList);
		existeEmpleado(empleado1);
		existeEmpleado(empleado2);
		//busqueda por nombre
		System.out.println("Prueba de busqueda por nombre");
		Empleado empleado3 = empleadoImp.buscarEmpleadoNombre("sandra", clienteList);
		Empleado empleado4 = empleadoImp.buscarEmpleadoNombre("yhomira", clienteList);
		existeEmpleado(empleado3);
		existeEmpleado(empleado4);
		//insertar
		System.out.println("Insersion:");
		List<Empleado> ListInsertada = empleadoImp.insertarEmpleado(new Empleado("1111", "katherin", "kmkk", "mkmkm", 500), clienteList);
		Empleado empleado5 = empleadoImp.buscarEmpleadoCedula("1111", ListInsertada);
		existeEmpleado(empleado5);
		System.out.println("Modificaion:");
		List<Empleado> ListModifica = empleadoImp.modificarEmpleado(new Empleado("1111", "juan", "kmkk", "mkmkm", 600), ListInsertada);
		Empleado empleado6 = empleadoImp.buscarEmpleadoCedula("1111", ListModifica);
		existeEmpleado(empleado6);
		System.out.println("Eliminar:");
		List<Empleado> ListEliminada = empleadoImp.eliminarEmpleado(new Empleado("1111", "juan", "kmkk", "mkmkm", 600), ListModifica);
		Empleado empleado7=empleadoImp.buscarEmpleadoCedula("1111",ListEliminada);
		existeEmpleado(empleado7);
	}
	public static void existeEmpleado(Empleado empleado){
		if(empleado !=null)
			System.out.println("El empleado es :"+empleado.getNombre());
		else
			System.out.println("El empleado no existe");

	}
	public static void existeProducto(Producto producto){
		if(producto !=null)
			System.out.println("El producto es :"+producto.toString());
		else
			System.out.println("El producto no existe");

	}

	public static void PruebaInterfazProducto(){
		ProductoInterface productoImp=new ProductoImplementacion();
		List<Producto> lista=new ArrayList<>();
		lista.add(new Producto("arroz", "ddd", 5, 5));
		lista.add(new Producto("azucar", "dulce", 10, 10));

		//probando

		//busqueda por nombre
		System.out.println("Prueba de busqueda por nombre");
		Producto producto1 = productoImp.buscarProductoNombre("magos", lista);
		Producto producto2 = productoImp.buscarProductoNombre("azucar", lista);
		existeProducto(producto1);
		existeProducto(producto2);
		//insertar
		System.out.println("Insersion:");
		List<Producto> ListInsertada = productoImp.insertarProducto(new Producto("mayoneza", "ddd", 5, 5), lista);
		Producto producto3 = productoImp.buscarProductoNombre("mayoneza", ListInsertada);
		existeProducto(producto3);
		System.out.println("Modificaion:");
		List<Producto> ListModifica = productoImp.modificarProducto(new Producto("mayoneza", "aceites", 5, 5), ListInsertada);
		Producto producto4 = productoImp.buscarProductoNombre("mayoneza", ListModifica);
		existeProducto(producto4);
		System.out.println("Eliminar:");
		List<Producto> ListEliminada = productoImp.eliminarProducto(new Producto("mayoneza", "aceites", 5, 5), ListModifica);
		Producto producto5=productoImp.buscarProductoNombre("mayoneza",ListEliminada);
		existeProducto(producto5);
	}


	public static void main(String[] args) {
		PruebaInterfazCliente();
		PruebaInterfazEmpleado();
		PruebaInterfazProducto();

	}

}
