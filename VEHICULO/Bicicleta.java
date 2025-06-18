package tp_herencia;

public class Bicicleta extends Vehiculo{
	
	public Bicicleta(String marca, String modelo, int año) {
		super(marca, modelo, año);
	}
	
	@Override
	public void encender() {
		this.encendido = true;
		System.out.println("La bicicleta ha sido encendida");
	}
}
