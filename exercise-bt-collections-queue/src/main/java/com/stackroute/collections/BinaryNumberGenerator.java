package com.stackroute.collections;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    //write logic to find binary number from 1 to given input
    public String findBinaryNumbersSequence(int input) {
        if (input <= 0) {
            return "Give proper input not zero or negative";
        }
        if (input > 20) {
            return "Give proper input not greater than 20";
        }
        int i = 0;
        Queue<String> qstr = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (i = 1; i <= input; i++) {
            String num = Integer.toBinaryString(i);
            qstr.add(num);
            qstr.add(" ");
        }
        for(String y :qstr){
            sb.append(y);
        }
//        while (!qstr.isEmpty()) {
//            sb.append(qstr.remove());
//        }
        sb.deleteCharAt(sb.length()-1);

        return sb.toString();
    }
}