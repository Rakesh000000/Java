package com.exercise;

import java.util.Scanner;     //for using the Scanner class

public class Main {
    public static void main(String[] args) {

        /*we write static because writing static allows us to call the method(function) without any instance(object)
        the class the method belongs to*/
//----------------------------------------------------------------------------------------------------------------------

        //CREATING LINK BETWEEN CLASSES
//        Me.sayName();
//        Me.sayAge();

//----------------------------------------------------------------------------------------------------------------------

//        USING STRINGS
//        final String LAST_NAME = "Pandey";
//        String myName ="Rakesh";
//        String myProfession ="Student";
//        int myAge = 20;
//        System.out.print(myName);
//        System.out.print(" ");
//        System.out.println(LAST_NAME);
//        System.out.println(myProfession);
//        System.out.println(myAge);

//----------------------------------------------------------------------------------------------------------------------
//        DATA TYPES
//        1 byte = 8 bits


//        byte b=5; // 1byte-->8 bits
//        short s=20; //2byte-->16bits
//        int i=100; // 4 byte-->32 bits
//        long l=999L; //8byte-->64bits
//        float f=4.8F;
//        double d=4.8;
//        System.out.println(f);
//        System.out.println(d);

                //MAX AND MIN VALUES OF DATA TYPES
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);


//----------------------------------------------------------------------------------------------------------------------
//        CHARACTER


//        char c1='A';
//        char c2=65; //also A
//        char c3='\u0041';  //also A
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);
//
//        int code1 = 'A';
//        int code2 = '\u0041';
//        System.out.println(code1);
//        System.out.println(code2);


//----------------------------------------------------------------------------------------------------------------------
//        BOOLEAN


//        boolean isTrue1=true;
//        boolean isTrue2=false;
//        boolean isTrue3= 2<3;
//        boolean isTrue4= 4<3;
//
//        System.out.println(isTrue1);
//        System.out.println(isTrue2);
//        System.out.println(isTrue3);
//        System.out.println(isTrue4);
//
//        boolean isAlive= false;
//
//        if(isAlive)
//            System.out.println("Alive");
//        else
//            System.out.println("Not Alive");


//----------------------------------------------------------------------------------------------------------------------
//        STRING OPERATIONS

//        String s1= "This is a text";


            //UPPER CASE AND LOWER CASE

//        System.out.println(s1.toUpperCase());
//        System.out.println(s1.toLowerCase());


            //LENGTH
//        int i= s1.length();
//        System.out.println(i);


            //isEmpty
//        System.out.println(s1.isEmpty());
//        String s = "   ";
//        System.out.println(s.isEmpty());
//        System.out.println(s.isBlank());//returns true when the string is either empty or contains only blank



            //charAt
//        System.out.println(s1.charAt(3));



            //indexOf
//        System.out.println(s1.indexOf("is"));
//        System.out.println(s1.indexOf('z'));//when character does not exist, the method returns -1
//        System.out.println(s1.lastIndexOf('a'));  //gives index of last 'a'


            //concat
//        String str="Rakesh";
//        String str2 =str.concat(" Pandey");
//        System.out.println(str2);



            //CONCATENATING STRINGS.
//        String str1="Rakesh", str2= "Pandey";
//        System.out.println(str1 + " " + str2);
//        System.out.println(str1 +" " + str2 + " Age is " + 20);
//        System.out.println(str1 + " " +str2 + " Age is " + (10+10));
//        System.out.println("Rakesh".concat(" Pandey").concat(" Age is ") + "20");


            //OBJECTS BY CONSTRUCTOR
//        Me one = new Me(2);




            //STRINGS ARE IMMUTABLE IN JAVA

//        String str0 ="Old value";
//        str0 = "New value";

        /*Immutable means the values that can not be changed.
        here the value Rakesh can not be changed so the reference to old value will be removed.

            ----REFERENCE TO OLD VALUE means the address of old value stored in the variable.----

        and the new reference will be allocated to the variable str0 and the old value is removed
        by java garbage collector
         */




//----------------------------------------------------------------------------------------------------------------------

        //READING INPUT FROM USER

//        Scanner data= new Scanner(System.in);
//        System.out.println("Enter: ");
//        int myInteger = data.nextInt();
//        float myFloat = data.nextFloat();
//        short myShort = data.nextShort();
//        long myLong= data.nextLong();
//        String myString= data.next();

//        System.out.println("You Entered: "+ myInteger +" "+ myFloat + " "+ myLong + " " + myString + " " + myShort);

//        System.out.print("True or false: ");
//        System.out.println(data.nextBoolean());



        //TAKING IN A STATEMENT WITH SPACES
//        System.out.print("Enter a statement: ");
//        System.out.println(data.nextLine());


//        PRACTICE EXERCISE

//        favouriteNumber();
//        nameAndAge();
//        conditionalOperator();
//        ConditionalStatementExercise.main();

//----------------------------------------------------------------------------------------------------------------------
//        PASSING BY REFERENCE

//        Me m = new Me();
//        Scanner value = new Scanner(System.in);
//        System.out.print("Enter value for x and y: ");
//        m.x= value.nextInt();
//        m.y= value.nextInt();
//
//        System.out.println("Before swapping: x="+m.x+" y="+m.y);
//        change(m);
//        System.out.println("After swapping: x="+m.x+" y="+m.y);

//----------------------------------------------------------------------------------------------------------------------
//        METHODS(FUNCTIONS) IN JAVA

//        METHOD OVERLOADING
//        Me.sayHi();
//        System.out.println(Me.sayHi("Rakesh"));


//        Me.primeInRange(1,50);

        Array.main(args);

    }

    public static void favouriteNumber(){
        Scanner data = new Scanner(System.in);
        //        System.out.print("Enter your favourite integer: ");
//        int integer = data.nextInt();
//        System.out.println(integer + " is my favourite too");


        System.out.print("Enter an long: ");
        System.out.println(data.nextLong() + " Is the long you entered");

    }

    public static void nameAndAge(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name and age: ");
        String name= input.next();
        int age= input.nextInt();

        System.out.println(name + " Age:" + age);
    }

    public static void conditionalOperator(){
        String name= "Rakesh";
//        Scanner data = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name2 = data.next();
        System.out.println(name.isBlank()?"String is empty": name);
    }

    public static void change(Me m){
        int temp;
        temp = m.x;
        m.x=m.y;
        m.y=temp;
    }
}