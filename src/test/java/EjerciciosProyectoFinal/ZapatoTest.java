package EjerciciosProyectoFinal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZapatoTest {
    String tipoPrendaEsperado = "Zapato";
    EstadosDeMexico estadoMexicoPrendaEsperado = EstadosDeMexico.NUEVO_LEON;
    String categoriaPrendaEsperado = "Gala";
    Integer costoProduccionEsperado = 15;
    Integer costoRentaEsperado = 25;
    Integer costoVentaEsperado = 35;

    Zapato zapato1 = new Zapato(tipoPrendaEsperado,estadoMexicoPrendaEsperado,categoriaPrendaEsperado,costoProduccionEsperado,costoRentaEsperado,costoVentaEsperado);

    @Test
    void imprimirInformacionPrenda() {
        zapato1.imprimirInformacionPrenda();
        Assertions.assertEquals(tipoPrendaEsperado,zapato1.tipoDePrenda);
    }
}