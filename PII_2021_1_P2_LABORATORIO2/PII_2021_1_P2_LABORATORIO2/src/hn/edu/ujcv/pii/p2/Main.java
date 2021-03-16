package hn.edu.ujcv.pii.p2;

import hn.edu.ujcv.pii.p2.Objetos.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Main {
    static Scanner teclado = new Scanner(System.in).useDelimiter("\\n");

    public static void main(String[] args) {
	// write your code here

        int opcion;
        String respuesta;
        try
        {
            ListaAlumnos alumnitos = new ListaAlumnos();
            ListaCampus campuses = new ListaCampus();
            ListaCarreras carreras = new ListaCarreras();
            ListaClases clases = new ListaClases();
            ListaCatedraticos catedraticos = new ListaCatedraticos();
            ListaHistoriales historiales = new ListaHistoriales();
            ListaPeriodos periodos = new ListaPeriodos();


          /*  Persona persona = new Persona();
            Alumno alumno1 = new Alumno()
            System.out.println("Ingrese su fecha de nacimiento en formato DD/MM/YYYY");
            String fechaNacimiento = teclado.nextLine();
            System.out.print ("Edad : ");
            System.out.println(persona.CalcularEdad(fechaNacimiento));
            */
            do {
                System.out.println("UNIVERSIDAD JOSE CECILIO DEL VALLE");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("              Menu de Opciones      ");
                System.out.println("1.Alumnos");
                System.out.println("2.Campus");
                System.out.println("3.Catedraticos");
                System.out.println("4.Carreras");
                System.out.println("5.Clases");
                System.out.println("6.Periodo");
                System.out.println("7.Historial");
                System.out.println("8.Salir");
                System.out.println("Seleccione una opcion ");
                opcion = teclado.nextInt();


                switch (opcion) {
                    case 1:
                        MenuAlumnos(alumnitos);
                        break;
                    case 2:
                        MenuCampus(campuses);
                        break;
                    case 3:
                        MenuCatedraticos(catedraticos);
                        break;
                    case 4:
                        MenuCarreras(carreras);
                        break;
                    case 5:
                        MenuClases(clases);
                        break;
                    case 6:
                        MenuPeriodo(periodos);
                        break;
                    case 7:
                        MenuHistorial(historiales, alumnitos, campuses, carreras, periodos, clases);
                }
            }while(opcion != 8);

        }catch (Exception e )
        {
            System.out.println("ERROR" + e.getMessage());
        }
    }

    private static void MenuHistorial(ListaHistoriales historiales, ListaAlumnos alumnitos, ListaCampus campuses, ListaCarreras carreras, ListaPeriodos periodos, ListaClases clases) {
        String respuesta;
        int opcion;
        do {
            System.out.println("~~~~~~~~   HISTORIAL   ~~~~~~~~~~");
            System.out.println("~~~~~~MENU DE OPCIONES~~~~~~~");
            System.out.println("1. Agregar Historial");
            System.out.println("2. Ver Lista de Historiales");
            System.out.println("~~~~ Selecione una opcion ~~~~~~~");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        Historial historial = new Historial();
                        Alumno alumno;
                        Campus campus;
                        Carrera carrera;
                        Periodo periodo;

                        if(alumnitos.Cantidad() == 0){
                            System.out.println("No se puede ingresar un historial si no hay alumnos");
                            return;
                        }

                        if(campuses.Cantidad() == 0){
                            System.out.println("No se puede ingresar un historial si no hay campuses");
                            return;
                        }
                        if(carreras.Cantidad() == 0){
                            System.out.println("No se puede ingresar un historial si no hay carreras");
                            return;
                        }

                        if(periodos.Cantidad() == 0){
                            System.out.println("No se puede ingresar un historial si no hay periodos");
                            return;
                        }

                        if(clases.Cantidad() == 0){
                            System.out.println("No se puede ingresar un historial si no hay clases");
                            return;
                        }

                        do {
                            alumnitos.ImprimirLista();
                            System.out.println("Ingrese el Id del alumno para el historial:");
                            int idAlumno = teclado.nextInt();
                            alumno = alumnitos.BuscarAlumno(idAlumno);
                            if(alumno==null){
                                System.out.printf("Alumno no existe");
                            }
                        }while (alumno==null);

                        do {
                            campuses.ImprimirLista();
                            System.out.println("Ingrese el Id del campus para el historial:");
                            int id = teclado.nextInt();
                            campus = campuses.BuscarCampus(id);
                            if(campus==null){
                                System.out.printf("Campus no existe");
                            }
                        }while (campus==null);

                        do {
                            carreras.ImprimirLista();
                            System.out.println("Ingrese el Id de la carrera para el historial:");
                            int id = teclado.nextInt();
                            carrera = carreras.Buscar(id);
                            if(carrera==null){
                                System.out.printf("Carrera no existe");
                            }
                        }while (carrera==null);

                        do {
                            periodos.ImprimirLista();
                            System.out.println("Ingrese el Id del periodo para el historial:");
                            int id = teclado.nextInt();
                            periodo = periodos.Buscar(id);
                            if(periodo==null){
                                System.out.printf("Periodo no existe");
                            }
                        }while (periodo==null);

                        String masClases="";
                        ArrayList<Clase> clasesH = new ArrayList<>();
                        do{
                            Clase clase;
                            do {
                                clases.ImprimirLista();
                                System.out.println("Ingrese el Id de la clase para el historial:");
                                int id = teclado.nextInt();
                                clase = clases.Buscar(id);
                                if(clase==null){
                                    System.out.printf("Clase no existe");
                                }
                            }while (clase==null);

                            clase.PedirNotas(teclado);
                            clasesH.add(clase);
                        }while (masClases.equalsIgnoreCase("s"));
                        historial.setAlumno(alumno);
                        historial.setCampus(campus);
                        historial.setCarrera(carrera);
                        historial.setPeriodo(periodo);
                        historial.setClases(clasesH);
                        historiales.addHistorial(historial);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Desea seguir agregando historiales? [s/n]");
                        respuesta = teclado.next();
                    } while (respuesta.equalsIgnoreCase("s"));
                    System.out.println("Hasta Pronto");
                    break;
                case 2:
                    historiales.ImprimirLista();
                    break;
            }
            System.out.println("Desea volver al menu anterior? [S/N]");
            respuesta = teclado.next();
        }while (respuesta.equalsIgnoreCase("s"));
    }

    private static void MenuPeriodo(ListaPeriodos periodos) {
        String respuesta;
        int opcion;
        do {
            System.out.println("~~~~~~~~   PERIODOS   ~~~~~~~~~~");
            System.out.println("~~~~~~MENU DE OPCIONES~~~~~~~");
            System.out.println("1. Agregar Periodo");
            System.out.println("2. Ver Lista de Periodos");
            System.out.println("3. Buscar Periodo");
            System.out.println("4. Regresar");
            System.out.println("~~~~ Selecione una opcion ~~~~~~~");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        Periodo periodo  = new Periodo();
                        System.out.println("1. Agregar Periodo ");
                        System.out.println("Ingrese el ID ");
                        periodo.setId(teclado.nextInt());
                        System.out.println("Ingrese la descripcion ");
                        periodo.setDescripcion(teclado.next());
                        String fchIni = "";
                        System.out.println("Ingrese la fecha de inicio (dd/MM/aaaa) ");
                        fchIni = teclado.next();
                        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate fecha = LocalDate.parse(fchIni,formato);
                        String fchFin = "";
                        System.out.println("Ingrese la fecha de finalizacion (dd/MM/aaaa) ");
                        fchFin = teclado.next();
                        LocalDate fechaFinal = LocalDate.parse(fchFin,formato);
                        periodo.setFechaInicio(Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        periodo.setFechaFin(Date.from(fechaFinal.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        periodos.addPeriodo(periodo);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Desea seguir agregando periodos? [s/n]");
                        respuesta = teclado.next();
                    } while (respuesta.equalsIgnoreCase("s"));
                    System.out.println("Hasta Pronto");
                    break;
                case 2:
                    periodos.ImprimirLista();
                    break;
                case 3:
                {
                    System.out.println("Ingrese el Id del periodo :");
                    long id = teclado.nextLong();
                    Periodo buscado = periodos.Buscar(id);
                    if(buscado != null){
                        System.out.println(buscado.toString());
                    } else{
                        System.out.println("El periodo no existe");
                    }

                }
                break;

            }
            System.out.println("Desea volver al menu anterior? [S/N]");
            respuesta = teclado.next();
        }while (respuesta.equalsIgnoreCase("s"));
    }

    private static void MenuClases(ListaClases clases) {
        String respuesta;
        int opcion;
        do {
            System.out.println("~~~~~~~~   CLASES   ~~~~~~~~~~");
            System.out.println("~~~~~~MENU DE OPCIONES~~~~~~~");
            System.out.println("1. Agregar Clases");
            System.out.println("2. Ver Lista de Clases");
            System.out.println("3. Buscar Clase");
            System.out.println("4. Regresar");
            System.out.println("~~~~ Selecione una opcion ~~~~~~~");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        SubMenuClases(clases);
                        System.out.println("Desea seguir agregando clases? [s/n]");
                        respuesta = teclado.next();
                    } while (respuesta.equalsIgnoreCase("s"));
                    System.out.println("Hasta Pronto");
                    break;
                case 2:
                    clases.ImprimirLista();
                    break;
                case 3:
                {
                    System.out.println("Ingrese el Id de la clase :");
                    long id = teclado.nextLong();
                    Clase buscado = clases.Buscar(id);
                    if(buscado != null){
                        System.out.println(buscado.toStringLineal());
                    } else{
                        System.out.println("La clase no existe");
                    }

                }
                break;

            }
            System.out.println("Desea volver al menu anterior? [S/N]");
            respuesta = teclado.next();
        }while (respuesta.equalsIgnoreCase("s"));
    }

    private static void SubMenuClases(ListaClases clases) {
        int opcion = 0;
        do{
            System.out.println("-AGREGAR CLASES-");
            System.out.println("1. General");
            System.out.println("2. Ingenieria");
            System.out.println("3. Idioma");
            System.out.println("4. Avanzada");
            System.out.println("5. Regresar");
            System.out.println("~~~~ Selecione una opcion ~~~~~~~");
            opcion = teclado.nextInt();
            if(opcion >=1 && opcion <= 4)
            {
                System.out.println("Pertenece a todas las carreras (S/N): ");
                boolean pertenece = teclado.next().equalsIgnoreCase("s");
                System.out.println("Ingrese el Id");
                int id = teclado.nextInt();
                System.out.println("Ingrese el nombre: ");
                String nombre = teclado.next();
                System.out.println("Ingrese las unidades valorativas: ");
                int uv = teclado.nextInt();
                switch (opcion){
                    case 1:
                        General clase = new General();
                        clase.setTodasCarreras(pertenece);
                        clase.setId(id);
                        clase.setNombre(nombre);
                        clase.setUnidadesValorativas(uv);
                        clases.addClase(clase);
                        break;
                    case 2:
                        Ingenieria claseIng = new Ingenieria();
                        claseIng.setTodasCarreras(pertenece);
                        claseIng.setId(id);
                        claseIng.setNombre(nombre);
                        claseIng.setUnidadesValorativas(uv);
                        clases.addClase(claseIng);
                        break;
                    case 3:
                        Idioma claseIdioma = new Idioma();
                        claseIdioma.setTodasCarreras(pertenece);
                        claseIdioma.setId(id);
                        claseIdioma.setNombre(nombre);
                        claseIdioma.setUnidadesValorativas(uv);
                        clases.addClase(claseIdioma);
                        break;
                    case 4:
                        System.out.println("Ingrese tiene vinculacion (#):");
                        int tieneVinculacion = teclado.nextInt();
                        Avanzada claseAvanzada = new Avanzada();
                        claseAvanzada.setTieneVinculacion(tieneVinculacion);
                        claseAvanzada.setId(id);
                        claseAvanzada.setNombre(nombre);
                        claseAvanzada.setUnidadesValorativas(uv);
                        clases.addClase(claseAvanzada);
                        break;
                }
            }

        }while (opcion != 5);
    }

    private static void MenuCarreras(ListaCarreras carreras) {
        String respuesta;
        int opcion;
        do {
            System.out.println("~~~~~~~~   CARRERAS   ~~~~~~~~~~");
            System.out.println("~~~~~~MENU DE OPCIONES~~~~~~~");
            System.out.println("1. Agregar Carreras");
            System.out.println("2. Ver Lista de Carreras");
            System.out.println("3. Buscar Carrera");
            System.out.println("4. Regresar");
            System.out.println("~~~~ Selecione una opcion ~~~~~~~");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        Carrera carrera  = new Carrera();
                        System.out.println("1. Agregar Carrera ");
                        System.out.println("Ingrese el ID ");
                        carrera.setId(teclado.nextInt());
                        System.out.println("Ingrese el nombre ");
                        carrera.setNombre(teclado.next());
                        carreras.addCarrera(carrera);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Desea seguir agregando carreras? [s/n]");
                        respuesta = teclado.next();
                    } while (respuesta.equalsIgnoreCase("s"));
                    System.out.println("Hasta Pronto");
                    break;
                case 2:
                    carreras.ImprimirLista();
                    break;
                case 3:
                {
                    System.out.println("Ingrese el Id de la Carrera :");
                    long id = teclado.nextLong();
                    Carrera buscado = carreras.Buscar(id);
                    if(buscado != null){
                        System.out.println(buscado.toString());
                    } else{
                        System.out.println("La carrera no existe");
                    }

                }
                break;

            }
            System.out.println("Desea volver al menu anterior? [S/N]");
            respuesta = teclado.next();
        }while (respuesta.equalsIgnoreCase("s"));
    }

    private static void MenuCatedraticos(ListaCatedraticos catedraticos) {
        String respuesta;
        int opcion;
        do {
            System.out.println("~~~~~~~~   CATEDRATICOS   ~~~~~~~~~~");
            System.out.println("~~~~~~MENU DE OPCIONES~~~~~~~");
            System.out.println("1. Agregar Catedratico");
            System.out.println("2. Ver Lista de Catedraticos");
            System.out.println("3. Buscar Catedratico");
            System.out.println("4. Regresar");
            System.out.println("~~~~ Selecione una opcion ~~~~~~~");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        Catedratico catedratico  = new Catedratico();
                        System.out.println("1. Agregar Catedratico ");
                        System.out.println("Ingrese el codigo ");
                        catedratico.setCodigo(teclado.nextInt());
                        System.out.println("Ingrese el ID ");
                        catedratico.setId(teclado.nextInt());
                        System.out.println("Ingrese el nombre ");
                        catedratico.setNombre(teclado.next());
                        catedraticos.addCatedratico(catedratico);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Desea seguir agregando catedraticos? [s/n]");
                        respuesta = teclado.next();
                    } while (respuesta.equalsIgnoreCase("s"));
                    System.out.println("Hasta Pronto");
                    break;
                case 2:
                    catedraticos.ImprimirLista();
                    break;
                case 3:
                {
                    System.out.println("Ingrese el Id del catedratico :");
                    long id = teclado.nextLong();
                    Catedratico buscado = catedraticos.Buscar(id);
                    if(buscado != null){
                        System.out.println(buscado.toString());
                    } else{
                        System.out.println("El Catedratico no existe");
                    }

                }
                break;

            }
            System.out.println("Desea volver al menu anterior? [S/N]");
            respuesta = teclado.next();
        }while (respuesta.equalsIgnoreCase("s"));
    }

    private static void MenuCampus(ListaCampus campuses) {
        String respuesta;
        int opcion;
        do {
            System.out.println("~~~~~~~~   CAMPUS   ~~~~~~~~~~");
            System.out.println("~~~~~~MENU DE OPCIONES~~~~~~~");
            System.out.println("1. Agregar Campus");
            System.out.println("2. Ver Lista de Campuses");
            System.out.println("3. Buscar Campus");
            System.out.println("4. Regresar");
            System.out.println("~~~~ Selecione una opcion ~~~~~~~");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    do{
                        Campus campus  = new Campus();
                        System.out.println("1. Agregar Campus ");
                        System.out.println("Ingrese el codigo ");
                        campus.setId(teclado.nextInt());
                        System.out.println("Ingrese el nombre ");
                        campus.setNombre(teclado.next());
                        System.out.println("Ingrese direccion ");
                        campus.setDireccion(teclado.next());
                        String fchIni = "";
                        System.out.println("Ingrese la fecha de inicio (dd/MM/aaaa) ");
                        fchIni = teclado.next();
                        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate fecha = LocalDate.parse(fchIni,formato);
                        campus.setFechaInicio(Date.from(fecha.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()));
                        campuses.addCampus(campus);
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println("Desea seguir agregando campus? [s/n]");
                        respuesta = teclado.next();
                    } while (respuesta.equalsIgnoreCase("s"));
                    System.out.println("Hasta Pronto");
                    break;
                case 2:
                    campuses.ImprimirLista();
                    break;
                case 3:
                {
                    System.out.println("Ingrese el Id del Campus :");
                    long id = teclado.nextLong();
                    Campus buscado = campuses.BuscarCampus(id);
                    if(buscado != null){
                        System.out.println(buscado.toString());
                    } else{
                        System.out.println("El Campus no existe");
                    }

                }
                break;

            }
            System.out.println("Desea volver al menu anterior? [S/N]");
            respuesta = teclado.next();
        }while (respuesta.equalsIgnoreCase("s"));
    }

    private static void MenuAlumnos(ListaAlumnos alumnitos) {
        String respuesta;
        int opcion;
        do {
            System.out.println("~~~~~~~~   ALUMNOS   ~~~~~~~~~~");
            System.out.println("~~~~~~MENU DE OPCIONES~~~~~~~");
            System.out.println("1. Agregar Alumno");
            System.out.println("2. Ver Lista de Alumnos");
            System.out.println("3. Buscar Alumno");
            System.out.println("4. Regresar");
            System.out.println("~~~~ Selecione una opcion ~~~~~~~");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:


                       do{

                            Alumno Alumnito  = new Alumno();
                            System.out.println("1. Agregar Alumno ");
                            System.out.println("Ingrese el nombre ");
                            Alumnito.setNombre(teclado.next());
                            System.out.println("Ingrese el numero de cuenta");
                            Alumnito.setCuenta(teclado.nextLong());
                            System.out.println("Ingrese el ID");
                            Alumnito.setId (teclado.nextInt());
                            alumnitos.addAlumno(Alumnito);
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            // listaAlumnos.addAlumno(Alumno);

                            System.out.println("Desea seguir agregando alumnos? [s/n]");
                            respuesta = teclado.next();

                        } while (respuesta.equalsIgnoreCase("s"));
                            System.out.println("Hasta Pronto");







                    break;
                case 2:

                   alumnitos.ImprimirLista();

                    /**for (Alumno item: Listaalumnos ){
                        System.out.println(item.toString());

                    }**/

                  /**  System.out.println("Ver lista de Alumnos");
                    System.out.println(listaAlumnos.ImprimirLista());
                    System.out.println(Alumno.toString());
                   **/
                    break;

                case 3:
                {
                    System.out.println("Ingrese el Id del Alumno :");
                    long id = teclado.nextLong();
                    Alumno buscado = alumnitos.BuscarAlumno(id);
                    if(buscado != null){
                        System.out.println(buscado.toString());
                    } else{
                        System.out.println("El Alumno no existe");
                    }

                }
                break;

            }
            System.out.println("Desea volver al menu anterior? [S/N]");
             respuesta = teclado.next();
        }while (respuesta.equalsIgnoreCase("s"));
    }

}
