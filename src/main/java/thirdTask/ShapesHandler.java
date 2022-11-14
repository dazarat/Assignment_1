package thirdTask;

import thirdTask.entity.Cube;
import thirdTask.entity.Cylinder;
import thirdTask.entity.Shape;
import thirdTask.entity.Sphere;

import java.util.*;

public class ShapesHandler {

    public static List<Shape> sortShapesByVolume(Collection<Shape> shapes){

        //throws exception if null
        if (shapes == null)
            throw new IllegalArgumentException();

        //casting collection to the list in order to sort
        List<Shape> shapeList = new ArrayList<>(shapes);

        //sorting using lambda-comparator
        shapeList.sort((shape1, shape2) -> (int) (shape1.getVolume() - shape2.getVolume()));

        return shapeList;
    }



}
