package Homework2;

import java.util.Scanner;

/**
 * Created by user on 3/1/2017.
 */
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Table to Calculated");
        int a=sc.nextInt();

        for(int i=1; i<=a;i++)
        {
            System.out.println(a+"*"+i+"="+(a*i));
        }



    }
}
