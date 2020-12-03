package util;

import java.util.Iterator;

/**
 *
 * @author Grupo_10
 */
public class CircularDoubleLinkedList <E> implements List<E>, Iterable<E>{
    
    private CircularDoubleNodeList<E> last;
    private int effectiveSize = 0;
    
    @Override
    public Iterator<E> iterator(){
        Iterator<E> it = new Iterator<E>(){
            private CircularDoubleNodeList<E> node = last;
            
            @Override
            public boolean hasNext() {
                return node!=null;
            }
            
            public boolean hasPrev(){
                return node!=null;
            }

            @Override
            public E next() {
                E tmp = node.getContent();
                node = node.getNext();
                return tmp;
            }
            
            public E prev(){
                E tmp = node.getContent();
                node = node.getPrev();
                return tmp;
            }
        };
        
        return it;
    }
    
    public CircularDoubleLinkedList(){
        last=null;
    }
    

    @Override
    public boolean addLast(E e) {
        CircularDoubleNodeList<E> nodo = new CircularDoubleNodeList<>(e);
        if(e == null){
            return false;
        }
        else if(isEmpty()){
            this.last=nodo;
        }
        else{
            nodo.setNext(this.last.getNext());
            this.last.getNext().setPrev(nodo);
            this.last.setNext(nodo);
            nodo.setPrev(this.last); 
        }
        this.last= nodo;
        effectiveSize++;
        return true;
    }

    @Override
    public E get(int index) {
        if(isEmpty() || index<0 || index> effectiveSize){
            return null;
        }
        
        CircularDoubleNodeList<E> node = last;
        
        for (int i=0; i<index; i++){
            node = node.getNext();
        }
        
        return node.getContent();
    }

    @Override
    public int size() {
        return effectiveSize;
    }

    @Override
    public boolean isEmpty() {
        return last==null;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(isEmpty()) 
            return "[]";
        sb.append("[");
        CircularDoubleNodeList<E> node = this.last;
        while(node.getNext() != this.last){
            node=node.getNext();
            sb.append(node.getContent());
            sb.append(", "); 
        }
        sb.append(this.last.getContent());
        sb.append("]");
        return sb.toString();
    }
    
}
