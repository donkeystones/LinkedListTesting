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
public class ListReferencedBased
extends java.lang.Object
implements ListInterface {

    private Node head;
    private int items;
    
    public ListReferencedBased(){
        head = null;
        items = 0;
    }
    
    public void add(Object item){
        if(head == null){
            head = new Node(item,null);
            items++;
        }
        else{
            Node node = find(items);
            node.setNext(new Node(item,null));
            items++;
        }
    }
    
    @Override
    public void add(int index, Object item) {
        Node node = find(index);
        node.setData(item);
    }
    /**
     * Finds the node in specific position (pos) and returns it
     * @param index the specified index in the list
     * @return Object   The object in the specified index
     */
    @Override
    public Object get(int index) {
        if(index+1 > items){
            throw new ListIndexOutOfBoundsException("Cannot get item from position " + index + " since the current size is " + items);
        }
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.getNext();
        }
        return node.getData();
    }
    
    private Node find(int pos){
        if(pos > items){
            throw new ListIndexOutOfBoundsException("Cannot get item from position " + pos + " since the current size is " + items);
        }
        Node n = head;
        for(int i = 0; i < pos; i++){
            if(n.getNext() == null){
                return n;
            }if(i == pos){
                return n;
            }
            else n = n.getNext();
        }
        return n;
    }
    
    /**
     * Checks if the list is empty.
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void remove(int index) {
        if(index > items){
            throw new ListIndexOutOfBoundsException("Cannot remove item " + index + " since the list is of size " + items);
        }else{
            Node n = find(index);
            n.setData(n.getNext().getData());
            items--;
        }
    }

    @Override
    public void removeAll() {
        head = null;
        items = 0;
    }

    @Override
    public int size() {
        return items;
    }
    
}
