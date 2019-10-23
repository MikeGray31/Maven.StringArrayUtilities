package com.zipcodewilmington;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String s : array){
            if (s.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        for(int i = 0; i < array.length / 2; i++){

            String replacement = array[i];
            array[i] = array[array.length - (i + 1)];
            array[array.length - (i + 1)] = replacement;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for(int i = 0; i < array.length / 2; i++){
            if(!array[i].equals(array[array.length -(i+1)])){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String checkthis = "";
        for (String s : array){
            checkthis += s.toLowerCase();
        }
        for (char i = 'a'; i <= 'z'; i++){
            if(!checkthis.contains(i + "")){
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String s : array){
            if (s.equals(value)){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int counter = 0;
        String[] keepthese = new String[array.length];
        for (int i = 0; i < array.length ;i++){
            if (!array[i].equals(valueToRemove)){
                keepthese[i - counter] = array[i];
            }
            else{
                counter++;
            }
        }
        String[] result = new String[array.length - counter];

        for (int j = 0; j < result.length; j++){
            result[j] = keepthese[j];
        }

        return result;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int counter = 1;

        for(int i = 1; i < array.length ;i++){
            if(array[i - 1] == array[i]){
                counter++;
            }
            else{
                array[i - counter] = array[i - 1];
            }
        }
        array[array.length - counter] = array[array.length -1];
        String[] result = new String[array.length - counter + 1];

        for (int j = 0; j < result.length; j++){
            result[j] = array[j];
        }

        return result;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int counter = 0;

        for(int i = 1; i < array.length ;i++){
            if(array[i - 1] == array[i]){
                array[counter] += array[i];
            }
            else{
                counter++;
                array[counter] = array[i];
            }
        }
        String[] result = new String[counter + 1];

        for (int j = 0; j < result.length; j++){
            result[j] = array[j];
        }

        return result;

    }
}
