package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class ListaCarreras {
    private ArrayList<Carrera> ListaCarreras;
    public ListaCarreras(){ ListaCarreras= new ArrayList<>();
    }
    public void addCarrera(Carrera Carrera){
        ListaCarreras.add(Carrera);
    }
    public void ImprimirLista()
    {
        for (Carrera carrera: ListaCarreras) {
            System.out.println(carrera.toString());
        }
    }

    public Carrera Buscar(long id) {
        for (Carrera carrera: ListaCarreras) {
            if(carrera.getId() == id)
                return carrera;
        }
        return null;
    }

    public int Cantidad(){
        return ListaCarreras.size();
    }
}
