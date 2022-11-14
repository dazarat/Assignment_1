package thirdTask;

import firstTask.IntegersArrayHandler;
import org.junit.Assert;
import org.junit.Test;
import thirdTask.entity.Cube;
import thirdTask.entity.Cylinder;
import thirdTask.entity.Shape;
import thirdTask.entity.Sphere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class ShapesHandlerTest {

    @Test
    public void testValidData() {

        Collection<Shape> collection = Arrays.asList(new Cube(2), new Cube(3), new Cube(1), new Cylinder(1, 10), new Cylinder(2, 2),
        new Sphere(1), new Sphere(2));

        List<Shape> actual = ShapesHandler.sortShapesByVolume(collection);

        List<Shape> expected = Arrays.asList(new Cube(1),new Sphere(1), new Cube(2),new Cylinder(2,2),
                new Cube(3), new Sphere(2), new Cylinder(1,10));



        for (int i = 0; i < actual.size(); i++){
            Assert.assertEquals(actual.get(i).getVolume(),expected.get(i).getVolume(), 0.001);
        }

    }


    @Test(expected = IllegalArgumentException.class)
    public void testForNullList(){
        Collection<Shape> nullShapeCollection = null;
        ShapesHandler.sortShapesByVolume(nullShapeCollection);
    }

    @Test(expected = NullPointerException.class)
    public void testForNullElementInList(){
        Collection<Shape> collectionWithNull = Arrays.asList(new Sphere(1), null);
        ShapesHandler.sortShapesByVolume(collectionWithNull);
    }
}