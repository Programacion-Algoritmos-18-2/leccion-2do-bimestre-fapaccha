package lecturaArchivos2;
import java.io.File;                                
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import com.google.gson.Gson;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class leerRegistros {   // Clase encargada de leer y escribir datos en el archivo   

    private Scanner entrada;     
    private Formatter salida;   

    // permite al usuario abrir el archivo
    public void abrirArchivo(String ruta) {                 // Metodo para abrir el archivo y mostrar errores 
        try {               
            entrada = new Scanner(new File(ruta));  
        } 
        catch (FileNotFoundException fileNotFoundException) {   
            System.err.println("Error al abrir el archivo.");
            System.exit(1);
        } 
    }
    
    public ArrayList<Profesor> leerRegistrosT() { // Metodo que Lee registro del archivo txt

        OperacionData operacion = new OperacionData();      // creacion de objeto de tipo operacion 
        ArrayList<Profesor> lista = new ArrayList<>();      // Creacion de una lista vacia tipo Profesor

        try // lee registros del archivo, usando el objeto Scanner
        {
            entrada.nextLine();
            while (entrada.hasNext()) {
                Gson g = new Gson();    
                String linea = entrada.nextLine();
                Profesor p = g.fromJson(linea, Profesor.class); // Se transforma de archivo json
                lista.add(p);

            } 

        } // fin de try
        catch (NoSuchElementException elementException) {           // Errores 
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;                       // Retornamos la lista tipo Profesor que creamos 
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    public ArrayList<Profesor> llerRegistrosC() {            // Metodo que nos creaea un arraylist tipo profesor al cual usaremos para ir guardando los datos

        ArrayList<Profesor> lista = new ArrayList<>();          

        try 
        {
            String linea = entrada.nextLine();
            while (entrada.hasNext()) {
                
                linea = entrada.nextLine();
                ArrayList<String> Lista_separada = new ArrayList<String>(Arrays.asList(linea.split(",")));    
                Profesor p = new Profesor();        
                p.setCedula(Lista_separada.get(0));   
                p.setNombres(Lista_separada.get(1));
                p.setZona(Lista_separada.get(2));
                p.setProvincia(Lista_separada.get(3));
                p.setCanton(Lista_separada.get(4));
                p.setPersonalidad(Lista_separada.get(5));
                p.setRazonamiento(Lista_separada.get(6));
                p.setDictamenIdoniedad(Lista_separada.get(7));
                lista.add(p);

            } // fin de while
        } // fin de try     
        catch (NoSuchElementException elementException) {               // Posibles errores que pueden presentarse
            System.err.println("El archivo no esta bien formado.");
            entrada.close();
            System.exit(1);
        } // fin de catch
        catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo.");
            System.exit(1);
        } // fin de catch
        return lista;                               
    } 
    

    public void cerrarArchivo() {                   // Metodo que permite cerrar el archivo
        if (entrada != null) {
            entrada.close(); // cierra el archivo
        }
    } // fin del m�todo cerrarArchivo
} // fin del m�todo agregarRegistros

// cierra el file
/**
 * ************************************************************************
 * (C) Copyright 1992-2007 por Deitel & Associates, Inc. y * Pearson Education,
 * Inc. Todos los derechos reservados. * * RENUNCIA: Los autores y el editor de
 * este libro han realizado su mejor * esfuerzo para preparar este libro. Esto
 * incluye el desarrollo, la * investigaci�n y prueba de las teor�as y programas
 * para determinar su * efectividad. Los autores y el editor no hacen ninguna
 * garant�a de * ning�n tipo, expresa o impl�cita, en relaci�n con estos
 * programas o * con la documentaci�n contenida en estos libros. Los autores y
 * el * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de * estos
 * programas. *
 * ***********************************************************************
 */
