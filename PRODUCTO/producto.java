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
		Producto.add(new ProductoPerecedero(1, "Harina", 200));
		Producto.add(new ProductoNoPerecedero(2, "Levadura", 200));
		
	}

}


import java.util.ArrayList;
import java.util.List;

// ---------- Producto ----------
public abstract class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id     = id;
        this.nombre = nombre;
        this.precio = precio;
    }

   
    public abstract double calcularPrecioFinal();

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    @Override
    public String toString() {
        return "Id: " + id +
               " | Nombre: " + nombre +
               " | Precio base: " + precio;
    }
}

// ---------- Producto perecedero ----------
class ProductoPerecedero extends Producto {
    private int diasParaVencer;

    public ProductoPerecedero(int id, String nombre, double precio, int diasParaVencer) {
        super(id, nombre, precio);
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcularPrecioFinal() {
        return (diasParaVencer < 10) ? getPrecio() * 0.80 : getPrecio();
    }
}

// ---------- Producto no perecedero ----------
class ProductoNoPerecedero extends Producto {
    public ProductoNoPerecedero(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio();      
    }
}

// ---------- Supermercado ----------
class Supermercado {
    public static void main(String[] args) {
        List<Producto> mercado = new ArrayList<>();

        mercado.add(new ProductoPerecedero(1, "Manzana", 1000, 9));
        mercado.add(new ProductoPerecedero(2, "Queso", 2000, 15));
        mercado.add(new ProductoNoPerecedero(3, "Arroz", 1500));

        for (Producto p : mercado) {
            System.out.printf("%s -> Precio final: $%.2f%n",
                              p.getNombre(), p.calcularPrecioFinal());
        }
    }
}
