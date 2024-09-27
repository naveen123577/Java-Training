package com.stackroute.basics;
import java.util.Scanner;


public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {
        Scanner n=new Scanner(System.in);
        double l = n.nextDouble();
        double b = n.nextDouble();
        double p=perimeterCalculator(l,b);
        System.out.println(p);


    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        double perimeters=2*(length+breadth);
        return perimeters;
    }
}
