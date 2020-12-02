package util;

import java.util.Iterator;

/**
 *
 * @author Grupo_10
 */
public class CircularLinkedList <E> implements List<E>, Iterable<E>{
    
    private CircularNodeList<E> last;
    private int effectiveSize = 0;
    
    @Override
    public Iterator<E> iterator(){
        Iterator<E> it = new Iterator<E>(){
            private CircularNodeList<E> node = last;
            
            @Override
            public boolean hasNext() {
                return node!=null;
            }

            @Override
            public E next() {
                E tmp = node.getContent();
                node = node.getNext();
                return tmp;
            }
        };
        
        return it;
    }
    
    public CircularLinkedList(){
        last=null;
    }
    

    @Override
    public boolean addLast(E e) {
        CircularNodeList<E> nodo = new CircularNodeList<>(e);
        if(e == null){
            return false;
        }
        else if(isEmpty()){
            this.last=nodo;
        }
        else{
            nodo.setNext(this.last.getNext());
            this.last.setNext(nodo);
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
        
        CircularNodeList<E> node = last;
        
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
        CircularNodeList<E> node = this.last;
        while(node.getNext() != this.last){
            sb.append(node.getContent());
            sb.append(", ");
            node=node.getNext();
        }
        sb.append(this.last.getContent());
        sb.append("]");
        return sb.toString();
    }
    
}
