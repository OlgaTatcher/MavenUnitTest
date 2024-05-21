package org.example;

import org.junit.Assert;
import org.junit.Test;

import static java.lang.System.out;

public class MaximumNumberOfBalloonsTest {
    private MaximumNumberOfBalloons maximumNumberOfBalloons=new MaximumNumberOfBalloons();

    @Test
    public void maxNumberOfBalloonsTest(){
        String firstTextForTesting="nlaebolko";
        String secondTextForTesting="loonbalxballpoon";
        String thirdTextForTesting="leetcode";

        Integer expectedOnFirstText=1;
        Integer actualOnFirstText=maximumNumberOfBalloons.maxNumberOfBalloons(
                firstTextForTesting);
        Assert.assertEquals(expectedOnFirstText,actualOnFirstText);
        out.println("Test case 1 was successful");

        Integer expectedOnSecondText=2;
        Integer actualOnSecondText=maximumNumberOfBalloons.maxNumberOfBalloons(
                secondTextForTesting);
        Assert.assertEquals(expectedOnSecondText,actualOnSecondText);
        out.println("Test case 2 was successful");

        Integer expectedOnThirdText=0;
        Integer actualOnThirdText=maximumNumberOfBalloons.maxNumberOfBalloons(
                thirdTextForTesting);
        Assert.assertEquals(expectedOnThirdText,actualOnThirdText);
        out.println("Test case 3 was successful");









    }
}
