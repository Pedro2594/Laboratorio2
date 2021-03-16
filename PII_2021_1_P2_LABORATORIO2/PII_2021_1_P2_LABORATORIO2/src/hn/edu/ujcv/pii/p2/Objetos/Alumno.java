package hn.edu.ujcv.pii.p2.Objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Alumno extends Persona {
    private long Cuenta;


    public Alumno(){}
public Alumno (long Cuenta, long Id, String Nombre)
{
    super(Id, Nombre);
    this.Cuenta = Cuenta;
}
public long getCuenta()
{
    return Cuenta;
}
   public void setCuenta (long Cuenta)
   {
       this.Cuenta = Cuenta;
   }

@Override
   public String toString ()
   {
       return super. toString().concat("\n").concat("Cuenta: ")  .concat("\t") .concat(String.valueOf(getCuenta()));
   }






}
