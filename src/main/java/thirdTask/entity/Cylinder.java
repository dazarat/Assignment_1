package thirdTask.entity;

public class Cylinder implements Shape{

    private double height;
    private double radius;

    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
    }

    public double getVolume(){
        return Math.pow(radius, 2) * Math.PI * height;
    }

}
