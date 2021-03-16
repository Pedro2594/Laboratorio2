package hn.edu.ujcv.pii.p2.Objetos;

import java.util.Date;

public class Campus {
    private  int Id;
    private  String Nombre;
    private  String Direccion;
    private  Date FechaInicio;
   public Campus(){}
   public Campus( int Id, String Nombre, String Direccion, Date FechaInicio)
   {
       this.Id          = Id;
       this.Nombre      = Nombre;
       this.Direccion   = Direccion;
       this.FechaInicio = FechaInicio;
   }
    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    public String getDireccion (){return Direccion;}
    public void setDireccion (String Direccion){ this.Direccion = Direccion;}
    public Date getFechaInicio ()
    {
        return FechaInicio;
    }
    public void setFechaInicio(Date FechaInicio)
    {
        this.FechaInicio= FechaInicio;
    }

    @Override
    public String toString(){
       return "Campus (" + Id + ") - " + Nombre + ", Direccion: " + Direccion + " Fecha Inicio : " + FechaInicio + "\n";
    }

}
