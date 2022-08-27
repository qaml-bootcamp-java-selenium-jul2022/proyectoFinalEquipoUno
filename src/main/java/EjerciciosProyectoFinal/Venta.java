package EjerciciosProyectoFinal;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    public Integer totalCostoVenta = 0;
    public Cliente cliente;
    public List<Prenda> prendasEnVenta;

    public Venta (String nombreCliente, String direccionCliente, String telefono, Boolean registrado, String correo, PagoElectronico pagoElectronico) {
        this.cliente = new Cliente(nombreCliente, direccionCliente, telefono, registrado, correo, pagoElectronico);
        this.prendasEnVenta =  new ArrayList<>();
    }
}
