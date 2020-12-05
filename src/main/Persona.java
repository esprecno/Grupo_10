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
    private ImageView imagen=new ImageView();
    
    
    
    public Persona(int id,double x, double y){
        this.imagen.setImage(new Image("sold.png"));
        this.id=id;
        this.vivo=true;
        this.imagen.setX(x);
        this.imagen.setY(y);
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
    
    public ImageView getImagen(){
        return imagen;
    }
    
    public void setImagen(Image imagen){
        this.imagen.setImage(imagen);
    }

}
