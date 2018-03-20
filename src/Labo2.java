/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafaj
 */
public class Labo2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //CREATING A PERSON OBJECT WITH DEFAULT CONSTRUCTOR(NO ARGUMENTS)
        Person p1 = new Person();
        
        //CREATING A PERSON OBJECT WITH OUR CONSTRUCTOR(WITH ARGUMENTS)
        Person p2 = new Person("Christina", "Linares", 24);
        
        //PRINTING VALUES OF THE 2 OBJECTS VIA GETTERS
        System.out.println(p1.getFirstName() + " " + p1.getLastName() + " " + p1.getAge());
        System.out.println(p2.getFirstName() + " " + p2.getLastName() + " " + p2.getAge());
        
        //CHANGING THE VALUES OF THE 2 OBJECTS VIA SETTERS
        p1.setFirstName("Paulo");
        p1.setLastName("Gonzalez");
        p1.setAge(15);
        
        p2.setFirstName("Jhon");
        p2.setLastName("Wicked");
        p2.setAge(666);

        //PRINTING THE NEW VALUES OF THE 2 OBJECTS VIA GETTERS
        System.out.println("-------------------------------------------------------------");
        System.out.println(p1.getFirstName() + " " + p1.getLastName() + " " + p1.getAge());
        System.out.println(p2.getFirstName() + " " + p2.getLastName() + " " + p2.getAge());
    }
    
}
