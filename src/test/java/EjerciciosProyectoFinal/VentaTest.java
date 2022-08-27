package EjerciciosProyectoFinal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VentaTest {
    Venta ventaTest = new Venta("NombreVentaTest", "direccion de Prueba venta", "3344556677", true, "correoTest@amail.com", PagoElectronico.TRANSFERENCIA);

    Prenda zapato1 = new Zapato("Zapato", EstadosDeMexico.SINALOA, CategoriaPrenda.PRENDA_COMUN, 1000, 200, 2500);
    Prenda blusa1 = new Blusa("Blusa", EstadosDeMexico.NAYARIT, CategoriaPrenda.PRENDA_GALA, 1000, 200, 2500);

    @Test
    void testVenta() {
        String expectedClienteNombre = "NombreVentaTest";
        Integer expectedTotalVenta = 5000;
        ventaTest.prendasEnVenta.add(zapato1);
        ventaTest.prendasEnVenta.add(blusa1);

        for (Prenda prendaEnRenta : ventaTest.prendasEnVenta) {
            ventaTest.totalCostoVenta = ventaTest.totalCostoVenta + prendaEnRenta.costoVenta;
        }

        Assert.assertEquals(expectedClienteNombre,ventaTest.cliente.getNombreCliente());
        Assert.assertEquals(expectedTotalVenta, ventaTest.totalCostoVenta);
    }
}