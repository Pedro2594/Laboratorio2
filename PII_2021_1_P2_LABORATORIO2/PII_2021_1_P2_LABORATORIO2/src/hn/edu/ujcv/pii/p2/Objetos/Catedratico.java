package hn.edu.ujcv.pii.p2.Objetos;

import java.util.Date;

public class Catedratico extends Persona{
    private  int Codigo;
    public Catedratico(){ }
    public Catedratico(int Codigo, int Id, String Nombre)
    {
        super(Id, Nombre);
        this.Codigo = Codigo;
    }
    public int getCodigo()
    {
        return Codigo;
    }
    public void setCodigo(int Codigo)
    {
        this.Codigo = Codigo;
    }

    @Override
    public String toString(){
        return "Catedratico ("+Codigo+") - " + getNombre() + ", Id: " + getId() + "\n";
    }
}
