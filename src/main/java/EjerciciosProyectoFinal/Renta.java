package EjerciciosProyectoFinal;

import java.util.ArrayList;
import java.util.List;

public class Renta {

    public Integer totalCostoRenta = 0;
    public Cliente cliente;
    public List<Prenda> prendasEnRenta;

    public Renta (String nombreCliente, String direccionCliente, String telefono, Boolean registrado, String correo, PagoElectronico pagoElectronico) {
        this.cliente = new Cliente(nombreCliente, direccionCliente, telefono, registrado, correo, pagoElectronico);
        this.prendasEnRenta =  new ArrayList<>();
    }

}
