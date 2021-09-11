package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 David Day
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter your weight (in pounds): " );
        double weight = input.nextDouble();
        System.out.print("Enter your height (in inches): ");
        double height = input.nextDouble();

        double bmi = height * height;
        bmi = weight / bmi;
        bmi = bmi * 703;
        bmi = Math.round(bmi * 100.0) / 100.0;

        System.out.println("Your BMI is " + bmi + ".");

        if (bmi <= 25 && bmi >= 18.5) {
            System.out.println("You are within the ideal weight range.");
        }
        else {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
