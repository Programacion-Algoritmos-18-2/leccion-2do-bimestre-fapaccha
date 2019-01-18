/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OperacionData {                                

    ArrayList<Profesor> informacion = new ArrayList<>();        
    Scanner e=new Scanner(System.in);

    public void agregarInformacion(ArrayList<Profesor> info) {      
        informacion =info;
    }

    public ArrayList<Profesor> obtenerInformacion() {       // Metodo para obtener informacion 
        return informacion;
    }
    
    public void ordenarPorCanton(){                         // Metodo encargado de ordenar por canton 
        ArrayList<Profesor> dataPorCantones = new ArrayList<>(); 
        dataPorCantones.addAll(informacion);                    
        Collections.sort(dataPorCantones, 
                        (o1, o2) -> o1.canton.compareTo(o2.canton));        
        for (int i = 0; i < dataPorCantones.size(); i++) {
            System.out.printf("%s",dataPorCantones.get(i));             
        }
    }
    
    public ArrayList<Profesor> ordenarPorNombres(){                 // Metodo que permite Ordenar la lista por Nombre
        ArrayList<Profesor> dataPorNombres = new ArrayList<>();     
        dataPorNombres.addAll(informacion);                         
        Collections.sort(dataPorNombres, 
                        (o1, o2) -> o1.nombres.compareTo(o2.nombres));  
        return dataPorNombres;
        
    }
    public void CantidadDictamenIdoniedad(){        // Metodo para Calcular la cantidad de personas de acuerdo al Dictamen
        int cont=0;             
        String a;           
        System.out.printf("Ingrese (i) si desea ordenar los participantes por IDONEO  o ingrese  (n) si es por NO IDONEO");
        char opt=e.next().charAt(0);
        if (opt=='I' || opt=='i') {         
            a="IDONEO";
        }else{                          
            a="NO IDONEO";
        }
        for (int i = 0; i < this.informacion.size(); i++) {
            if(this.informacion.get(i).getDictamenIdoniedad().equals(a)){      
                cont+=1;
            }
        }
        System.out.printf("La cantidad de participantes  %s es %d\n",a,cont);    
    }
    
    public void CantidadPersonalidad(){                 // Metodo encargado de contar el numero de personas ademas de crear un menu
        
        String a;                       
        int cont=0;                         
        System.out.printf("Ingrese (a) si desea ordenar los participantes por ADECUADOR o (c) si es por CONVOCAR ");  
        char opt=e.next().charAt(0);
        if (opt=='A' || opt=='a') {         
            a="ADECUADO";
        }else{                              
            a="POR CONVOCAR";
        }
        for (int i = 0; i < this.informacion.size(); i++) {
            if(this.informacion.get(i).getPersonalidad().equals(a)){    
                cont+=1;
            }
        }
        System.out.printf("La cantidad de participantes  %s es %d\n",a,cont);   
    }
    
    public void lecturaData() {                    // Metodo para recorrer la lista y presentar el elemento            
        for (int i = 0; i<obtenerInformacion().size(); i++) {
            System.out.println(obtenerInformacion().get(i));    
        }
        
    }

}
