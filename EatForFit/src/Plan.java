
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
public class Plan {
    private Profesional pro;
    private Usuario user;
    private ArrayList<Alimento> desayunos;
    private ArrayList<Alimento> almuerzos;
    private ArrayList<Alimento> meriendas;
    private ArrayList<Alimento> cenas;
    
    //get,Set
    public void setPro(Profesional iPro){
        this.pro=iPro;
    }
    public Profesional getPro (){
        return this.pro;
    }
    
    public void setUser(Usuario iUser){
        this.user=iUser;
    }
    public Usuario getUser (){
        return this.user;
    }
    
    public void setDesayunos(ArrayList<Alimento> iDesayunos){
        this.desayunos= iDesayunos;
    }
    
    public ArrayList<Alimento> getDesayunos(){
        return this.desayunos;
    }
    public void setAlmuerzos(ArrayList<Alimento> iAlmuerzos){
        this.almuerzos= iAlmuerzos;
    }
    
    public ArrayList<Alimento> getAlmuerzos(){
        return this.almuerzos;
    }
    
    public void setMeriendas(ArrayList<Alimento> iMeriendas){
        this.meriendas= iMeriendas;
    }
    
    public ArrayList<Alimento> getMeriendas(){
        return this.meriendas;
    }
    
    public void setCenas(ArrayList<Alimento> iCenas){
        this.cenas= iCenas;
    }
    
    public ArrayList<Alimento> getCenas(){
        return this.cenas;
    }
    
    //Constructor
    
    public Plan(Profesional iPro,Usuario iUser,ArrayList<Alimento> iDesayunos,ArrayList<Alimento> iAlmuerzos,ArrayList<Alimento> iMeriendas,ArrayList<Alimento> iCenas){
        this.setPro(iPro);
        this.setUser(iUser);
        this.setDesayunos(iDesayunos);
        this.setAlmuerzos(iAlmuerzos);
        this.setMeriendas(iMeriendas);
        this.setCenas(iCenas);
    }
}
