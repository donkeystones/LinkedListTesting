/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlisttesting;

import java.util.Scanner;
import linkedlisttesting.LinkedList.ListReferencedBased;

/**
 *
 * @author Oscar Bäck
 */
public class LinkedListTesting {

    public static ListReferencedBased list;
    public static Scanner scan;
    public static Person person;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Initializing test!");
        System.out.println("Creating Linked List Instance.");
        list = new ListReferencedBased();
        
        System.out.println("IsEmpty? = " + list.isEmpty());
        System.out.println("----------------------------------------------");
        
        System.out.println("\nAdding persons!");
        list.add(new Person((short)100,"Knugen","major"));
        System.out.println("added: 100, knugen, major");
        
        list.add(new Person((short)101,"Peppe","Entertainer"));
        System.out.println("added: 101, peppe, entertainer");
        
        list.add(new Person((short)102,"Miles","Farenheit"));
        System.out.println("added: 102, miles, farenheit");
        
        System.out.println("\nIsEmpty? = " + list.isEmpty());
        
        System.out.println("\nTesting get method:");
        System.out.println("-----------------------------------------");
        System.out.println("Pos 0,");
        person = (Person)list.get(0);
        person.display();
        System.out.println("----------------------------------------------");
        
        System.out.println("Pos 1,");
        person = (Person)list.get(1);
        person.display();
        System.out.println("----------------------------------------------");
        
        System.out.println("Pos 2,");
        person = (Person)list.get(2);
        person.display();
        System.out.println("----------------------------------------------\n\n");
        
        System.out.println("Changing the object in pos 1!\nnew Person(111,\"Hej\",\"HEJ\")\n\n");
        list.add(1, new Person((short)111,"Hej","HEJ"));
        
        System.out.println("print change!");
        
        System.out.println("pos 0");
        person = (Person)list.get(0);
        person.display();
        System.out.println("----------------------------------------------");
        
        System.out.println("pos 1");
        person = (Person)list.get(1);
        person.display();
        System.out.println("----------------------------------------------");
        
        System.out.println("pos 2");
        person = (Person)list.get(2);
        person.display();
        System.out.println("----------------------------------------------");
        
        System.out.println("\n\nTesting remove!");
        
        System.out.println("Removing object in pos 1");
        list.remove(1);
        
        System.out.println("\nPrint Change!");
        
        System.out.println("Pos 0");
        person = (Person)list.get(0);
        person.display();
        
        System.out.println("----------------------------------------------");
        
        System.out.println("Pos 1");
        person = (Person)list.get(1);
        person.display();
        
        System.out.println("\n\nRemoveAll function testing!");
        list.removeAll();
        System.out.println("List Cleared!");
        
        System.out.println("\nAccessing at pos 0");
        //Should throw a ListIndexOutOfBoundsException
        list.get(0);
    }
    
}
