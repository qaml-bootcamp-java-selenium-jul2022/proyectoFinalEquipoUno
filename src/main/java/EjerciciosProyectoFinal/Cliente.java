package EjerciciosProyectoFinal;

public class Cliente {
    private String nombreCliente = "alvaro";

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public boolean isClienteRegistrado() {
        return clienteRegistrado;
    }

    public void setClienteRegistrado(boolean clienteRegistrado) {
        this.clienteRegistrado = clienteRegistrado;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        if(correoElectronico.endsWith("@gmail.com")||correoElectronico.endsWith("@hotmail.com")){
            this.correoElectronico = correoElectronico;
        }
        else{
            System.out.println("El correo electronico es invalido.");
        }

    }

    public PagoElectronico getPagoElectronico() {
        return pagoElectronico;
    }

    public void setPagoElectronico(PagoElectronico pagoElectronico) {
        this.pagoElectronico = pagoElectronico;
    }

    private String direccionCliente = "Calle primera #1546";
    private String telefonoCliente = "+526671825514";
    private boolean clienteRegistrado = true;
    private String correoElectronico = "alvmmn@gmail.com";
    private PagoElectronico pagoElectronico;

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


