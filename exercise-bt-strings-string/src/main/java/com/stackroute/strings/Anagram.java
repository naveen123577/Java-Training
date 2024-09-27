package com.stackroute.strings;

public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        char[] firstphrase =  phraseOne.toCharArray();
        char[] secondphrase = phraseTwo.toCharArray();
        if(phraseOne.isEmpty()||phraseTwo.isEmpty()||phraseOne==null||phraseTwo==null){
            return "Give proper input not empty phrases";
        }
        else if(!phraseOne.isEmpty()) {
            java.util.Arrays.sort(firstphrase);
            java.util.Arrays.sort(secondphrase);

            // Check if the sorted arrays are equal
            if (java.util.Arrays.equals(firstphrase, secondphrase)) {
                return "Given phrases are anagrams";
            } else {
                return "Given phrases are not anagrams";
            }
        }

        return null;
    }
}
