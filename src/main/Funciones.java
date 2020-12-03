/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import util.CircularDoubleLinkedList;

/**
 *
 * @author USUARIO
 */
public class Funciones {
    
    public static void simular(int nPersonas, int inicio, boolean der){
        CircularDoubleLinkedList<Persona> list = new CircularDoubleLinkedList<>();
        for(int i=1; i<=nPersonas; i++){
            Persona p = new Persona(i);
            list.addLast(p);
        }
    }
}
