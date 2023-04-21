/**
 * 
 */
package org.cursojava.java.proyecto;

/**
 * @author MatebookD16
 *
 */
public class Producto {
	
	private String fabricante;
	private String nombre;
	private int precio;
	
	
	public Producto(String fabricante, String nombre, int precio) {
		super();
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.precio = precio;
	}


	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}
	
	
	
	
	

}
