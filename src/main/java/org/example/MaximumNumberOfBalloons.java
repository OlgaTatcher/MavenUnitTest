package org.example;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class MaximumNumberOfBalloons {
    public static void main(String[] args) {
        String firstInputText="nlaebolko";
        String secondInputText="loonbalxballpoon";
        String thirdInputText="leetcode";

        out.println("Maximum number of instances in first string: "+maxNumberOfBalloons(firstInputText));
        out.println("Maximum number of instances in first string: "+maxNumberOfBalloons(secondInputText));
        out.println("Maximum number of instances in first string: "+maxNumberOfBalloons(thirdInputText));

    }
    public static int maxNumberOfBalloons(String text) {

        Map<Character, Integer> searchText=new HashMap<>();
        searchText.put('b',1);
        searchText.put('a',1);
        searchText.put('l',2);
        searchText.put('o',2);
        searchText.put('n',1);

        Map<Character, Integer> textCount=new HashMap<>();
        for(char everyChar:text.toCharArray()){
            textCount.put(everyChar,textCount.getOrDefault(everyChar,0)+1);

        }

        int maxInstance=Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : searchText.entrySet()) {
            char searchChar= entry.getKey();
            int requiredCount = entry.getValue();
            int availableCount = textCount.getOrDefault(searchChar, 0);

            maxInstance = Math.min(maxInstance, availableCount / requiredCount);
        }

        return maxInstance;

    }
}
