package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/28/2017.
 */
public class NumberOfDays
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner((System.in));
        System.out.println("Enter months name");
        String months = sc.nextLine();

        switch(months)
        {
            case "January":
                System.out.println("\n January = 31");
                break;


            case "February":
                System.out.println("\n February = 28 0r 29 ");
                break;

            case "March" :
                System.out.println("\n March = 31");
                break;

            case "April":
                System.out.println("\n April = 30");
                break;


            case "May":
                System.out.println("\n may =31");
                break;

            case "June" :
                System.out.println("\n June = 30");
                break;

            case "July":
                System.out.println("\n July = 31");
                break;


            case "August":
                System.out.println("\n August = 31");
                break;

            case "September" :
                System.out.println("\n September = 30");
                break;

            case "Octomber":
                System.out.println("\n Octomber = 31");
                break;


            case "November":
                System.out.println("\n November = 30 ");
                break;

            case "December" :
                System.out.println("\n December = 31");
                break;

            default:
                System.out.println(" Invalid number");






        }

    }
}
