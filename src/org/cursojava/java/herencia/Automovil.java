/**
 * 
 */
package org.cursojava.java.herencia;

/**
 * @author MatebookD16
 *
 */
public class Automovil extends Vehiculo{
	
	int numeroLlantas;
	int numPuertas;
	
	//Cosntructir de la clase automovil
	public Automovil(String marca, String modelo, int anio, int numeroLlantaS, int numPuertas) {
		super(marca, modelo, anio);
		this.numPuertas = numPuertas;
		this.numeroLlantas = numeroLlantaS;
		
	}

	//Metodo para mostrar la informacion  del automovil
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();//Llamada al metodo mostrarInfo de la clase vehiculo
		System.out.println("Numero de puertas: " + numPuertas);
		System.out.println("Numero de llantas: " + numeroLlantas);
	}

}
