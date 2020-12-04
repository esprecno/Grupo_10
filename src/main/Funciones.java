/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Iterator;
import java.util.ListIterator;
import util.CircularDoubleLinkedList;

/**
 *
 * @author Grupo_10
 */
public class Funciones {
    
    public static void simular(int nPersonas, int inicio, boolean der){
        CircularDoubleLinkedList<Persona> list = new CircularDoubleLinkedList<>();
        for(int i=1; i<=nPersonas; i++){
            Persona p = new Persona(i);
            list.addLast(p);
        }
        ListIterator<Persona> it = list.listIterator(inicio);
        if(der) simularDer(it, inicio);
        else simularIzq(it, inicio);
        System.out.println(list);
    }
    
    public static void simularDer(ListIterator<Persona> it, int inicio){
        
            Persona pAsesino = it.next();
            Persona pVictima = it.next();
            while(!pVictima.equals(pAsesino)){
                if(pVictima.getVivo()){
                    pVictima.setVivo(false);
                    pAsesino = buscarAsesinoDer(it);
                    pVictima = buscarVictimaDer(it);
                }
                else{
                    pVictima = it.next();
                }
            }
            System.out.println(pAsesino.getId());
            
    }
    
    private static Persona buscarAsesinoDer(ListIterator<Persona> it){
        Persona p = it.next();
        while(!p.getVivo()){
            p=it.next();
        }
        return p;
    }
    private static Persona buscarVictimaDer(ListIterator<Persona> it){
        Persona p = it.next();
        int id = p.getId();
        if(p.getVivo()){
            return p;
        }
        while(!p.getVivo() && p.getId()!=id){
            p=it.next();
        }
        return p;
    }
    
    public static void simularIzq(ListIterator<Persona> it, int inicio){
        Persona pAsesino = it.previous();
        Persona pVictima = it.previous();
        while(!pVictima.equals(pAsesino)){
            if(pVictima.getVivo()){
                pVictima.setVivo(false);
                pAsesino = buscarAsesinoIzq(it);
                pVictima = buscarVictimaIzq(it);
            }
            else{
                pVictima = it.previous();
            }
        }
        System.out.println(pAsesino.getId());
    }
    
    private static Persona buscarAsesinoIzq(ListIterator<Persona> it){
        Persona p = it.previous();
        while(!p.getVivo()){
            p=it.previous();
        }
        return p;
    }
    private static Persona buscarVictimaIzq(ListIterator<Persona> it){
        Persona p = it.previous();
        int id = p.getId();
        if(p.getVivo()){
            return p;
        }
        while(!p.getVivo() && p.getId()!=id){
            p=it.previous();
        }
        return p;
    }
}
