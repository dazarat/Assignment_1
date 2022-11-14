package thirdTask.entity;


public class Sphere implements Shape {
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    public double getVolume() {
        return (Math.pow(radius, 3) * Math.PI * 4) / 3;
    }


}