package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/26/2017.
 */
public class Leapyear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Year");
        int y = sc.nextInt();

        String s = (y % 4 == 0) ? "Leap year" : "Not Leap Year";
        System.out.println(s);
    }
}
