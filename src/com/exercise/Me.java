package com.exercise;

public class Me {
    int x,y;

    Me(){
        x=0;
        y=0;
    }

    Me(int a){
        System.out.println("Hello");
    }



    public static void sayName(){
        System.out.println("Name:");
    }

    public static void sayAge(){
        System.out.println("Age:");
    }

    public static void sayHi(){
        System.out.println("Hi user");
    }

    public static String sayHi(String a){
        return "Hi "+a;
    }

    public static void primeInRange(int x, int y){
        for (int i=x; i<=y; i++){
            if ((isPrime(i))==true)
                System.out.print(i+ " ");
        }
    }

    public static boolean isPrime(int x){
        int count = 0;
        for (int i=1;i<x;i++){
            if((x % i)==0)
                count++;
        }
        return count>1?false:true;
    }
}