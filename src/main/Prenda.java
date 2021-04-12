package main;

public class Prenda {
	TipoPrenda tipoPrenda;
	EstadoPrenda estado;
	int precioBase;
	
	public Prenda(TipoPrenda tipoPrenda, EstadoPrenda estado, int precioBase) {
		this.tipoPrenda = tipoPrenda;
		this.estado = estado;
		this.precioBase = precioBase;
	}
	
	public double precio() {
		return estado.calcularPrecioPrenda(precioBase);
	}
}
