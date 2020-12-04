/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private boolean vivo;
    private int id;
    private ImageView imagen;
    
    
    
    public Persona(int id){
        this.imagen.setImage(new Image("resources\\soldado_normal.png"));
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
        return "Persona "+vivo;
    }

    int getId() {
        return id;
    }
    
    ImageView getImagen(){
        return imagen;
    }
    
    public void setImagen(ImageView imagen){
        this.imagen=imagen;
    }
}
