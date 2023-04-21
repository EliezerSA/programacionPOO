/**
 * 
 */
package org.cursojava.java.herencia;

/**
 * @author MatebookD16
 *
 */
public class Vehiculo {
	
	String marca;
	String modelo;
	int anio;
	
	
	//Constructor de la clase vehiculo
	public Vehiculo(String marca, String modelo, int anio) {
		//super();
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	//Metodo para mostrar las informacion del vehiculo
	public void mostrarInfo() {
		System.out.println("Marca" + marca);
		System.out.println("Modelo" + modelo);
		System.out.println("Año" + anio);
	}
	

}
