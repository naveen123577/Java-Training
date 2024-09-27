package com.stackroute.collections;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class UniqueNumbersCounter {
    //write logic to find maximum unique numbers count from given array in the sub array of certain length
    public String findUniqueNumbersCount(int[] inputArray, int subArrayLength) {
        if (inputArray == null) {
            return "Give proper input not null array";
        }
        if (inputArray.length == 0) {
            return "Give proper input not empty array";
        }
        if (subArrayLength > inputArray.length) {
            return "Give proper input, sub array length exceeds array length";
        }
        if (subArrayLength <= 0) {
            return "Give proper input, sub array length can not be negative or zero";
        }
//        List<Integer> li = new ArrayList<>();
//        int i = 0;
//        int l =0;
//        for (i = 0; i < subArrayLength; i++){
//            if (!li.contains(inputArray[i])) {
//                li.add(inputArray[i]);
//            }
//            else{
//                i++;
//            }
//        }
//        l = li.size();
//        return "Count of Unique Numbers is " + l;
//    }

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int j = 0; j < subArrayLength; j++) {
            uniqueNumbers.add(inputArray[j]);
        }
        int l = uniqueNumbers.size();

        return "Count of Unique Numbers is " + l;
    }
}



