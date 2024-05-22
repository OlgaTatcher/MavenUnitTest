package org.example;

import java.util.HashSet;
import java.util.Set;

import static java.lang.System.out;

public class JewelsAndStones {
    public static void main(String[] args) {
        String firstStringJewels="aA";
        String firstStringStones="aAAbbbb";

        String secondStringJewels="z";
        String secondStringStones="ZZ";

        int resultOfFirstStrings=numJewelsInStones(firstStringJewels,firstStringStones);
        out.println("Jewels in stones:"+resultOfFirstStrings);

        int resultOfSecondStrings=numJewelsInStones(secondStringJewels,secondStringStones);
        out.println("Jewels in stones:"+resultOfSecondStrings);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int numberOfUnits=0;
        Set<Character> charsOfStrings =new HashSet<>();

        for(Character jewel:jewels.toCharArray()){
            charsOfStrings.add(jewel);
        }

        for(Character stone:stones.toCharArray()){
            if(charsOfStrings.contains(stone)){
                numberOfUnits++;
            }
        }
        return numberOfUnits;

    }
}