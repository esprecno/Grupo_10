/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private boolean vivo;
    private int id;
    
    public Persona(int id){
        this.id=id;
        this.vivo=true;
    }
    
    public boolean getVivo(){
        return vivo;
    }
    
    public void setVivo(boolean vivo){
        this.vivo=vivo;
    }
    
    @Override
    public String toString(){
        return "Persona "+id;
    }
}
