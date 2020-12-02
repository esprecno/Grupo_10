package util;

/**
 *
 * @author Grupo_10
 */
public interface List <E>{
   
    public boolean addLast(E e);
    
    public E get(int index);
    
    public int size();
    
    public boolean isEmpty();
    
    @Override
    public String toString();
}
