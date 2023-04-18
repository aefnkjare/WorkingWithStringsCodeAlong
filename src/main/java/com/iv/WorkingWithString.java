package com.iv;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Pattern;

import java.util.*;

public class WorkingWithString {
    public static void main(String[] args){

//        String pp = "Peepee ";
//        String popo = "Poopoo ";
//        System.out.println(pp.concat(popo)); // .concat only works on Strings
//        System.out.println(pp + popo);  // will look the same as above (+ and concat are the same)
//        String result = pp.concat(popo);
//
//        int wordLength = result.length();
//        System.out.println((wordLength));
//        /////////////////////////////
//        char myChar = 'G'; // single ' is char type
//        String myName = "Greg"; // double " is String type
//
//        String phrase = "Big tex says \n \"Hello\"! test"; // \ means the next thing is not to be processed as code
//        System.out.println(phrase);

        ///////////

//        int num1 = 10;
//        int num2 = 10;
//        System.out.println(num1 == num2);

//        String phrase1 = new String ("Hello World");
//        String phrase2 = new String ("Hello World");
//        String phrase3 = "Hello " + "World";
//        //Primitives (data type?): int long boolean short char double float // compare (==)
//        // Non-primitive (class?): String // compare .equals
//
//        System.out.println(phrase1.equals(phrase2));

        /////////////////////////

//        String myName = "Isaiah";
////        String myUpperCaseName = myName.toUpperCase(); //
//        myName =myName.trim().toUpperCase();
////        System.out.println(myUpperCaseName);
//        System.out.println(myName);

        //////////////////////

//        String phrase = "              Hello World            !         ";
//        System.out.println(phrase.trim());

        //////////////

//        String myPhrase = "Isaiah is the best programmer!";
//        System.out.println(myPhrase.startsWith("isaiah"));

//        String[] = ["Name: Isaiah", "From: USA", "Favorite Color: Periwinkle"]; // if you just wanted
//        the name you use .startsWith

        ///////////////

//        String trackingCode = "USA-12981-Y-22";

//        char hasShipped = trackingCode.charAt(10);
//        System.out.println(hasShipped);

        ///////////

//        String productCode1 = "ACME-12213"; // "ACME", "12213"
//        int dashPosition1 = productCode1.indexOf("-"); // 4
//        String vendor1 = productCode1.substring(0, dashPosition1);
//        String productNum1 = productCode1.substring(dashPosition1 + 1);
//        System.out.println("Vendor1: " + vendor1 + " ProductNum1: " +productNum1);
//
//        String productCode2 = "SAMSUNG-320233242"; // "SAMSUNG" - "320233242"
//        int dashPosition2 = productCode2.indexOf("-"); // 7
//        String vendor2 = productCode2.substring(0, dashPosition2);
//        String productNum2 = productCode2.substring(dashPosition2 + 1);
//        System.out.println("Vendor2: " + vendor2 + " ProductNum2: " + productNum2);

        ////////////////////////////

//        String str1 = "my@dear@aunt@sally";
//        System.out.println(str1.substring(3, 7));
//
//        String str2 = "my@dear@aunt@sally";
//        System.out.println(Arrays.toString(str2.split("@")));

        ////////////////////////////////
        // Start week2day2 here
//        String str = "34344";
//        int num = 10;
//
//        int parsedInt = Integer.parseInt(str);
//        int sum = num + parsedInt;
//        System.out.println(parsedInt + 10);
        /////////////

        // string contains "id|description|quantity|price"

//        String input = "111|Hot Chocolate (12-count)|21|4.99";
//
//        String[] tokens = input.split(Pattern.quote("|"));
//
//        int id = Integer.parseInt(tokens[0]);
//        String name = tokens[1];
//        int quantity = Integer.parseInt(tokens[2]);
//        double price = Double.parseDouble(tokens[3]);
        ///////////////////

        String userInput = "2002-10-17";
        LocalDate birthDay = LocalDate.parse(userInput);
        System.out.println(birthDay);


    }
}
