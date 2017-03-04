package Homework2;

import java.util.Scanner;

/**
 * Created by user on 2/28/2017.
 */
public class NaturalnoAndsum
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        int b = 0;
        for (int i = 1 ; i<=a ;i++)
        {
            b= b+a;
            System.out.println(i);
        }
        System.out.println(b);


    }

}
