package pipe;

public class ProductoNoPerecedero extends Producto{

	public ProductoNoPerecedero(int id, String nombre, int precio) {
		super(id, nombre, precio);
	}

	@Override
	public void calcularPrecioFinal() {
		System.out.println(precio);	
	}
}

