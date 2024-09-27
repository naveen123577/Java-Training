package com.stackroute.basics;
import java.util.Scanner;

public class StringFinder {
    Scanner s = new Scanner(System.in);
    //Create Scanner object as instance variable

    public static void main(String[] args) {
        StringFinder sf=new StringFinder();
        String searchString = sf.getInput();
        String firstString = sf.getInput();
        String secondString = sf.getInput();
        int result = sf.findString(searchString, firstString, secondString);
        sf.displayResult(result);

        //Get three strings from the user
    }

    public String getInput() {
        String inputstring = s.nextLine();
        return inputstring;


//        return null;
    }

    public void displayResult(int result) {
        if (result==1){
            System.out.println("Found as expected");;
        }
        else if(result==0){
            System.out.println("Not found");
        }
        else if(result==-1){
            System.out.println("Empty string or null");
        }
        //displays the result
    }

    public int findString(String searchString, String firstString, String secondString) {
        if(searchString == null || searchString.isEmpty() ||
                firstString == null || firstString.isEmpty() ||
                secondString == null || secondString.isEmpty()){
                return -1;
        }
        else if (searchString.contains(firstString)&&searchString.contains(secondString)) {
            int firstIndex=searchString.indexOf(firstString);
            int secondIndex=searchString.indexOf(secondString);
            if (firstIndex<secondIndex){
                return 1;
            }
            else{
                return 0;
                
            }

        }
        else if(!searchString.contains(firstString) || !searchString.contains(secondString)){
            return 0;
        }


        else{
//            System.out.println('4');
            return 0;
        }
    }

    public void closeScanner() {
    }
}
