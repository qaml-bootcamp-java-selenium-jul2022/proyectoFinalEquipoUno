package EjerciciosProyectoFinal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PantalonTest {
    String tipoDePrendaEsperada = "pantalon";
    EstadosDeMexico estadoMexicoPrendaEsperada = EstadosDeMexico.AGUASCALIENTES;
    CategoriaPrenda categoriaPrendaEsperada = CategoriaPrenda.PRENDA_GALA;
    Integer costoProduccionEsperada = 45;
    Integer costoRentaEsperada = 25;
    Integer costoVentaEsperada = 60;

Pantalon pantalon1 = new Pantalon(tipoDePrendaEsperada,estadoMexicoPrendaEsperada,categoriaPrendaEsperada,costoProduccionEsperada,costoRentaEsperada,costoVentaEsperada);

    @Test
    void imprimirInformacionPrenda() {
        pantalon1.imprimirInformacionPrenda();
        Assertions.assertEquals(tipoDePrendaEsperada,pantalon1.tipoDePrenda);
    }
}