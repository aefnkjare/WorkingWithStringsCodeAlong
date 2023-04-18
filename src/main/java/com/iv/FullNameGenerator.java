package com.iv;

import java.util.Scanner;

//public class FullNameGenerator {
//    public static void main(String[] args ){

//        String fName = "Jacob ";
//        String mName = "B. ";
//        String lName = "Diaz";
//        String suffix = "";
//        if(suffix != ""){
//            suffix = ", ".concat(suffix);
//        }
//
//        System.out.println(fName + mName + lName + suffix);

//    }
    public class FullNameGenerator {
        public static void main(String[] args){
            // Initialize Scanner
            Scanner userScanner = new Scanner(System.in);

            //Create a variable to store the full name,
            //initialize as empty String
            String fullName = "";
            System.out.println("Please enter your name");

            // Prompt user for first name, Make sure to trim
            System.out.println("First Name:");
            String firstName = userScanner.nextLine().trim();

            // Prompt user for middle name "", Make sure to trim
            System.out.println("Middle Name:");
            String middleName = userScanner.nextLine().trim();
            // Prompt user for last name, Make sure to trim
            System.out.println("Middle Name:");
            String lastName = userScanner.nextLine().trim();
            // Prompt user for suffix, Make sure to trim
            System.out.println("Last Name:");
            String suffix = userScanner.nextLine().trim();

            // Add first name to fullNameVariable
            fullName += firstName + " ";

            // * Add Middle name to fullNameVariable, Making sure to have whitespace
            if (!middleName.equals("")) {
                fullName += middleName + " ";
            }

            // Add last name to fullNameVariable
            fullName += lastName + " ";

            // if there is a suffix, add (", " + suffix) to fullNameVariable
            if(!suffix.equals("")){ // ! pretty much means not
                fullName += ", " + suffix;
            }
            // Otherwise do nothing

            // Print out full name

            System.out.println("Full Name:" + fullName);


        }
    }
//}
