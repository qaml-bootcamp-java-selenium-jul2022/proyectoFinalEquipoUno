package EjerciciosProyectoFinal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VentaTest {
    Venta ventaTest = new Venta("NombreVentaTest", "direccion de Prueba venta", "3344556677", true, "correoTest@amail.com", PagoElectronico.TRANSFERENCIA);

    Prenda zapato = new Zapato("Zapato", EstadosDeMexico.SINALOA, CategoriaPrenda.PRENDA_COMUN, 1000, 200, 2500);
    Prenda blusa = new Blusa("Blusa", EstadosDeMexico.NAYARIT, CategoriaPrenda.PRENDA_GALA, 1000, 200, 2500);
    Prenda pantalon = new Pantalon("Pantalon", EstadosDeMexico.JALISCO, CategoriaPrenda.PRENDA_COMUN, 1000, 500, 2500);
    Prenda sombrero = new Sombrero("Sombrero", EstadosDeMexico.NUEVO_LEON, CategoriaPrenda.PRENDA_GALA, 1000, 500, 2500);
    Prenda falda = new Falda("Falda", EstadosDeMexico.NUEVO_LEON, CategoriaPrenda.PRENDA_GALA, 1000, 500, 5000);


    @Test
    void testVenta() {
        String expectedClienteNombre = "NombreVentaTest";
        String expectedDireccionCliente = "direccion de Prueba venta";
        String expectedTelefono="3344556677";
        Boolean expectedClienteRegistrado = true;
        String expectedCorreoCliente = "correoTest@amail.com";
        PagoElectronico expectedPagoElectronico = PagoElectronico.TRANSFERENCIA;
        Integer expectedTotalVenta = 15000;
        ventaTest.prendasEnVenta.add(zapato);
        ventaTest.prendasEnVenta.add(blusa);
        ventaTest.prendasEnVenta.add(pantalon);
        ventaTest.prendasEnVenta.add(sombrero);
        ventaTest.prendasEnVenta.add(falda);

        for (Prenda prendaEnRenta : ventaTest.prendasEnVenta) {
            ventaTest.totalCostoVenta = ventaTest.totalCostoVenta + prendaEnRenta.costoVenta;
        }

        Assert.assertEquals(expectedClienteNombre,ventaTest.cliente.getNombreCliente());
        Assert.assertEquals(expectedTotalVenta, ventaTest.totalCostoVenta);
        Assert.assertEquals(expectedDireccionCliente,ventaTest.cliente.getDireccionCliente());
        Assert.assertEquals(expectedTelefono,ventaTest.cliente.getTelefonoCliente());
        Assert.assertEquals(expectedClienteRegistrado,ventaTest.cliente.isClienteRegistrado());
        Assert.assertEquals(expectedCorreoCliente, ventaTest.cliente.getCorreoElectronico());
        Assert.assertEquals(expectedPagoElectronico,ventaTest.cliente.getPagoElectronico());
    }
}