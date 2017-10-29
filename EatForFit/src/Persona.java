
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
public class Persona {
    private String nombre;
    private  String apellido;
    private Date fechaNacimiento;
    private Image foto;
    
   //Gets, Sets
    public void setNombre(String iNombre){
        this.nombre = iNombre;
    } 
    public String getNombre(){
        return this.nombre;
    }
    
    public void setApellido(String iApellido){
        this.nombre = iApellido;
    } 
    public String getApellido(){
        return this.apellido;
    }
    
    public void setFechaNacimiento(Date iFechaNacimiento){
        this.fechaNacimiento = iFechaNacimiento;
    } 
    public Date getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    public void setFoto(Image iFoto){
        this.foto = iFoto;
    } 
    public Image getFoto(){
        return this.foto;
    }
    
    //Constructor
    public Persona (String iNombre, String iApellido,Date iFechaNac,Image iFoto){
        this.setNombre(iNombre);
        this.setApellido(iApellido);
        this.setFechaNacimiento(fechaNacimiento);
        this.setFoto(iFoto);
    }
    
    
}
