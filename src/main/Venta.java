package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
	
	List<Item> prendas;
	LocalDate fecha;
	
	public Venta(LocalDate fecha) {
		this.prendas = new ArrayList<Item>();
		this.fecha = fecha;
	}
	
	public void agregarPrendaConCantidad(Prenda prenda, int cantidad) {
		var prendaCantidad = new Item(prenda, cantidad);
		prendas.add(prendaCantidad);
	}
	
	
	public double valorVenta() {
		return prendas
				.stream()
				.mapToDouble(prendaCantidad -> prendaCantidad.precio())
				.sum();
	}
	
	public boolean esDeLaFecha(LocalDate unaFecha) {
		return unaFecha.equals(fecha);
	}
}
