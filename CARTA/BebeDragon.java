package pipe;

public class BebeDragon extends Carta {

	public BebeDragon(String nombreP, int elixirP) {
		super(nombreP, elixirP);
	}
	@Override
	public void invocar() {
		System.out.println("Ataque aéreo en área");
	}
	
	@Override
	public String toString() {
		return super.toString() + ("vuela y lanza fuego");
	}
}


