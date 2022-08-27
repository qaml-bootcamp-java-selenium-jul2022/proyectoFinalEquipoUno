package EjerciciosProyectoFinal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
        String nombreClienteEsperado = "Pedro";
        String direccionEsperado = "Calle Azul #1234";
        String telefonoClienteEsperado="+525566778899";
        boolean clienteRegistradoEsperado=true;
        String correoElectronicoEsperado = "abcde@gmail.com";
        PagoElectronico pagoElectronicoEsperado = PagoElectronico.CREDITO;

        Cliente cliente1 = new Cliente(nombreClienteEsperado, direccionEsperado,telefonoClienteEsperado,clienteRegistradoEsperado,correoElectronicoEsperado,pagoElectronicoEsperado);

        @Test
        void imprimirInformacionCliente(){
               // cliente1.imprimirInformacionCliente();
                Assertions.assertEquals(nombreClienteEsperado,cliente1.getNombreCliente());
        }
        @Test
        void imprimirInformacionClienteNegativo(){
                // cliente1.imprimirInformacionCliente();
                Assertions.assertNotEquals("Roberto", cliente1.getNombreCliente());
        }
        @Test
        void setCorreoElectronico(){
                cliente1.setCorreoElectronico("mamamia@gmail.com");
        }
}