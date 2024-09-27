package com.stackroute.exercises;

import java.time.LocalDate;


public class FindDay {

    // Write logic to find day of the date and return result
    public String findDay(int month, int day, int year) {
        String str = "";
        int flag = 0;
        if(month > 12 || month < 1){
            str += "Give month in range";
            flag = 1;
        }if(day > 31 || day < 1){
            str += "Give day in range";
            flag = 1;
        }if(year > 3000 || year < 2000){
            str += "Give year in range";
            flag = 1;
        }
        if(flag == 1){
            return str;
        }

        try {
            LocalDate date = LocalDate.of(year, month, day);
            String dayOfWeek = date.getDayOfWeek().toString();
            return dayOfWeek.toUpperCase();
        } catch (Exception e) {
            return "Give valid date";
        }
    }
}
