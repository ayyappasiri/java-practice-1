package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/26/2017.
 */
public class Oddeven
            {
                public static void main(String args[])
                {
                    Scanner sc = new Scanner(System.in);
                    System.out.println(" Enter Number first no ");
                    int a = sc.nextInt();
                    System.out.println("Enter Number second no");
                    int b = sc.nextInt();
                    String c = a%2==0? +a+ " Is Even Number " :  + a + " Is Odd Number";
                    String d = b%2==0? +b+ " Is Even Number " :  + b + " Is odd Number";
                    System.out.println(c);
                    System.out.println(d);




                }

            }
