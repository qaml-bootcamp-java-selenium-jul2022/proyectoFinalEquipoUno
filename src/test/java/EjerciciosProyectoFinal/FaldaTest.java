package EjerciciosProyectoFinal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaldaTest {

    String tipoDePrendaEsperada = "Falda";
    EstadosDeMexico estadoMexicoPrendaEsperada = EstadosDeMexico.NAYARIT;
    String categoriaPrendaEsperada = "Gala";
    Integer costoProduccionEsperada = 40;
    Integer costoRentaEsperada = 30;
    Integer costoVentaEsperada = 80;

    Falda falda1 = new Falda(tipoDePrendaEsperada,estadoMexicoPrendaEsperada,categoriaPrendaEsperada,costoProduccionEsperada,costoRentaEsperada,costoVentaEsperada);
    @Test
    void imprimirInformacionPrenda() {
        falda1.imprimirInformacionPrenda();
        Assertions.assertEquals(tipoDePrendaEsperada,falda1.tipoDePrenda);
    }
}