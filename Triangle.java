
package com.mycompany.lab_08_2;

class Triangle implements Shape 
{
  private double height;
    private double base;
    private double x,y,z;
    public Triangle(double height,double base,double x,double y,double z)
    {
        this.height=height;
        this.base=base;
        this.x=x;
        this.y=y;
        this.z=z;
        
    }
    public void setHeight(int height)
    {
        this.height=height;
    }
    public void setBase(int base)
    {
        this.base=base;
    }
    public void setA(int x)
    {
        this.x=x;
    }
    public void setB(int y)
    {
        this.y=y;
    }
    public void setC(int z)
    {
        this.z=z;
    }
    public double getHeight()
    {
        return height;
    }
    public double getBase()
    {
        return base;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public double getZ()
    {
        return z;
    }
    
    public double calculateArea()
    {
        return (height*base)/2;
    }
    public double calculatePerimeter()
    {
        return x+y+z;
    }
      
}
