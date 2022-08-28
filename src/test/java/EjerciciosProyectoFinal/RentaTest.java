package EjerciciosProyectoFinal;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentaTest {
    Renta rentaTest = new Renta("NombreRentaTest", "direccion de Prueba", "3344556677", true, "correoTest@gmail.com", PagoElectronico.TRANSFERENCIA);

    Prenda pantalon = new Pantalon("Pantalon", EstadosDeMexico.JALISCO, CategoriaPrenda.PRENDA_COMUN, 1000, 500, 2000);
    Prenda sombrero = new Sombrero("Sombrero", EstadosDeMexico.NUEVO_LEON, CategoriaPrenda.PRENDA_GALA, 1000, 500, 2000);
    Prenda blusa = new Blusa("Blusa", EstadosDeMexico.JALISCO, CategoriaPrenda.PRENDA_COMUN, 1000, 500, 2000);
    Prenda falda = new Falda("Falda", EstadosDeMexico.NUEVO_LEON, CategoriaPrenda.PRENDA_GALA, 1000, 500, 2000);
    Prenda zapato = new Zapato("Zapato", EstadosDeMexico.JALISCO, CategoriaPrenda.PRENDA_COMUN, 1000, 500, 2000);


    @Test
    void testRenta() {
        String expectedClienteNombre = "NombreRentaTest";
        String expectedDireccionCliente = "direccion de Prueba";
        String expectedTelefono="3344556677";
        Boolean expectedClienteRegistrado = true;
        String expectedCorreoCliente = "correoTest@gmail.com";
        PagoElectronico expectedPagoElectronico = PagoElectronico.TRANSFERENCIA;

        Integer expectedTotalRenta = 2500;
        rentaTest.prendasEnRenta.add(pantalon);
        rentaTest.prendasEnRenta.add(sombrero);
        rentaTest.prendasEnRenta.add(blusa);
        rentaTest.prendasEnRenta.add(falda);
        rentaTest.prendasEnRenta.add(zapato);

        for (Prenda prendaEnRenta : rentaTest.prendasEnRenta) {
            rentaTest.totalCostoRenta = rentaTest.totalCostoRenta + prendaEnRenta.costoRenta;
        }

        Assert.assertEquals(expectedClienteNombre,rentaTest.cliente.getNombreCliente());
        Assert.assertEquals(expectedTotalRenta, rentaTest.totalCostoRenta);
        Assert.assertEquals(expectedDireccionCliente,rentaTest.cliente.getDireccionCliente());
        Assert.assertEquals(expectedTelefono,rentaTest.cliente.getTelefonoCliente());
        Assert.assertEquals(expectedClienteRegistrado,rentaTest.cliente.isClienteRegistrado());
        Assert.assertEquals(expectedCorreoCliente, rentaTest.cliente.getCorreoElectronico());
        Assert.assertEquals(expectedPagoElectronico,rentaTest.cliente.getPagoElectronico());

    }
}