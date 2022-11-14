package secondTask;

import java.util.*;
import java.util.stream.Collectors;

public class HashtagCounter {

    public static Map<String, Integer> countHashtags(List<String> stringsList){

        //returns empty map if list is empty, or throws exception if null
        if (stringsList==null) throw new IllegalArgumentException();
        else if (stringsList.isEmpty()) return Collections.emptyMap();

        Map<String, Integer> hashtags = new LinkedHashMap<>();
        ArrayList<String> hashtagsInLine;


        //checking every string in list
        for (String line : stringsList){
            String[] words = line.split(" ");

            //find non-repeating hashtag in every line
            hashtagsInLine = new ArrayList<>();
            for (int i = 0; i < words.length; i++){

                if (words[i].charAt(0) == '#'){
                    if (!hashtagsInLine.contains(words[i])){
                        hashtagsInLine.add(words[i]);
                    }
                }
            }

            //adding found hashtags to the map
            for (String word : hashtagsInLine){
                if (!hashtags.containsKey(word)){
                    hashtags.put(word, 1);
                }
                else if (hashtags.containsKey(word)) {
                    hashtags.put(word, hashtags.get(word) + 1);
                }
            }
        }

        return hashtags
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (oldVal, newVal) -> oldVal, LinkedHashMap::new));
    }



}
