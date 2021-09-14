/*
* UCF COP 3330 Fall Assignment 11 Solution
* Copyright 2021 Rahel Haque
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner money = new Scanner(System.in);
        System.out.println("How many euros are you exchanging?");
        int c_from = money.nextInt();
        System.out.println("What is the exchange rate?");
        double rate = money.nextFloat();

        double c_to = c_from * rate;

        System.out.printf("%d euros at an exchange rate of %.4f is%n%.2f U.S. dollars.", c_from, rate, c_to);
    }
}