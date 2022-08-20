package EjerciciosProyectoFinal;

public class Cliente {
    public String nombreCliente = "alvaro";
    public String direccionCliente = "Calle primera #1546";
    public String telefonoCliente = "+526671825514";
    public boolean clienteRegistrado = true;
    public String correoElectronico = "alvmmn@gmail.com";
    public PagoElectronico pagoElectronico;

    public Cliente(String nombreCliente, String direccionCliente, String telefonoCliente, boolean clienteRegistrado,String correoElectronico, PagoElectronico pagoElectronico){
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.clienteRegistrado = clienteRegistrado;
        this.correoElectronico = correoElectronico;
        this.pagoElectronico = pagoElectronico ;
    }

    public void imprimirInformacionCliente(){
        System.out.println(this.nombreCliente);
        System.out.println(this.direccionCliente);
        System.out.println(this.telefonoCliente);
        System.out.println(this.clienteRegistrado);
        System.out.println(this.correoElectronico);
        System.out.println(this.pagoElectronico);
    }
}


