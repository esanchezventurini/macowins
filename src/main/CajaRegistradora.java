package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CajaRegistradora {
	List<Venta> ventas;
	
	public CajaRegistradora() {
		this.ventas = new ArrayList<>();
	}
	
	public void registrarVenta(Venta unaVenta) {
		ventas.add(unaVenta);
	}
	
	private List<Venta> ventasPorFecha(LocalDate unaFecha){
		return ventas
				.stream()
				.filter(unaVenta -> unaVenta.esDeLaFecha(unaFecha))
				.collect(Collectors.toList());
	}
	
	public double ventasDeLaFecha(LocalDate unaFecha) {
		return ventasPorFecha(unaFecha)
				.stream()
				.mapToDouble(unaVenta -> unaVenta.valorVenta())
				.sum();
	}
}
