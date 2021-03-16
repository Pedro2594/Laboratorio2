package hn.edu.ujcv.pii.p2.Objetos;

import java.util.Scanner;

public class Avanzada extends Clase{
    int TieneVinculacion;
    int ValorVinculacion;
    public Avanzada(){}
    public Avanzada( boolean TodasCarreras, int Id, String Nombre,int UnidadesValorativas,
                int NA1,int NE1,  int NA2, int NE2, int NA3, int NE3, int NR,int TieneVinculacion,int ValorVinculacion)
    {
       super(Id,  Nombre, UnidadesValorativas, NA1, NE1, NA2, NE2,  NA3, NE3, NR);
       this.TieneVinculacion = TieneVinculacion;
       this.ValorVinculacion = ValorVinculacion;
    }
    public int  getTieneVinculacion(){return TieneVinculacion;}
    public void setTieneVinculacion(int TieneVinculacion){this.TieneVinculacion = TieneVinculacion;}
    public int  getValorVinculacion(){return ValorVinculacion;}
    public void setValorVinculacion(int ValorVinculacion){this.ValorVinculacion = ValorVinculacion;}

    @Override
    public String toString()
{
    return super.toString().concat("");
}

    @Override
    public double CalcularNotaFinal() {
        return (getNA1()+getNA2()+getNA3()+getNE1()+getNE2()+getNE3()+getNR());
    }

    @Override
    public String toStringLineal() {
        return "Clase (" + getId() + ") - " + getNombre() + " Tiene Vinculacion: " + ValorVinculacion + " UV: " + getUnidadesValorativas() + "\n";
    }


}
