package secondTask;

import org.junit.Assert;
import org.junit.Test;
import thirdTask.ShapesHandler;
import thirdTask.entity.Shape;
import thirdTask.entity.Sphere;

import java.util.*;

import static org.junit.Assert.*;

public class HashtagCounterTest {

    @Test
    public void testValidData() {
        List<String> stringsWithTags = Arrays.asList("#string with #some #some #text", "this #string #has hashtag", "how #many #string i need to #add",
                "#text is not #some");

        Map<String, Integer> actual = HashtagCounter.countHashtags(stringsWithTags);
        Map<String, Integer> expected = new LinkedHashMap<>();
        expected.put("#string", 3);
        expected.put("#some",2);
        expected.put("#text", 2);
        expected.put("#has", 1);
        expected.put("#many", 1);

        Assert.assertEquals(actual,expected);



    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNullList(){
        List<String> nullList = null;
        HashtagCounter.countHashtags(nullList);
    }

    @Test(expected = NullPointerException.class)
    public void testForNullElementInList(){
        List<String> listWithNull = Arrays.asList("string one", null, "any #string");

        HashtagCounter.countHashtags(listWithNull);
    }
}