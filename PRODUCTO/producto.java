package pipe;

import java.util.ArrayList;

public abstract class Producto {
	int id;
	String nombre;
	int precio;
	
	public Producto(int idE, String nombreE, int precioE) {
		this.id = idE;
		this.nombre = nombreE;
		this.precio = precioE;
	}
	
	public abstract void calcularPrecioFinal();

	public static void main(String[] args) {
		ArrayList<Producto> Productos  = new ArrayList<>();
		Producto.add(new ProductoPerecedero(1, "Harina", 200, 12));
		Producto.add(new ProductoNoPerecedero(2, "Levadura", 200));
		
	}

}
