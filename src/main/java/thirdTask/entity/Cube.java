package thirdTask.entity;


public class Cube implements Shape {

    private double side;


    public Cube(double side){

        if (side < 0) throw new IllegalArgumentException();

        this.side = side;

    }


    public double getVolume(){
        return Math.pow(side,3);
    }
}



