/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlisttesting;

/**
 *
 * @author Oscar Bäck
 */
public class Person {
    private short id;
    private String name, job;
    
    public Person(short _id, String _name,String _job){
        id = _id;
        name = _name;
        job = _job;
    }

    public short getAge() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setAge(short id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
    public void display(){
        System.out.println("Age: " + id +
                           "\nName: " + name +
                           "\nJob: " + job);
    }
    
}
