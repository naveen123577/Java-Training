package com.stackroute.exercises;


import java.util.List;
import java.util.*;
public class CatalogSortedListSearch {
    List<String> sorted = new ArrayList<>();


    //write here logic to get sorted Array List which is a global class variable
    public String catalogListSorter(List<String> unSortedCatalogList) {
        if(unSortedCatalogList==null){
            return "The catalog list is null";
        }
        if (unSortedCatalogList.isEmpty()) {
            return "The catalog List is empty";
        }if (unSortedCatalogList.contains("null")|| unSortedCatalogList.contains(null)) {
            return "The catalog List contains empty or null or blank space as a value";
        }
        for(String str:unSortedCatalogList)
        {
            if(str.isBlank())
                return "The catalog List contains empty or null or blank space as a value";
        }
        Collections.sort(unSortedCatalogList);
        sorted=unSortedCatalogList;
        return sorted.toString();
    }

    //write here logic to search the input value in sorted Array List
    public String catalogListSearcher(String value) {
        if(value==null||value.isBlank())
        {
            return "Input is not accepted";
        }
        // Binary search
        for(String str:sorted)
        {
            if(str.equalsIgnoreCase(value))
            {
                return "Found: "+str;
            }
        }
        return "Not Found";
    }
}

