package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class ListaClases {
    private ArrayList<Clase> ListaClases;
    public ListaClases(){ ListaClases= new ArrayList<>();
    }
    public void addClase(Clase Clase){
        ListaClases.add(Clase);
    }
    public void ImprimirLista()
    {
        for (Clase clase: ListaClases) {
            System.out.println(clase.toStringLineal());
        }
    }

    public Clase Buscar(long id) {
        for (Clase clase: ListaClases) {
            if(clase.getId() == id){
                return clase;
            }
        }
        return null;
    }

    public int Cantidad(){
        return ListaClases.size();
    }
}
