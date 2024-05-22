package org.example;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.System.out;

public class NumberOfGoodPairsTest {
    private NumberOfGoodPairs numberOfGoodPairs=new NumberOfGoodPairs();

    @Test
    public void numIdenticalPairsTest(){
        int [] firstArrayOfNumbers={1,2,3,1,1,3};
        Integer firstExpected=4;
        Integer firstActual=numberOfGoodPairs.numIdenticalPairs(firstArrayOfNumbers);
        Assert.assertEquals(firstExpected,firstActual);
        out.println("Test case 1 was successful");

        int [] secondArrayOfNumbers={1,1,1,1};
        Integer secondExpected=6;
        Integer secondActual=numberOfGoodPairs.numIdenticalPairs(secondArrayOfNumbers);
        Assert.assertEquals(secondExpected,secondActual);
        out.println("Test case 2 was successful");

        int [] thirdArrayOfNumbers={1,2,3};
        Integer thirdExpected=0;
        Integer thirdActual=numberOfGoodPairs.numIdenticalPairs(thirdArrayOfNumbers);
        Assert.assertEquals(thirdExpected,thirdActual);
        out.println("Test case 3 was successful");

    }

}
