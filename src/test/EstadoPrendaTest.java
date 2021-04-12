import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Liquidacion;
import main.Promocion;

public class EstadoPrendaTest {
	
	Liquidacion liquidacion;
	Promocion promocion;
	
	@Before
	public void init() {
		liquidacion = new Liquidacion();
		promocion = new Promocion(300);
	}
	
	@Test
	public void liquidacionCalculaPrecioBien() {
		var precio = liquidacion.calcularPrecioPrenda(1000);
		Assert.assertEquals(precio,500,0);
	}
	
	@Test
	public void promocionCalculaBienPrecio() {
		var precio = promocion.calcularPrecioPrenda(1000);
		Assert.assertEquals(precio,700,0);
	}
	
	@Test
	public void promocionDescuentoMayorPrecio() {
		var precio = promocion.calcularPrecioPrenda(100);
		Assert.assertEquals(precio, 0, 0);
	}
}





