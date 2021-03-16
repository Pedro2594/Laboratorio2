package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class ListaAlumnos {
    private ArrayList<Alumno> Listaalumnos ;

    public int Cantidad(){
        return Listaalumnos.size();
    }

    public ListaAlumnos (){

        Listaalumnos =new ArrayList<>();
    }

public void addAlumno (Alumno Alumno){
    Listaalumnos.add(Alumno);

}

  public void ImprimirLista(){
        for (Alumno alumno : Listaalumnos) {
//            String listado = "";
            System.out.println("El nombre el alumno es: "+alumno.getNombre()+
                    "---El ID es: "+alumno.getId()+
                    "---El nuemro de cuenta es:"+alumno.getCuenta());
        }

    }

public Alumno BuscarAlumno(long Id){
        for (Alumno alumno : Listaalumnos){
            if (alumno.getId()==Id){
                return alumno;
            }
        }
        return null;
}

}
