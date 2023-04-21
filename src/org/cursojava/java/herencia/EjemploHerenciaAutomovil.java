/**
 * 
 */
package org.cursojava.java.herencia;

/**
 * @author MatebookD16
 *
 */
public class EjemploHerenciaAutomovil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creacion de un objeto de la clase Automovil
		Automovil miAutomovil = new Automovil("Toyota", "Camry", 2022, 4,2);
		
		//LLamada al metodo mostrarInfo() del objeto miAutomovil
		miAutomovil.mostrarInfo();

	}

}

//Paquetes
//'com.empresa.modelo', 'org.empresa.vista', 'org.empresa.controller'
