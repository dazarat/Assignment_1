package firstTask;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class IntegersArrayHandlerTest {

    @Test
    public void testValidData() {

        List<Integer> values = Arrays.asList(6,0,-2,-3,3,4);

        List<Integer> actual = IntegersArrayHandler.findPositiveValuesAndSort(values);

        List<Integer> expected = Arrays.asList(6,4,3,0);

        Assert.assertEquals(actual, expected);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNullList(){
        ArrayList<Integer> nullList = null;
        IntegersArrayHandler.findPositiveValuesAndSort(nullList);
    }

    @Test(expected = NullPointerException.class)
    public void testForNullElementInList(){
        List<Integer> listWithNull = Arrays.asList(1, null, 3);
        IntegersArrayHandler.findPositiveValuesAndSort(listWithNull);
    }

}