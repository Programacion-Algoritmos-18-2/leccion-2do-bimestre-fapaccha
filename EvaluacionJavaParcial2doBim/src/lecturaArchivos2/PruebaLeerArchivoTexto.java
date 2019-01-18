package lecturaArchivos2;

// Fig. 14.12: PruebaLeerArchivoTexto.java
import java.util.ArrayList;

public class PruebaLeerArchivoTexto {           

    public static void main(String args[]) {  
        
        OperacionData operacion = new OperacionData();          //Objeto tipo OperacionData
        leerRegistros lectura = new leerRegistros();            //Objeto tipo leerRegistros

        lectura.abrirArchivo("data/data1.csv");              
        ArrayList<Profesor> Lista_C = lectura.llerRegistrosC();     
        lectura.abrirArchivo("data/data2.txt");              
        ArrayList<Profesor> lista_txt = lectura.leerRegistrosT();     
        
        ArrayList<Profesor> Lista_part = new ArrayList<>();        
        for (int i = 0; i < Lista_C.size(); i++) {
            Lista_part.add(Lista_C.get(i));                      
        }
        for (int i = 0; i < lista_txt.size(); i++) {
            Lista_part.add(lista_txt.get(i));                      
        }
        operacion.agregarInformacion(Lista_part);                  
        operacion.ordenarPorCanton();                           
        ArrayList<Profesor> listaNombres = operacion.ordenarPorNombres();   
        CrearArchivoTexto archivo= new CrearArchivoTexto();             
        archivo.AbrirArchivo();                     
        archivo.AgregarRegistros(listaNombres);              
        operacion.CantidadPersonalidad();           
        operacion.CantidadDictamenIdoniedad();      
        lectura.cerrarArchivo();                 
        archivo.cerrarArchivo();
        
    } 
} 

