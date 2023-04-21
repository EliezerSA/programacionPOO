/**
 * 
 */
package org.cursojava.java.proyecto;

import java.util.Date;

/**
 * @author MatebookD16
 *
 */
public class OrdenCompra {
	
	private int identificador;
	private String descripcion;
	private Date fecha;
	private Cliente cliente;
	private Producto [] productos;
	
	private static int ultimoId;
	private int indiceProductos;
	
	
	public OrdenCompra(String descripcion) {
		this.descripcion = descripcion;
		this.identificador = ++ultimoId;
		this.productos = new Producto[4];
	}


	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}


	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}


	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}


	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}


	/**
	 * @return the productos
	 */
	public Producto[] getProductos() {
		return productos;
	}
	
	
	public void addProducto(Producto producto) {
		if(indiceProductos < this.productos.length) {
			this.productos[indiceProductos++] = producto;
		}
	
	}
	
	
	public int getGranTotal() {
		int total = 0;
		for(Producto p: productos) {
			total += p.getPrecio();
		}
		return total;
	}
	

}
