
import java.awt.Image;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Llote
 */
public class Usuario extends Persona{
    private String nacionalidad;
    private ArrayList<String> preferencias;
    private ArrayList<String> restricciones;
    private ArrayList<Alimento> ingeridos;
    
    //Gets, Sets
    
    public void setNacionalidad(String iNacionalidad){
        this.nacionalidad = iNacionalidad;
    } 
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    
    public void setPreferencias(ArrayList<String> iPreferencia){
        this.preferencias = iPreferencia;
    } 
    public ArrayList<String> getPreferencias(){
        return this.preferencias;
    }
    
    public void setRestriciones(ArrayList<String> iRestriccion){
        this.restricciones = iRestriccion;
    } 
    public ArrayList<String> getRestricciones(){
        return this.restricciones;
    }
    
    public void setIngeridos(ArrayList<Alimento> iIngeridos){
        this.ingeridos=iIngeridos;
    } 
    public ArrayList<Alimento> getIngeridos(){
        return this.ingeridos;
    }
    
    //Constructor
    public Usuario(String iNombre, String iApellido,Date iFechaNac,Image iFoto,String iNacionalidad,ArrayList<String> iPreferencias,ArrayList<String> iRestricciones,ArrayList<Alimento> iIngeridos){
        super(iNombre,iApellido,iFechaNac,iFoto);
        this.setNacionalidad(iNacionalidad);
        this.setPreferencias(iPreferencias);
        this.setRestriciones(iRestricciones);
        this.setIngeridos(iIngeridos);
    }
    
    
}
