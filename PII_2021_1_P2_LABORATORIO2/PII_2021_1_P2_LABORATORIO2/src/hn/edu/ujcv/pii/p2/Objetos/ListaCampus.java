package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class ListaCampus {
    private ArrayList<Campus> ListaCampus;
    public ListaCampus(){
        ListaCampus= new ArrayList<>();
    }
    public void addCampus(Campus Campus){
        ListaCampus.add(Campus);
    }

    public void ImprimirLista()
    {
        for (Campus campus: ListaCampus) {
            System.out.println(campus.toString());
        }
    }

    public Campus BuscarCampus(long id) {
        for(Campus campus: ListaCampus){
            if(campus.getId() == id)
                return campus;
        }
        return null;
    }

    public int Cantidad(){
        return ListaCampus.size();
    }
}
