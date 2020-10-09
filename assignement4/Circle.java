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
public class Circle {
    
    private double radius = 1;
    private String color = "red";
    
    public Circle(){
        
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
}
