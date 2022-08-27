package EjerciciosProyectoFinal;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RentaTest {
    Renta rentaTest = new Renta("NombreTest", "direccion de Prueba", "3344556677", true, "correoTest@gmail.com", PagoElectronico.TRANSFERENCIA);

    Prenda pantalon = new Pantalon("Pantalon", EstadosDeMexico.JALISCO, CategoriaPrenda.PRENDA_COMUN, 1000, 200, 1500);
    Prenda sombrero = new Sombrero("Sombrero", EstadosDeMexico.NUEVO_LEON, CategoriaPrenda.PRENDA_GALA, 1000, 200, 1500);

    @Test
    void testRenta() {
        String expectedClienteNombre = "NombreTest";
        Integer expectedTotalRenta = 400;
        rentaTest.prendasEnRenta.add(pantalon);
        rentaTest.prendasEnRenta.add(sombrero);

        for (Prenda prendaEnRenta : rentaTest.prendasEnRenta) {
            rentaTest.totalCostoRenta = rentaTest.totalCostoRenta + prendaEnRenta.costoRenta;
        }

        Assert.assertEquals(expectedClienteNombre,rentaTest.cliente.getNombreCliente());
        Assert.assertEquals(expectedTotalRenta, rentaTest.totalCostoRenta);
    }
}