/**
 * 
 */

/**
 * @author MatebookD16
 *
 */
public class Automovil {

	private String fabricante;
	private String modelo;
	private String color;
	private double cilindrada;
	private int capacidadEstanque = 40;
	
	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}

	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the cilindrada
	 */
	public double getCilindrada() {
		return cilindrada;
	}

	/**
	 * @param cilindrada the cilindrada to set
	 */
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	/**
	 * @return the capacidadEstanque
	 */
	public int getCapacidadEstanque() {
		return capacidadEstanque;
	}

	/**
	 * @param capacidadEstanque the capacidadEstanque to set
	 */
	public void setCapacidadEstanque(int capacidadEstanque) {
		this.capacidadEstanque = capacidadEstanque;
	}
	
	
	

	
	
	

	public String detalle() {
		// StringBuilder sb = new StringBuilder();
		return "auto.fabricante = " + this.fabricante + "\nauto.modelo = " + this.modelo + "\nauto.color = "
				+ this.color + "\nauto.cilindrada = " + this.cilindrada;

		// return sb.toString();

	}
	
	//Metodo con argumentos 
	public  String acelerar(int rpm) {
		return "El auto " + this.fabricante + " acelerado a " + rpm + "rpm";
		
	}
	
	//Metodo 
	public  String frenar() {
		return this.fabricante + " " + this.modelo + " frenando!";
		
	}
	
	public String acelerarFrenar(int rpm) {
		String acelerar = this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + "\n" + frenar;
	}
	
	public float calcularConsumo(int km, float porcentajeGasolina) {
		return km/(capacidadEstanque*porcentajeGasolina);
	}
	
	public float calcularConsumo2(int km, int porcentajeGasolina) {
		return km/(capacidadEstanque*porcentajeGasolina/100f);
	}

	

	
	
	
}
