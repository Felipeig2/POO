package pipe;

public class ProductoPerecedero extends Producto {
    int diasVencer;
	public ProductoPerecedero(int id, String nombre, int precio, int diasVencer) {
		super(id, nombre, precio);
	}

	@Override
	public void calcularPrecioFinal() {
        if(diasVencer < 10) {
            precio *= 0.8;
        }
    }
		
	}

}
