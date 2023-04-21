/**
 * 
 */
package org.cursojava.java.proyecto;

/**
 * @author MatebookD16
 *
 */
public class Cliente {
	
	private String nombre;
	private String apellido;
	
	//Constructor
	public Cliente(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	
	@Override
	public String toString() {
		return nombre + " " + apellido;
	}
	
	
	
	

}
