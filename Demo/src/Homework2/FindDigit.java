package Homework2;

import java.util.Scanner;

/**
 * Created by user on 3/1/2017.
 */
public class FindDigit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        String s=sc.next();
        char ch=s.charAt(0);
        if(s.length()>1)
        {
            System.out.println("Invalid Input");

        }
        if(Character.isDigit(ch))
        {
            System.out.println("\nValue is Number");

        } else if(Character.isAlphabetic(ch))
        {
            System.out.println("\nValue is Alphabet");

        }else
            {
                System.out.println("\nValue is Symbol");
            }







    }
}
