package EjerciciosProyectoFinal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlusaTest {
    String tipoPrendaEsperado = "Blusa";
    EstadosDeMexico estadoMexicoPrendaEsperado = EstadosDeMexico.JALISCO;
    String categoriaPrendaEsperado = "Gala";
    Integer costoProduccionEsperado = 10;
    Integer costoRentaEsperado = 15;
    Integer costoVentaEsperado = 20;

    Blusa blusa1 = new Blusa(tipoPrendaEsperado,estadoMexicoPrendaEsperado,categoriaPrendaEsperado,costoProduccionEsperado,costoRentaEsperado,costoVentaEsperado);


    @Test
    void imprimirInformacionPrenda() {
        blusa1.imprimirInformacionPrenda();
        Assertions.assertEquals(tipoPrendaEsperado,blusa1.tipoDePrenda);
    }
}