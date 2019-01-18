

package lecturaArchivos2;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException; 
import java.util.FormatterClosedException;
import java.lang.SecurityException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class CrearArchivoTexto {                    

    private Formatter salida;       

    public void AbrirArchivo() {  // Metodo creado para abrir el archivo  
        try {                       
            salida = new Formatter("data/ListaNombres.csv");    
        } 
        catch (SecurityException securityException) {           
            System.err.println("No puede escribir en este archivo - Sin acceso. "); 
            System.exit(1);
        } 
        catch (FileNotFoundException filesNotFoundException) {  
            System.err.println("Error al crear el archivo.");
            System.exit(1);
        } 
    }

    public void AgregarRegistros(ArrayList<Profesor> Lista) {  // Metodo creado para ir agregando la informacion en el archivo 
        try {               
            for (int i = 0; i < Lista.size(); i++) {     
                Profesor p = Lista.get(i); 
                salida.format("%s|%s|%s|%s|%s|%s|%s|%s\n", p.getCedula(), p.getNombres(), p.getZona(), p.getProvincia(), p.getCanton(), p.getPersonalidad(),p.getRazonamiento(), p.getDictamenIdoniedad());
            }       
        } catch (FormatterClosedException formatterClosedException) {       
            System.err.println("Error al escribir en el archivo.");
            return;
        } 
        catch (NoSuchElementException elementException) {
            System.err.println("Entrada no valida.");
        } 

    } 
    public void cerrarArchivo() {  //Metodo que cierra el archivo       
        if (salida != null) {
            salida.close();         
        }
    }
} 