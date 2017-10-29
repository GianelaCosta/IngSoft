/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Llote
 */
public class Alimento {
    
    private String tipo;
    private String nombre;
    private String[][] nutrientes; //matriz que contiene cada nutriente con su cantidad [nutriente][cantidad]
    
    //Get,Set
    public void setTipo(String iTipo){
        this.tipo = iTipo;
    } 
    public String getTipo(){
        return this.tipo;
    }
    
    public void setNombre(String iNombre){
        this.nombre = iNombre;
    } 
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNutrientes(String[][] iNutrientes){
        this.nutrientes = iNutrientes;
    }
    public String[][] getNutrientes(){
        return this.nutrientes;
    }
    
    //Constructor
    public Alimento( String iTipo,String iNombre, String[][] iNutrientes){
        this.setTipo(iTipo);
        this.setNombre(iNombre);
        this.setNutrientes(iNutrientes);
    }
}
