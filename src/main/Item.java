package main;

public class Item {
	Prenda prenda;
	int cantidad;
	
	public Item(Prenda prenda, int cantidad) {
		this.prenda = prenda;
		this.cantidad = cantidad;
	}
	
	public double precio() {
		return prenda.precio() * cantidad;
	}
	
	public double porcentajePrecios(double porcentaje) {
		return this.precio() * porcentaje;
	}
}
