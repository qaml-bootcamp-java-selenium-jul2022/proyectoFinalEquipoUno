package EjerciciosProyectoFinal;

public class Falda extends Prenda {

    public Falda(String tipoDePrenda, EstadosDeMexico estadoMexicoPrenda, CategoriaPrenda categoriaPrenda, Integer costoProduccion, Integer costoRenta, Integer costoVenta) {
        super(tipoDePrenda, estadoMexicoPrenda, categoriaPrenda, costoProduccion, costoRenta, costoVenta);
    }
    @Override
    public void imprimirInformacionPrenda(){
        System.out.println("Tipo de prenda: "+ this.tipoDePrenda);
        System.out.println("Estado Mexico: "+this.estadoMexicoPrenda +", Region del Estado: "+ this.regionEstadoDeMexico(estadoMexicoPrenda));
        System.out.println("Categoria de la prenda: "+this.categoriaPrenda);
        System.out.println("Costo de produccion: $"+this.costoProduccion);
        System.out.println("Costo de renta: $"+this.costoRenta);
        System.out.println("Costo de venta: $"+this.costoVenta);
    }
}
