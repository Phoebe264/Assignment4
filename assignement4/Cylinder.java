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
public class Cylinder extends Circle {

    private double height = 1;

    public Cylinder() {
        super();
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * super.getArea() * super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * super.getRadius() * (super.getRadius() + height);
    }

}
