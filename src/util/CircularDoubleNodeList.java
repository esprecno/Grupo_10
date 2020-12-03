package util;

/**
 * 
 * @author Grupo_10 
 */
public class CircularDoubleNodeList<E> {
    
    private E content;
    private CircularDoubleNodeList<E> next;
    private CircularDoubleNodeList<E> prev;

    public CircularDoubleNodeList(E content) {
        this.content = content;
        this.next = this;
        this.prev = this;
    }   

    public E getContent() {
        return content;
    }

    public void setContent(E content) {
        this.content = content;
    }

    public CircularDoubleNodeList<E> getNext() {
        return next;
    }

    public void setNext(CircularDoubleNodeList<E> next) {
        this.next = next;
    }
    
    public CircularDoubleNodeList<E> getPrev() {
        return prev;
    }

    public void setPrev(CircularDoubleNodeList<E> prev) {
        this.prev = prev;
    }
}
