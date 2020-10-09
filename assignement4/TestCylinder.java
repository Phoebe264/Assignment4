/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignement4;

/**
 *
 * @author litong
 */
public class TestCylinder {
    
    
    public static void main(String[] args){
        Circle c = new Circle(2 ,"yellow");
        System.out.println("Radius is "+c.getRadius()+", Color is "+c.getColor()+", Base area is "+String.format("%.2f", c.getArea()));
        
        Cylinder cyl = new Cylinder();
        System.out.println("Radius is "+cyl.getRadius()+", Height is "+cyl.getHeight()+", Color is "+cyl.getColor()+
                ", Base area is "+String.format("%.2f", cyl.getArea())+", Volume is "+String.format("%.2f", cyl.getVolume()));
        
        Cylinder cyl2 = new Cylinder(5, 2);
        System.out.println("Radius is "+cyl2.getRadius()+", Height is "+cyl2.getHeight()+", Color is "+cyl2.getColor()+
                ", Base area is "+String.format("%.2f", cyl2.getArea())+", Volume is "+String.format("%.2f", cyl2.getVolume()));
        
        
        
        
    }
}

