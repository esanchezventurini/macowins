package main;

public class Liquidacion extends EstadoPrenda{
	
	public Liquidacion() {
		
	}
	
	@Override
	public double calcularPrecioPrenda(double precioBase) {
		return super.calcularPrecioPrenda(precioBase) * 0.5;
	}
}
