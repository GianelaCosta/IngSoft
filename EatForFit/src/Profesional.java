
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
public class Profesional extends Persona {
    private String nombreTitulo;
    private Date fTitulo;
    private String paisTitulo;
   
    //Gets, Sets
    
    public void setNombreTitulo(String iNombreTitulo){
        this.nombreTitulo = iNombreTitulo;
    } 
    public String getNombreTitulo(){
        return this.nombreTitulo;
    }
    
    public void setFtitulo(Date iFtitulo){
        this.fTitulo = iFtitulo;
    } 
    public Date getFtitulo(){
        return this.fTitulo;
    }
    
    public void setPaisTitulo(String iPaisTitulo){
        this.paisTitulo = iPaisTitulo;
    } 
    public String getPaisTitulo(){
        return this.paisTitulo;
    }
    
    
    //Constructor
    public Profesional(String iNombre, String iApellido,Date iFechaNac,Image iFoto,String iNombreTitulo,Date iFtitulo,String iPaisTitulo){
        super(iNombre,iApellido,iFechaNac,iFoto);
        this.setNombreTitulo(iNombreTitulo);
        this.setFtitulo(iFtitulo);
        this.setPaisTitulo(iPaisTitulo);
    }
    
}
