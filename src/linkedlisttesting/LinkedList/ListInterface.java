/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlisttesting.LinkedList;

/**
 *
 * @author Oscar Bäck
 */
public interface ListInterface {
    
    public void add(int index, java.lang.Object item);
    public java.lang.Object get(int index);
    public boolean isEmpty();
    public void remove(int index);
    public void removeAll();
    public int size();
    
}
