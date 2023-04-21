/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class EjemploAutomovil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Asignar por una instancia un espacio de memoria para el objeto
		Automovil auto = new Automovil();
	
		
		//LLenado de atributos
		Automovil mercedes = new Automovil();
		mercedes.setFabricante("Benz");
		mercedes.setModelo("Sport75"); 
		mercedes.setColor("Blanco");
		mercedes.setCilindrada(2.0);

		
		Automovil mazda = new Automovil();
		mazda.setFabricante("Mazda");
		mazda.setModelo("BT-89"); 
		mazda.setColor("Rojo"); 
		mazda.setCilindrada(3.0);
		System.out.println("mazda.fabricante = " + mazda.getFabricante());
		
		
		//Llamada de los atributos de automovil mercedes
		System.out.println(mercedes.detalle());
		
		//Llamada de los atributos de automovil mazda
		System.out.println(mazda.detalle());
		
		//Llamada de metodos adicionales
		System.out.println(mazda.acelerar(3000));
		System.out.println(mazda.frenar());
		
		//Llamada de ambos metodos
		System.out.println(mercedes.acelerarFrenar(4000));
		
		//Llamada a calculo de redimiento de gasolina
		System.out.println("Kilometros por litro: " + mazda.calcularConsumo(300, 0.60f));
		
		//Llamada a calculo de redimiento de gasolina
		System.out.println("Kilometros por litro: " + mazda.calcularConsumo2(300, 60));
	}

}
