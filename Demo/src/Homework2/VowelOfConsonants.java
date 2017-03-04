package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/28/2017.
 */
public class VowelOfConsonants
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter Alphabet only");
        String a = sc.next();

        if (a.length()>1)
             {
                 System.out.println("Invalid input");

             }else if(a.equalsIgnoreCase("a") || a.equalsIgnoreCase("e") || a.equalsIgnoreCase("i") || a.equalsIgnoreCase("o") || a.equalsIgnoreCase("u"))
                   {
                       System.out.println("Letter is Vowel");


                   }else
                      {
                          System.out.println(" Letter is Consonant");
                      }



    }
}

