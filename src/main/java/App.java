/*What is the first number? 10
        What is the second number? 5
        10 + 5 = 15
        10 - 5 = 5
        10 * 5 = 50
        10 / 5 = 2
*/

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Luis Andres Acosta Mejia
 *
 */
import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Here we are declaring the scanner to be used.

        String first_number; //These are the two strings we are going to be using to input
        String second_number;

        //Then we declare two int variables that will hold the number value of the string inputted.
        int first;
        int second;

        System.out.print("What is the first number? ");
        first_number = in.next(); //Here we are inputing the string
        first = Integer.parseInt(first_number); //Here we are passing the conversion from string to int to this variable.

        System.out.print("What is the second number? ");
        second_number = in.next(); //Here we are inputting the string
        second = Integer.parseInt(second_number); //Here we are passing the conversion from string to int to this variable.

        //First we are going to print the sum up
        System.out.println(first + " + " + second + " = " + (first + second));

        //Now we are printing the substraction
        System.out.println(first + " - " + second + " = " + (first - second));

        //Now we are printing the multiplication
        System.out.println(first + " * " + second + " = " + (first * second));

        //Now we are printing the division.
        System.out.println(first + " / " + second + " = " + (first/second));
    }
}
