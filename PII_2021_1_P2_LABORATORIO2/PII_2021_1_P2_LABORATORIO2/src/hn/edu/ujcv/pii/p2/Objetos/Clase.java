package hn.edu.ujcv.pii.p2.Objetos;

import java.util.Scanner;

public abstract class Clase implements IClase {
    private  int Id;
    private  String Nombre;
    private  int UnidadesValorativas;
    private  int NA1;
    private  int NE1;
    private  int NA2;
    private  int NE2;
    private  int NA3;
    private  int NE3;
    private  int NR;
    public Clase(){}
    public Clase(int Id, String Nombre, int UnidadesValorativas, int NA1,int NE1,int NA2, int NE2,int NA3,int
            NE3,int NR)
    {
        this.Id = Id;
        this.Nombre = Nombre;
        this.NA1 = NA1;
        this.NA2 = NA2;
        this.NA3 = NA3;
        this.NE1 = NE1;
        this.NE2 = NE2;
        this.NE3 = NE3;
        this.NR = NR;
        this.UnidadesValorativas = UnidadesValorativas;

    }
    public int getId()
    {
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

    public int getNA1() {
        return NA1;
    }

    public int getNE1() {
        return NE1;
    }

    public int getNA2() {
        return NA2;
    }

    public int getNE2() {
        return NE2;
    }

    public int getNA3() {
        return NA3;
    }

    public int getNE3() {
        return NE3;
    }

    public int getNR() {
        return NR;
    }

    public int getUnidadesValorativas() {
        return UnidadesValorativas;
    }

    public void setNA1(int NA1) {
        this.NA1 = NA1;
    }

    public void setNA2(int NA2) {
        this.NA2 = NA2;
    }

    public void setNA3(int NA3) {
        this.NA3 = NA3;
    }

    public void setNE1(int NE1) {
        this.NE1 = NE1;
    }

    public void setNE2(int NE2) {
        this.NE2 = NE2;
    }

    public void setNE3(int NE3) {
        this.NE3 = NE3;
    }

    public void setNR(int NR) {
        this.NR = NR;
    }

    public void setUnidadesValorativas(int unidadesValorativas) {
        UnidadesValorativas = unidadesValorativas;
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

    public String toStringLineal(){
        return "";
    }

    public void PedirNotas(Scanner teclado){
        System.out.println("Ingrese NA1:");
        NA1 = teclado.nextInt();
        System.out.println("Ingrese NA2:");
        NA2 = teclado.nextInt();
        System.out.println("Ingrese NA3:");
        NA3 = teclado.nextInt();
        System.out.println("Ingrese NE1:");
        NE1 = teclado.nextInt();
        System.out.println("Ingrese NE2:");
        NE1 = teclado.nextInt();
        System.out.println("Ingrese NE3:");
        NE1 = teclado.nextInt();
        System.out.println("Ingrese NR:");
        NR = teclado.nextInt();
    }
}
