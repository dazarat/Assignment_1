package thirdTask.entity;


public class Cube implements Shape {

    private double side;


    public Cube(double side){
        this.side = side;
    }


    public double getVolume(){
        return Math.pow(side,3);
    }
}



