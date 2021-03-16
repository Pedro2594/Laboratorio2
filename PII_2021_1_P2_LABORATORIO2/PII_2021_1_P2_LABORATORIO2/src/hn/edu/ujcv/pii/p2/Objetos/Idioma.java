package hn.edu.ujcv.pii.p2.Objetos;

import java.util.Scanner;

public class Idioma extends General{
int NotaLaboratorio;
public Idioma(){}
public Idioma(boolean TodasCarreras, int Id, String Nombre, int UnidadesValorativas,int NA1, int NE1,int NA2,
              int NE2,int NA3, int NE3, int NR,int NotaLaboratorio)
{
    super(TodasCarreras, Id, Nombre,  UnidadesValorativas,NA1,  NE1, NA2,
            NE2, NA3,  NE3,  NR);
    this.NotaLaboratorio = NotaLaboratorio;
}
    public int getNotaLaboratorio() {

        return NotaLaboratorio;
    }
    public void setNotaLaboratorio(int NotaLaboratorio )
    {
        this.NotaLaboratorio = NotaLaboratorio;
    }
    @Override
    public String toString() {
        return super.toString().concat(("Ingrese la nota del laboratorio ").concat(String.valueOf(getNotaLaboratorio())));
    }

    @Override
    public double CalcularNotaFinal()
    {
        return (getNA1()+getNA2()+getNA3()+getNE1()+getNE2()+getNE3()+getNR()) + NotaLaboratorio;
    }

    @Override
    public void PedirNotas(Scanner teclado) {
        super.PedirNotas(teclado);
        System.out.println("Ingrese nota Laboratorio");
        NotaLaboratorio = teclado.nextInt();
    }
}
