package pipe;

import java.util.ArrayList;

public abstract class Carta {
	String nombre;
	int elixir;
	
	public Carta(String nombreP, int elixirP) {
		this.nombre = nombreP;
		this.elixir = elixirP;
	}
	public abstract void invocar();
	
	public String toString() {
		return "|Nombre: " + this.nombre + "\t|Elixir: " + this.elixir;
	}
	
	

	public static void main(String[] args) {
		ArrayList<Carta> Cartas  = new ArrayList<>();
		Cartas.add(new Caballero("Caballero", 3));
		Cartas.add(new Arquera("Arquera", 5));
		Cartas.add(new BebeDragon("BebéDragon", 4));
		
		Cartas.get(0).invocar();
		Cartas.get(1).invocar();
		Cartas.get(2).invocar();

        for(Carta v : Cartas){
            v.invocar();
            v.toString();
        }
				
	}
}
