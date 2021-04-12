package main;

public class PrendaConCantidad {
	Prenda prenda;
	int cantidad;
	
	public PrendaConCantidad(Prenda prenda, int cantidad) {
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
