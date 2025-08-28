package com.learning.util;

public class GlobalUtility {

    // utility method that checks if a string is neither null nor empty
    public static boolean isNotNullOrEmpty(String value){
        return value != null && !value.trim().isEmpty();
    }

    //add new line after relevant details
    public static String message(String message){
        return "Please add relevant details " + message;
    }
}
