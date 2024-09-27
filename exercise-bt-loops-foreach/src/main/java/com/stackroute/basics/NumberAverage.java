package com.stackroute.basics;
import java.util.Scanner;

public class NumberAverage {

    public static void main(String[] args) {
        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
        Scanner s= new Scanner(System.in);
        int length=s.nextInt();
        int[] inputarray=new int[length];
        int i =0;
        for( i=0; i<length;i++){
            inputarray[i]=s.nextInt();
        }
        //findAverage(inputarray);
        System.out.println(findAverage(inputarray));
    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {
        int sum=0;
        int count =0;
        int avg;
        if (inputArray.length==0){
            return "Empty array";
        }

        for(int num:inputArray){
            if(num<0){
                return "Give proper positive integer values";
            }
            else{
                sum+=num;
                //count ++;
            }



        }

        return "The average value is: "+sum/inputArray.length;
    }
}
