
package com.mycompany.lab_05;

public class Lab_05 
{

    public static void main(String[] args) 
    {
        
        Student S1=new Student(28935,"Kamal","CS");
        Lecturer L1=new Lecturer(2520,"Rasika","DSA");
        S1.getId();
        S1.getName();
        S1.getcourse();
        System.out.println("Your Student id: "+S1.getId());
        System.out.println("Your Name: "+S1.getName()); 
        System.out.println("Your Studied Course: "+S1.getcourse());
        L1.getId();
        L1.getName();
        L1.getProgram();
        System.out.println("Your Lecturer id: "+L1.getId());
        System.out.println("Your Name: "+L1.getName());
        System.out.println("Your Delivered Module: "+L1.getProgram());
                
    }
}

