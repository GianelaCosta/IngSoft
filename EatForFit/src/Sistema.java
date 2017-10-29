
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
public class Sistema {
    
    private ArrayList<Usuario> usuarios;
    private ArrayList<Profesional> profesionales;
    private ArrayList<Alimento> alimentos;
    private ArrayList<Plan> planes;
    
    
    //Get,Set
    public void setUsuarios (ArrayList<Usuario> iUsuarios){
        this.usuarios=iUsuarios;
    }
    public ArrayList<Usuario> getUsuarios(){
        return this.usuarios;
    }
    //en el get se agrega de a un profesional al array para poder agregar en el momento de registrar un profesional
    //idem para usuarios, alimentos o planes
    public void setProfesionales(Profesional iProfesional){
        this.getProfesionales().add(iProfesional);
    }
    public ArrayList<Profesional> getProfesionales(){
        return this.profesionales;
    }
    
    public void setAlimentos(Alimento iAlimento){
        this.getAlimentos().add(iAlimento);
    }
    public ArrayList<Alimento> getAlimentos(){
        return this.alimentos;
    }
    
    public void setPlanes(Plan iPlan){
        this.getPlanes().add(iPlan);
    }
    public ArrayList<Plan> getPlanes(){
        return this.planes;
    }
    
    //Constructor
    public Sistema(){//de aca se inicializa el programa
        
    }
}
