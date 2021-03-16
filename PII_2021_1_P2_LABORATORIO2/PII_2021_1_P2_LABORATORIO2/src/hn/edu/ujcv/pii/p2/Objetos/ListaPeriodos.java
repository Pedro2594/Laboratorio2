package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class ListaPeriodos {
    private ArrayList<Periodo> ListaPeriodos;
    public ListaPeriodos(){ ListaPeriodos= new ArrayList<>();
    }
    public void addPeriodo (Periodo Periodo){
        ListaPeriodos.add(Periodo);
    }
    public void ImprimirLista()
    {
        for (Periodo periodo: ListaPeriodos) {
            System.out.println(periodo.toString());
        }
    }

    public Periodo Buscar(long id){
        for (Periodo periodo: ListaPeriodos) {
            if(periodo.getId() == id)
                return periodo;
        }
        return null;
    }

    public int Cantidad(){
        return ListaPeriodos.size();
    }
}
