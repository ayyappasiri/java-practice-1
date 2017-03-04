package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/28/2017.
 */
public class Weekdays
{
    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Weekdays number");
        int weekdays=scanner.nextInt();
        switch (weekdays)

        {
            case 1:
                System.out.println("\n First Day of week is Monday");
                break;

            case 2:
                System.out.println("\n Second dau of week is Tuesday");
                break;

            case 3:
                System.out.println("\n Third day of week is Wednesday");
                break;

            case 4:
                System.out.println("\n Four day if week is Thursday");
                break;

            case 5:
                System.out.println("\n Fifth day of week is Friday");
                break;

            case 6 :
                 System.out.println("\n Sixth day of week is Saturday");
                 break;

            case 7:
                System.out.println("\n Seven day of week is Sunday");
                break;

            default:
                System.out.println("Invalid input only 7 days of week");



        }

    }
}
