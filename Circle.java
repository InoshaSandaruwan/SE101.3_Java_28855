
package com.mycompany.lab_08_2;

class Circle implements Shape
{
    private double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public void setRadius(int radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double calculateArea()
    {
        return Math.PI*radius*radius;
    }
    public double calculatePerimeter()
    {
        return 2*Math.PI*radius;
    }
}
