package tp_herencia;

public class Auto extends Vehiculo{
	
	public Auto(String marca, String modelo, int año) {
		super(marca, modelo, año);
	}
	
	@Override
	public void encender() {
		this.encendido = true;
		System.out.println("El auto ha sido encendida");
	}
	
	
}
