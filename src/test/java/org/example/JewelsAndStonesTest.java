package org.example;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.System.out;

public class JewelsAndStonesTest {
    private JewelsAndStones jewelsAndStones=new JewelsAndStones();

    @Test
    public void numJewelsInStonesTest(){
        String firstStringForTestingJewels="aA";
        String firstStringForTestingStones="aAAbbbb";

        Integer firstExpectedByFirstStrings=3;
        Integer firstActualByFirstStrings=jewelsAndStones.numJewelsInStones(
                firstStringForTestingJewels,firstStringForTestingStones);

        Assert.assertEquals(firstExpectedByFirstStrings,firstActualByFirstStrings);
        out.println("Test case 1 was successful");


        String secondStringForTestingJewels="z";
        String secondStringForTestingStones="ZZ";

        Integer secondExpectedBySecondStrings=0;
        Integer secondActualBySecondStrings=jewelsAndStones.numJewelsInStones(
                secondStringForTestingJewels,secondStringForTestingStones);

        Assert.assertEquals(secondExpectedBySecondStrings,secondActualBySecondStrings);
        out.println("Test case 2 was successful");

    }

}
