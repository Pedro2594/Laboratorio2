package hn.edu.ujcv.pii.p2.Objetos;

public  class General extends Clase{
    private boolean TodasCarreras;
    public General(){}
    public General( boolean TodasCarreras, int Id, String Nombre,int UnidadesValorativas,
                    int NA1,int NE1,  int NA2, int NE2, int NA3, int NE3, int NR)
    {
        super( Id,  Nombre, UnidadesValorativas, NA1, NE1, NA2, NE2,  NA3, NE3, NR);
    }
    public boolean isTodasCarreras(){
        return TodasCarreras;
    }
   @Override
    public String toString (){
    return super.toString().concat(("Nombre de la clase : " ).concat(String.valueOf(getNombre()))
                           .concat(" Unidades Valorativas de la clase").concat(String.valueOf(getUnidadesValorativas() ))
                           .concat("NOTAS PRIMER PARCIAL: ")
                           .concat("Nota Acumulativa I: ").concat(String.valueOf(getNA1()))
                           .concat(" Nota de Examen I").concat(String.valueOf(getNE1()))
                           .concat("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
                           .concat("NOTAS SEGUNDO PARCIAL: ")
                           .concat(" Nota Acumulativa II").concat(String.valueOf(getNA2()))
                           .concat(" Nota Examen II").concat(String.valueOf(getNE2()))
                           .concat("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~")
                           .concat("NOTAS TERCER PARCIAL :" )
                           .concat("Nota Acumulativa III :")
                           .concat(String.valueOf(getNA3()))
                           .concat("Nota Examen III").concat(String.valueOf(getNE3()))
                           .concat(" Nota de Reposicion").concat(String.valueOf(getNR())));
}

    @Override
    public double CalcularNotaFinal() {
        return (getNA1()+getNA2()+getNA3()+getNE1()+getNE2()+getNE3()+getNR());
    }

    public void setTodasCarreras(boolean todasCarreras) {
        TodasCarreras = todasCarreras;
    }

    @Override
    public String toStringLineal(){
        return "Clase (" + getId() + ") - " + getNombre() + " Todas las carreras " + (TodasCarreras?"Si":"No") + " UV: " + getUnidadesValorativas() + "\n";
    }

/*@Override
    public double CalcularNotaFinal(double NotaFinal, double Primer, double Segundo,double Tercero)
{
    //Primer Parcial
    Primer = NA1+NE1;
    Segundo = NA2+ NE2;
    Tercero =NA3 + NE3;
    NotaFinal = Primer + Segundo + Tercero;
    return NotaFinal;
}
*/

}
