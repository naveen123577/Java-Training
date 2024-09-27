package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        Scanner e = new Scanner(System.in);
        int first= e.nextInt();
        int second=e.nextInt();
        int op=e.nextInt();
        String result= calculate(first, second,op);
        System.out.println(result);

    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        switch(operator){
            case 1:
                return String.format("%s + %s = %s",firstValue,secondValue,firstValue+secondValue);

            case 2:
                return String.format("%s - %s = %s",firstValue,secondValue,firstValue-secondValue);

            case 3:
                return String.format("%s * %s = %s",firstValue,secondValue,firstValue*secondValue);

            case 4:
                if (secondValue==0){
                    return "The divider (secondValue) cannot be zero";
                }
                return String.format("%s / %s = %s",firstValue,secondValue,firstValue/secondValue);
            default:
                return String.format("Entered wrong option %s",operator);

        }
//        return null;
    }
}
