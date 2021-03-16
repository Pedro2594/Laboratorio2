package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;

public class Historial implements IHISTORIAL {
    Alumno Alumno;
    Campus Campus;
    Carrera Carrera;
    Periodo Periodo;
    ArrayList<Clase>Clases;
    public Historial(){}
    public Historial( Alumno Alumno, Campus Campus,Carrera Carrera, Periodo Periodo, ArrayList<Clase>Clases)
    {
        this.Alumno = Alumno;
        this.Campus = Campus;
        this.Carrera = Carrera;
        this.Periodo = Periodo;

    }
    public Alumno getAlumno ()
    {
        return Alumno;
    }
    public void setAlumno (Alumno Alumno)
    {
        this.Alumno = Alumno;
    }
    public Campus getCampus( )
    {
        return Campus;
    }
    public void setCampus (Campus Campus)
    {
        this.Campus = Campus;
    }
    public Carrera getCarrera (){return Carrera;}
    public void setCarrera (Carrera Carrera){this.Carrera = Carrera;}
   public Periodo getPeriodo(){return Periodo;}
   public void setPeriodo (Periodo Periodo){this.Periodo = Periodo;}
   public ArrayList <Clase> getClases (){return Clases;}

    public void setClases(ArrayList<Clase> clases) {
        Clases = clases;
    }

    public String toString()
    {
        return ("Alumno".concat(String.valueOf(getAlumno()))
                .concat("Campus").concat(String.valueOf(getCampus()))
                .concat("carrera").concat(String.valueOf(getCarrera()))
                .concat("Periodo: ").concat(String.valueOf(getPeriodo()))
                .concat("Clase :").concat(String.valueOf(getClases())));
    }

    @Override
    public double CalcularPromedio(double Promedio) {
        return 0;
    }
  /*  @Override
    public double CalcularPromedio(double Promedio)
    {   Promedio =;
        return Promedio;
    }*/
}
