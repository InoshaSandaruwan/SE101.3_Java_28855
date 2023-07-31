
package com.mycompany.lab_03;

public class Employee 
{
    private String name;
    private double bonus;
    private double basic_salary;
    public Employee(String name,double bonus,double basic_salary)
    {
        this.name=name;
        this.bonus=bonus;
        this.basic_salary=basic_salary;
    }
    
    public String getname()
    {
        return name;
    }
    public double getbonus()
    { 
        return bonus;
    }
    public double getbasicSalary()
    { 
        return basic_salary;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public void setbonus(int bonus)
    { 
        this.bonus=bonus;
    }
    public void setbasicSalary(double basic_salary)
    { 
        this.basic_salary=basic_salary;
    }
    public double calculatetotalOfBonus()
    {
        return basic_salary+bonus;
    }
}
