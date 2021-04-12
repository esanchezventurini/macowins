import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Nueva;
import main.Prenda;
import main.Promocion;
import main.TipoPrenda;
import main.VentaConTarjeta;
import main.Venta;

public class VentaTest {
	Nueva nueva;
	Promocion promocion;
	
	Prenda remeraGris;
	Prenda pantalonAzul;
	
	Venta ventaEfectivo;
	VentaConTarjeta ventaTarjeta;

	@Before
	public void init() {
		nueva = new Nueva();
		promocion = new Promocion(100);
		
		remeraGris = new Prenda(TipoPrenda.PANTALON, nueva, 1000);
		pantalonAzul = new Prenda(TipoPrenda.PANTALON, promocion, 2000);
		
		ventaEfectivo = new Venta(LocalDate.now()); 
		ventaTarjeta = new VentaConTarjeta(LocalDate.now(), 10, 100);
	}
	
	@Test
	public void PrecioEsAdecuadoConEfectivo() {
		ventaEfectivo.agregarPrendaConCantidad(remeraGris, 3);
		ventaEfectivo.agregarPrendaConCantidad(pantalonAzul, 5);
		var valorVenta = ventaEfectivo.valorVenta();
		Assert.assertEquals(valorVenta, 12500.0, 0);
	}
	
	@Test
	public void PrecioEsAdecuadoConTarjeta() {
		ventaTarjeta.agregarPrendaConCantidad(remeraGris, 3);
		ventaTarjeta.agregarPrendaConCantidad(pantalonAzul, 5);
		var valorVenta = ventaTarjeta.valorVenta();
		// 12500 + 10 * 100 + 12500 * 0,01
		Assert.assertEquals(valorVenta, 13625, 0);
	}
}









