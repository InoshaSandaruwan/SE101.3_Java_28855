
package com.mycompany.lab_7;

public class Circle extends Shape 
{
    private int radius;
    public Circle(int radius)
  {
      this.radius=radius;           
  }
  double calculateArea()
  {
      return Math.PI*radius*radius;
  }
}
