package main;

public class Promocion implements EstadoPrenda{
	float precioARestar;
	
	public Promocion(float precioARestar) {
		this.precioARestar = precioARestar;
	}
	
	@Override
	public double calcularPrecioPrenda(double precioBase) {
		return Math.max(precioBase - precioARestar, 0);
	}
}
