package org.example;

import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Buoi1 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        MenuDay();
    }
    public static void MenuDay(){
        while(true){
            System.out.println("============================================");
            System.out.println("Enter -1 to finish System");
            System.out.println("Day 1");
            System.out.print("Your choice: ");
            String choice = scan.nextLine();
            switch (choice){
                case "-1": System.out.println("Stop"); System.exit(0);
                case "1": MenuDay1();break;
                case "2":MenuDay2();break;
                default: System.out.println("Your day is invalid");break;
            }
        }
    }
    public static void MenuDay2(){

    }
    public static void MenuDay1(){
            System.out.println();
            System.out.println("======================BUOI 1======================");
            System.out.println("Exercise 1 - JAVA SYNTAX");
            System.out.println("Exercise 2 - JAVA SYNTAX");
            System.out.println("Exercise 3 - JAVA VARIABLES");
            System.out.println("Exercise 4 - JAVA VARIABLES");
            System.out.println("Exercise 5 - JAVA VARIABLES");
            System.out.println("Exercise 6 - JAVA VARIABLES");
            System.out.println("Exercise 7 - JAVA VARIABLES");
            System.out.println("Exercise 8 - JAVA DATA TYPES");
            System.out.println("Exercise 9 - JAVA DATA TYPES");
            System.out.println("Exercise 10 - JAVA DATA TYPES");
            System.out.println("Exercise 11 - JAVA OPERATOR");
            System.out.println("Exercise 12 - JAVA OPERATOR");
            System.out.println("Exercise 13 - JAVA OPERATOR");
            System.out.println("Exercise 14 - JAVA OPERATOR");
            System.out.println("Exercise 15 - JAVA Strings");
            System.out.println("Exercise 16 - JAVA Strings");
            System.out.println("Exercise 17 - JAVA Strings");
            System.out.println("Exercise 18 - JAVA Strings");
            System.out.println("Exercise 19 - JAVA Strings");
            System.out.println("Exercise 20 - JAVA Strings");
            System.out.println("Exercise 21 - JAVA MATH");
            System.out.println("Exercise 22 - JAVA MATH");
            System.out.println("Exercise 23 - JAVA MATH");
            System.out.println("Exercise 24 - JAVA BOOLEANS");
            System.out.println("Exercise 25 - JAVA BOOLEANS");
            System.out.println("Exercise 26 - JAVA IF...ELSE");
            System.out.println("Exercise 27 - JAVA IF...ELSE");
            System.out.println("Exercise 28 - JAVA IF...ELSE");
            System.out.println("Exercise 29 - JAVA IF...ELSE");
            System.out.println("Exercise 30 - JAVA IF...ELSE");
            System.out.println("Exercise 31 - JAVA SWITCH");
            System.out.println("Exercise 32 - JAVA SWITCH");
            System.out.println("Exercise 33 - JAVA LOOPS");
            System.out.println("Exercise 34 - JAVA LOOPS");
            System.out.println("Exercise 35 - JAVA LOOPS");
            System.out.println("Exercise 36 - JAVA LOOPS");
            System.out.println("Exercise 37 - JAVA LOOPS");
            System.out.println("Exercise 38 - JAVA LOOPS");
            System.out.println("Exercise 39 - JAVA Arrays");
            System.out.println("Exercise 40 - JAVA Arrays");
            System.out.println("Exercise 41 - JAVA Arrays");
            System.out.println("Exercise 42 - JAVA Arrays");
            System.out.println("Exercise 43 - JAVA Arrays");
            System.out.println("Exercise 44 - JAVA Arrays");
            System.out.println("Exercise 45 - JAVA METHODS");
            System.out.println("Exercise 46 - JAVA METHODS");
            System.out.println("Exercise 47 - JAVA METHODS");
            System.out.println("Exercise 48 - JAVA METHODS");
            System.out.println("Exercise 49 - JAVA METHODS");
            System.out.println("Exercise 50 - JAVA Classes/Object");
            System.out.println("Exercise 51 - JAVA Classes/Object");
            System.out.println("Exercise 52 - JAVA Classes/Object");
            System.out.println("Exercise 53 - JAVA Classes/Object");
            System.out.println("Exercise 54 - JAVA Classes/Object");
            System.out.println("Exercise 55 - JAVA Classes/Object");
            System.out.println("Exercise 56 - JAVA Classes/Object");
            System.out.println("Exercise 57 - JAVA Classes/Object");
            System.out.println("Exercise 58 - JAVA Exception");
            System.out.println("Exercise 59 - JAVA Exception");
            System.out.print("Your Exercie: ");
            String choice = scan.nextLine();
            System.out.println();
            switch (choice){
                case "1": Excercie_1_Day1();break;
                case "2": Excercie_2_Day1();break;
                case "3": Excercie_3_Day1();break;
                case "4": Excercie_4_Day1();break;
                case "5": Excercie_5_Day1();break;
                case "6": Excercie_6_Day1();break;
                case "7": Excercie_7_Day1();break;
                case "8": Excercie_8_Day1();break;
                case "9": Excercie_9_Day1();break;
                case "10": Excercie_10_Day1();break;
                case "11": Excercie_11_Day1();break;
                case "12": Excercie_12_Day1();break;
                case "13": Excercie_13_Day1();break;
                case "14": Excercie_14_Day1();break;
                case "15": Excercie_15_Day1();break;
                case "16": Excercie_16_Day1();break;
                case "17": Excercie_17_Day1();break;
                case "18": Excercie_18_Day1();break;
                case "19": Excercie_19_Day1();break;
                case "20": Excercie_20_Day1();break;
                case "21": Excercie_21_Day1();break;
                case "22": Excercie_22_Day1();break;
                case "23": Excercie_23_Day1();break;
                case "24": Excercie_24_Day1();break;
                case "25": Excercie_25_Day1();break;
                case "26": Excercie_26_Day1();break;
                case "27": Excercie_27_Day1();break;
                case "28": Excercie_28_Day1();break;
                case "29": Excercie_29_Day1();break;
                case "30": Excercie_30_Day1();break;
                case "31": Excercie_31_Day1();break;
                case "32": Excercie_32_Day1();break;
                case "33": Excercie_33_Day1();break;
                case "34": Excercie_34_Day1();break;
                case "35": Excercie_35_Day1();break;
                case "36": Excercie_36_Day1();break;
                case "37": Excercie_37_Day1();break;
                case "38": Excercie_38_Day1();break;
                case "39": Excercie_39_Day1();break;
                case "40": Excercie_40_Day1();break;
                case "41": Excercie_41_Day1();break;
                case "42": Excercie_42_Day1();break;
                case "43": Excercie_43_Day1();break;
                case "44": Excercie_44_Day1();break;
                case "45": Excercie_45_Day1();break;
                case "46": Excercie_46_Day1();break;
                case "47": Excercie_47_Day1();break;
                case "48": Excercie_48_Day1();break;
                case "49": Excercie_49_Day1();break;
                case "50": Excercie_50_Day1();break;
                case "51": Excercie_51_Day1();break;
                case "52": Excercie_52_Day1();break;
                case "53": Excercie_53_Day1();break;
                case "54": Excercie_54_Day1();break;
                case "55": Excercie_55_Day1();break;
                case "56": Excercie_56_Day1();break;
                case "57": Excercie_57_Day1();break;
                case "58": Excercie_58_Day1();break;
                case "59": Excercie_59_Day1();break;



        }

    }
    public static void Excercie_1_Day1(){
        System.out.println("Hello world");
    }
    public static void Excercie_2_Day1(){
        //This is single-line comment
        /*This is a Multi-line comment*/
    }

    public static void Excercie_3_Day1(){
        String carName = "Volvo";
        System.out.println(carName);
    }
    public static void Excercie_4_Day1(){
        int maxSpeed = 120;
        System.out.println(maxSpeed);
    }
    public static void Excercie_5_Day1(){
        int x = 5;
        int y = 10;
        System.out.println(x + y);
    }
    public static void Excercie_6_Day1(){
        int x = 5;
        int y = 10;
        int z = x + y;
        System.out.println(z);
    }
    public static void Excercie_7_Day1(){
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);
    }
    public static void Excercie_8_Day1(){
        int myNum = 9;
        float myFloatNum = 8.99f;
        char myLetter = 'A';
        boolean myBool = false;
        String myText = "Hello World";
        System.out.println(myNum + "," + myFloatNum + "," + myLetter + "," + myBool + "," + myText);
    }
    public static void Excercie_9_Day1(){
        System.out.println("This is primitive");
    }

    public static void Excercie_10_Day1(){
        double myDouble = 9.78d;
        int myInt = (int) myDouble;
        System.out.println(myInt);
    }

    public static void Excercie_11_Day1() {
        System.out.println(10 * 5);
    }
    public static void Excercie_12_Day1() {
        System.out.println(10 / 5);
    }
    public static void Excercie_13_Day1() {
        int x = 10;
        ++x;
        System.out.println(x);
    }

    public static void Excercie_14_Day1() {
        int x = 10;
        x += 5;
        System.out.println(x);
    }

    public static void Excercie_15_Day1() {
        String greeting = "Hello";
        System.out.println(greeting);
    }

    public static void Excercie_16_Day1() {
        String txt = "Hello";
        System.out.println(txt.length());
    }

    public static void Excercie_17_Day1() {
        String txt = "Hello";
        System.out.println(txt.toUpperCase());
    }

    public static void Excercie_18_Day1() {
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName + lastName);
    }

    public static void Excercie_19_Day1() {
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    }
    public static void Excercie_20_Day1() {
        String txt = "Hello Everybody";
        System.out.println(txt.indexOf("e"));
    }

    public static void Excercie_21_Day1() {
        int x = 5;
        int y = 10;
        Math.max(x, y);
    }

    public static void Excercie_22_Day1() {
        int x = 16;
        System.out.println(Math.sqrt(x));
    }
    public static void Excercie_23_Day1() {
        System.out.println(Math.random());
    }
    public static void Excercie_24_Day1() {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
    }
    public static void Excercie_25_Day1() {
        int x = 10;
        int y = 9;
        System.out.println(x > y);
    }

    public static void Excercie_26_Day1() {
        int x = 50;
        int y = 10;
        if (x > y) {
            System.out.println("Hello World");
        }
    }
    public static void Excercie_27_Day1() {
        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("Hello World");
        };
    }
    public static void Excercie_28_Day1() {
        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
    public static void Excercie_29_Day1() {
        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("1");
        }
        else if (x > y) {
            System.out.println("2");
        }
        else
        {
            System.out.println("3");
        }
    }
    public static void Excercie_30_Day1() {
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }

    public static void Excercie_31_Day1() {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
        }
    }

    public static void Excercie_32_Day1() {
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Weekend");
        }
    }

    public static void Excercie_33_Day1() {
        int i = 1;
        while (i < 6) {
            System.out.println(i);
            i++;
        }
    }
    public static void Excercie_34_Day1() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 6);
    }
    public static void Excercie_35_Day1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Yes");
        }
    }
    public static void Excercie_36_Day1() {
        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
    public static void Excercie_37_Day1() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
    public static void Excercie_38_Day1() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void Excercie_39_Day1() {
        String[] cars = {"Volvo", "BMW", "Ford"};
        System.out.println(cars);
    }

    public static void Excercie_40_Day1() {
        String[] cars = {"Volvo", "BMW", "Ford"};
        System.out.println(cars[1]);
    }

    public static void Excercie_41_Day1() {
        String[] cars = {"Volvo", "BMW", "Ford"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
    }

    public static void Excercie_42_Day1() {
        String[] cars = {"Volvo", "BMW", "Ford"};
        System.out.println(cars.length);
    }

    public static void Excercie_43_Day1() {
        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    public static void Excercie_44_Day1() {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    }

    static void myMethod() {
        System.out.println("I just got executed!");
    }
    public static void Excercie_45_Day1() {
        myMethod();
    }
    public static void Excercie_46_Day1() {
        myMethod();
        myMethod();
    }
    static void myMethod(String fname) {
        System.out.println(fname + " Doe");
    }
    public static void Excercie_47_Day1() {
        myMethod("John");
    }

    static int myMethod(int x) {
        return 5 + x;
    }
    public static void Excercie_48_Day1() {
        System.out.println(myMethod(3));
    }
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied");
        }
        else
        {
            System.out.println("Access granted");
        }
    }
    public static void Excercie_49_Day1() {
        checkAge(20);
    }

    public static void Excercie_50_Day1() {
        System.out.println("this Exercise is create class MyClass");
    }

    public static void Excercie_51_Day1() {
        MyClass myObj = new MyClass();
        System.out.println("this Exercise is create a object of class MyClass");
    }

    public static void Excercie_52_Day1() {
        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
    }

    public static void Excercie_53_Day1() {
        MyClass myObj = new MyClass();
        myObj.myMethod();
    }

    public static void Excercie_54_Day1() {
        MyClass myObj = new MyClass();
        System.out.println(myObj.x);
    }

    public static void Excercie_55_Day1() {
        System.out.println("this Exercise is create a final class");
    }

    public static void Excercie_56_Day1() {
        System.out.println("this Exercise is create Import java.util.Scanner");
    }
    public static void Excercie_57_Day1() {
        System.out.println("this Exercise is create make class Car extends Vehicle");
    }
    public static void Excercie_58_Day1() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
    public static void Excercie_59_Day1(){
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("The 'try catch' is finished.");
        }
    }



}