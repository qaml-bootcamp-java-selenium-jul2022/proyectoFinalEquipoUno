package EjerciciosProyectoFinal;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class Prenda {
    public String tipoDePrenda;
    public String categoriaPrenda;
    public Integer costoProduccion;
    public Integer costoRenta;
    public Integer costoVenta;
    public EstadosDeMexico estadoMexicoPrenda;

    public Prenda(String tipoDePrenda, EstadosDeMexico estadoMexicoPrenda, String categoriaPrenda, Integer costoProduccion, Integer costoRenta, Integer costoVenta){
        this.tipoDePrenda = tipoDePrenda;
        this.estadoMexicoPrenda = estadoMexicoPrenda;
        this.categoriaPrenda = categoriaPrenda;
        this.costoProduccion = costoProduccion;
        this.costoRenta = costoRenta;
        this.costoVenta = costoVenta;

    }
    public String regionEstadoDeMexico(EstadosDeMexico regionEstadoMexico) {
        Map<EstadosDeMexico, String> mapaEstadosDeMexico = new TreeMap<>();
        mapaEstadosDeMexico.put(EstadosDeMexico.CIUDAD_DE_MEXICO,"Region Centro");
        mapaEstadosDeMexico.put(EstadosDeMexico.JALISCO,"Occidente");
        mapaEstadosDeMexico.put(EstadosDeMexico.SINALOA,"Noroeste");
        mapaEstadosDeMexico.put(EstadosDeMexico.NUEVO_LEON,"Noreste");
        mapaEstadosDeMexico.put(EstadosDeMexico.QUINTANA_ROO,"Region Sureste");
        mapaEstadosDeMexico.put(EstadosDeMexico.AGUASCALIENTES,"Region centro");


        return mapaEstadosDeMexico.get(regionEstadoMexico);
    }

    public void imprimirInformacionPrenda(){

    }
}
