package com.exercise;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

//----------------------------------------------------------------------------------------------------------------------

//        arrayInputOutput();

//----------------------------------------------------------------------------------------------------------------------

        /*creating an anonymous array
        we can create an array with no variable name
        one use of anonymous array can be when we need to use an array parameter
        in a method for example:

        printArray(new int[] {1,2,3,4})
         */
//----------------------------------------------------------------------------------------------------------------------

//        char[] chars= {'a','b','c','d'};
//        System.out.println(chars);

//----------------------------------------------------------------------------------------------------------------------
        /*Arrays are passed by reference to any method*/
//        int[] numbers={0,1};
//        System.out.print("Before changing:");
//        printArray(numbers);
//        System.out.println();
//        changeArray(numbers);
//        System.out.print("After changing:");
//        printArray(numbers);
//        System.out.println();
//----------------------------------------------------------------------------------------------------------------------
        /* Array Class */

//        int[] numberArray ={5,1,6,8,2,3,4};
//
////        sorting
//        System.out.println("array 1:");
//        printArray(numberArray);
//        System.out.println();
//        Arrays.sort(numberArray);
//        printArray(numberArray);
//        System.out.println("\n---------------------");
//
////        Arrays.sort(array, fromIndex, toIndex): sort from (fromIntex) to (toIndex-1)\
//        int[] arrayNumbers ={3,2,6,8,24,7,9};
//        System.out.println("array 2:");
//        printArray(arrayNumbers);
//        System.out.println();
//        Arrays.sort(arrayNumbers,0,3);
//        printArray(arrayNumbers);
//        System.out.println("\n---------------------");

        }


    public static void arrayInputOutput() {
        int[] newArray = new int [5];
        int count = 1;
        for(int i=0;i<5;i++){
            newArray[i]=count++;
        }
        System.out.println("array values are:");
        for (int i=0;i<5;i++){
            System.out.println(newArray[i]);
    }
    }

    public static void changeArray(int[] array){
        array[0]=1;
        array[1]=0;
    }

    public static void printArray(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
}