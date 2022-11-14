package firstTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntegersArrayHandler {

    public static List<Integer> findPositiveValuesAndSort(List<Integer> integers){
        //throws exception if list is null
        if (integers == null){
            throw new IllegalArgumentException();
        }

        List<Integer> resultList = new ArrayList<>();

        //find positive values
        for (Integer value : integers){
            if (value >= 0)
                resultList.add(value);
        }

        //sorting in reverse order
        resultList.sort(Collections.reverseOrder());

        return resultList;
    }


}
