package main;

public class Promocion extends EstadoPrenda{
	float precioARestar;
	
	public Promocion(float precioARestar) {
		this.precioARestar = precioARestar;
	}
	
	@Override
	public double calcularPrecioPrenda(double precioBase) {
		var precioSinPromocion = super.calcularPrecioPrenda(precioBase);
		return Math.max(precioSinPromocion - precioARestar, 0);
	}
}
