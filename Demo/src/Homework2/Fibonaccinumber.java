package Homework2;

import java.util.Scanner;

/**
 * Created by user on 3/1/2017.
 */
public class Fibonaccinumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Number " );
        int no =sc.nextInt();

        int a=0,b=1,c;
        System.out.print(a +"  "+ b);
        for( int i=1;i<=no;++i)
        {
            c=a+b;
            System.out.print(" "+ c);
            a=b;
            b=c;
        }


    }
}
