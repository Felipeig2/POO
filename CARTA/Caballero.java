package pipe;

public class Caballero extends Carta {

	public Caballero(String nombreP, int elixirP) {
		super(nombreP, elixirP);
	}
	
	@Override
	public void invocar() {
		System.out.println("El Caballero entra en combate");
	}
}
