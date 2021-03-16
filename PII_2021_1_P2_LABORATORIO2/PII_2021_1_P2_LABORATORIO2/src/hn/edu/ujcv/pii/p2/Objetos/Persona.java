package hn.edu.ujcv.pii.p2.Objetos;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Persona {
    private long Id;
    private String Nombre;
    //private Date FechaNacimiento;
    public Persona(){}
    public Persona (long Id, String Nombre)
    {
        this.Id              = Id;
        this.Nombre         = Nombre;
       // this.FechaNacimiento = FechaNacimiento;
    }
    public long getId(){
        return Id;
    }
    public void setId(long Id){
        this.Id = Id;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    //public Date getFechaNacimiento ()
   /* {
        return FechaNacimiento;
    }
    //public void setFechaNacimiento (Date FechaNacimiento)
    {
        this.FechaNacimiento = FechaNacimiento;
    }

   public int CalcularEdad(String fechaNacimiento)
   {

       Date fechaActual = new Date();
       SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       String hoy = formato.format(fechaActual);
       String[] dat1 = fechaNacimiento.split("/");
       String[] dat2 = hoy.split("/");
       int anos = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
       int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
       if (mes < 0) {
           anos = anos - 1;
       } else if (mes == 0) {
           int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
           if (dia > 0) {
               anos = anos - 1;
           }
       }
       return anos;
   }*/
   public String toString ()
   {
       return "Nombre  : " .concat("\t").concat(getNombre()).concat("\n")
               .concat("ID :  ").concat("\t").concat(String.valueOf(getId()));
   }
}




