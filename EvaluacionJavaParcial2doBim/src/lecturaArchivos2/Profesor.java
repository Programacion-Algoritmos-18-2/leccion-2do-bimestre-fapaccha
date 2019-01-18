/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos2;


public class Profesor {                     // Creacion de la clase Profesor
    String cedula;                          
    String nombres;
    String zona;
    String provincia;
    String canton;
    String personalidad;
    String razonamiento;
    String dictamenIdoniedad;

    public String getCedula() {   // Metodos para agregar y obtener 
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getRazonamiento() {
        return razonamiento;
    }

    public void setRazonamiento(String razonamiento) {
        this.razonamiento = razonamiento;
    }

    public String getDictamenIdoniedad() {
        return dictamenIdoniedad;
    }

    public void setDictamenIdoniedad(String dictamenIdoniedad) {
        this.dictamenIdoniedad = dictamenIdoniedad;
    }
    
    
    
    @Override
    public String toString(){               // Metodo toString para presentar datos
        return String.format("%s-%s-%s-%s-%s-%s-%s-%s\n", getCedula(),getNombres(),getZona(),getProvincia(),getCanton(),getPersonalidad(),getRazonamiento(),getDictamenIdoniedad());
    }
}







