package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class ListaHistoriales {
    private ArrayList<Historial> ListaHistoriales;
    public ListaHistoriales(){ ListaHistoriales= new ArrayList<>();
    }
    public void addHistorial (Historial Historial){
        ListaHistoriales.add(Historial);
    }
    public void ImprimirLista()
    {
        for (Historial historial: ListaHistoriales) {
            System.out.println(historial.toString());
        }
    }


}
