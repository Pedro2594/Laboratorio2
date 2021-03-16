package hn.edu.ujcv.pii.p2.Objetos;

import java.util.Scanner;

public class Ingenieria extends General{
    private int NotaProyecto;
    public Ingenieria(){}
    public Ingenieria(boolean TodasCarreras, int Id, String Nombre, int UnidadesValorativas,int NA1, int NE1,int NA2,
                      int NE2,int NA3, int NE3, int NR,int NotaProyecto)
    {
        super(TodasCarreras, Id, Nombre,  UnidadesValorativas,NA1,  NE1, NA2,
        NE2, NA3,  NE3,  NR );
        this.NotaProyecto = NotaProyecto;
    }
    public int getNotaProyecto() {

        return NotaProyecto;
    }
    public void setNotaProyecto (int NotaProyecto )
    {
        this.NotaProyecto = NotaProyecto;
    }
    @Override
    public String toString()
    {
        return super.toString().concat("Ingrese Nota de Proyecto " ).concat(String.valueOf(getNotaProyecto()));

    }
    @Override
   public  double CalcularNotaFinal()
    {
       return (getNA1()+getNA2()+getNA3()+getNE1()+getNE2()+getNE3()+getNR()) + NotaProyecto;
    }

    @Override
    public void PedirNotas(Scanner teclado) {
        super.PedirNotas(teclado);
        System.out.println("Ingrese nota proyecto: ");
        NotaProyecto = teclado.nextInt();
    }
}
//coeficiente 0.20
//coef ii 0.20
//coef iii 0.30
//Agregar metodo de buscar por cada lista
