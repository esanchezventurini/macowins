package main;

import java.time.LocalDate;

public class VentaConTarjeta extends Venta{

	int cantidadCuotas;
	int coeficiente;
	
	
	public VentaConTarjeta(LocalDate fecha, int cantidadCuotas, int coeficiente) {
		super(fecha);
		this.cantidadCuotas = cantidadCuotas;
		this.coeficiente = coeficiente;
	}
	
	private double porcentajeValorPrendas(double porcentaje) {
		return prendas
				.stream()
				.mapToDouble(prendaConCantidad -> prendaConCantidad.porcentajePrecios(porcentaje))
				.sum();
	}
	
	private double recargo() {
		return cantidadCuotas * coeficiente + this.porcentajeValorPrendas(0.01);
	}
	
	@Override
	public double valorVenta() {
		return super.valorVenta() + this.recargo();
	}

}
