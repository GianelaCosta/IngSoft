
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Llote
 */
public class Ingerido {
    
    private Alimento alimento;
    private Date fechaHora;
    
    //Get,Set
    public void setAlimento (Alimento iAlimento){
        this.alimento=iAlimento;
    }
    public Alimento getAlimento(){
        return this.alimento;
    }
    
    public void setFechaHora(Date iFechaHora){
        this.fechaHora=iFechaHora;
    }
    
    public Date getFechaHora(){
        return this.fechaHora;
    }
    
    //Constructor
    public Ingerido(Alimento iAlimento, Date iFechaHora){
        this.setAlimento(iAlimento);
        this.setFechaHora(iFechaHora);
    }
}
