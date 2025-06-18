package pipe;

public class Arquera extends Carta {

	public Arquera(String nombreP, int elixirP) {
		super(nombreP, elixirP);
	}
	
	@Override
	public void invocar() {
		System.out.println("Doble flecha al enemigo");
	}
}
