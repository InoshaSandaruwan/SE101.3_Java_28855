
package com.mycompany.lab_08_2;

class Rectangle implements Shape 
{
    private double height;
    private double width;
    public Rectangle(double height,double width)
    {
        this.height=height;
        this.width=width;
    }
    public void setHeight(int height)
    {
        this.height=height;
    }
    public void setWidth(int width)
    {
        this.width=width;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWidth()
    {
        return width;
    }
    public double calculateArea()
    {
        return height*width;
    }
    public double calculatePerimeter()
    {
        return 2*(height+width);
    }
    
}
