package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class ListaCatedraticos {
    private ArrayList<Catedratico> ListaCatedraticos;
    public ListaCatedraticos(){ ListaCatedraticos= new ArrayList<>();
    }
    public void addCatedratico(Catedratico Catedratico){
        ListaCatedraticos.add(Catedratico);
    }
    public void ImprimirLista()
    {

        for (Catedratico catedratico: ListaCatedraticos) {
            System.out.println(catedratico.toString());
        }
    }

    public Catedratico Buscar(long id) {
        for(Catedratico catedratico: ListaCatedraticos){
            if(catedratico.getId() == id)
                return catedratico;
        }
        return null;
    }

    public int Cantidad(){
        return ListaCatedraticos.size();
    }
}
