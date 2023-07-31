
package com.mycompany.lab_09_1;

public class Lab_09_1 {

    public static void main(String[] args) 
    {
        CylinderContainer CC1=new CylinderContainer(8,10);
        CC1.calculateVolume();
        System.out.println("Volume: "+CC1.calculateVolume());
    }
}
