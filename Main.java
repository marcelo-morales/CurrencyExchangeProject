package com.jetbrains;
import java.util.*;

import static java.lang.System.exit;


/*
This is a program that tells you whether a given number is an Armstrong number with the isArmstrong() function
after, the printArmstrong() function prints all the Armstrong numbers from 0 to 100

to clarify, will give an example with a three digit number
An Armstrong number of a three digit number is an integer such that the sum of the cubes
of its digits is equal to the number itself

An n-digit number that is the sum of the nth powers of its digits is called an n-Armstrong(narcissistic) number
*/

public class Main {

    public static void main(String[] args) {


        if (isArmstrong()) {
            System.out.println("Yes, your number is an armstrong number! ");
        } else {
            System.out.println("No, your number is not an armstrong number!");
        }

        //uncomment below if want to print the armstrong numbers from 0 to 1000
       //printArmstrong();
    }


    //be careful of int max capaicty
    //The int type in Java can be used to represent any whole number from -2147483648 to 2147483647
    public static boolean isArmstrong() {
        int number = -1;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please type in a number and I will tell you if this number is an armstrong number." +
                    "\n Watch out for integer overflow (max number to input is 2147483647)");
            number = scanner.nextInt();

            if (number > Integer.MAX_VALUE) {
                throw new ArithmeticException("Integer overflow, number is too large");
            }
            if (number < 0) {
                throw new InputMismatchException("Number is negative!");
            }
        }

        catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            exit(0); //exit program, bad input
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            exit(0); //exit program, bad input
        }
        //catch any other exception that is not accouned for
        catch (Exception e) {
            System.out.println("Input is wrong");
            exit(0); //exit program, bad input
        }

        // if got here, user input is correct, will see if number inputted is an armstrong number
        int original = number; //saving original number

        int temp = number; //temp variable used to find the number of digits
        int num_digits = 0;
        while (temp != 0) {
            temp = temp / 10;
            ++num_digits;
        }

        int check = 0; //check is number that is the sum of the nth powers of its digits
        for (int i = 0; i < num_digits; ++i) {
            int digit = number % 10;
            check = (int) (check + Math.pow(digit,num_digits));
            number = number / 10;
        }

        return original == check;
    }

    //function prints all the armstrong numbers between 1 and 1000
    public static void printArmstrong() {
        //looping from all the numbers from 0 to 1000
        for (int i = 0; i <= 1000; ++i) {

            int current_num = i;
            int original = i;

            int num_digits = 0;
            int check = 0;

            //counting the number of digits
            while (current_num != 0) {
                current_num = current_num / 10;
                ++num_digits;
            }

            //performing calculation if specific number is an armstrong number
            for (int j = 0; j < num_digits; ++j) {
                int digit = original % 10;
                check = (int) (check +  Math.pow(digit, num_digits));
                original = original / 10;
            }
            if (check == i) {
                System.out.println(check);
            }
        }
    }


}
