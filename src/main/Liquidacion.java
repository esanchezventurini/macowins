package main;

public class Liquidacion implements EstadoPrenda{
	
	@Override
	public double calcularPrecioPrenda(double precioBase) {
		return precioBase * 0.5;
	}
}
