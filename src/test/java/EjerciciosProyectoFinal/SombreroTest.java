package EjerciciosProyectoFinal;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SombreroTest {

    String tipoPrendaEsperado = "Sombrero";
    EstadosDeMexico estadoMexicoPrendaEsperado = EstadosDeMexico.NUEVO_LEON;
    String categoriaPrendaEsperado = "Gala";
    Integer costoProduccionEsperado = 10;
    Integer costoRentaEsperado = 15;
    Integer costoVentaEsperado = 20;

    Sombrero sombrero1 = new Sombrero(tipoPrendaEsperado,estadoMexicoPrendaEsperado,categoriaPrendaEsperado,costoProduccionEsperado,costoRentaEsperado,costoVentaEsperado);


    @Test
    void imprimirInformacionPrenda() {
        sombrero1.imprimirInformacionPrenda();
        Assertions.assertEquals(tipoPrendaEsperado,sombrero1.tipoDePrenda);
    }
}