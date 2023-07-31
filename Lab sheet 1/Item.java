
package com.mycompany.lab_01;
public class Item 
{
    protected int location;
    protected String Description;
    public Item(int l,String d)
    {
        location=l;
        Description=d;
    }
    public void setlocation(int l)
    {
        location=l;
    }
    public int getlocation()
    {
        return location;
    }
    public void setDescription(String d)
    {
        Description=d;
    }
    public String getDescription()
    {
        return Description;
    }
    public void display()
    {
        System.out.println("The location is: "+location);
        System.out.println("The Description is: "+Description);
    
    }
}