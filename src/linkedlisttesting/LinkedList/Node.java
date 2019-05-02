/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlisttesting.LinkedList;

/**
 *
 * @author Oscar Bäck
 * 
 * 
 */
public class Node {
    protected java.lang.Object data;
    protected Node next;
    
    public Node(){
        next = null;
        data = null;
    }
    
    public Node(java.lang.Object _data, Node _next){
        data = _data;
        next = _next;
    }
    
    public void setNext(Node _next){
        next = _next;
    }
    
    public void setData(java.lang.Object _data){
        data = _data;
    }
    
    public Node getNext(){
        return next;
    }
    
    public java.lang.Object getData(){
        return data;
    }
    
}
