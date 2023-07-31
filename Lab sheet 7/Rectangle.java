
package com.mycompany.lab_7;

public class Rectangle extends Shape
{
    private int length;
    private int width;
    public Rectangle(int length,int width)
  {
      this.length=length;
      this.width=width;           
  }
  double calculateArea()
  {
      return length*width;
  }
}
