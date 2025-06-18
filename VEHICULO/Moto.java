package tp_herencia;

public class Moto extends Vehiculo{
	
	public Moto(String marca, String modelo, int año) {
		super(marca, modelo, año);
	}
	
	@Override
	public void encender() {
		this.encendido = true;
		System.out.println("La moto ha sido encendida");
	}
	
	
}
  