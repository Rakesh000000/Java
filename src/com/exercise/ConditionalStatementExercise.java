package com.exercise;
import java.util.Scanner;
public class ConditionalStatementExercise {
    public static void main(){
        /*
        if-statement
        syntax:
        if(boolean-expression){
        statement
         }
         */

//----------------------------------------------------------------------------------------------------------------------
//        if(true)
//            System.out.println("Inside if statement");
//
//        System.out.println("Outside if statement");


//----------------------------------------------------------------------------------------------------------------------
//        max();
//        Scanner integer= new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int num= integer.nextInt();
//        evenOrOdd(num);
//        evenOrOdd2(num);
//        comparingWith10(num);
//        switchStatement();
//        luckyNumber();
    }

    public static void max(){
        int x=10, y=10;
        System.out.println("Greatest among " + x + " and "+y+" is:");
        if(x>y)
            System.out.print(x);
        if(y>x)
            System.out.print(y);
        if(x==y)
            System.out.print(x + "and "+y+" are equal");
    }

    public static void evenOrOdd(int number){
        if (number%2 == 0)
            System.out.println(number+" is even");
        if (number%2 ==1){
            System.out.println(number+" is odd");
        }
    }

    public static void evenOrOdd2(int number){
        if(number%2==0){
            System.out.println(number +" is even");
        }
        else
            System.out.println(number + " is odd");

    }

    public static void comparingWith10(int number){
        if(number>10)
            System.out.println(number+" is greater than 10");
        else if (number <10) {
            System.out.println(number+" is less than 10");
        }
        else
            System.out.println(number+" is equal to 10");
    }

    public static void switchStatement() {
        String name="User";
        int age=20;
        float height=5.8f;
        System.out.println("1.Name \n2. Age\n3. Height");
        Scanner choice = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int ch = choice.nextInt();
        switch (ch){
            case 1:
                System.out.println(name);
                break;
            case 2:
                System.out.println(age);
                break;
            case 3:
                System.out.println(height);
                break;
            default:
                System.out.println("Invalid choice!!");
                break;
        }
    }

    public static void luckyNumber() {
        System.out.print("Enter a 4 digit number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int A, B, C, D;
        A = num % 10;
        num = num / 10;
        B = num % 10;
        num = num / 10;
        C = num % 10;
        num = num / 10;
        D = num % 10;


        if (A + B == C + D)
            System.out.println("Lucky number");
        else
            System.out.println("Not a lucky number");
    }
}