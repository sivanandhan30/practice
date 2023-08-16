package com.stringclass;

import java.util.*;

public class StringDuplicate {
    public static void main(String[] args) {
        String s = "Hi How are You";
        int count;
        //Converts given string into character array
        char string[] = s.toCharArray();
        System.out.println("Duplicate characters in a given string:");
        //Counts each character present in the string
        for (int i = 0; i < string.length; i++) {
            count = 1;
            for (int j = i + 1; j < string.length; j++) {
                if (string[i] == string[j] && string[i] != ' ') {
                    count++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
            //A character is considered as duplicate if count is greater than 1
            if (count > 1 && string[i] != '0')
                System.out.println(string[i]);
        }
        String[] strArrays = {
                "Cabbage",
                "Kale",
                "Radish",
                "Kale",
                "Garlic",
                "Ginger",
                "Garlic",
                "Carrot",
                "Kale"
        };

        // First convert to List
        List<String> list = Arrays.asList(strArrays);

        // just empty HashSet object
        // add converted List (Arrays -> List)
        Set<String> set = new HashSet<String>();;

        // Iterate using enhanced for-each loop
        System.out.println("\nDuplicate in given String array:");
        for (String str : list) {
            boolean flagForDuplicate = set.add(str);

            if(!flagForDuplicate){
                System.out.println(str+" is duplicate element");
            }
        }
    }
}