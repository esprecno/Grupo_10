package util;

import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Grupo_10
 */
public class CircularDoubleLinkedList <E> implements List<E>{
    
    private CircularDoubleNodeList<E> last;
    private int effectiveSize = 0;
    
    
    public ListIterator<E> listIterator(int index){
        ListIterator<E> it = new ListIterator<E>(){
            private CircularDoubleNodeList<E> node = getNode(index);
            private int currentIndex=index;
            
            @Override
            public boolean hasNext() {
                return node!=null;
            }

            @Override
            public E next() {
                E tmp = node.getContent();
                node = node.getNext();
                nextIndex();
                return tmp;
            }

            @Override
            public boolean hasPrevious() {
                return node!=null;
            }

            @Override
            public E previous() {
                E tmp = node.getContent();
                node = node.getPrev();
                previousIndex();
                return tmp;
            }

            @Override
            public int nextIndex() {
                if(currentIndex<effectiveSize-1){
                    currentIndex++;
                }
                else{
                    currentIndex=0;
                }
                return currentIndex;
            }

            @Override
            public int previousIndex() {
                if(currentIndex>0){
                    currentIndex--;
                }
                else{
                    currentIndex=effectiveSize-1;
                }
                return currentIndex;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void set(E e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void add(E e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
    public CircularDoubleNodeList<E> getNode(int index){
        if(isEmpty() || index<0 || index> effectiveSize){
            return null;
        }
        
        CircularDoubleNodeList<E> node = last.getNext();
        
        for (int i=0; i<index; i++){
            node = node.getNext();
        }
        
        return node;
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
