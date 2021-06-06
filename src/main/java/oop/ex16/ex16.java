/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 16 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex16;
import java.util.Scanner;

public class ex16 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        int userAge = userInputScanner.nextInt();

        String outputString = userAge>=16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(outputString);
    }
}
