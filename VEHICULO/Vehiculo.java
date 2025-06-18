package tp_herencia;

public abstract class Vehiculo {
	
	String marca;
	String modelo;
	int año;
	boolean encendido = false;
	
	public Vehiculo(String marcaE, String modeloE, int añoE) {
		this.marca= marcaE;
		this.modelo = modeloE;
		this.año = añoE;
	}
	
	public void encender() {
		this.encendido = true;
	}
	
	public void mostrar() {
		 System.out.println(toString());
	}
	
	public String toString() {
		return "| Marca: " + this.marca + "\t|Modelo: " + this.modelo + "\t|Año: " + this.año + "\t|Encendido: " + this.encendido; 
	}
	
	
	
	public static void main(String[] args) {
		Vehiculo Autazo = new Auto("Chevrolet", "nuevo", 2027);
		Vehiculo Motarda = new Moto("Ferrari", "vieja", 1927);
		Vehiculo Bicicletarda = new Bicicleta("Lamborguini", "vieja", 1827);
		
		Autazo.mostrar();
		Autazo.encender();
		Autazo.mostrar();
		
		Motarda.mostrar();
		Motarda.encender();
		Motarda.mostrar();

		Bicicletarda.mostrar();
		Bicicletarda.encender();
		Bicicletarda.mostrar();

	}

}
