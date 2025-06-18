package tp_herenciaAnimales;

import java.util.ArrayList;

public abstract class Animal {
	String raza;
	String sonido;
	
	public Animal(String razaE, String sonidoE) {
		this.raza = razaE;
		this.sonido = sonidoE;
	}
	
	public void hacerSonido() {
		System.out.println(this.sonido);
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	
	public String toString() {
		return "|Raza: " + this.raza + "\t|Sonido: " + this.sonido;
	}
	

    public static void main(String[] args) {
    	
        ArrayList<Animal> Bioparque  = new ArrayList<>();
        Bioparque.add(new Perro("Bulldog", "Guau"));
        Bioparque.add(new Vaca ("Hereford", "Muu"));
        Bioparque.add(new Gato ("Persa", "Miau"));
        
        Bioparque.get(0).hacerSonido();
        Bioparque.get(1).hacerSonido();
        Bioparque.get(2).hacerSonido();
        
        Bioparque.get(0).mostrar();
        Bioparque.get(1).mostrar();
        Bioparque.get(2).mostrar();    
    }
}
