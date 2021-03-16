package hn.edu.ujcv.pii.p2.Objetos;

public class Carrera {
    private  int Id;
    private  String Nombre;
   public Carrera(){}
     public Carrera(int Id, String Nombre)
    {
        this.Id              = Id;
        this.Nombre         = Nombre;
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

    @Override
    public String toString() {
        return "Carrera (" + Id + ") - " + Nombre + "\n";
    }
}
