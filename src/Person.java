/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafaj
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    
    //DEFAULT CONSTRUCTOR WITH NO ARGUMENTS
    public Person(){
    }
   
    //CUSTOM CONSTRUCTOR WITH ARGUMENTS
    public Person(String fName, String lName, int a){
        this.firstName = fName;
        this.lastName = lName;
        this.age = a;
    }

    //SETTERS AND GETTERS
    
    //GETTERS
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getAge() {
        return age;
    }

    //SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
}
