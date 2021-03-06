import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Liquidacion;
import main.CajaRegistradora;
import main.Nueva;
import main.Prenda;
import main.Promocion;
import main.TipoPrenda;
import main.VentaConTarjeta;
import main.Venta;

public class CajaRegistradoraTest {
	CajaRegistradora cajaRegistradora;
	
	LocalDate unaFecha;
	LocalDate otraFecha;
	
	Nueva nueva;
	
	Prenda remeraGris;
	Prenda pantalonAzul;
	
	Venta ventaEfectivo;
	Venta ventaEfectivo2;
	Venta ventaEfectivo3;

	@Before
	public void init() {
		cajaRegistradora = new CajaRegistradora();
		
		unaFecha = LocalDate.of(2021, 1, 19);
		otraFecha = LocalDate.of(2021, 1, 20);
		
		nueva = new Nueva();
		
		remeraGris = new Prenda(TipoPrenda.PANTALON, nueva, 1000);
		pantalonAzul = new Prenda(TipoPrenda.PANTALON, nueva, 2000);
		
		ventaEfectivo = new Venta(unaFecha); 
		ventaEfectivo2 = new Venta(unaFecha);
		ventaEfectivo3 = new Venta(otraFecha);
		
		ventaEfectivo.agregarPrendaConCantidad(remeraGris, 1);
		ventaEfectivo2.agregarPrendaConCantidad(pantalonAzul, 1);
		ventaEfectivo3.agregarPrendaConCantidad(pantalonAzul, 1000);
		
		cajaRegistradora.registrarVenta(ventaEfectivo);
		cajaRegistradora.registrarVenta(ventaEfectivo2);
		cajaRegistradora.registrarVenta(ventaEfectivo3);
	}
	
	@Test
	public void liquidacionCalculaPrecioBien() {
		var montoVentasUnaFeha = cajaRegistradora.ventasDeLaFecha(unaFecha);
		Assert.assertEquals(montoVentasUnaFeha, 3000,0);
	}
}




