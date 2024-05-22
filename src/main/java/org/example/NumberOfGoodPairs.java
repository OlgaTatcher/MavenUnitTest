package org.example;

import java.util.HashMap;

import static java.lang.System.out;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int [] firstArrayOfNums= {1,2,3,1,1,3};
        int resultFromFirstArrayOfNums=numIdenticalPairs(firstArrayOfNums);
        out.println(resultFromFirstArrayOfNums);

        int [] secondArrayOfNums={1,1,1,1};
        int resultFromSecondArray=numIdenticalPairs(secondArrayOfNums);
        out.println(resultFromSecondArray);

        int [] thirdArrayOfNums={1,2,3};
        int resultFromThirdArray=numIdenticalPairs(thirdArrayOfNums);
        out.println(resultFromThirdArray);

    }
    public static int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        int result = 0;

        for(int i=0; i<nums.length; i++){
            if(numbers.containsKey(nums[i])){
                result = result+numbers.get(nums[i]);
                numbers.put(nums[i],numbers.get(nums[i])+1);
            }else{
                numbers.put(nums[i],1);
            }
        }
        return result;
    }


}
