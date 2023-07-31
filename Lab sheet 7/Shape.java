
package com.mycompany.lab_7;

abstract class Shape 
{
    abstract double calculateArea();
    public void display()
    {
        System.out.println("Area "+calculateArea());
    }
}
