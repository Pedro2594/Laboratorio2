package hn.edu.ujcv.pii.p2.Objetos;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Periodo {
    private  int Id;
    private  String Descripcion;
    private  Date FechaInicio;
    private  Date FechaFin;
   public Periodo(){}
   public Periodo(int Id, String Descripcion, Date FechaInicio, Date FechaFin)
   {
       this.Id           = Id;
       this.Descripcion = Descripcion;
       this.FechaInicio = FechaInicio;
       this.FechaFin    = FechaFin;
   }
    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id = Id;
    }
    public String getDescripcion(){return Descripcion;}
    public void setDescripcion(String Descripcion){this.Descripcion = Descripcion;}
    public Date getFechaInicio ()
    {
        return FechaInicio;
    }
    public void setFechaInicio(Date FechaInicio)
    {
        this.FechaInicio= FechaInicio;
    }
    public Date getFechaFin ()
    {
        return FechaFin;
    }
    public void setFechaFin(Date FechaFin)
    {
        this.FechaFin= FechaFin;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return "Periodo (" + Id + ") - " + Descripcion + " De " + format.format(FechaInicio) + " hasta " + format.format(FechaFin) + "\n";
    }
}
