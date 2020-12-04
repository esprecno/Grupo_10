/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 *
 * @author darin
 */
public class Imagen extends Parent{
    
    private final ImageView Imagen;
    
    private static final Image NORMAL= new Image("resources\\soldado_normal.png");//1
    private static final Image MUERTO= new Image("resources\\soldado_muerto.png");//0
    private static final Image DISPARA= new Image("resources\\soldado_dispara.png");//2
    
    
    public Imagen(int id) {
        Imagen= new ImageView();
        actualizarImagen(id);
        getChildren().add(Imagen);
    }
    
    public void actualizarImagen(int i){
        switch(i){
            case 1:
                Imagen.setImage(NORMAL);
                break;
            case 2:
                Imagen.setImage(DISPARA);
                break;
            case 0:
                Imagen.setImage(DISPARA);
                break;
        }
    }
    
    
}
