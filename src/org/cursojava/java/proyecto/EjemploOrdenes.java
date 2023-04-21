/**
 * 
 */
package org.cursojava.java.proyecto;

import java.util.Date;

/**
 * @author MatebookD16
 *
 */
public class EjemploOrdenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ejmplos de Ordenes de compra
		
		OrdenCompra orden1 = new OrdenCompra("Compras componentes pc");
		orden1.setCliente(new Cliente("Jesus", "Gonzales"));
		orden1.setFecha(new Date());
		
		
		orden1.addProducto(new Producto("Western Digital", "Unidad SSD 250GB", 2000));
		orden1.addProducto(new Producto("MSI", "Monitor Optix G721", 5000));
		orden1.addProducto(new Producto("AMD", "Procesador AMD Ryzen 9 6000", 10000));
		orden1.addProducto(new Producto("EVGA", "Tarjeta de video EVGA RTX  3060ti", 7000));
		
		
		OrdenCompra orden2 = new OrdenCompra("Compras Electrodomesticos");
		orden2.setCliente(new Cliente("Alejandra", "Flores"));
		orden2.setFecha(new Date());
		orden2.addProducto(new Producto("Fensa", "Cocina", 15000));
		orden2.addProducto(new Producto("Samsung", "Refrigerador", 11000));
		orden2.addProducto(new Producto("Mabe", "Lavadora", 7000));
		orden2.addProducto(new Producto("Whirpool", "Microoondas", 4000));
		
		
		OrdenCompra orden3 = new OrdenCompra("Compras Materiales de Construccion");
		orden3.setCliente(new Cliente("Diego", "Eduardo"));
		orden3.setFecha(new Date());
		orden3.addProducto(new Producto("Holcim", "Cemento 50kg ", 300));
		orden3.addProducto(new Producto("InterCeramic", "Taza de baño", 2000));
		orden3.addProducto(new Producto("RedLine", "Varilla 2 pulg", 200));
		orden3.addProducto(new Producto("Truper", "Martillo", 500));
		
		
		OrdenCompra[] ordenes = {orden1, orden2, orden3};
		for(OrdenCompra orden : ordenes) {
			System.out.println("Folio" + orden.getIdentificador());
			System.out.println("Folio" + orden.getCliente());
			System.out.println("Folio" + orden.getDescripcion());
			System.out.println("Folio" + orden.getFecha());
			System.out.println("Folio" + orden.getGranTotal());
			
			int i = 1;
			for (Producto p: orden.getProductos()) {
				System.out.println("Producto" + i + ": " + p.getNombre() + " " + p.getFabricante() + "precio $" + p.getPrecio());
				i++;
			}
			
			System.out.println("======================= siguiente =========================");
			
			
		}
		
		
		
		
		

	}

}
