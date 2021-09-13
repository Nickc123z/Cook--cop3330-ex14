/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Nick Cook
 */

import java.util.Scanner;


public class E14 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("What is the order amount ? ");
        double amount = 0.0;
        amount = scan.nextInt();


        System.out.print("What is the state ? ");
        String st = scan.next();

        System.out.print("The subtotal is $" + amount);


        if (st.equalsIgnoreCase("wi")) {

            double tax = amount * 0.055;
            System.out.print("\nThe Tax is $" + tax);

            amount = amount + tax;
            System.out.print("\nThe total is $" + amount);

        }
    }
}